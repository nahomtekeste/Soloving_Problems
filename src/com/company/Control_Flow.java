package com.company;

public class Control_Flow {
    public static void main(String []args){
        int temp = 32 ;
        if(temp > 30 ){
            System.out.println(" hey it is hot day here ");
            System.out.println(" plase drink water ");
        }if(temp > 20 && temp < 35 ){
            System.out.println(" it is nic day");
        }else{
            System.out.println(" it is cold");
        }


        // exampple of swit ch statments
        String role = "admin";
        switch (role) {
            case " admin" :
                System.out.println("your r an admin");
                break;
            case " monitor" :
                System.out.println("your r a monitor");
                break;
            default :
                System.out.println(" your r a guest ");
        }
    }
}
