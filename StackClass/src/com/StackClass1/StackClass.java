//Stack's Operation==>1)Push 0(1),-->2)Pop 0(1)-->3)Peek 0(1)
//Stack are Also Called (Last In First Out)-->(LIFO)==> Data coming in last that Data firstly will go out
//Push Operation-->Push Something keep over the stack(kisi cheez ko push krke Stack ke upar daal dena)==>(It Always Implemented at the top of the Stack/End of the Stack--> Time Complexity==>O(1)
//Pop Operation==> Remove the topmost element at the Stack
//Peek==>take out the value of the topmost element at Stack
//In good implementation the time complexity must be 0(1)
//Real Life Examples==> Stack of Plate, Stack of Books, Brick work
//Implementation of Stack in Coding
//1)Array == Fixed Size == Stack(Fixed Size)==>In this Case last element/Index will be treated as the Top element of the Stack
//Problem==>Many Elements can come inside the stack==>(Hectic process) we do not use it usually
//2)ArrayList == Variable Size == LinkedLIst == Stack
//In this Case last element/Index will be treated as the Top element of the Stack
//3)LinkedList==>
//Step 1) Create 1st Element(Head)
//Step 2) Create the other elements make it Head consecutively
//Stack can be treated as LinkedList because whatever operations we will do like Push, Pop & Peek it will take the time complexity of O(1), and we know the when the implementation will be good then only the time Complexity will be O(1)
//if the last element will be created as head the there will be the problem in time complexity
//So we will Implement the Stack using ArrayList and LinkedList

//How to Develop the Stack Using the LinkedList
package com.StackClass1;

public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head;//head will be LinkedList head and top of the Stack

        //(Corner Case)To check that our Stack is empty or not
        public static boolean isEmpty() {

            return head == null;
        }

        //Push function
        //push it over the LinkedList Head
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;//negative number indicates that Stack is empty and there is nothing to POP
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            while(!s.isEmpty()){
                System.out.print(s.peek()+" ");
                s.pop();
            }

    }

}


