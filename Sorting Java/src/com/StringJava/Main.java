package com.StringJava;
import java.util.*;

public class Main {
   /*public static void Print_Array(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int size  = sc.nextInt();
        int[] Adil = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter the "+i+" "+"Element of an Array");
            Adil[i] = sc.nextInt();
        }

        //Bubble Sorting
        for(int i = 0; i < Adil.length-1; i++){
            for(int j = 0; j < Adil.length-i-1; j++){
                if(Adil[j]> Adil[j+1]){
                    //Swap
                    int temp = Adil[j];
                    Adil[j] = Adil[j+1];
                    Adil[j+1] = temp;
                }
            }
        }
        Print_Array(Adil);*/


        //Selection Sorting
       /* for(int i = 0; i < Adil.length -1; i++){
            int smallest = i;
            for(int j = i+1; j< Adil.length; j++){
                if(Adil[j] < Adil[smallest]){
                    smallest = j;
                }
            }
            //swap
            int temp = Adil[smallest];
            Adil[smallest] = Adil[i];
            Adil[i] = temp;
        }

        Print_Array(Adil);*/

        /*for(int i =0; i < Adil.length-1;i++){
            int smallest = i;
            for(int j = i+1; j < Adil.length; j++){
                if(Adil[smallest]>Adil[j]){
                    smallest = j;
                }
            }
            //swap
            int temp = Adil[smallest];
            Adil[smallest] = Adil[j];
            Adil[j]= temp;
            }*/
    public static void Print_Array(int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
            /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of An array");
        int size = sc.nextInt();
        int[] Adil = new int[size];*/

        /*for(int i = 0; i < Adil.length; i++){
            System.out.println("Enter the "+i+" "+"Element of an Array");
            Adil[i]= sc.nextInt();
        }*/

        //Bubble Sorting
        int[] Adil = {7,8, 3, 1, 2};

        for(int i = 0; i < Adil.length - 1; i++){
            for(int j = 0; j < Adil.length - i - 1; j++){
                if(Adil[j] > Adil[j+i]){
                    //Swap
                    int temp = Adil[j];
                    Adil[j] = Adil[j+1];
                    Adil[j+1] = temp;
                }
            }
        }
        Print_Array(Adil);
    }
}
