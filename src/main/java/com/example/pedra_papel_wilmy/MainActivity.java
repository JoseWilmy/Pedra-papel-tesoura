package com.example.pedra_papel_wilmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comecar(View view){
        Intent itent = new Intent(getApplicationContext(),comeco.class );
        startActivity(itent);
    }

    public void terminar (View view){
        Intent itent = new Intent(getApplicationContext(), termino.class);
        startActivity(itent);
    }

}