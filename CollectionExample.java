import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Narayan");
        names.add("Rahul");
        names.add("Amit");
        System.out.println("Names List: " + names);
        System.out.println("First name: " + names.get(0));
        names.remove("Rahul");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
