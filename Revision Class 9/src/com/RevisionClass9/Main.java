package com.RevisionClass9;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        String full_name = sc.nextLine();
        System.out.println(full_name);*/

        //Concatenate
        /*Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        String last_name = sc.next();
        String full_name = first_name+" "+last_name;
        System.out.println(full_name);*/


        //charAt
        /*Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        String last_name = sc.next();
        String full_name = first_name+" "+last_name;
        System.out.println(full_name);
        for(int i = 0; i<full_name.length();i++){
            System.out.print(full_name.charAt(i)+"   ");*/
        //}

        //Compare

        /*Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        String last_name = sc.next();
        String full_name = first_name+" "+last_name;
        System.out.println(full_name);
        *//*for(int i = 0; i<full_name.length();i++) {
            System.out.print(full_name.charAt(i) + "   ");*//*
        // String 1 > String 2 ===> +ve Values
        // String 1 < String 2 ===> -ve Values
        //String 1 == String 2 ===>     0
        if(first_name.compareTo(last_name)== 0){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Strings Are Not Equal");
        }*/

        //Compare Using Equals to

        /*Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        String last_name = sc.next();*/
        //String full_name = first_name+" "+last_name;
        //System.out.println(full_name);
        //for(int i = 0; i<full_name.length();i++) {
            //System.out.print(full_name.charAt(i) + "   ");
        // String 1 > String 2 ===> +ve Values
        // String 1 < String 2 ===> -ve Values
        //String 1 == String 2 ===>     0

        /*String first_name = "Adil";
        String last_name = "Adil";
        if(first_name == last_name){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Strings Are Not Equal");
        }*/

        //Sub Strings

        /*String Sentence = "My Name is Adil Nawab";
        System.out.println(Sentence.substring(11,15));*/


        ///###Note: Strings Are Immutable###\\\


        //##Strings Builder##\\

        /*StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //char At Index
        System.out.println(sb.charAt(0));

        //Set at chatAt index ==> Replace any Character

        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Insert any Character

        //sb.insert(5, 'n');
        System.out.println(sb.insert(5, 'n'));

        //Delete any Character:

        System.out.println(sb.delete(0,1));

        //Append Any character:

        *//*sb.append(' ');
        sb.append('m');
        sb.append('u');
        sb.append('s');
        sb.append('k');*//*
        sb.append(" "+"Musk"+" ");
        System.out.println(sb);
        sb.setCharAt(0,'E');
        System.out.println(sb);
        sb.append("is Number"+' ');
        sb.append(1);
        System.out.println(sb);*/


        //##Reverse the String##\\

        /*StringBuilder sb = new StringBuilder("Hello");

        for(int i = 0; i<sb.length()/2;i++){
            //Calculate the Index which has to be replaced
            int front = i;
            int back = sb.length() - 1 - i;

            //Calculate the Character at Different Positions

            char frontChar = sb.charAt(front);
            char backChar  = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
*/
        int a = 10;
        int b = 0;
        //b = ++a;
        //System.out.println(a);
        //System.out.println(b);
        if(!(a>b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
