package com.StringBuilder1;

public class Main {

    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        //System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.insert(0,'K');
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.setCharAt(0, 'T');
        System.out.println(sb);
        sb.append(" Stark");
        System.out.println(sb);
        System.out.println(sb.length());*/


       /* //##Reversing the String, Ready for Something New!##\\
        //Defining a String using String Builder
        StringBuilder sb  = new StringBuilder("Stark");
        for(int i = 0 ; i < sb.length()/2; i++){
            //Processing the Index
            int front = i;
            int back = sb.length()-i-1;

            //Replacing the Index According Particular Index Number

            char Front = sb.charAt(front);
            char Back  = sb.charAt(back);

            sb.setCharAt(front, Back);
            sb.setCharAt(back, Front);
        }
        System.out.println(sb);*/

    }
}
