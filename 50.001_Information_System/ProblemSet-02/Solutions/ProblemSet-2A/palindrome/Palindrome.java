package palindrome;

import java.util.Arrays;

public class Palindrome {

    public static boolean isPalindrome (char[] S) {

        if (S.length <= 1) {
            return true;
        }
        int len = S.length;
        if (S[0] == S[len-1]) {
            S = Arrays.copyOfRange(S, 1, len-1);
            return isPalindrome(S);
        }else{
            return false;
        }
    }
}

