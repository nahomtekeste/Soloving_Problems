package com.company;

public class Problem_Solving_12 {

    public static void main(String []args){

//        System.out.println();
//        int [] arr1 = { 1,2,3,4,5,6,7,8,9,10};
//        int [] arr2 ={ 11,12,13,14,15,16,17,18,19,20};
//        int [] arr3 = new int [20];
//        int index = 0 ;
//        for(int i = 0 ; i < arr1.length;i++){
//            arr3 [index++] = arr1[i];
//            arr3 [index++] = arr2[i];
//        }
//        for(int i =0 ;i < arr3.length ;i++){
//
//            System.out.print(arr3[i] + " ");
//        }

        System.out.println(" ");

        //here we are able to get the second smallest numebr from the array and the second larger numbers from the array
        int [] arr = {5, 50,34,1,6,56,82,43,101};
        int small = arr[0] , large=arr[0];
        int s_small =-1 ,   s_large = -1 ;
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i] < small){
                s_small = small;
                small = arr[i];
            }
            if(arr[i] > large){
                s_large = large;
                large = arr[i];
            }
        }
        System.out.println(s_small + " " +  s_large);
    }
}
