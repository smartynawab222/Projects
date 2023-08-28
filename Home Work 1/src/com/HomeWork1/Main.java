package com.HomeWork1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Try to declare meaningful variables of each type.
        // Eg - a variable named age should be a numeric type (int or float) not byte.

        /*int age = 23;
        float age1 = (float) 23.6;
        System.out.println(age+age1);

        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float A = (3.14 * r * r)f;
        System.out.println(A);

        int  d = 2;
        float b = d;
        System.out.println(b);*/

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <=10 ; i++){
            System.out.println(x+" "+"x"+" "+i+" "+"="+" "+(x*i));
        }


    }
}
