package day4;

import java.util.Random;

public class Demo {

    public int generateNumber(MyRandom random) {
        return random.nextInt();
    }
}

interface MyRandom {
    int nextInt();
}
