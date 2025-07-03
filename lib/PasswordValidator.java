package lib;

public class PasswordValidator {

    /**
     * Confirm if the code is secure enough.
     * @param The password to be confirmed must not be null or empty.
     * @return Password security assessment results.
     * @throws IllegalArgumentException if the input is null or empty.
     */

    public static PasswordStrength validate(String password) { 

        if (password == null || password.isEmpty()){
            return PasswordStrength.INVALID;
        }

        int minLength = 8;
        boolean Uppercha = false;
        boolean Lowercha = false;
        boolean digit = false;
        boolean specialcha = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                Uppercha = true;
            } else if (Character.isLowerCase(c)) {
                Lowercha = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                specialcha = true;
            }
        }
        if (password.length() >= minLength && Uppercha && Lowercha && digit && specialcha) {
            return PasswordStrength.STRONG;
        } else if (password.length() >= minLength && Uppercha && Lowercha && digit) {
            return PasswordStrength.MEDIUM;
        } else if (password.length() >= minLength && Uppercha && specialcha && digit) {
            return PasswordStrength.MEDIUM;
        } else if (password.length() >= minLength && Lowercha && specialcha && digit) {
            return PasswordStrength.MEDIUM;
        } else if (password.length() >= minLength && Uppercha && Lowercha && specialcha) {
            return PasswordStrength.MEDIUM;
        } else {
            return PasswordStrength.WEAK;
        }

    }
}