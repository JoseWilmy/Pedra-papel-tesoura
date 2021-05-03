package com.example.pedra_papel_wilmy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class comeco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comeco);
    }

    public void area_inicial(View view){
        Intent itent = new Intent(getApplicationContext(),comeco.class );
        startActivity(itent);
    }

    public void terminar (View view){
        Intent itent = new Intent(getApplicationContext(), termino.class);
        startActivity(itent);
    }

    public void pedra(View view){
       opccao("pedra");
    }

    public void papel(View view){
       opccao("papel");
    }

    public void tesoura(View view){
        opccao("tesoura");
    }


    public void opccao(String opccaoUsuario){
        ImageView imgresult = findViewById(R.id.imgresult);
        TextView resultado = findViewById(R.id.resultado);

        int numero = new Random().nextInt(3);
        String [] opccoes = {"pedra" , "papel" , "tesoura" };

        String selecaoMaquina = opccoes[numero];

        switch (selecaoMaquina){
            case "pedra":
                imgresult.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgresult.setImageResource(R.drawable.papel);
                break;
            case  "tesoura":
                imgresult.setImageResource(R.drawable.tesoura);
                break;
        }

        if((selecaoMaquina == "pedra" && opccaoUsuario == "tesoura") || (selecaoMaquina == "tesoura" && opccaoUsuario=="papel") || (selecaoMaquina=="papel" && opccaoUsuario=="pedra")) //Validação do app
            resultado.setText("Você Perdeu!");

        else if ((selecaoMaquina == "tesoura" && opccaoUsuario == "pedra") || (selecaoMaquina == "papel" && opccaoUsuario=="tesoura") || (selecaoMaquina=="pedra" && opccaoUsuario=="papel"))
            resultado.setText("Você Ganhou!!");
        else
            resultado.setText("Empate");
    }


}