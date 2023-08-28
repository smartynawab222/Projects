package com.RevesionVersion6;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*int[] marks = {45, 42, 49};//new int[3];
       *//* marks[0]= 46;
        marks[1]= 42;
        marks[2]= 45;*//*
        for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }*/
        //Step 1:   Design an Array for an User Size

        /*System.out.println("Enter the Size of an Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        //Step 2: Taking the Values of an Array
        System.out.println("Enter the Values of An Array");

        for(int i=0; i< size; i++){
            marks[i] = sc.nextInt();
        }

        //Step 3: Giving the Output of the Array
        System.out.println("Outputs of the Array");

        for(int i = 0; i < size; i++){
            System.out.print(marks[i]+" ");
        }
*/
        //Linear Search

        /*System.out.println("Enter the Size of an Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];

        //Step 2: Taking the Values of an Array
        System.out.println("Enter the Values of An Array");

        for(int i=0; i< size; i++){
            marks[i] = sc.nextInt();
        }

        //Step 4:Input of the Number you want to Search

        System.out.println("Enter the Value of x");

        int x = sc.nextInt();

        //Step 3: Giving the Output of the Array
        System.out.println("Outputs of the Array");

        for(int i = 0; i < marks.length; i++){
            if(marks[i]== x)
            System.out.print(i);
        }*/

        //2D Arrays

        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] marks = new int[size1][size2];

        for(int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                marks[size1][size2]= sc.nextInt();
            }
            //System.out.println();
        }

        for(int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(marks[size1][size2]+" ");
            }
            System.out.println();
        }
    }
}
