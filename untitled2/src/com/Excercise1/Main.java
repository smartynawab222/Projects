package com.Excercise1;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
	for(int i = 1; i <= n; i++) {
        if (n % i == 0) {
            count = count + 1;

        }
    }
        if(count == 2 ){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }*/

        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int j = 0;
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                j = j+i;
                //System.out.print(j+" ");
            }/*else{
                System.out.println();
            }*/
        }
        System.out.println(j);

    }
}
