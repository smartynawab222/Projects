/*package com.newclassofjava;
import java.sql.SQLOutput;
import java.util.*;

import java.net.StandardSocketOptions;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A % 2 != 0){
            System.out.println("Weird");
        }
        if(A%2 == 0 && A >= 2 && A <= 5){
            System.out.println("Not Weird");
        }
        if(A%2 == 0 && A >= 6 && A <= 20){
            System.out.println("Weird");
        }
        if(A%2 == 0 && A>20){
            System.out.println("Not Weird");
        }
    }
}*/


package com.newclassofjava;
import java.sql.SQLOutput;
import java.util.*;

import java.net.StandardSocketOptions;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Exam = sc.nextInt();
        switch(Exam){
            case 80:
                System.out.println("AS");
                break;
            case 60:
                System.out.println("A");
                break;
            case 40:
                System.out.println("B");
                break;
            case 30:
                System.out.println("C");
                break;
            case 25:
                System.out.println("D");
                break;
            case 20:
                System.out.println("E");
                break;
            case 15:
                System.out.println("P");
                break;
            case 10:
                System.out.println("F");
                break;
        }


        /*//Sacnner sc = new Scanner(System.in);
        //int A = 2;
        for(int A = 2; A <= 20; A++){
            for(int i = 1;i <= 10;i++){
                System.out.println(A+"x"+i+"="+A*i);
            }
        }
*/

        /*Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        if(A % 2 != 0){
            System.out.println("Weird");
        }
        else if(A%2 == 0 && A >= 2 && A <= 5){
            System.out.println("Not Weird");
        }
        else if(A%2 == 0 && A >= 6 && A <= 20){
            System.out.println("Weird");
        }
        else if(A%2 == 0 && A>20){
            System.out.println("Not Weird");
        }
*/
    }

}
