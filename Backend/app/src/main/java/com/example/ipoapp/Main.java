package com.example.ipoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView name = findViewById(R.id.userName);
        name.setText("adrian");
        TextView altura = findViewById(R.id.height);
        altura.setText("183 cms");
        TextView peso = findViewById(R.id.weight);
        peso.setText("82 Kg");
        TextView objetivo = findViewById(R.id.userTarget);
        objetivo.setText("Bajar de peso");

    }

    public void toForo(View foro){
        Intent a = new Intent(this, Foro.class);
        startActivity(a);

    }

    public void toCalendar(View calendar){
        Intent a = new Intent(this, Calendar.class);
        startActivity(a);
    }

    public void toMain(View main){
        Intent a = new Intent(this, Main.class);
        startActivity(a);
    }

    public void toExercise(View excersise){
        Intent a = new Intent(this, Exercise.class);
        startActivity(a);
    }

    public void toNutrition(View nutrition){
        Intent a = new Intent(this, Nutrition.class);
        startActivity(a);
    }

    public void toProfile(View profile){
        Intent a = new Intent(this, Profile.class);
        startActivity(a);
    }

    public void toExerciseList(View exerciseList){
        Intent a = new Intent(this, ExerciseList.class);
        startActivity(a);
    }

}
