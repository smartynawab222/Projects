package com.strings;

import java.util.Scanner;

public class Main {

    /*public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.print(name);*/
    // Concatenation
    /*public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String First_name = sc.nextLine();
    String Second_name = sc.nextLine();
    String Final_name = First_name + " " + Second_name;
    //System.out.print("Your Name is" + " " + Final_name);

    //charAt
        for(int i = 0; i < Final_name.length(); i++){
            System.out.println(Final_name.charAt(i));
        }*/
    //Compare to
        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String First_name = sc.nextLine();
            String Second_name = sc.nextLine();
            if(First_name.compareTo(Second_name) == 0){
                System.out.println("Strings are equal");
            }else{
                System.out.print("Strings are not equal");
            }*/
    //Substring
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String First_name = "Gold Medalist Adil Nawab";
        //String Second_name = sc.nextLine();
        System.out.print(First_name.substring(5,First_name.length()));
    }
}
//String is Immutable;
