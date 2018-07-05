package com.example.demo.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FizzBuzz {

    private String result;

    public String say(int input) {
        //register
        List<Condition> conditions = new ArrayList<>();
        conditions.add(new FizzBuzzCondition());
        conditions.add(new BuzzCondition());
        conditions.add(new FizzCondition());
        conditions.add(new KBTGCondition());
        conditions.add(new ValueCondition());

//        //process
//        for (Condition condition: conditions) {
//            if (condition.check(input)) {
//                return condition.say();
//            }
//        }
//        throw new RuntimeException("Condition not match");

        //process stream
        return  conditions.stream()
                .filter(condition -> condition.check(input)) //if
                .map(Condition::say) //return
                .collect(Collectors.toList()).get(0); // to List

    }

}
