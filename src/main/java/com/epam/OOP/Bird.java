package com.epam.OOP;



public class Bird extends Animal {

    public Bird () {
     super ("blue", 2,false);

    }


    public String getDescription() {
    String result = super.getDescription();
    result = result + " Moreover, it has 2 wings and can fly.";
        return result;

    }

}
