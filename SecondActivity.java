package com.example.toast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private String name, surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Odbieranie danych z MainActivity
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        surname = intent.getStringExtra("surname");

        Button buttonShowToast = findViewById(R.id.buttonShowToast);

        // Wyświetlenie Toast z danymi
        buttonShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this,
                        "Imię: " + name + "\nNazwisko: " + surname,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
