package day4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AbbreviationTest {

    @Test
    public void ShortFirst() {
        String string = "United States of America";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.lowerCase(string);
        assertEquals("USA", result);
    }

    @Test
    public void check_data_after_split_data() {
        String string = "United States of America";
        Abbreviation abbreviation = new Abbreviation();
        String[] result = abbreviation.split(string);
        assertEquals(4, result.length);
        assertArrayEquals(
                new String[] {"United", "States", "of", "America"},
                result);
    }

    @Test
    public void filter_out_of_stop_word() {
        String string = "United States of America";
        List<String> listAssert = new ArrayList<>();
        listAssert.add("United");
        listAssert.add("States");
        listAssert.add("America");
        Abbreviation abbreviation = new Abbreviation();
        List<String> result = abbreviation.filter(string);
        assertEquals(listAssert, result);
    }

    @Test
    public void filter_out_of_stop_word_from_data() {
        String string = "United States of America";
        List<String> listAssert = new ArrayList<>();
        listAssert.add("United");
        listAssert.add("States");
        listAssert.add("America");
        Abbreviation abbreviation = new Abbreviation();
        List<String> result = abbreviation.filter(string);
        assertEquals(listAssert, result);
    }

    @Test
    public void get_result_return_USA() {
        String string = "United States of America";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.of(string);
        assertEquals("USA", result);
    }

    @Test
    public void get_result_return_USA_with_lower_case() {
        String string = "united states of america";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.of(string);
        assertEquals("USA", result);
    }

    @Test
    public void get_result_return_LASER() {
        String string = "Light Amplification by Stimulation of Emitted Radiation";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.of(string);
        assertEquals("LASER", result);
    }

    @Test
    public void get_result_return_JTW() {
        String string = "Jordan Of the World ";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.of(string);
        assertEquals("JTW", result);
    }

    @Test
    public void using_stream_result_return_USA() {
        String string = "United States of America";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.ofStream(string);
        assertEquals("USA", result);
    }
    @Test
    public void using_stream_result_return_USA_with_lower_case() {
        String string = "united states of america";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.ofStream(string);
        assertEquals("USA", result);
    }

    @Test
    public void using_stream_result_return_LASER() {
        String string = "Light Amplification by Stimulation of Emitted Radiation";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.ofStream(string);
        assertEquals("LASER", result);
    }

    @Test
    public void using_stream_result_return_JTW() {
        String string = "Jordan Of the World ";
        Abbreviation abbreviation = new Abbreviation();
        String result = abbreviation.ofStream(string);
        assertEquals("JTW", result);
    }
}
