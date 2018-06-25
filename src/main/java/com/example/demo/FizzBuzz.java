package com.example.demo;

public class FizzBuzz {

    public String say(int input) {

        for (int i =input; i>=0; i-=15){
            if (i==0){
                return "FizzBuzz";
            }
        }

        for (int i =input; i>=0; i-=5){
            if (i==0){
                return "Buzz";
            }
        }

        for (int i=input; i>=0; i-=3){
            if (i==0){
                return "Fizz";
            }
        }

        return ""+input;
    }
}
