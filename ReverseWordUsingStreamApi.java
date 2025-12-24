import java.util.stream.IntStream;

public class ReverseWordUsingStreamApi {
    public static void main(String[] args) {

        String word = "Narayan";

        String reversed = IntStream.range(0, word.length())
                .mapToObj(i -> word.charAt(word.length() - 1 - i))
                .map(String::valueOf)
                .reduce("", (a, b) -> a + b);

        System.out.println(reversed);
    }
}
