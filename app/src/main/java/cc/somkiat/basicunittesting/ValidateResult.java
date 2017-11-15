package cc.somkiat.basicunittesting;

/**
 * Created by SMART on 15/11/2560.
 */

class ValidateResult {
    private boolean isValid;
    private String message;

    public ValidateResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }
}
