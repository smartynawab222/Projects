package com.ArrayPart2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	/*Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] Hatif_Kashif = new int[row][col];

    for(int i = 0; i< row; i++){
        for(int j = 0 ; j < col; j++){
            Hatif_Kashif[i][j] = sc.nextInt();

        }
    }
    for(int j = 0; j < row; j++){
        for(int i = 0; i < col; i++){
            System.out.print(Hatif_Kashif[j][i]+" ");
        }
        System.out.println();
    }*/

        //Scanner sc = new Scanner(System.in);
       /* int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] Hatif_Kashif = new int[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0 ; j < col; j++){
                Hatif_Kashif[i][j] = sc.nextInt();

            }
        }

        int x = sc.nextInt();
        for(int j = 0; j < row; j++) {
            for (int i = 0; i < col; i++) {
                if (x == Hatif_Kashif[j][i]) {
                    System.out.print(j+i);
                }
                //System.out.println();
            }
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row of your Matrix");
        int row = sc.nextInt();
        System.out.println("Enter the Column of your Matrix");
        int col = sc.nextInt();
        int[][] Adil = new int[row][col];

        System.out.println("Enter the Elements of your Array");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                Adil[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Number you want to find out");
        int x = sc.nextInt();


        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(x == Adil[i][j]){
                    System.out.println(i+" "+j);
                }
            }
        }*/

        Scanner sc = new Scanner(System.in);
        int row  = sc.nextInt();
        int col  = sc.nextInt();
        int[][] Adil = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j =0; j < col; j++){
                Adil[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(Adil[j][i]+" ");
            }
            System.out.println();


        }

     }

 }
