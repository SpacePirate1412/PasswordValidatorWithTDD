package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        PasswordStrength result2 = PasswordValidator.validate("Johnneed");
        if (result2 == PasswordStrength.WEAK){
            System.out.println("Test Case 2 Passed: Only Character is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }

        PasswordStrength result3 = PasswordValidator.validate("johnneed*123");
        if (result3 == PasswordStrength.MEDIUM){
            System.out.println("Test Case 3 Passed: Character and Digit is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }

        PasswordStrength result4 = PasswordValidator.validate("Johnneed123");
        if (result4 == PasswordStrength.MEDIUM){
            System.out.println("Test Case 4 Passed: Character and Digit is MEDIUM.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected MEDIUM but got " + result3);
        }

        PasswordStrength result5 = PasswordValidator.validate("Johnneed*123");
        if (result5 == PasswordStrength.STRONG){
            System.out.println("Test Case 5 Passed: Only character is STRONG.");
        } else {
            System.out.println("Test Case 5 FAILED: Expected STRONG but got " + result5);
        }

        System.out.println("--------------------------------");
    }
}
