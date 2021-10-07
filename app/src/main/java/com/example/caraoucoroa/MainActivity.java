package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonJogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonJogar = findViewById(R.id.imageButtonJogar);


        imageButtonJogar.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
            startActivity(intent);


        });
    }

}