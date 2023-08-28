package com.RevesionVersion5;
import java.util.*;

public class Main {

    public static void factorial(int a){
        int factorials = 1;
        for(int i = a; i >= 1; i--){
            factorials = factorials*i;
        }
        System.out.println(factorials);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    factorial(a);
    }
}
