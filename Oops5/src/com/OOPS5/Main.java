//Abstract Using Interface===> it is a kind of pure Abstraction
//It does not allow any kind of Constructor
//it also does not allow any kind of Non-Abstract Methods/Functions

package com.OOPS5;
interface Animal{
    int eyes = 2;//-->Static==>Same for Everyone, Final==>Always remain fixed, Public==> Accessible to everyone
    public void walk();//if we will remove Public the by default it will remain Public and Abstract
}
interface Herbivore {

}
//Interface Can  not be extended it can be Implement
//Multiple Inheritance
class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }

}

public class Main {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

    }
}
//All fields in Interface are Public, static and final by default
//All methods are public and abstract by default
//all class implements an interface must implement all the methods declared in the interface
//interfaces support the functionality of multiple inheritance