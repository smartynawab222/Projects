//Abstraction ---> to show the Important things to User and To hide the non-important things from user
//Abstractions and data hiding are two different things do not confuse
//ABSTRACTION can be implement by two ways---> 1)Use Abstract keywords or create abstract class/functions/properties
//2) Use the Interfaces
package com.OOPS4;
//Abstract and Abstract Class
/*class Animal{
    public void walk(){

    }
}*/
abstract class Animal{
    //Abstract class can have Abstract and Non-Abstract Methods/Parameter
    //Abstract Method
    abstract void walk();
    //Non-Abstract Method
    public void eats(){
        System.out.println("Animal Eats");
    }
    //Constructor
    Animal(){
        System.out.println("You are creating an animal");
    }
}
class Horse extends Animal {
   public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
//In above, we do not we do not need to show Animal Class to user because Class Horse and Class Chicken Using the Parameters/Methods of Class Animal
//therefore we will make the Animal Class as Abstract Class using Abstract Keyword
//we can also make Abstract function/properties inside the abstract class
//Blueprint of a class(Sub-Class) is its Base class
//Blueprint of an object is its Sub-Class/Base-Class


public class Main {

    public static void main(String[] args) {
	Horse h1 = new Horse();
    h1.walk();
    h1.eats();
    //if we will try to make an object for Animal it will show a run-time error
        //" Cannot Instantiate the Type Animal "
        //it can have constructors and static methods also

        //Constructor Chaining
        //(Calling Pattern)---->Base Class Constructor---->SubClass Constructor
    }
}
