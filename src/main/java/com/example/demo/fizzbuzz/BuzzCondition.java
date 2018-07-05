package com.example.demo.fizzbuzz;

public class BuzzCondition implements Condition{
    public boolean check(int input) {
        return input % 5 == 0;
    }

    public String say() {
        return "Buzz";
    }
}
