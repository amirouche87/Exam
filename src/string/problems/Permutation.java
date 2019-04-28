package string.problems;

import java.util.ArrayList;

public class Permutation {


        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        public static ArrayList<String> permute(ArrayList<String> s, String p , String str){
            int n = str.length();
            if(n==0) s.add(p);
            for(int i=0;i<n;i++){
                permute(s,p+str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
            }
            return s;

        }
        public static void main(String[] args) {


            ArrayList<String> s= new ArrayList<String>();
            s= permute(s,"","ABC");
            System.out.print(s);
    }
}
