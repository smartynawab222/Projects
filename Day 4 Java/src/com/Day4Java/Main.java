package com.Day4Java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// For Loop
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        //int i = sc.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.println(name);
        }*/
        /*int sum = 0;
        for(int i = 0; i<11; i++){
            //System.out.println(sum+i);
            //sum++;
            System.out.println(i);
        }*/

        // While => Jab Tak
       /* int i = 0;
        while(i<11){
            System.out.println(i);
            i++;
        }*/

        //do while
       /* int i = 0;
        do{
            System.out.println(i);
            i++;
        } while(i<11);*/

      /*  int i = 12;
        while(i < 11) {
            System.out.println("Someone is best");
            i++;
        }*/
      /* int j = 12;
        do{
            System.out.println("Adil is best");
            j++;
        } while(j<11);*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<= n; i++){
            sum = sum + i;
            //System.out.println(sum + i);
        }
        System.out.println(sum);*/


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value");
//        int n = sc.nextInt();
//        int sum = 0;
//        for( int i = 0; i <= n; i++){
//            sum = sum + i;
//            //System.out.print(sum + "+");
//        }
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        //int sum = 1;
        for(int i = 1; i <= 10; i++){
            System.out.println(number + "x" + i + "=" + number*i);
        }

    }
}
