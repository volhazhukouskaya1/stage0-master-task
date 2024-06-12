package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int a=1; a<=10; a++) {
          System.out.println(a +" x " +numberTableToPrint + " = " + a*numberTableToPrint);
        }
    }

}
