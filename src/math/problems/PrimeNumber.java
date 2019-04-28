package math.problems;

import java.util.ArrayList;

public class PrimeNumber {
    public static boolean Prime(int n){
        int a = (int)Math.sqrt(n)+1;
        for(int i=2;i<=a;i++){
            if((n%i)==0) return  false;
        }
        return true;
    }



    public static <integer> void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        ArrayList<Integer> prime= new ArrayList<Integer>();
        int c;
        int a;
        for(int i=2;i<=1000000;i++){
            if(Prime(i)) prime.add(i);

        }
     System.out.println(prime);
    }

}
