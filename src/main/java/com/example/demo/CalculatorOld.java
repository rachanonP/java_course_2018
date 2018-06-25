package com.example.demo;

class MainOld {

    public int add(int i, int i1) {
        return i+i1;
    }
}

public class CalculatorOld {

    public static void main(String[] args) {
        CalculatorOld calculatorOld = new CalculatorOld();
        calculatorOld.start();
    }

    private void start(){
        MainOld mainOld = new MainOld();
        System.out.println(mainOld.add(1,2));
    }
}
