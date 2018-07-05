package day4;


import java.util.ArrayList;
import java.util.List;

public class Abbreviation {

    public String lowerCase(String string) {
        String cutOf = string.replace(" of", "");
        String[] list = cutOf.split(" ");
        String result = "";
        for (String s: list) {
            result += s.substring(0,1);
        }
        return result;
    }

    public String[] split(String input) {
        // "\\s" is space
        String result = input.trim();
        return result.split("\\s");
    }

    public List<String> filter(String input) {
        String[] result = split(input);
        List<String> afterFilter = new ArrayList<>();
        for (String string: result)  {
            if (!string.toLowerCase().equals("of") && !string.equals("by")) {
                afterFilter.add(string);
            }
        }
        return afterFilter;
    }

    public String of(String string) {
        List<String> afterFilter = filter(string);
        String result = "";
        for (String s:afterFilter) {
            result += s.charAt(0);
        }
        return result.toUpperCase();
    }
}
