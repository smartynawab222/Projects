package com.RevisionClass8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] marks = new int[size1][size2];

        for(int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                marks[i][j]= sc.nextInt();
            }
            //System.out.println();
        }

        int x = sc.nextInt();

        for(int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if(marks[i][j] == x){
                    System.out.println(i+","+j);
                }
                //System.out.print(marks[i][j]+" ");
            }
            //System.out.println();
        }

    }
}
