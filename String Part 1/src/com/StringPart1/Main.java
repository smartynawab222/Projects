package com.StringPart1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String name = "Adil";
        System.out.println(name);*/

        /*Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        String full_name = sc.nextLine();
        //System.out.println(name);
        System.out.println(full_name);*/

        //##Some Operations Over the String##\\

        //Concatenation
       /* Scanner sc = new Scanner(System.in);
        String First_name = sc.nextLine();
        String Last_name = sc.nextLine();

        //String Full_name = First_name+" "+Last_name;
        //System.out.println(Full_name);
        System.out.println(First_name+' '+Last_name);*/

        //Length of the String
        /*String Name = "Adil Nawab";
        //System.out.println(Name.length());
        for(int i = 0; i < Name.length(); i++){
            System.out.print(Name.charAt(i)+" ");
        }*/

        /*Scanner sc = new Scanner(System.in);
        String Name1 = sc.nextLine();
        String Name2 = sc.nextLine();
        //String 1 < String 2 ==> -1
        //String 1 > String 2 ==> +1
        //String 1 == String 2 ==> 0

        if(Name1.compareTo(Name2) == 0){
            System.out.println("Strings Are Equal");
        }else{
            System.out.println("Strings Are Not Equal");
        }*/

        //##Sub Strings##\\

        /*Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println(Name.substring(0, 4));*/


        //##ParseInt Method of Integer class##\\

        /*String str = "123";
        int Number = Integer.parseInt(str);
        System.out.println(Number);*/

        /*int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of An Array");
        int size = sc.nextInt();
        String[] str = new String[size];

        for(int i = 0; i < size; i++){
            str[i] = sc.next();
        }
        int x = 0;

        for(int i = 0; i < size; i++){
            System.out.print(str[i]);
        }
*/
        /*Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
            System.out.println(totLength);
        }

        System.out.println(totLength);*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String Name = sc.nextLine();
        String result = "";

        for(int i = 0; i  < Name.length(); i++){
            if(Name.charAt(i) == 'e'){
                result = result+"i";

            }else{
                result = result+ Name.charAt(i);
            }
        }
        System.out.println(result);*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the E-mail ID");
        String E_mail_ID = sc.nextLine();
        String User_Name = "";
        for(int i = 0; i < E_mail_ID.length(); i++){
            if(E_mail_ID.charAt(i) == '@'){
                break;
            }else{
                User_Name = User_Name + E_mail_ID.charAt(i);
            }
            //System.out.println(User_Name);
        }
        System.out.println(User_Name);

    }
}






