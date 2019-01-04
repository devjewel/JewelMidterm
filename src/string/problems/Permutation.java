package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        pemutation("","ABC");
    }
    public static void pemutation(String holder, String str){
        int l = str.length();
        if (l==0){
            System.out.println(holder);
        }else {
            for(int i = 0; i < str.length(); i++){
                pemutation(holder+str.charAt(i),str.substring(0,1)+str.substring(i+1, l));
            }
        }
    }


    }


