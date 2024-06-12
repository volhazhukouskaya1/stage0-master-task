package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
   int result=1;
        for (int a =1; a<=power; a++) {
            result=result*numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
