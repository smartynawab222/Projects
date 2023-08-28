package com.SortingRevision;
import java.util.*;

public class Main {

    public static void PrintArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of An Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //PrintArray(arr);


        //Bubble Sorting
        /*for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){

                    //swap

                    //int temp = arr[j];
                    arr[j] = arr[j+1];
                    //arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr);*/

        //Selection Sorting

        /*for(int i = 0; i < arr.length-1; i++){
            int Smallest = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[Smallest] > arr[j]){
                    Smallest = j;
                }
            }
            int temp = arr[Smallest];
            arr[Smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);*/


        //Insertion Sorting

        /*for(int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = current;
        }
        PrintArray(arr );*/

    }
}
