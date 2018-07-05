package com.example.demo.fizzbuzz;

public class FizzCondition implements Condition{
    public boolean check(int input) {
        return input % 3 == 0;
    }

    public String say() {
        return "Fizz";
    }
}
