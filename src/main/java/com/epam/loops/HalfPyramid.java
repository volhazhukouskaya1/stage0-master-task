package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int a=1; a<=cathetusLength; a++) {
            for (int b=1; b<= cathetusLength; b++) {
                if (b<cathetusLength-a+1) {
                    System.out.print(" ");
                }
                else  {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
