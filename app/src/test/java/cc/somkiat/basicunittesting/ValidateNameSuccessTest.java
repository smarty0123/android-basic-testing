package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by SMART on 15/11/2560.
 */

public class ValidateNameSuccessTest {
    @Test
    public void เมื่อป้อนชื่อผลลัพธ์ต้องเป็นจริง() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("Nattapon");
        assertTrue(result.getMessage(), result.isValid());
    }

    @Test
    public void ป้อนชื่อถูกรูปแบบผลลัพธ์ต้องเป็นจริง() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("Nattapon");
        assertTrue(result.getMessage(), result.isValid());
    }

    @Test
    public void ป้อนชื่อความยาวระหว่างสองถึงสามสิบตัวอักษรผลลัพธ์ต้องเป็นจริง() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("Nattapon");
        assertTrue(result.getMessage(), result.isValid());
    }
}
