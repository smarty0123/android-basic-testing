package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private DatePicker etBirthday;
    private EditText etEmail;
    private NameValidation nameValidation;
    private EmailValidation emailValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.userNameInput);
        etBirthday = findViewById(R.id.dateOfBirthInput);
        etEmail = findViewById(R.id.emailInput);


        nameValidation = new NameValidation();
        emailValidation = new EmailValidation();
    }

    public void onSaveClick(View view) {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        showResult(nameValidation.validate(name), emailValidation.validate(email));
    }

    public void onRevertClick(View view) {
        Time now = new Time();
        now.setToNow();
        etName.setText("");
        etBirthday.updateDate(now.year, now.month, now.monthDay);
        etEmail.setText("");
    }


    private void showResult(ValidateResult nameResult, ValidateResult emailResult) {
        if (!nameResult.isValid()) {
            Toast.makeText(this, nameResult.getMessage(), Toast.LENGTH_SHORT).show();
        }

        if (!emailResult.isValid()) {
            Toast.makeText(this, emailResult.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
