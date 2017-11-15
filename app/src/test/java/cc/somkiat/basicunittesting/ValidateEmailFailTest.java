package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by SMART on 15/11/2560.
 */

public class ValidateEmailFailTest {
    @Test
    public void ไม่มีอีเมล์ผลลัพธ์ต้องเป็นเท็จ() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void อีเมล์ไม่มีชื่อผู้ใช้ผลลัพธ์ต้องเป็นเท็จ() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("@้hotmail.com");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void อีเมล์มีชื่อผู้ใช้ผิดรูปแบบผลลัพธ์ต้องเป็นเท็จ() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("#$@!sma rty_0123@hotmail.com");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void อีเมล์ไม่มีเครื่องหมายatผลลัพธ์ต้องเป็นเท็จ() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("smarty_0123hotmail.com");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void อีเมล์มีโดเมนผิดรูปแบบผลลัพธ์ต้องเป็นเท็จ() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("smarty_0123@hotmailcom");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void อีเมล์ไม่มีโดเมนผลลัพธ์ต้องเป็นเท็จ() {
        EmailValidation validator = new EmailValidation();
        ValidateResult result = validator.validate("smarty_0123@");
        assertFalse(result.getMessage(), result.isValid());
    }

}
