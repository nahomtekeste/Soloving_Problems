package com.company;
import java.util.Scanner;

public class Inout {

    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" your name  : " );
        String name = scanner.nextLine().trim();
        System.out.println(" your are " + name);

    }
}
