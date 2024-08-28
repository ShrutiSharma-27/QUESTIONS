import java.util.* ;

public class Count_Inversions_MergeSort {
    public static int count=0;
    public static void main(String args[]) {
        // Write your code here.

        long[] arr = {24, 18, 38, 43, 14, 40, 1, 54};
        mergeSort(arr);
        System.out.println(count);
    }

    public static long[] mergeSort(long[] arr){
        if (arr.length == 1) return arr;

        int mid = arr.length/2;

        long[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        long[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));


        return merge(left, right);
    }

    public static long[] merge(long[] first, long[] second){
        int i=0;
        int j=0;
        int k=0;

        long[] combined = new long[first.length + second.length];

        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                combined[k] = first[i];
                i++;
            }
            else{
                combined[k] = second[j];
                j++;
                count+=first.length-i;
            }
            k++;
        }

        while(i<first.length){
            combined[k] = first[i];
            k++; i++;
        }
        while(j<second.length){
            combined[k] = second[j];
            k++; j++;
        }
        return combined;
    }
}

//Output :

// 12
