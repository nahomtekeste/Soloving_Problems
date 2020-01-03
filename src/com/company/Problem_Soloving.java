package com.company;

public class Problem_Soloving {

    public static void main(String[]args){

        // this is problem solving number one
        for(int i = 1 ; i <=6 ; i++){
            for(int j =1; j <= i ;j++){
                System.out.print(j);
            }
            for(int  k = 6; k > i ; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("  ***************     number 2 *********************");

        System.out.println();
        for(int i = 6 ; i >=1 ; i--){
            for(int j =1; j < i ;j++){
                System.out.print(j);
            }
            for(int  k = 6; k >= i ; k-- ){
                System.out.print("&");
            }
            System.out.println();
        }
        System.out.println("*******************number 3 ******************* ");
        System.out.println(" ");
        System.out.println(" @");
        for(int i = 5 ; i >=1 ; i--){
            System.out.print(" @ ");
            for(int j =5 ; j >= i ;j--){
                System.out.print(" ");
            }
            System.out.print(" @");
            System.out.println();
        }
        for(int j = 5 ;j> 0 ;j--){
            System.out.print(" @");
        }
    }
}
