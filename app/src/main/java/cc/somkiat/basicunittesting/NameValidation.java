package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

/**
 * Created by SMART on 15/11/2560.
 */

class NameValidation {
    public ValidateResult validate(String name) {
        try {
            isNameNotEmpty(name);
            isNamePatternCorrect(name);
            isNameLengthLessThanThirty(name);
            isNameLengthMoreThanTwo(name);
        } catch (ValidateException e) {
            return new ValidateResult(false, e.getMessage());
        }

        return new ValidateResult(true, "Name is valid");
    }

    private void isNameNotEmpty(String name) throws ValidateException {
        if (name.isEmpty()) {
            throw new ValidateException("Name is empty");
        }
    }

    private void isNamePatternCorrect(String name) throws ValidateException {
        String namePattern = "[a-zA-Z]+ ?[a-zA-Z]+";

        if (!Pattern.matches(namePattern, name)) {
            throw new ValidateException("Name Pattern is incorrect");
        }
    }

    private void isNameLengthMoreThanTwo(String name) throws ValidateException {
        if (name.length() <= 2) {
            throw new ValidateException("Name is too short");
        }
    }

    private void isNameLengthLessThanThirty(String name) throws ValidateException {
        if (name.length() >= 30) {
            throw new ValidateException("Name is too long");
        }
    }
}
