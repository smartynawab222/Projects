package com.stringbuilder;

public class Main {

    public static void main(String[] args) {
	//String Builder is used to make any changes in Existing String
        /*StringBuilder sb = new StringBuilder("Tony");
        System.out.println((sb));
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);
        sb.append("Stark");
        System.out.println(sb);
        System.out.print(sb.length());*/

        //Reverse the String Problem
        StringBuilder sb = new StringBuilder("HELLO");
        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.print(sb);

    }
}
