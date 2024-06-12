package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;



    public Animal (String color, int numberOfPaws, boolean hasFur) {
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }


    public String getDescription() {
        String result = "This animal is mostly ";
        result= result + color + ". It has " + numberOfPaws;
        if (numberOfPaws > 1) {
            result = result + " paws ";
        } else {
            result = result + " paw ";
        }
        if (hasFur) {
            result = result + "and a fur.";
        } else {
            result = result + "and no fur.";
        }
        return result;
    }

}



