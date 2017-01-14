package com.example.st.kwadratowaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView wyswietl;
    private EditText napisLiczby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wyswietl = (TextView) findViewById(R.id.txtV1);
        napisLiczby = (EditText) findViewById(R.id.edT1);
    }

    public void liczF(View view) {
        //kod liczenia funkcji
        String[] liczbyNapis = napisLiczby.getText().toString().split(",");
        int a = Integer.valueOf(liczbyNapis[0]);//zamiana napisanej liczby na typowe liczby
        int b = Integer.valueOf(liczbyNapis[1]);
        int c = Integer.valueOf(liczbyNapis[2]);

        int dt = b * b - 4 * a * c;
        double pDt = Math.sqrt(dt);

        if (dt > 0) {
            double x1 = (-b - pDt) / 2 * a;
            double x2 = (-b + pDt) / 2 * a;
            wyswietl.setText("X1 = " + String.format("%.2f",x1) + " X2 =" + String.format("%.2f",x2));

        } else if (dt == 0) {
            double x0 = -b / 2 * a;
            wyswietl.setText("X0 = " + String.format("%.2f",x0));
        } else {
            wyswietl.setText("Delta jest ujemna");
        }

    }
}
