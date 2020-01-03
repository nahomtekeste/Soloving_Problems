package com.company;

import java.util.Scanner;

// this is solotion is supposet to be number 16
public class Problem_Soloving_13 {
    public static void main(String[] args) {

//        //in this case what we are doing is that we are reveiceing an array numbers from the user
//        // and also revied another two numbers than to be able to swip the numbers index place from
//        // from the numbers that i have recived from the user in the fisrt array
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int[10];
//        System.out.println("Array Values : ");
//        for(int i =0  ; i < arr.length ;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(" Num 1 : ");
//        int a = sc.nextInt();
//        System.out.println(" Num 2: ");
//        int b = sc.nextInt();
//
//        int index_a =0 ,index_b = 0;
//        for(int i =0 ;i < arr.length ;i++){
//            if(arr[i] == a ){
//                index_a = i;
//            }
//             if(arr[i] ==b ){
//                 index_b = i ;
//             }
//        }
//        int c = arr[index_a] ;
//        arr[index_a] = arr[index_b] ;
//        arr[index_b] = c ;
//        for(int i = 0 ; i < arr.length; i++){
//            System.out.println(arr[i] + "  ");
//        }
//
//
//

        int[] arr1 = {1, 2, 13, 4, 5, 6, 17, 8, 9, 10};
        int[] arr2 = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }

        // this is number the last solotion of those questions
        int[] arr3 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
