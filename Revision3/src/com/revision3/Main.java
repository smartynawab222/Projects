package com.revision3;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b");
        int b = sc.nextInt();
        System.out.println("Press the Case you want");
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Case, Please Try Again");
        }*/
        System.out.println("Enter the first Value");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter the Second Value");
        int y = sc.nextInt();
        System.out.println("Enter the Case you want");
        int z = sc.nextInt();
        if(z == 1){
            System.out.println(x+y);
        }
        else if(z == 2){
            System.out.println(x-y);
        }
        else if(z == 3){
            System.out.println(x*y);
        }
        else if(z == 4){
            System.out.println(x/y);
        }
        else if(z == 5){
            System.out.println(x%y);
        }
        else{
            System.out.println("Please try again");
        }

    }
}
