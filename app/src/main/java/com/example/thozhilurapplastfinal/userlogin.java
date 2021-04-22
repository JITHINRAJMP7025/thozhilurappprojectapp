package com.example.thozhilurapplastfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class userlogin extends AppCompatActivity {
    EditText mob,password;
    Button login,signup;
    TextView forgotpswrd;
    CheckBox remember;
    String mobile_id,password_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        login=(Button)findViewById(R.id.login);
        signup=(Button)findViewById(R.id.signup);
        forgotpswrd=(TextView)findViewById(R.id.forgotpswrd);
        mob=(EditText)findViewById(R.id.number);
        password=(EditText)findViewById(R.id.password);
        remember=(CheckBox)findViewById(R.id.remember);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kl = new Intent(userlogin.this, userprofile.class);
                startActivity(kl);

            }
        });

        forgotpswrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent forgotIntent=new Intent(userlogin.this,forgotpswrd.class);

                startActivity(forgotIntent);

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent=new Intent(userlogin.this,signup.class);

                startActivity(signupIntent);
            }
        });
    }
}