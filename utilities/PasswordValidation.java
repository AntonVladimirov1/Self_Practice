package utilities;

public class PasswordValidation {

    public static boolean validPassword(String password) {
        // Requirement 1: Password must be at least 6 characters and should not contain space
        if ((password.length() < 6) ||
                (password.contains(" ")) ||
                (!password.matches(".*[A-Z].*")) ||
                (!password.matches(".*[a-z].*")) ||
                (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) ||
                (!password.matches(".*\\d.*"))) {
            return false;
        }
        return true; // if all requirements are met
    }

    public static void main(String[] args) {

        System.out.println(validPassword("Av@5mk"));
    }

}
