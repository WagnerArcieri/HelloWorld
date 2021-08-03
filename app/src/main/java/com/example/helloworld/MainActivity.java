package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void onBtnClick (View view) {
        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtMail = findViewById(R.id.txtMail);

        EditText edtTextName = findViewById(R.id.editTextName);
        EditText edtTextLastName = findViewById(R.id.editTextLastName);
        EditText edtTextMail = findViewById(R.id.editTextEmail);


        txtName.setText("Name: " + edtTextName.getText().toString());
        txtLastName.setText("Last: " + edtTextLastName.getText().toString());
        txtMail.setText("Mail: " + edtTextMail.getText().toString());
    }
}