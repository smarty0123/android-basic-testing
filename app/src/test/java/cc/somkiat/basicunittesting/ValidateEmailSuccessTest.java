package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by SMART on 15/11/2560.
 */

public class ValidateEmailSuccessTest {
    @Test
    public void เมื่อป้อนอีเมล์ผลลัพธ์ต้องเป็นจริง() throws ValidateException {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("smarty_0123@hotmail.com");
        assertTrue(result.getMessage(), result.isValid());
    }

    @Test
    public void อีเมล์ถูกรูปแบบผลลัพธ์ต้องเป็นจริง() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("smarty_0123@hotmail.com");
        assertTrue(result.getMessage(), result.isValid());
    }
}
