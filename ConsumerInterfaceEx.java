import java.util.function.Consumer;

public class ConsumerInterfaceEx {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Java 8");
    }
}
