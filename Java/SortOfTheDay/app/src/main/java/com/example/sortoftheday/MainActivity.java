package com.example.sortoftheday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;
    private ArrayList<String> messages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.text_title);
        buttonAction = findViewById(R.id.id_button);

        messages.add("Seja a presa do caçador!");
        messages.add("Nenhum obstáculo é grande demais para quem desiste!");
        messages.add("Só dará errado se você tentar.");
        messages.add("Tudo passa, mesmo que por cima de você!");
        messages.add("Amanhã será um novo dia!");
        messages.add("As derrotas de hoje foram duras, mas amanhã será muito pior!");

        buttonAction.setOnClickListener(
            new View.OnClickListener() {

                @Override
                public void onClick(View v){

                    Random random = new Random();
                    int index = random.nextInt(messages.size());
                    String message = messages.get(index);
                    textViewTitle.setText(message);
                }
            }
        );
    }
}