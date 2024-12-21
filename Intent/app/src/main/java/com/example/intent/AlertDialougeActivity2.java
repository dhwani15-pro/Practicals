package com.example.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlertDialougeActivity2 extends AppCompatActivity {

    Button btnAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_dialouge2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnAlert = findViewById(R.id.btnAlert);
        btnAlert.setOnClickListener(View v -> {

            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("EXIT")
                    .setMessage("Are You Sure?")
                    .setPositiveButton("YES",(dialog, which) -> {
                        finish();
                        Toast.makeText(this,"Yes Button Clicked",Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("NO",(dialog, which) -> {
                        Toast.makeText(this,"No Button Clicked",Toast.LENGTH_SHORT);
                    })
                    .show();
        });
    }
}