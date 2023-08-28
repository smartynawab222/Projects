package com.Excercise1;
import java.util.*;
import java.lang.*;

public class Main {

    /*public static float Average(int x, int y, int z){
        float average =(float) (x+y+z)/3;
        System.out.println(average);
        return average;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int p = scan.nextInt();
        System.out.println("Enter the Second Number");
        int q = scan.nextInt();
        System.out.println("Enter the Third Number");
        int r = scan.nextInt();
        System.out.println("Average of Above Three Numbers");
        Average(p,q,r);*/

    /*public static void Odd_Sum(int n){
        int f = 0;
        for(int i = 1; i < n; i++){
            if(i % 2 != 0){
                f = f+i;
                System.out.print(i+" "+"+"+" ");
            }
            //System.out.println(f);
        }
        System.out.println("="+" "+f);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Y = scan.nextInt();
        Odd_Sum(Y);*/

       /* public static void Greater_Of_Two(int x, int y){
            if(x>y){
                System.out.println(x);
            }else{
                System.out.println(y);
            }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Value");
            int x = sc.nextInt();
            System.out.println("Enter the Second Value");
            int y = sc.nextInt();
            System.out.print("Greater of Two Numbers in"+" "+x+" "+"and"+" "+y+" "+"is"+" "+"="+" ");
            Greater_Of_Two(x,y);*/

    /*public static void Area(int R){
        float area = (float) (3.14 * R * R);
        System.out.println(area+"Sqaure Meter");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius of Circle");
        int Radius = sc.nextInt();
        System.out.print("The Area of the Circle for Radius"+" "+Radius+"m"+" "+"="+" ");
        Area(Radius);*/

    /*public static void EFV(int age){
        if(age > 18){
            System.out.println("Person Is Eligible For Voting");
        }else{
            System.out.println("Person Is Not Eligible For Voting");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age Of The Person");
        int age = sc.nextInt();
        System.out.print("Opinion: ");
        EFV(age);*/


    /*public static void Prime(int n){
        int j = 0;
        for(int i =1; i <= n; i++){
            if( n % i == 0){
                j++;
            }
        }
        if(j == 2){
            System.out.println("The Number is Prime");
        }
        else{
            System.out.println("The Number is Composite");
        }
    }


    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        Prime(x);*/

    //public static void main(String[] args) {
    /*int i =0;
    while(true){
        System.out.println(i);
        i++;
    }*/

        /*int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(true);*/

   /* public static int Power(int X, int n){
        int C = (int) Math.pow(X,n);
        //System.out.println(C);
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = sc.nextInt();
        Power(X,n);
        System.out.println(Power(X,n));*/

        /*public static void main(String[] args) {
            int n = 2;
            int x = 5;
            int c = 1;
            for(int i = 1; i <= n; i++){
                c = c*x;
            }
            System.out.println(c);*/


        /*public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int X = sc.nextInt();
            int Y = sc.nextInt();
            for(int i =1; i <= X; i++){
                if(X%i == 0){
                    System.out.println(i);
                }
            }

            for(int j =1; j <= Y; j++) {
                if (Y%j == 0) {
                    System.out.println(j);
                }
            }*/



    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int x = 5;
        int n = 2;
        int j =1;
        for(int i = 1; i <= n; i++){
            j = j*x;
        }
        System.out.println(j);


    }
}
