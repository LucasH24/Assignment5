package wctc.edu;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Last Name >> ");
        String lastName = keyboard.nextLine();

        System.out.println("First Name >> ");
        String firstName = keyboard.nextLine();

        System.out.println("Middle Initial >> ");
        String middleInitial = keyboard.nextLine();

        System.out.println("Month of birth (1-12) >> ");
        String tempMonth = keyboard.nextLine();

        System.out.println("Day of birth (1-31) >> ");
        String tempDay = keyboard.nextLine();

        System.out.println("Year of birth (YYYY) >> ");
        String tempYear = keyboard.nextLine();

        System.out.println("Gender (M/F) >> ");
        String gender = keyboard.nextLine();

//got stuck had to add extra try-catch to check for NumberFormatException

        String datesValid = "true";

        try {
            int month = parseInt(tempMonth);
            int day = parseInt(tempDay);
            int year = parseInt(tempYear);
        } catch(NumberFormatException e) {
            datesValid = "false";
        }


        try {
            if (lastName.isEmpty()) {
                throw new MissingNameException("Last name cannot be blank");
            }

            if (firstName.isEmpty()) {
                throw new MissingNameException("First name cannot be blank");
            }

            if (datesValid == "false") {
                throw new InvalidBirthdayException("Birth dates must be input as numbers");
            }

            int month = parseInt(tempMonth);
            int day = parseInt(tempDay);
            int year = parseInt(tempYear);

            if (month > 12 | 1 > month) {
                throw new InvalidBirthdayException("Invalid birth month");
            }

            if (day > 31 | 1 > day) {
                throw new InvalidBirthdayException("Invalid birth day");
            }

            if (year > 2021 | 1900 > year) {
                throw new InvalidBirthdayException("Invalid birth year");
            }

            if (!gender.equals("M") && !gender.equals("F")) {
                throw new UnknownGenderException("The gender code is not known");
            }

            String newFirstName = firstName.toUpperCase();
            String newMiddleInitial = middleInitial.toUpperCase();
            int encodedFirstName = new FirstNameUtility().encodeFirstName(newFirstName, newMiddleInitial);
            String encodedLastName = new LastNameUtility().encodeLastName(lastName);
            int encodedMonthDayGender = new MonthDayGenderUtility().encodeMonthDayGender(year, month, day, gender);
            DriversLicense driversLicense = new DriversLicense();
            driversLicense.setSSSS(encodedLastName);
            driversLicense.setFFF(encodedFirstName);
            driversLicense.setYY(year);
            driversLicense.setDDD(encodedMonthDayGender);
            String wisconsinReturn = new WisconsinFormatter().formatLicenseNumber(driversLicense);
            String floridaReturn = new FloridaFormatter().formatLicenseNumber(driversLicense);
            System.out.println("Wisconsin: " + wisconsinReturn);
            System.out.println("Florida: " + floridaReturn);

        } catch(Exception e) {
                //throw new MissingNameException("First and Last name may not be blank");
                String message = e.getMessage();
            System.out.println(message);
        }
    }
}
