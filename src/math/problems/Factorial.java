package math.problems;

import java.util.Scanner;

public class Factorial {
             //1//iteration
    public static int FactorialL(int i){
        int fact=1;
        for(int a=2;a<=i;a++){
            fact=fact*a;
        }
        return fact;
    }
            //2//recurtion
    public static int FactorialF(int i){
        if (i==0)return 1;
        else return FactorialF((i-1));
    }


    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int i = sc.nextInt();
        System.out.println("the factorial of " +i+ " using iteration methode is " +FactorialL(i));
        System.out.println("the factorial of " +i+ " using recurtion methode is 7" +FactorialF(i));

    }
}
