package com.example.informationformapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtInfo;
    Button btnConfirm;
    EditText edtName, edtNumber, edtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mapping();

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String email = edtEmail.getText().toString();
                String number = edtNumber.getText().toString();

                String textWelcome = getResources().getString(R.string.text_Welcome);
                String textEmail = getResources().getString(R.string.text_Email);
                String textNumber = getResources().getString(R.string.text_Number);

                txtInfo.setText((textWelcome + ": " + name + "\n" +
                        textEmail + ": " + email + "\n" +
                        textNumber + ": " + number));
            }
        });

    }

    private void Mapping() {
        btnConfirm = (Button) findViewById(R.id.buttonConfirm);
        txtInfo = (TextView) findViewById(R.id.textViewInfo);
        edtEmail = (EditText) findViewById(R.id.editTextEmail);
        edtName = (EditText) findViewById(R.id.editTextName);
        edtNumber = (EditText) findViewById(R.id.editTextPhoneNumber);
    }
}
