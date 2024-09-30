package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nom,adresse,surface,nbr;
    private CheckBox picine;
    private TextView resu;
    private Button calculer;
    private double impot_de_base=0.0;
    private double impot_supp=0.0;
    private double totale=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        calculer=findViewById(R.id.button);
        surface=findViewById(R.id.surface);
        nom=findViewById(R.id.nom);
        adresse=findViewById(R.id.adresse);
        nbr=findViewById(R.id.nbr);
        picine=findViewById(R.id.piscine);
        resu=findViewById(R.id.textView9);
        calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                impot_de_base=Double.valueOf(surface.getText().toString());
                impot_supp=Double.valueOf(nbr.getText().toString())*50;
                if(picine.isChecked()){
                    impot_supp+=100;
                }
                resu.setText("Impot de base : "+(impot_de_base*2)+"\nImpot suplémentaire : "+impot_supp+
                        "\nImpot Total : "+(impot_supp+impot_de_base*2));

            }
        });
    }
}