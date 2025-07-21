import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for birthdate input
        System.out.print("Enter the birthdate (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        try {
            // Parse input string to LocalDate
            LocalDate birthDate = LocalDate.parse(inputDate);
            LocalDate currentDate = LocalDate.now();

            // Check if birthdate is in the future
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birthdate can't be in the future.");
            } else {
                // Calculate the period (difference)
                Period age = Period.between(birthDate, currentDate);
                System.out.println("Your age is: "
                        + age.getYears() + " years, "
                        + age.getMonths() + " months, and "
                        + age.getDays() + " days.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
        }

        scanner.close();
    }
}

