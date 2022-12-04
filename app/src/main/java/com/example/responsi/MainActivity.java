package com.example.responsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText user,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        Button btn = findViewById(R.id.btn_login);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.getText().toString().length() == 0){
                    user.setError("Isikan Username Anda");
                }else if(password.getText().toString().length() == 0){
                    user.setError("Isikan Password Anda");
                }else{
                    Toast.makeText(MainActivity.this, "Berhasil Login", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Layout2.class);
                    intent.putExtra("Username", user.getText().toString());
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }
}