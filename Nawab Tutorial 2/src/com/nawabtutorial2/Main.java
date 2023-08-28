package com.nawabtutorial2;
import java.util.*;
//Boiler Plate Code
public class Main {

    public static void main(String[] args) {
        // Concept of Switch and Break
        Scanner sc = new Scanner(System.in);
            int button = sc.nextInt();
            switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Number");

        }

        //Else If in Java Format
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //if(a == 1){
           // System.out.println("Hello");
        //} else if(a == 2){
           // System.out.println("Namaste");
        //} else if(a == 3){
            //System.out.println("Bonjour");
        //} else{
            //System.out.println("Invalid Number");
       // }

        //ELse IF IN Simple Manner
        //Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
       // int b = sc.nextInt();
        //if(a == b){
            //System.out.println("GOOD");
        //} else{
            //if (a>b){
               // System.out.println("Very Good");
            //} else{
               // System.out.println("Invalid Number");
            //}
        //}

	// IF ELse
        // Scanner sc = new Scanner(System.in);
        //int age = sc.nextInt();
        //if(age > 18){
            //System.out.println("Adult");
        //} else{
            //System.out.print("Not adult");

        //}


    }
}
