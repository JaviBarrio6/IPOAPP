package com.example.ipoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends AppCompatActivity {



    EditText name;
    EditText age;
    EditText user;
    EditText password;
    EditText sex;
    EditText nationality;
    EditText weight ;
    EditText height;
    EditText activitylevel;
    EditText target;
    Button signup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        sex = findViewById(R.id.sex);
        nationality = findViewById(R.id.nationality);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        activitylevel = findViewById(R.id.activityLevel);
        target = findViewById(R.id.target);
        signup = findViewById(R.id.signUp);

    }

    public void ToMain (View view2){
        Intent a = new Intent(this, Main.class);
        startActivity(a);
    }

}
