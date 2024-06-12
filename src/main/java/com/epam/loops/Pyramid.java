package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
     for (int a=1; a<=cathetusLength; a++) {
         for (int b=1; b<= cathetusLength+a-1; b++) {
             if (b<cathetusLength-a+1 || b>cathetusLength+a-1) {
                 System.out.print(" ");
             }
             else if (b<cathetusLength) {
                 System.out.print(cathetusLength-b+1);
             }
             else {
                 System.out.print(b-cathetusLength+1);
             }
         }
         System.out.println();
     }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
