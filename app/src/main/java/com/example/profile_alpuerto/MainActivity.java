package com.example.profile_alpuerto;

import androidx.appcompat.app.AppCompatActivity; import android.view.View; import android.widget.EditText;
import android.widget.TextView; import android.widget.Button; import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText name, age, address, nationality;
    TextView nameResult, ageResult, addressResult, nationalityResult;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameInput);
        age = findViewById(R.id.ageInput);
        address = findViewById(R.id.addressInput);
        nationality = findViewById(R.id.nationalityInput);

        nameResult = findViewById(R.id.nameDisplay);
        ageResult = findViewById(R.id.ageDisplay);
        addressResult = findViewById(R.id.addressDisplay);
        nationalityResult = findViewById(R.id.nationalityDisplay);

        submit = findViewById(R.id.goodButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                nameResult.setText((name.getText().toString()));
                ageResult.setText((age.getText().toString()));
                addressResult.setText((address.getText().toString()));
                nationalityResult.setText((nationality.getText().toString()));
            }
        });
    }
}
