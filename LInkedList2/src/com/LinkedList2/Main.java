package com.LinkedList2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("List");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);
        list.addLast("Null");
        System.out.println(list);
        list.add("Happy");//if we do not write anything after the add(First/Last) by default is Assumed to be as addLast()
        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" "+"-->"+" ");
        }
        System.out.println("Null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(3);
        list.remove(2);
        System.out.println(list);

    }
}
