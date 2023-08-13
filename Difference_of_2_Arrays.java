// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1
// Assumption - number represented by a2 is greater.

import java.util.Arrays;
import java.util.Scanner;

public class Difference_of_2_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input 1st array
        int n1 = input.nextInt();
        int[] a1 = new int[n1];
        for (int i=0 ; i<n1 ; i++){
            a1[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(a1)); //print 1st array

        //input 2nd array
        int n2 = input.nextInt();
        int[] a2 = new int[n2];
        for (int i=0 ; i<n2 ; i++){
            a2[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(a2)); //print 2nd array
        
        int[] result = find_diff_array(a1,a2); //calling function to get result array
        System.out.println(Arrays.toString(result));
    }

    static int[] find_diff_array(int[] a1, int[] a2){
        int[] a_diff = new int[a2.length];

        int carry = 0;

        //kind of pointers starting from last index of each array
        int i = a1.length - 1; //i at last index of a1
        int j = a2.length - 1; //j at last index of a2
        int k = a_diff.length - 1; //k at last index of arr_diff

        while (k>=0){                          //till there's space in difference array
            int diff=0;
            int a1_value = (i>=0) ? a1[i] : 0;
            if (a2[j]+carry < a1_value){
                diff=a2[j]+carry+10-a1_value ;
                carry=-1;
            }
            else{
                diff=a2[j]+carry-a1_value ;
                carry=0;
            }
            a_diff[k]=diff;
            i--;
            j--;
            k--;
        }
        return a_diff;
    }
}

//Output :

// 2
// 2
// 0
// [2, 0]
// 4
// 1
// 0
// 0
// 0
// [1, 0, 0, 0]
// [0, 9, 8, 0]
