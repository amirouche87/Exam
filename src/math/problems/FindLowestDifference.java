package math.problems;

import java.sql.Array;

public class FindLowestDifference {

    public static void bublesort(int Array[]){
        int b;
        for (int i=0;i<Array.length-1;i++){
            for(int f=0;f<Array.length-1;f++){
                if (Array[f]>Array[f+1]){
                    b=Array[f];
                    Array[f]=Array[f+1];
                    Array[f+1]=b;
                }
            }

        }
    }


    public static void main(String[] args) {

        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

bublesort(array1);
bublesort(array2);
if(array1[0]<array2[0])
    System.out.println("the lowest difference is "+array1[0]+ " from array1");
else System.out.println("the lowest difference is "+array2[0]+"from array2");
    }

}
