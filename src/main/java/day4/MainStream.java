package day4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        MainStream mainStream = new MainStream();
        mainStream.start();
    }

    private void start() {
        // Stream can use 1 round for 1 datas
        //Array
        String[] datas = new String[] {"One", "Two", "Three"};
        Stream<String> stream = Arrays.stream(datas);
        stream.forEach(System.out::println);

        List<String> lists = new ArrayList<>();
        lists.add("One");
        lists.add("Two");
        lists.add("Three");
        Stream<String> stream2 = lists.stream();
        stream2.forEach(System.out::println);

        // Filter Normal
        List<String> after = new ArrayList<>();
        for ( String string: lists) {
            if (string.startsWith("T")) {
                after.add(string);
            }
        }
        after.forEach(System.out::println);

        // Filter With Stream use filter()
        lists.stream().filter(string -> string.startsWith("T")).forEach(System.out::println);

        // Convert to lower case With Stream use map()
        lists.stream()
                .filter(string -> string.startsWith("T"))
                .map(string -> string.toLowerCase())
                .forEach(System.out::println);

        // save out put to list
        List<String> result = lists.stream()
                .filter(string -> string.startsWith("T"))
                .map(string -> string.toLowerCase())
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
