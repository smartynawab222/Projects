package com.bank;

class Account{
    //--> Access Modifiers
    //Public type---> it can used for functions(Methods), Characteristics, Parameters etc...
    //This information can be access by anyone in our class,even it can be used in any another packages,
    //means if anybody has created the object then it can be accessible==>example of Scanner class
    public String name;
    //Default access modifiers
    int age;
    //Protected access modifiers
    protected String email;
    //Private Modifiers
    //cannot be access by another package, another class in same package, only the same class can access it
    private String Password;
    //to access this private modifiers we will make a getter function
    public String getPassword(){
        //we can also use like
        setPassword("randomPass");
        return this.Password;
    }
    //using of setter function to access private modifiers
    private void setPassword(String pass){
        this.Password = pass;
    }
}

public class Main {

    public static void main(String[] args) {
        //main function must be public so tha it can be accessed by the java run time compiler
        Account account1 = new Account();
        account1.name = "Adil Nawab";
        account1.age = 23;
        account1.email = "adilnawab222@gmail.com";
        //===>//account1.Password = "abcd";//--> see this private modifiers can not be accessible by Main Class, hence it can only be access by account Class
        //Above name parameter is used because it is under the public access modifiers

        //==>Default access modifiers
        //it can be accessible inside our package only, other package can not access it
        //--> In default we do not need to Specify our default access modifiers---> if we do not specify ant modifiers in front of Parameters(etc...)
        //then java itself treat it as default access modifiers

        //==>Protected modifiers can be accessible in our package, and it can only be access by subclass of another package

        //==> Private Modifiers
        //it can not be access outside from the class
        //so how to access private modifiers
        //using -- > getters and setters
        //getters ---> Return the information of Private Modifiers
        //setters ---> set any value of that private modifiers
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());


        //Encapsulation -->it is defined as to combine Data and Methods in on entity
        //Creating a Class and Object is called as encapsulation
        //Concept of Data Hiding Can be possible with the Help of Encapsulation
        //Data Hiding concept can be implemented by using Access modifiers
    }
}
