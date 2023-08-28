package com.RevisionClass10;

public class Main {

    public static void main(String[] args) {
	//##Bit Manipulation##\\

        //Get Operations;

        //Bit Mask : 1 << i
        //Operation : AND

        /*int Number = 5;
        int pos = 2;
        int BitMask = 1<<pos;
        if((BitMask & Number) == 0){
            System.out.println("The Bit is ZERO");
        }
        else{
            System.out.println("The Bit is ONE");
        }*/

        //Set BIT
        /*int Number = 5;
        int pos = 1;
        int BitMask = 1<<pos;
       int New_Number= BitMask | Number;
        System.out.println(New_Number);*/

        //Clear BIT
        /*int Number = 5;
        int pos = 2;
        int BitMask = 1<<pos;
        int Inverse = ~(BitMask);
        int New_Number = Inverse & Number;
        System.out.println(New_Number);*/

        //Update BIT
        //Case 1 : For Zero
        /*int Number = 5;
        int pos = 2;
        int BitMask = 1<<pos;
        int Inverse = ~(BitMask);
        int New_Number = Inverse & Number;
        System.out.println(New_Number);*/

        //Case 2 : For One
        /*int Number1 = 5;
        int pos1 = 1;
        int BitMask1 = 1<<pos1;
        int New_Number1 = BitMask1 | Number1;
        System.out.println(New_Number1);*/
    }
}
