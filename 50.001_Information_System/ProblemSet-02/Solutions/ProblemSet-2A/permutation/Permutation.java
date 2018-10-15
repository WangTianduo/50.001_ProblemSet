package permutation;

import java.util.ArrayList;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();
    // additional attribute if needed

    Permutation(final String str){
        in = str;
        // additional initialization if needed
    }

    private void permute(char[] str, int start) {
        if (start == str.length - 1) {
            a.add(new String(str));
        }

        for (int i = start; i <= str.length - 1; i++) {
            swap(str, i, start);
            permute(str, start + 1);
            swap(str, i, start);
        }
    }

    private void swap(char chs[],int i,int j)
    {
        if (i == j) {
            return;
        }

        if (i - j == 2) {
            char temp;
            temp = chs[j];
            chs[j] = chs[i];
            chs[i] = chs[j+1];
            chs[j+1] = temp;
            return;
        }
        char temp;
        temp=chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }

    public void permute(){
        permute(in.toCharArray(), 0);
        // produce the permuted sequences of 'in' and store in 'a', recursively
    }

    public ArrayList<String> getA(){
        return a;
    }
}


