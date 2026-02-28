package br.gov.sp.cps.buttonText;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void sorteioNumero(View view) {
        TextView resultado = findViewById(R.id.textResultado);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);
        TextView tv6 = findViewById(R.id.tv6);

        Random random = new Random();

        int n1 = random.nextInt(60) + 1;
        int n2 = random.nextInt(60) + 1;
        int n3 = random.nextInt(60) + 1;
        int n4 = random.nextInt(60) + 1;
        int n5 = random.nextInt(60) + 1;
        int n6 = random.nextInt(60) + 1;

        tv1.setText(String.valueOf(n1));
        tv2.setText(String.valueOf(n2));
        tv3.setText(String.valueOf(n3));
        tv4.setText(String.valueOf(n4));
        tv5.setText(String.valueOf(n5));
        tv6.setText(String.valueOf(n6));

        resultado.setText("Números sorteados!");
    }

    public void limpaNumeros(View view) {

        TextView resultado = findViewById(R.id.textResultado);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);
        TextView tv6 = findViewById(R.id.tv6);

        tv1.setText("-");
        tv2.setText("-");
        tv3.setText("-");
        tv4.setText("-");
        tv5.setText("-");
        tv6.setText("-");

        resultado.setText("Resultado");
    }
}