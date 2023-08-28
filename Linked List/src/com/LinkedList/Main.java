//LinkedList==>it means there is a list of Elements/Nodes, and it is linked together, and forming an overall structure
//in LinkedList the Data stored in the form of Non-contiguous form,
//LinkedList vs ArrayList
//-->ArrayList==>it Implements inside the memory with the help Dynamic Array, if the Dynamic Array filled completely, and we need to insert something in an ArrayList then we use new Dynamic Array of larger capacity and paste all the elements of smaller Dynamic Array in new Dynamic Array
//--> In general, in case of an ArrayList the time complexity of insertion of any element in an ArrayList is O(n).
//-->In general, in case of an ArrayList the time complexity of searching of any element in an ArrayList is O(1).
//-->In general, in case of an LinkedList the time complexity of insertion of any element in an LinkedList is O(1)(time complexity of constant operation)
//-->In general, in case of an LinkedList the time complexity of insertion of any element in an LinkedList is O(n).
//--> Because in this case you do not at which index which number is stored, so you have to traverse throughout the LinkedList.
//-->Therefore it has been concluded that if there is any Addition/Insertion of an Element Process then we have to go for LinkedList
//-->Therefore it has been concluded that if there is any search operation of an Element Process then we have to go for ArrayList
//--> Basic Structure of LinkedList is Node--> Node of LinkedList consist of two Parameters----> 1)Data, 2)next---> next is a Reference Point(Pointing towards the Next Address or next point)
//-->Types of Nodes---> 1)Head(First Node) and Tail(Last Node)
//---> Types of Linked List===> 1)Singular(Can only move fwd./ Can only Store fwd. Pointer), 2)Double(Can move fwd. and bwd./Can store fwd. and Backward pointers)
//--->Circular LinkedList===> In which Last Node is Connected with first Node
//--->Four Operations on LinkedList==> Addition,-->Printing of LinkedList,-->Delete.--->Size of LinkedList
//--->Never Manipulate Head always take a "currentNode" kind of Variable
//-->Corner Cases---> which are different from normal cases
package com.LinkedList;
class LinkedList {
    Node head;
    private int size;

    LinkedList(){
        this.size =0;
    }
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //Add First/Add Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
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
}


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("This");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());
    }
}
