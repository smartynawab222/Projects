package com.nestedloops;

public class Main {

    public static void main(String[] args) {
        //Solid Rectangle
	/*for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= 4; j++){
            System.out.print("*");
        } System.out.println("*");
    }*/
        //Hollow Rectangle
        /*for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //Half pyramid
       /* for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }System.out.println();
        }*/
        //Inverted Half Pyramid
        /*for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }System.out.println();
        }*/

        // 180 Degree Half Pyramid
       /* for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4-i; j++) {
                System.out.print(" ");
            }
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }System.out.println();
            }*/
        //Half Pyramid But With Increasing Numbers
        /*for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }System.out.println();
        }*/
        // inverted Half Pyramid But With Increasing Numbers
//        for(int i = 5; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j);
//            }System.out.println();
//        }
        // Triangle with increasing numbers
        /*int number = 1;
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }System.out.println();
        }*/
        // Binary Pyramid

       /* for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }System.out.println();
        }*/
        //
        int $a = 10;
        float b = 20;
        b = $a;
        System.out.println(b);
        }
    }

