//Static Keyword
//Means accessible for everyone not like Public
//Static are those properties which will remain same for all kind of class
package com.OOPS6;
class Student{
    String name;
    static String school; //Because school name will remain same for all Student--> we want to keep school name same for all students
    //Student class ke liye jitne bhi object banenge sbke liye School name same rahenge
    //Some functions can also be static --> which is called with the help of class
    public static void cahngeSchool(){
        school = "New School";
    }
}
public class Main {

    public static void main(String[] args) {
        Student.school = "JNV";//Static properties can be used by this way--> directly by using class name
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.name);
        System.out.println(student1.school);

    }
}
//Static are those properties which should be same for all class

//Static Keyword can be used in four ways inside the Java
//==>Can be used with properties
//==>Can be used with functions/Methods
//==>Can be used with Blocks
//==>Can be use with nested class
//==>Static properties ==> Memory Allocated once
//==>Object properties ==> Memory Allocated Again and Again
//==> If we want to save our Memory, and we have common in information then we will use Static for that Properties/Functions/Variable
//==>OOPS use to write codes in an organized manner
                                              //===>>>>>Thank-you<===\\
