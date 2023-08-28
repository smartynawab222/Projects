package com.OOPS;

class Pen{
    //Properties(Data)
    String color;
    String type;

    //Function(Methods)
    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
    class Student{
    String Name;
    int age;

    public void info(){
        System.out.println(this.Name);
        System.out.println((this.age));
    }
    //Non Parameterize Constructor
    /*Student() {
        System.out.println("Called Constructor");
    }*/
        //--> Parameterize Constructor
        Student(Student s2) {
            this.Name = s2.Name;
            this.age  = s2.age;
        }
        Student(){

        }
    }

public class Main {

    public static void main(String[] args) {
        /*Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        //pen1.write();

        Pen pen2 = new Pen();
        pen2.type = "Ball point";
        pen2.color = "Black";

        pen1.printColor();
        pen2.printColor();*/

        //Student s1 = new Student();//-->Non Parameterize Constructor
        Student s1 = new Student();
        s1.Name = "Adil Nawab";
        s1.age = 23;
        //s1.info();
        Student s2 = new Student(s1);
        s2.info();
        ////new keyword will create a space in memory heap or Allocate the space to our objects in Memory heap
         //Student() --> It is a special kind of functions which is called as constructors, it will create/construct java objects
        //Three type of constructors
        //-->Non Parameterize Constructor ---> do not take any kind of parameters
        //Characteristics
        //Objects/Class Constructor name must be same as Class name
        //Constructor do not return Anything
        //one object---> one constructor

        //if we do not write any non parameterize constructor in java then java itself create a non parameterize constructor


        //--->Parameterize Constructor

        //--> Copy Constructors

        //In java we do not need Destructor
        //Java itself has a Destructor

    }
}
