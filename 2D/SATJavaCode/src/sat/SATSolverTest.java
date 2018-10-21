package sat;

import sat.env.*;
import sat.formula.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;


public class SATSolverTest {
    Literal a = PosLiteral.make("a");
    Literal b = PosLiteral.make("b");
    Literal c = PosLiteral.make("c");
    Literal na = a.getNegation();

    public static void main(String args[]) throws IOException {
        System.out.println("Reading File");
        long startRead = System.nanoTime();
        File fin = null;
        Scanner bin = null;
        try {
            fin = new File("/Users/wangtianduo/Desktop/SATJavaCode/src/sat/abc.txt");
            bin = new Scanner(fin);

            String line;
            boolean commentCheck = true;
            String[] format = new String[3];
            while(commentCheck != false){
                String[] commentRemove = bin.nextLine().split(" ");
                System.out.println(commentRemove[0]);
                if(!commentRemove[0].contains("c")){
                    format = commentRemove;
                    commentCheck=false;
                }
            }

            int NumberOfClauses = Integer.parseInt(format[3]);
            Formula f = new Formula();
            while (f.getSize()!=NumberOfClauses) {
                line=bin.nextLine();
                if(line.length()>0){
                    String[] tempLine=line.split(" ");
                    Clause c = new Clause();
                    for(String i:tempLine){
                        if(Integer.parseInt(i) == 0) {
                            break;
                        }
                        Literal literal = PosLiteral.make(Integer.toString(Math.abs(Integer.parseInt(i))));

                        if((Integer.parseInt(i))<0){
                            c=c.add(literal.getNegation());
                        }
                        else if ((Integer.parseInt(i))>0){
                            c=c.add(literal);
                        }
                        if (c == null){
                            c = new Clause();
                        }
                    }
                    f=f.addClause(c);
                }
            }
            String fileName = "BoolAssignment.txt";
            PrintWriter write = new PrintWriter(fileName, "UTF-8");
            long endRead = System.nanoTime();
            long tReadTime = endRead - startRead;
            System.out.println("Reading Time: " + tReadTime/1000000000.0 + "s");
            System.out.println("SAT Solver starts");
            long startTime = System.nanoTime();
            Environment env = SATSolver.solve(f);
            long endTime = System.nanoTime();
            long timeTaken = endTime - startTime;
            System.out.println("Solving Time: " + timeTaken/1000000.0 + "ms");
            System.out.println("Total Time: " + (timeTaken+tReadTime)/1000000000.0 + "s");
            if (env == null){
                System.out.println("Formula Unsatisfiable");
            }else{
                System.out.println("Formula Satisfiable");
                String bindings = env.toString();
                System.out.println(bindings);
                bindings = bindings.substring(bindings.indexOf("[")+1, bindings.indexOf("]"));
                String[] bindingNew = bindings.split(", ");
                for (String binding : bindingNew){
                    String[] bind = binding.split("->");
                    write.println(bind[0] + ":" + bind[1]);
                }
            }
            write.close();

        }finally {
            if (bin != null) {
                bin.close();

            }
        }
    }

    public void testSATSolver1(){
    // (a v b)
    	Environment e = SATSolver.solve(makeFm(makeCl(a,b))	);
/*
    	assertTrue( "one of the literals should be set to true",
    			Bool.TRUE == e.get(a.getVariable())  
    			|| Bool.TRUE == e.get(b.getVariable())	);
    	
*/    	
    }

    public void testSATSolver2(){
    	// (~a)
    	Environment e = SATSolver.solve(makeFm(makeCl(na)));
/*
    	assertEquals( Bool.FALSE, e.get(na.getVariable()));
*/    	
    }
    
    private static Formula makeFm(Clause... e) {
        Formula f = new Formula();
        for (Clause c : e) {
            f = f.addClause(c);
        }
        return f;
    }
    
    private static Clause makeCl(Literal... e) {
        Clause c = new Clause();
        for (Literal l : e) {
            c = c.add(l);
        }
        return c;
    }
    
    
    
}