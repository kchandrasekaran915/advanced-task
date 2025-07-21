import java.util.*;
import java.util.stream.*;
    public class GiftforAstudent {
        public static void main(String[] args) {
            // 1. Use List interface to store student names
            List<String> studentNames = Arrays.asList(
                    "Alice", "Bob", "Anita", "David", "Aarav",
                    "Catherine", "Akhil", "Rita", "Ayesha", "Arjun"
            );

            // 2. Use Stream API with lambda to filter names starting with "A"
            List<String> specialGiftStudents = studentNames.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            // Print the students eligible for special gifts
            System.out.println("Students eligible for special gifts:");
            specialGiftStudents.forEach(System.out::println);
        }
    }

