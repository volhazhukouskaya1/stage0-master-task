package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int result = number%10 + number/10%10+ number/100%10 + number/1000;
        System.out.println(result);

    }

}
