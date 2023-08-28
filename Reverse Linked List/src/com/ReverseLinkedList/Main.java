//Here we will study how two reverse Linked List
//Two Methods-->Iterative Method,-->Recursive Method
//(Head)<==1-->2-->3-->4-->null
//Now the reverse one will be==> null<--1<--2<--3<--4==>(Head)
//Condition must be Satisfied that is no extra memory should be used==>Space complexity O(1).
//time complexity ==>O(n)
//in iterative method we will use three types of Nodes==>1)Previous Node(Before the current Node),2)Current Node,3)Next Node(After the Current Node)
//we will solve this problem in a bunch of three

package com.ReverseLinkedList;
class LinkedList {
    Node head;
    private int size;

    LinkedList(){

        this.size =0;
    }
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Add First/Add Last
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){

            currNode = currNode.next;

        }
        currNode.next =newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("String is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" "+"-->"+" ");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }
    //Delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //Delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;//head.next ==> null --> lastNode = null
        while(lastNode.next != null){//null.next==> null
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){

        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            //Update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}



public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        list.reverseIterate();
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
