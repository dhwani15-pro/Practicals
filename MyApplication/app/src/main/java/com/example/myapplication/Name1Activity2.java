package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Name1Activity2 extends AppCompatActivity {

    EditText etName;
    Button btnClick;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_name12);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvName=findViewById(R.id.tvName);
        btnClick=findViewById(R.id.btnClick);
        etName=findViewById(R.id.etName);

        btnClick.setOnClickListener(v ->  {

            String name=etName.getText().toString();
            tvName.setText("The Name is :"+name);
            Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
            etName.setText("");
        });
    }
}