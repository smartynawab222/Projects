package com.revision4;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        //Sum of n Natural Numbers
	/*Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Value of x");
    int x  = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= x; i++){
        sum = sum+i;
        System.out.print(i + "+");
    }
        System.out.println(sum);*/

        //Multiplication of n Natural Numbers
        /*Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number");
        int x  = sc.nextInt();
        System.out.println("The table of"+" "+x);
        //int Multiply = 1;
        for(int i = 1; i <= 10; i++){
            //x = x*i;

            System.out.println(x+" "+"x"+" "+i+" "+"="+" "+x*i);
        }*/

        //Different Kind of Patterns
        //Solid Pattern
        /*for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }*/
        //Hollow Solids
        /*for(int x = 1; x <= 5; x++){
            for(int y = 1; y <= 5; y++){
                if(x == 1||y == 1||x == 5||y == 5){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }*/
        /*for(int i = 5; i >= 1; i--)
        //for(int i = 1; i <= 5; i++)
            {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<= 4-i; j++){
                System.out.print(" ");
            }
            System.out.print();
        }
    }
}
