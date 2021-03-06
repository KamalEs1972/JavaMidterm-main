package math.problems;

public class FindMissingNumber {

     //public static void main(String[] args) {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */


    static int getMissingNo(int a[], int n)
    {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }

    /* program to test above function */
   // public static void main(String args[])

        int a[] = { 10, 2, 1, 4, 5, 3, 7, 8, 6 };
        int miss = getMissingNo(a, 9);
        //System.out.println(miss);
    }



