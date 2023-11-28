package email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_PATTERN =
         "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private Pattern pattern;
    private Matcher matcher;

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validateEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address for validation: ");
        String emailToValidate = scanner.nextLine();

        EmailValidator emailValidator = new EmailValidator();

        if (emailValidator.validateEmail(emailToValidate)) {
            System.out.println(emailToValidate + " is a valid email address.");
        } else {
            System.out.println(emailToValidate + " is not a valid email address.");
        }
    }
}

