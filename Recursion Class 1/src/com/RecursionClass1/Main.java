package com.RecursionClass1;

public class Main {
    /*public static int Calculate_Factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int Fact_nm1 = Calculate_Factorial(n-1);
        int fact_n = n*Fact_nm1;
        return fact_n;
    }*/

    public static int Calculate_Factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        //int fact = n * (n -1);
        Calculate_Factorial(n-1);
        int fact = n * (n -1);
        return fact;
    }

    public static void main(String[] args) {

        System.out.println(Calculate_Factorial(5));
    }
}
