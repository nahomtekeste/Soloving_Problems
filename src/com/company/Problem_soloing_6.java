package com.company;

public class Problem_soloing_6 {
    public static void main(String []args){

        // this numebr connot contain odd number due to ncrementing with   2
        int even = 0 , odd = 1 ;
        for(int i = 1; i <= 20 ;i+=2){
            odd = odd * i ;
        }
        for(int i = 2 ; i <=100; i+=2) {
            even = even + i ;
        }
        System.out.println(" Even : " +even + " Odd " + odd );
    }
}
