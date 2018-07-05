package com.example.demo.fizzbuzz;

public class FizzBuzzCondition implements Condition{
    public boolean check(int input) {
        return input % 15 == 0;
    }

    public String say() {
        return "FizzBuzz";
    }
}
