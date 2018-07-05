package day4;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

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
            if (!string.equalsIgnoreCase("of") && !string.equals("by")) {
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

    public String ofStream(String input) {
//        Stream.of(input.split(" "))
//                .filter(e -> !"of".equalsIgnoreCase(e))
//                .map(e -> String.valueOf(e.charAt(0)))
//                .forEach(System.out::println);
        return Stream.of(input.split(" "))
                .filter(e -> !"of".equalsIgnoreCase(e))
                .filter(e -> !"by".equalsIgnoreCase(e))
                .map(e -> String.valueOf(e.charAt(0)).toUpperCase())
                .collect(joining(""));
    }
}
