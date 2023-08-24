import java.util.Arrays;

public class Merge_2_SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,7,9,28,90,100,190};
        int[] arr2 = new int[]{1,8,90,200};

        int[] result = merge(arr1,arr2);

        System.out.println(Arrays.toString(result));
    }

    static int[] merge(int[] arr1, int[] arr2){
        int size1=arr1.length;
        int size2=arr2.length;
        int [] mergedArr = new int[size1+size2];
        int newIndex=0;
        int index1=0;
        int index2=0;
        while (index1!=size1 && index2!=size2){ //OR you also write in this way : while (index1<size1 && index2<size2)
            if(arr1[index1]<=arr2[index2]){
                mergedArr[newIndex]=arr1[index1];
                index1++;
            }
            else{
                mergedArr[newIndex]=arr2[index2];
                index2++;
            }
            newIndex++;
        }

        //if anything is left or I can say when arrays are of different sizes
        while(index1!=size1){
            mergedArr[newIndex]=arr1[index1];
            index1++; newIndex++;
        }
        while(index2!=size2){
            mergedArr[newIndex]=arr2[index2];
            index2++; newIndex++;
        }

        return mergedArr;
    }
}

//Output :

// [1, 2, 7, 8, 9, 28, 90, 90, 100, 190, 200]
