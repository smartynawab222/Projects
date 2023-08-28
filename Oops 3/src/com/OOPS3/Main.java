package com.OOPS3;
/*//Base class(parent class)
class Shape{
    String color;
}
//Subclass(child class)
class Triangle extends Shape{

}*/

//Single level Inheritance--> Parent Class --> Subclass
//Parent Class
class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}
//Subclass1
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//Multi level Inheritance--> Parent Class ---> Sub Class 1(Parent Class for Subclass1 i) ---> Sub Class 1 i
//Subclass1 i
class EquilateralTriangle extends Triangle {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//Hierarchical Inheritance---> Parent Class ---> Subclass1 ---> Subclass2
//Subcalss2
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//Hybrid Inheritance --> It is the Combination of all kind of Inheritance

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        //Inheritance -- > when one class using the Properties of other class
        //No Error even we have not defined any color properties in Triangle class
	//Inheritance increases the usability of Code
        //Base Class --> through which subclass inherit the properties
        //Packages ---> Inside the package we actually write same kind of projects-->it is actually used to write your code in an organized manner
        //Built-in packages & User Defined packages
    }
}
