package math.problems;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class  UnitTestingMath{
    public static void factorialtest()

    {
        int a=2;
        assertEquals(100, Factorial.FactorialL(a));
        assertEquals(100,Factorial.FactorialF(a));
    }

    public static void fibonaccitest(){
        ArrayList<Integer> array= new ArrayList<>();
        array.add(0);array.add(1);array.add(2);
        assertEquals(array,Fibonacci.fibonnaci(2));

    }
public static void missingtest(){
        int[]array=new int[]{10,2,7,3,4,1,5,6,8};
        assertEquals(9,FindMissingNumber.MN(array, 10));
}
public static void primetest(){
        assertEquals(true, PrimeNumber.Prime(2));
}
    public static void main(String[] args) {
        factorialtest();
        fibonaccitest();
        missingtest();
        primetest();

    }

    }

