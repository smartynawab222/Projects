package com.newclassofjava;
import java.sql.SQLOutput;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // first code in java//
        /*String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("May I know your Name");
        name = sc.nextLine();
        System.out.println("Welcom "+ name);*/

        //DATA TYPES
        /*Primitive Data types we will store simple Data types and Primitive Data types has fix range,
                whereas Non primitive Data Types or Refrence Data types stores complex values and values with no fix range
                and primitive Data types has their own functions like length, type etc....*/
        /*TO RUN THE CODE ORALLY IS CALLED "DRY RUN"*/
        //STRINGS//
       /* String name = "Adil";
        System.out.println(name);
        System.out.println(name.length());*/
        //OPERATIONS ON STRINGS//
        //CONCATENATE//
       /* String name1 = "Adil";
        String name2 = "Nawab";
        String name3 = name1 +" "+ name2;
        System.out.println(name3);
        System.out.println(name3.charAt(0));
        System.out.println(name3.length());
        String name4 = name3.replace('a' , 'b');
        System.out.println(name4);
        //Strings are immutable
        //SubStrings
        System.out.println(name3.substring(5, 9));*/
        //Arrays//
        /*ARRAYS IS THE LIST OF SAME KIND OF DATA TYPES
                1D ARRAYS AND 2D ARRAYS ARE THERE, ARRAYS HAS ALSO SOME PREDEFINED FUNCTION/METHODS*/
        /*int[] marks = new int[3];
        marks[0] = 98;
        marks[1] = 96;
        marks[2] = 97;
        //System.out.println(marks);//this will not give me the actual array value, this will provide garbage value/
        System.out.println(marks[0]);
        System.out.println(marks.length);
        // SORT
        Arrays.sort(marks);
        System.out.println(marks[0]);*/

        //Another way to initiallize Arrays

        /*int[] marks = {97,98,99};
        System.out.println(marks[0]);*/

        //2D Arrays//
       /* int[][] marks = {{98,99,100}, {91, 92, 93}};
        System.out.print(marks[1][1]);*/

        //Casting is the change of data type from one data type to another data type. Casting are of two types Implicit casting and explicit casting

        /*double price = 100.00;
        double finalPrice = price + 18; //an example of implicit casting//
        System.out.println(finalPrice);

        //Explicit casting

        int price1 = 54;
        int finalPrice2 = 54 + (int)18.;
        System.out.println(finalPrice2);*/

        //CONSTANTS//
        // TO ENSURE THAT THE VALUE MUST REMAIN CONSTANT WILL USE "FINAL KEYWORD"//
        /*final float pi = 3.147F;
        pi = 1.1F;
        System.out.println(pi);*/

        //ARITHMETIC OPERATORS;
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter the Value b");
        int b = sc.nextInt();

        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);*/

        //ASSIGNMENT OPERATORS
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter the Value of b");
        int b = sc.nextInt();
        a = b;
        System.out.println(a);*/

        //Unary operators//
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //a = a++;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);*/

        //MATHS CLASS
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("The Maximum Value Among a And b is");
        System.out.println(Math.max(a,b));
        System.out.println("The Minimum Value Among a And b is");
        System.out.println(Math.min(a,b));

        //Random is the function of maths which returns the value between 0.00 to 1.00
        System.out.println("The Random Value of the Syntax Are");
        System.out.println(Math.random());
        System.out.println("The integer Random Value of the Syntax Are");
        System.out.println((int)Math.random());*/
        //System.out.println((int)(Math.random()*100));

        //Comparison Operators//
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a = sc.nextInt();
        System.out.println("Enter The Value of b");
        int b = sc.nextInt();*/

        //Conditional Statement

       /* boolean isSunup = false;
        if(isSunup == true){
            System.out.println("Good Morning");
        }
        else{
            System.out.println("Good Night");
        }*/
        /*System.out.println("Please Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>= 18){
            System.out.println("Can Vote");
        }else{
            System.out.println("Can't Vote");
        }*/
        //Logical Operators
        /*boolean isSunup = false;
        if(!isSunup){                   // it will automatically check for true condition if we don't write true condition
            System.out.println("Good Morning");
        }
        else{
            System.out.println("Good Night");}*/

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of a");
        int a = sc.nextInt();
        System.out.println("Enter The Value of b");
        int b = sc.nextInt();

        if (a <= 50 && b <= 50 ){
            System.out.println("Very Good");
        }else{
            System.out.println("Very Bad");
        }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of a");
        int a = sc.nextInt();
        System.out.println("Enter The Value of b");
        int b = sc.nextInt();

        if (a <= 50 || b <= 50 ){
            System.out.println("Very Good");
        }else{
            System.out.println("Very Bad");
        }*/
        System.out.println("Enter Any Value of Day ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Hello World");
                break;
            case 2:
                System.out.println("Hello Adil");
                break;
            case 3:
                System.out.println("Hello Nawab");
                break;
            case 4:
                System.out.println("Hello Asif");
            default:
                System.out.println("Khakkar Aadmi");

        }

    }
}
