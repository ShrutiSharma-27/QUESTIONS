//1. You are given an ArrayList of positive integers.
//2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.
//
//Note -> The order of elements should remain same.

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_Primes_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //you can change the value at a particular index by using list.set(index,element);
        Scanner input = new Scanner(System.in);
        int element ;

        String ans = "yes";
        while (ans.equals("yes")){
            element = input.nextInt();
            list.add(element);  //you can also add an element on a particular index using list.add(index,element) ;
            System.out.print("Want to add more? (yes/no) : ");
            ans = input.next();
        }

        System.out.println("Before :" + list);

        for(int i =list.size()-1 ; i>=0 ; i--){ //start from end because in ArrayList indices get changed if you remove an element
            int n = list.get(i);
            if (isPrime(n)) {
                list.remove(i);
            }
        }
        System.out.println("After :" + list);
    }

    static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2 ; i<n ; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}

//Output : 

3
// Want to add more? (yes/no) : yes
// 1
// Want to add more? (yes/no) : yes
// 4
// Want to add more? (yes/no) : yes
// 19
// Want to add more? (yes/no) : yes
// 1
// Want to add more? (yes/no) : no
// Before :[3, 1, 4, 19, 1]
// After :[1, 4, 1]
