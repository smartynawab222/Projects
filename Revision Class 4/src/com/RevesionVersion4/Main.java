package com.RevesionVersion4;
import java.util.*;

public class Main {

    /*public static void MyName(String name){
        System.out.println(name);
        return;
    }*/

    /*public static int CalculateSum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
    int a = sc.nextInt();
        System.out.println("Enter the Value of b");
    int b = sc.nextInt();
    //int x = CalculateSum(a,b);
        //System.out.println("Sum of two numbers:"+" "+a+" "+"+"+" "+b+" "+"="+" "+x);
        System.out.println("Sum of two numbers:"+" "+a+" "+"+"+" "+b+" "+"="+" "+CalculateSum(a,b));
    }
*/
    public static int factorial(int a){
        int factorials = 1;
        for(int i = a; i >= 1; i--){
            factorials = factorials*i;
        }
        //System.out.println(factorials);
        return factorials;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //factorial(a);
        System.out.println(factorial(a));
    }
}
