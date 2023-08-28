//Array is defined as a continuous chunk
//Properties of an Array
//Data will be stored in continuous form inside the memory
//Array's size always fixed
//once we have defined the size of an array then we cannot change it---> means we can not add any more elements
//we can store primitive Data type(int/float etc...)
//we can also store objects in ARRAY
//for primitive we need to create Memory beforehand
//it is stored in the form of Stack inside the memory

//==> Array List
//Data can be stored in non-continuous form
//Size of an array list are variable in nature
//here we can only store objects
//new objects can be added one by one
//Array list Store in the forms of heap inside the memory

//==>Operations of Array list
//--> Addition==> How to add an element in an Array
//-->Get==>How to get back the added element
//-->Modify/Add in Between==> if we want to insert any value or change any value at any Index
//-->Delete/Remove==>How to Delete or Remove any Particular Data from Data structure
//-->Iterate/Operations
package com.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //We Can not store Integer Variable inside the ArrayList
        //We have to use Integer/Float/String/Boolean class
        ArrayList<Integer> list = new ArrayList<Integer>();
       /* ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();*/

        //Add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //Get the Elements
        int element = list.get(0);
        System.out.println(element);

        //To Add element in Between
        list.add(1,2);
        System.out.println(list);

        //Set Element
        list.set(0,5);
        System.out.println(list);

        //Delete Element

        list.remove(3);
        System.out.println(list);


        //Size of an Array List
        int size = list.size();
        System.out.println(size);

        //Iteration on Array List
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Sorting
        Collections.sort(list);//Collections is a class in java it contains a function called Sort
//whatever the Data Structures of Collections framework like ArrayList/Maps/Set can be sort using this sort functions inside the Collection Class
        //It does not work on ARRAY
        System.out.println(list);
    }
}
