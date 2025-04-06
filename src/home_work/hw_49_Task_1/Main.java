package home_work.hw_49_Task_1;

public class Main {

    public static void main(String[] args) {

        Validator validator = new Validator();

        String email = "user@example";
        String password = "12345";

        if (validator.isEmailValid(email)) {
            System.out.println("E-mail is correct");
        } else {
            System.out.println("E-mail is incorrect");
        }
        try {
            validator.validatePassword(password);
            System.out.println("Password is correct");
        } catch (PasswordValidateException e) {
            System.out.println("Password validation error: " + e.getMessage());
        }
    }
}
