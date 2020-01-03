package com.company;
import  java.util.Scanner;
public class SecondProject {

    public static void main(String[] args) {
   Scanner scanner = new Scanner (System.in);
        System.out.println(" hello there would like to put your number ");
        int num = scanner.nextInt();

        if(num % 3 ==0  && num % 5 == 0 ){
            System.out.println(" fuzziBuzz ");
        }else if(num % 5 == 0){
            System.out.println(" buzz");
        }else if (num % 3 ==0){
            System.out.println(" fuzzi");
        }else{
            System.out.println(num);
        }



    }
}
