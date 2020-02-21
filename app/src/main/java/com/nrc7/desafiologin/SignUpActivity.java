package com.nrc7.desafiologin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button registerBtn;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        registerBtn = findViewById(R.id.signupBtn);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> numbers = ArrayAdapter.createFromResource(this, R.array.age, android.R.layout.simple_selectable_list_item);
        numbers.setDropDownViewResource(android.R.layout.simple_selectable_list_item);
        spinner.setAdapter(numbers);
        spinner.setOnItemSelectedListener(this);


        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(SignUpActivity.this, "Registro Correcto!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
