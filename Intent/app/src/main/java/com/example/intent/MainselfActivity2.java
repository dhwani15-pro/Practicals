package com.example.intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainselfActivity2 extends AppCompatActivity {

    EditText etPass;
    EditText etName;
    EditText etAge;
    EditText etCno;
    Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mainself2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.tvAge);
        etCno = findViewById(R.id.etCno);
        etPass = findViewById(R.id.etPass);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String str=etAge.getText().toString().trim();
            int age=Integer.parseInt(strAge);
            String str=etCno.getText().toString().trim();
            int age=Integer.parseInt(strCno);
            String str=etPass.getText().toString().trim();

        });
    }
}