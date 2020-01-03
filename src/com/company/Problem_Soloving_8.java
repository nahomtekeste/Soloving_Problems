package com.company;
import java.util.Scanner ;

public class Problem_Soloving_8 {

    public static void main(String []args){
//        Scanner sc = new Scanner (System.in);
//        System.out.println(" num : ");
//        int a = sc.nextInt();
//        boolean isPrim = true;
//        for(int i = 2 ;i < a/2 ; i++){
//            if(a % i == 0){
//                isPrim = false;
//                break;
//            }
//        }
//        if(isPrim){
//            System.out.println(" Yes");
//        }else{
//            System.out.println(" No");
//        }

        System.out.println( "***********************");

//        Scanner sc = new Scanner (System.in);
//        System.out.println(" num : ");
//       int a = sc.nextInt();
//       int result = 1;
//       int q = a/ 10 ;
//       while(q != 0){
//           q = q /10;
//           result++;
//       }
//        System.out.println(result);
//
        // this qesution add numebr in between the give numebr that have recevied from the user
        System.out.println( "***********************");

        Scanner sc = new Scanner (System.in);
        System.out.println(" num 1 : ");
        int a = sc.nextInt();
        System.out.println(" num 2 : ");
        int b = sc.nextInt();
        int sum =0 , mul = 1 ;
        if(a < b){
            for(int i = a+1 ; i< b; i++){
                sum =sum + i;
                mul = mul * i;
            }
            System.out.println(" Sum : " + sum + " and Mul : " + mul);

        }

   }
}
