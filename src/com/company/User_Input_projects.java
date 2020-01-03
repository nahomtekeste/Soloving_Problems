package com.company;

import java.util.Scanner;
public class User_Input_projects {

    public static void main(String []args){

        System.out.println(" hello there wellcome to Mitchel library ");
        Scanner sca = new Scanner(System.in);

        System.out.println(" hey would liek to tell us your name  : " );
        String name = sca.nextLine();

        System.out.println(" welcome again " + name + " and here your three options where u would like to spend your day in : ");
        System.out.println(" would like to confirm if that is 1 or 0 : ");
        int ans = sca.nextInt();

            if (ans == 1) {
                System.out.println(" okey here is question 1). who is the cofoubnder of facebook \n" +
                        "1.)  zark zukember " +
                        "2). martin luter " +
                        "3). mahtema gandi" +
                        "4). billgates ");
                int answer = sca.nextInt();
                if (answer == 1) {
                    System.out.println(" hey" + name + " congratulatulation  you have got the right answer");
                    System.out.println(" okey here is question 2). who is the cofoubnder of java programming  \n" +
                            "1.)  zark zukember " +
                            "2). james gospel " +
                            "3). mahtema gandi" +
                            "4). billgates ");
                    int answe = sca.nextInt();
                    if(answe == 2 ){
                        System.out.println(" hey " + name + " Congratulation you have got the orrect answer ");
                        System.out.println(" okey here is question 3). what was the first coampany's name  where james gospel use to work when he found java  \n" +
                                "1.)  oracal " +
                                "2). microsoft " +
                                "3). sun microsoft" +
                                "4). nono ");
                        int an = sca.nextInt();
                        if(an == 3){
                            System.out.println(" hey " + name + " you have got three questions right so far ");
                        }else{
                            System.out.println(" hey " + name + " you have answer 2 qestions out of three so is not bad , is it ?");
                            System.out.println(" try to restart the programm to try questions again ");
                        }
                    }else{
                        System.out.println(" sorrt " + name + " you have got the wrong answer try to restart the programm");
                    }

                }
                if (answer == 2) {
                    System.out.println(" sorry " + name + " you have got the wrong answer");
                } else {
                    System.out.println(" hey" + name + "you have got the worong answer ");
                }
            } else {
                System.out.println(" hey " + name + " thanks for playing with us bey");
            }

        }

}
