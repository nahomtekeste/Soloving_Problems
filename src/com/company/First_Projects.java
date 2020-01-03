package com.company;

import java.util.Scanner;
public class First_Projects {

    public static void main(String []args){

        final byte Months_in_year = 12 ;
        final byte percent = 100 ;
        int principle = 0;
        float annualInterset = 0;
        byte years = 0;
        int numberOfPayment = 0 ;
        float monthlyInterest = 0;


        Scanner scanner = new Scanner (System.in );

        while (true) {
            System.out.println(" Principle :  ");
             principle = scanner.nextInt();

            if(principle >= 1000 && principle <= 1000000)
                break;
            System.out.println(" enter a value between 1000 and 1000000");
        }
        while (true) {
            System.out.println(" interest rate : ");
             annualInterset = scanner.nextFloat();
            if(annualInterset >= 1 && annualInterset <= 30 ) {
                 monthlyInterest = annualInterset / percent / Months_in_year;
                break;
            }else{
                System.out.println(" enter a value between 1 - 30 ");
            }
        }
        while(true) {
            System.out.println(" period (Years ) : ");
            years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                 numberOfPayment = years * Months_in_year;
                break;
            }
            System.out.println(" enter a value between 1 and 30");
        }
        double morage = principle + numberOfPayment / monthlyInterest ;
        System.out.println( " your Morage payment is : " + morage);


    }
}
