package com.example.demo.fizzbuzz;

public class ValueCondition implements Condition {

    private int data;

    @Override
    public boolean check(int input) {
        this.data = input;
        return true;
    }

    @Override
    public String say() {
        return String.valueOf(data);
    }
}
