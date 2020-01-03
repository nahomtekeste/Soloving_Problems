package com.company;

import java.util.Scanner ;
public class Problem_Soloving_11 {
    public static void main(String []args){

        Scanner sc = new Scanner (System.in);
        System.out.println(" num : ");
         int a = sc.nextInt();
         int count= 0 , large= 0 ;
         boolean isPrim= true ;
         for(int i = 1 ; i < a ; i++){
             isPrim = true;
             for(int j = 2 ;j< i ; j++){
                 if(i % j==0 ){
                     isPrim =false;
                     break;
                 }
             }
             if(isPrim && i !=2 ){
                 count++;
                 large = i ;
                 System.out.println(i);
                 isPrim = false;
             }
         }
        System.out.print(" our total prime number is :" + count + " and \n this is our large number : " + large);
    }
}
