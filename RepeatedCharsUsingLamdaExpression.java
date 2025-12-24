import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharsUsingLamdaExpression {
    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        charCount.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
