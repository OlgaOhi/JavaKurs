package home_work.hw_49_Task_1;

public class Validator {

    public boolean isEmailValid(String email) {

        if (email == null) return false;

        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex >= email.length() -2) return false;

        for (char ch : email.toCharArray()) {
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';
            if (!isPass) return false;
        }
        if (indexAt == 0) return false;
        if (!Character.isLetter(email.charAt(0))) return false;
        return true;
    }
    public void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.isEmpty()) {
            throw new PasswordValidateException("Пароль не может быть пустым");
        }
        if (password.length() < 8) {
            throw new PasswordValidateException("Пароль должен содержать минимум 8 символов");
        }
        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLetter(ch)) hasLetter = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }
        if (!hasLetter) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну букву");
        }
        if (!hasDigit) {
            throw new PasswordValidateException("Пароль должен содержать хотя бы одну цифру");
        }
    }
}
