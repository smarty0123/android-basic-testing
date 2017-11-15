package cc.somkiat.basicunittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Created by SMART on 15/11/2560.
 */

public class ValidateNameFailTest {
    @Test
    public void ไม่ใส่ชื่อผลลัพธ์ต้องได้เท็จ() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void รูปแบบของชื่อผิดผลลัพธ์ต้องเป็นเท็จ() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("Nattapon 5555");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void ชื่อมีความยาวสองตัวอักษรผลลัพธ์ต้องเป็นเท็จ() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("Na");
        assertFalse(result.getMessage(), result.isValid());
    }

    @Test
    public void ชื่อมีความยาวสามสิบตัวอักษรผลลัพธ์ต้องเป็นเท็จ() {
        NameValidation validator = new NameValidation();
        ValidateResult result = validator.validate("NattaponNattaponNattaponNattap");
        assertFalse(result.getMessage(), result.isValid());
    }
}
