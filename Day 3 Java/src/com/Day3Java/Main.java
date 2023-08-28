package com.Day3Java;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*System.out.println("Enter your Age");
	Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age >= 18){
        System.out.println("Adult");
    }else {
        System.out.println("Not an Adult");
    }*/
       /* System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }*/

        //else if
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("Very Good");
        } else if (a == b){
            System.out.println("Good");
        } else {
            System.out.println("Poor");
        }*/

        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        switch(Number){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Salam");
                break;
            case 3 :
                System.out.println("Hafiz");
                break;
            default :
                System.out.println("Invalid");
        }
    }
}
