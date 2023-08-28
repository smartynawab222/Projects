package com.HomeWork3;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	/*Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        if(i% 2 == 0){
            System.out.print(i+" ");
        }*//*else{
            System.out.print("Invalid"+" ");
        }*//*
    }*/

        /*for(int i = 0; i <= 5; i++ ){
            System.out.println("Apna College");
        }*/


        /*Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Options");
        int n  = sc.nextInt();
        if(n == 1){
            System.out.println("Enter the Size of An Array");
            int Size = sc.nextInt();
            int[] arr = new int[Size];
            //Input of An Array
            System.out.println("Enter the Details");
            for(int i = 0; i < Size; i++){
                arr[i] = sc.nextInt();
            }
            //Output of the Array
            System.out.println("Showing your Details");
            for(int i = 0; i < Size; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else if(n == 0){
            System.out.println("Stop");
        }
        else{
            System.out.println("An Invalid Number");
        }*/

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i < n; i++){
            if(n%i != 0){
                System.out.println("Number is Prime");
            }
            /*else{
                System.out.println("Number is Prime");
                break;
            }*/
        }

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }*/

    }
}
