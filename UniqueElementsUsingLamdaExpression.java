import java.util.*;

public class UniqueElementsUsingLamdaExpression {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 4, 5, 1, 6 };

        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);
    }
}
