package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String str1, str2, str3, str4, str5, str6, str7, str8, str9;
    int count = 0;
    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b1.setOnClickListener(this::check);
        b2.setOnClickListener(this::check);
        b3.setOnClickListener(this::check);
        b4.setOnClickListener(this::check);
        b5.setOnClickListener(this::check);
        b6.setOnClickListener(this::check);
        b7.setOnClickListener(this::check);
        b8.setOnClickListener(this::check);
        b9.setOnClickListener(this::check);
    }

    public void check(View view)
    {
        Button b = (Button) view;
        if(b.getText().equals("")) {
            if (count % 2 == 0)
            {
                b.setText("X");
            }
            else
            {
                b.setText("O");
            }
            count++;
            if (count > 4) {
                str1 = b1.getText().toString();
                str2 = b2.getText().toString();
                str3 = b3.getText().toString();
                str4 = b4.getText().toString();
                str5 = b5.getText().toString();
                str6 = b6.getText().toString();
                str7 = b7.getText().toString();
                str8 = b8.getText().toString();
                str9 = b9.getText().toString();
                if (str1.equals(str2) && str2.equals(str3) && !str1.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str4.equals(str5) && str5.equals(str6) && !str5.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str7.equals(str8) && str8.equals(str9) && !str7.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str1.equals(str4) && str4.equals(str7) && !str1.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str2.equals(str5) && str5.equals(str8) && !str2.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str3.equals(str6) && str6.equals(str9) && !str3.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str1.equals(str5) && str5.equals(str9) && !str1.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (str3.equals(str5) && str5.equals(str7) && !str3.equals("")) {
                    Toast.makeText(this, "Winner is " + str1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (count == 9) {
                    Toast.makeText(this, "Game is drawn", Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }
    }
    private void newGame() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        count=0;
        flag=0;
    }
}