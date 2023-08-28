package com.OOPS2;
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Adil Nawab";
        s1.age = 23;
        s1.printInfo(s1.name, s1.age);
        //Polymorphism
        //--> Function Over loading --> Compile type Polymorphism
        //|^V
        //in this case we will create Different Functions performing Different Works But all the functions Having the same name
        //--> Function Over Riding --> Run type Polymorphism

        //Rues:
        //--> Differentiating Factors--> Return Type Must be different,---> Parameters Type Should be Different,--->Number of Arguments should be different

    }
}
