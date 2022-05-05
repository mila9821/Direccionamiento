package com.example.direccionamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton google, facebook, instagram, messenger, youtube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        google = findViewById(R.id.btngoogle);
        facebook=findViewById(R.id.btnfacebook);
        youtube=findViewById(R.id.btnyoutube);
        instagram = findViewById(R.id.btninstagram);
        messenger = findViewById(R.id.btnmessenger);

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri google = Uri.parse("https://www.youtube.com/watch?v=ZSOBiNmjoFY");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);

            }
        });
    }
}