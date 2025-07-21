import java.util.*;
    public class nonemptystringfilter {
        public static void main(String[] args) {
            List<String> listStrings = Arrays.asList("abc", "bc", " ", "efg", "abcd", " ", "jkl");

            // Filter and collect non-empty (non-whitespace-only) strings
            List<String> nonEmptyStrings = new ArrayList<>();
            for (String str : listStrings) {
                if (!str.trim().isEmpty()) { // Remove spaces and check if not empty
                    nonEmptyStrings.add(str);
                }
            }

            System.out.println("List with non-empty strings:");
            System.out.println(nonEmptyStrings);
        }
    }

