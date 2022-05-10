package com.ecpe205;

public class Calculator {
    public double power( double a, double b ) {
        double pow = 1;
        for(int i=1;i<=b;i++){
            pow = pow*a;
        }
        return pow;
    }
    public double factorial(double value) {
        int fact;
        if(value>=0){
        fact=1;
        for(int i=1;i<=value;i++){
            fact=fact*i;
        }

        return fact;

        }
        else{
        fact=-1;
        for(int i=-1;i>=value;i--){
           fact=fact*i;
        }
        if (fact>0) {
            fact = fact * -1;
        }
        return fact;
        }
    }
    public boolean Palindrome (String word) {
        int i = 0, g = word.length() - 1;

        // While there are characters to compare
        while (i < g) {

            // If there is a mismatch
            if (word.charAt(i) != word.charAt(g))
                return false;

            i++;
            g--;
        }

        return  true;
    }

    public int[] Sort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int g = i + 1; g < arr.length; g++) {
                if (arr[i] > arr[g]) {
                    temp = arr[i];
                    arr[i] = arr[g];
                    arr[g] = temp;
                }
            }
        }
        return;
    }


    
    //https://github.com/kaiserabanto/ecpe205-unit-test.git
