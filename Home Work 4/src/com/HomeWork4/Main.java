package com.HomeWork4;

public class Main {

    public static void main(String[] args) {
        //We will Draw all kind of Patterns
        //Solid Rectangle
        //Defining the Rows
      /*for(int i = 0; i < 4; i++){
          //Defining the Columns
          for(int j = 0; j < 5; j++){
              System.out.print("*"+" ");
          }
          System.out.println();
      }*/

        //Hollow Rectangle
        /*for(int i = 0; i < 4; i++) {
            //Defining the Columns
            for (int j = 0; j < 5; j++){
                if(i == 0 || i == 3 || j == 0 || j == 4){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/

        //Half Pyramid

       /* for(int i = 0; i <= 5; i++ ){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i = 5; i >= 0; i-- ){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Half Pyramid But rotated with 180`

        /*for(int i = 4;i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");

            }
            for(int j = 0; j <= 4-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*int Sum = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=i; j++){
                //Sum = Sum+j;
                System.out.print(Sum+" ");
                Sum++;
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }*/

        /*for(int  i = 5; i >= 1; i--){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= 5-i; j++){
                System.out.print("*"+" ");
            }
            for(int j = 0; j <=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

        /*for(int  i = 1; i <= 5; i++){
            for(int j = 0; j <=5-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 5; j++){
                System.out.print("*"+" ");
            }
            *//*for(int j = 0; j <=i; j++){
                System.out.print("*"+" ");
            }*//*
            System.out.println();
        }*/


        for(int i = 5; i >= 1; i--){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
