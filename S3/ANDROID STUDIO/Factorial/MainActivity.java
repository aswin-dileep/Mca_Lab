package com.example.factorial;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText e;
    Button b;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        e = (EditText) findViewById(R.id.fact);
        b = (Button) findViewById(R.id.factbtn);
        t = (TextView) findViewById(R.id.result);
        b.setOnClickListener(this);
    }

    public void onClick(View view) {
        if(view.getId()==b.getId()){
            int num=Integer.parseInt(e.getText().toString());
            int result=1;
            if(num > 1) {
                for (int i = 2; i <= num; ++i)
                    result *= i;
            }

            t.setText("Result: " + result);

        }
    }

}
