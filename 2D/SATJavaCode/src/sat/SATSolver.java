package sat;

import immutable.EmptyImList;
import immutable.ImList;
import sat.env.Environment;
import sat.env.Variable;
import sat.formula.Clause;
import sat.formula.Formula;
import sat.formula.Literal;
import sat.formula.PosLiteral;
import sat.formula.NegLiteral;
import java.util.Iterator;

public class SATSolver {

    private static Clause tempClause;

    public static Environment solve(Formula formula) {
        ImList<Clause> clauses = formula.getClauses();
        Environment env = new Environment();
        return solve(clauses, env);
    }

    private static Environment solve(ImList<Clause> clauses, Environment env) {
        if (clauses.size() == 0) {
            return env;
        }
        int minSize = Integer.MAX_VALUE;
        Clause minClause = null;

        for (Clause c : clauses) {
            if (c.size() < minSize) {
                minSize = c.size();
                minClause = c;
            }
        }


        if (minSize == 0) {
            return null;
        } else if (minSize == 1) {
            Literal literal = minClause.chooseLiteral();
            Variable var = literal.getVariable();
            Literal newLiteral = PosLiteral.make(var);
            if (newLiteral.negates(literal)) {
                Environment newEnv = env.putFalse(var);
                ImList<Clause> newClauses = substitute(clauses,literal);
                return solve(newClauses, newEnv);
            } else {
                Environment newEnv = env.putTrue(var);
                ImList<Clause> newClauses = substitute(clauses,literal);
                return solve(newClauses, newEnv);
            }
        } else {
            Literal literal = minClause.chooseLiteral();
            Variable var = literal.getVariable();
            Environment newEnv = env.putTrue(var);
            Literal posLiteral = PosLiteral.make(var);
            ImList<Clause> newClauses = substitute(clauses, posLiteral);
            Environment solution = solve(newClauses, newEnv);
            if (solution == null) {
                newEnv = env.putFalse(var);
                Literal negLiteral = NegLiteral.make(var);
                newClauses = substitute(clauses, negLiteral);
                return solve(newClauses, newEnv);
            }
            return solution;
        }

    }

    private static ImList<Clause> substitute(ImList<Clause> clauses,
            Literal l) {
        Clause newClause = new Clause();
        ImList<Clause> outClauses = new EmptyImList<Clause>();
        if (clauses.isEmpty()){
            return outClauses;
        }

        for (Clause cl: clauses) {
            if (cl.isEmpty()) {
                newClause = cl.reduce(l);
            }
            if (newClause != null) {
                outClauses = outClauses.add(newClause);
            }
        }
//        Iterator<Clause> iter = clauses.iterator();
//        while(iter.hasNext()) {
////            tempClause = iter.next();
////            if (!tempClause.isEmpty()) {
////                newClause = tempClause.reduce(l);
////            }
////            if (newClause != null) {
////                outClauses = outClauses.add(newClause);
////            }
////        }
        return outClauses;
    }

}
