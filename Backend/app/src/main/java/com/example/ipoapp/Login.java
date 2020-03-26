package com.example.ipoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user;
    EditText password;
    Button login;
    Button signup;
    Button forgotpassword;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signUp);
        forgotpassword = findViewById(R.id.forgotPassword);




    }

    public void LoginButton (View view) {
        String emailUser = this.user.getText().toString();
        String passwordUser = this.password.getText().toString();

        if (emailUser.equals("adrian") && passwordUser.equals("adrian")){
            Toast.makeText(this, "Bienvenido adrian", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Main.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "User or password are wrong...", Toast.LENGTH_SHORT).show();
        }


    }

    public void ToRegister(View view){
        Intent i = new Intent(this, Register.class);
        startActivity(i);

    }

    public void toError(View error){
        Intent i = new Intent(this, Error.class);
        startActivity(i);

    }

}
