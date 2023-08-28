package com.ArrayPart1;
import java.sql.SQLOutput;
import java.util.*;
//Array Size is the Number of Elements that can be Stored by an Array;
//Array.length actually will tell us about the size of an array;
//Note := Keep this in your Mind Very Clearly;

public class Main {

    public static void main(String[] args) {
        //Creating an Array with New keyword\\
        /*int[] Adil = new int[3];
        Adil[0] = 98;
        Adil[1] = 87;
        Adil[2] = 67;
        System.out.print(Adil[0]+" ");
        System.out.print(Adil[1]+" ");
        System.out.print(Adil[2]+" ");*/

        //Defining the Array with the help of Curly Braces\\

        /*int Adil[] = {98, 87, 67};
        System.out.print(Adil[0]+" ");
        System.out.print(Adil[1]+" ");
        System.out.print(Adil[2]+" ");*/


        //Defining the Array by User Input\\

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of aan Array");
        int size = sc.nextInt();
        int Adil[] = new int[size];
        System.out.println("Enter the Elements of An Array");
        for(int i = 0; i < Adil.length; i++){
            Adil[i] = sc.nextInt();
        }
        System.out.println("Enter the Number you want to Find Out");
        int x = sc.nextInt();
        for(int i = 0; i< Adil.length;i++){
            if(x == Adil[i]){
                System.out.println(i);
            }
        }
        //System.out.println(i);
       *//* for(int j = 0 ; j < size; j++){
            System.out.println(Adil[j]);
        }*/


        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] Asif = new int[size];
        for(int i = 0; i < Asif.length; i++){
            Asif[i] = sc.nextInt();
        }
        for(int i = 0; i < Asif.length; i++){
            System.out.println();
        }*/

        /*System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
*/

        /*Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);*/


        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int size = sc.nextInt();
        int[] Hatif = new int[size];
        //System.out.println("Enter the Elements of an Array"+" "+"at"+" "+"Index"+" "+i);
        for(int i = 0; i < Hatif.length; i++){
            System.out.println("Enter the Elements of an Array"+" "+"at"+" "+"Index"+" "+i);
            Hatif[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < Hatif.length; i++){
            if(Hatif[i] < min){
                min = Hatif[i];
            }
        }

        for(int i = 0; i < Hatif.length; i++) {
            if (Hatif[i] > max) {
                max = Hatif[i];

            }
        }

        System.out.println("The Maximum Value in this Array: "+" "+max);
        System.out.println("The Minimum Value in this Array: "+" "+min);



    }
}
