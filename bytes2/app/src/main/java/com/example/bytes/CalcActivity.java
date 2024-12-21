package com.example.bytes;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalcActivity extends AppCompatActivity {

    EditText etNo1;
    EditText etNo2;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        etNo1=findViewById(R.id.etNo1);
        etNo2=findViewById(R.id.etNo2);
        tvResult=findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(v -> {
            String strno1=etNo1.getText().toString();
            String strno2=etNo2.getText().toString();
            if(TextUtils.isEmpty(strno1))
            {
                Toast.makeText(this, "", Toast.LENGTH_SHORT).show();.makeText(this,"Please enter no1",Toast.LENGTH_SHORT).show();
                etNo1.setError("Please enter no1");
            }
            else if(TextUtils.isEmpty(strno2))
            {
                Toast.makeText(this,"Please enter no2",Toast.LENGTH_SHORT).show();
                etNo2.setError("Please enter no2");
            }
            else

                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int result=i+j;
                tvResult.setText(result+"");
            }
        });
        btnMinus.setOnClickListener(v -> {
            String strno1=etNo1.getText().toString();
            String strno2=etNo2.getText().toString();

            if(TextUtils.isEmpty(strno1))
            {
                Toast.makeText(this,"Please enter no1",Toast.LENGTH_SHORT).show();
                etNo1.setError("Please enter no1");
            }
            else if(TextUtils.isEmpty(strno2))
            {
                Toast.makeText(this,"Please enter no2",Toast.LENGTH_SHORT).show();
                etNo2.setError("Please enter no2");
            }
            else
            {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int result=i-j;
                tvResult.setText(result+"");
            }
        });
        btnMultiply.setOnClickListener(v -> {
            String strno1=etNo1.getText().toString();
            String strno2=etNo2.getText().toString();

            if(TextUtils.isEmpty(strno1))
            {
                Toast.makeText(this,"Please enter no1",Toast.LENGTH_SHORT).show();
                etNo1.setError("Please enter no1");
            }
            else if(TextUtils.isEmpty(strno2))
            {
                Toast.makeText(this,"Please enter no2",Toast.LENGTH_SHORT).show();
                etNo2.setError("Please enter no2");
            }
            else
            {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int result=i*j;
                tvResult.setText(result+"");
            }
        });
        btnDivide.setOnClickListener(v -> {
            String strno1=etNo1.getText().toString();
            String strno2=etNo2.getText().toString();

            if(TextUtils.isEmpty(strno1))
            {
                Toast.makeText(this,"Please enter no1",Toast.LENGTH_SHORT).show();
                etNo1.setError("Please enter no1");
            }
            else if(TextUtils.isEmpty(strno2))
            {
                Toast.makeText(this,"Please enter no2",Toast.LENGTH_SHORT).show();
                etNo2.setError("Please enter no2");
            }
            else
            {
                int i=Integer.parseInt(strno1);
                int j=Integer.parseInt(strno2);
                int result=i/j;
                tvResult.setText(result+"");
            }
        });
    }
}
    }
}