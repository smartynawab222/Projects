//Question 1)Push at the bottom of the Stack
//Stack ==>Implicit Stack(Recursion Stack), Created by Memory/Code,-->Explicit Stack, Created by Users
//Step1) Remove All the Data and make the Stack Empty
//Step2) Then Push the Given New Elements and then push the other Old elements
//In Implicit Stack we will perform some operations while going up, and we will perform some operations while coming down
//During going up we will remove All the Elements and while coming down we will push all the elements in stack
//Null Stack will be our Base Case
//We will push our new elements in the Base Case
//while returning again we will push all the Elements
package com.StackProblem;

import java.util.Stack;

public class Main {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //pushAtBottom(5,s);
        reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }

    }
}
