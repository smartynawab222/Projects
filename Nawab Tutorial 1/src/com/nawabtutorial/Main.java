package com.nawabtutorial;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
//Basics java Programming, Output, User input, Data types, Variables
public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.print("Hello World");
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        System.out.print(c)*/;

        System.out.println("Hello world");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter the Value b");
        int b = sc.nextInt();
        System.out.println("The Answer is");
        int c  = a+b;
        System.out.println(c);

    }
}
