package com.example.login_validation;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText user,password;
    String u="Aswin";
    String p="Aswin@123";
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
    }
    public void verify(View v){
        if(v.getId()==R.id.loginBtn){
            user=(EditText)findViewById(R.id.username);
            password=(EditText)findViewById(R.id.password);
            String a=user.getText().toString();
            String b=password.getText().toString();
            if(a.equals(u)&&b.equals(p)){
                Toast.makeText(this,"Login successful",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show();
            }
        }
    }
}