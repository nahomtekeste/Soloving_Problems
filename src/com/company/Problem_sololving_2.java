package com.company;

import java.util.Scanner ;
public class Problem_sololving_2 {

    public static void main(String []args){
        System.out.println("  ");
        for(int a = 1, b = 10 , c=11 , d = 20, e =21 , f = 30 ; a <= 10 ; a++ , b--, c++,d--,e++,f--){
            System.out.println(a + " " + b + " " + c + " " + d + " " + f + " ") ;
        }
        System.out.println(" ***************** number 3 **************");

        Scanner sc= new Scanner(System.in);
        System.out.println(" Rows : ");
        int row = sc.nextInt();

        System.out.println(" Col :");
        int col = sc.nextInt();
        if(row <= 0 || col <= 0 ){
            System.out.println(" hey your need to enter number greater than 0 ");
        }else{
            for(int i = 1 ; i <= row ; i++){
                for(int j = 1 ; j <=col ; j++){
                    System.out.print("B");
                }
                System.out.println();
            }
        }
        System.out.println(" ****************** ");

    }
}
