package com.Day5Java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	//Patterns
    // Nested Loops
    /*for(int i = 1; i <= 4; i++){
        for(int j = 1; j<= 5; j++){
            System.out.print("*");
        }
        System.out.println();
    }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value a");
        int n = sc.nextInt();
        System.out.println("Enter the values b");
        int m = sc.nextInt();
        if(n<m) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 5; j++) {
                    if (i == 1 || j == 1 || i == 4 || j == 5) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid Values");
        }*/
        Scanner sc = new Scanner(System.in);

        /*for(int i = 4; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");

            }
            System.out.println();
        }*/
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
