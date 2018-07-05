package day4;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RandomNumberTest {

    @Test
    public void random_5() {
        // test random 5. I am Fix Random only 5
        Demo demo = new Demo();
        assertEquals(5, demo.generateNumber(new Random5()));
    }
}

class Random5 implements MyRandom{
    @Override
    public int nextInt() {
        return 5;
    }
}
