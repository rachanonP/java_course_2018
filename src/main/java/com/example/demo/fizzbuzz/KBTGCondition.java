package com.example.demo.fizzbuzz;

public class KBTGCondition implements Condition{
    public boolean check(int input) {
        return input % 7 == 0;
    }

    public String say() {
        return "KBTG";
    }
}
