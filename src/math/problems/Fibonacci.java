package math.problems;

import java.util.ArrayList;

public class Fibonacci {
    public static ArrayList<Integer> fibonnaci(int n){
       ArrayList<Integer> array = new ArrayList<Integer>();
        int c=0; int d=1;
        int e=c+d;
        array.add(c); array.add(d); array.add(e);
        for(int i=0;i<=n;i++){
            c=d;
            d=e;
            e=c+d;
            array.add(e);

        }
        return array;
    }








    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         ArrayList array = fibonnaci(40);
         System.out.println(array);

    }
}
