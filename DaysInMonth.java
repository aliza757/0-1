import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Determine the number of days in the month
        int days;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28; // Not a leap year
                }
                break;
            default:
                System.out.println("Invalid month entered.");
                return; // Exit the program if the month is invalid
        }

        // Display the result
        System.out.println("The month " + month + " of year " + year + " has " + days + " days.");
    }
}
