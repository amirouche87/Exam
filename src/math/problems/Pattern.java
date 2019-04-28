package math.problems;

public class Pattern {


        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */
        public static void printNums(int n)
        {
            int i, j,num;


            for(i=0; i<n; i++)
            {
                // initialising starting number
                num=1;

                //  inner loop to handle number of columns
                //  values changing acc. to outer loop
                for(j=0; j<=i; j++)
                {

                    System.out.print(num+ " ");

                    //incrementing value of num
                    num++;
                }

                // ending line after each row
                System.out.println();
            }
        }

        // Driver Function
        public static void main(String args[])
        {
           int n=1;
            printNums(n);
        }
    }
