package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

/**
 * Created by SMART on 15/11/2560.
 */

class EmailValidation {
    public ValidateResult validate(String email) {
        try {
            isEmailNotEmpty(email);
            isEmailPatternCorrect(email);
        } catch (ValidateException e) {
            return new ValidateResult(false, e.getMessage());
        }

        return new ValidateResult(true, "Email is valid");
    }

    private void isEmailNotEmpty(String email) throws ValidateException {
        if (email.isEmpty()) {
            throw new ValidateException("Email is empty");
        }
    }

    private void isEmailPatternCorrect(String email) throws ValidateException {
        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";

        if (!Pattern.matches(emailPattern, email)) {
            throw new ValidateException("Email Pattern is incorrect");
        }
    }
}
