import java.util.*;
import java.util.stream.*;

public class mainnum {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aBc", "d", "ef");

        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original List: " + names);
        System.out.println("Uppercase List: " + upperCaseNames);
    }
}