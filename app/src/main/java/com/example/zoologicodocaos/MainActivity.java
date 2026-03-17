package com.example.zoologicodocaos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.zoologicodocaos.models.Animal;
import com.example.zoologicodocaos.models.ZoologicoDoCaos;

public class MainActivity extends AppCompatActivity {

    ZoologicoDoCaos z1;
    Button btnAdicionar;
    Button btnProcurar;
    EditText especie, hablidade;

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

        this.btnAdicionar = findViewById(R.id.btnAdicionar);
        this.btnProcurar = findViewById(R.id.btnProcurar);

        this.btnAdicionar.setOnClickListener(v -> {
            //Apanhar o texto
            String valorEspecie = this.especie.getText().toString();

            Toast.makeText(this, "--> " + valorEspecie, Toast.LENGTH_SHORT).show();
        });

        this.btnProcurar.setOnClickListener(v -> {
            Toast.makeText(this, "JAVA", Toast.LENGTH_SHORT).show();
        });

        this.especie = findViewById(R.id.textViewEspecie);


        this.buildZoologico();
    }

    private void buildZoologico() {
        Toast.makeText(MainActivity.this, "ZOO", Toast.LENGTH_SHORT).show();

        Animal a1 = new Animal("gato", "Faz mewo mewo");
        Animal a2 = new Animal("cao", "Faz waf waf");
        Animal a3 = new Animal("vaca", "Faz goo goo");
        Animal a4 = new Animal("snake", "Faz si si");
        Animal a5 = new Animal("raza", "Faz lara lara");

        z1 = new ZoologicoDoCaos("Z1");

        z1.adicionarAnimal(a1);
        z1.adicionarAnimal(a2);
        z1.adicionarAnimal(a3);
        z1.adicionarAnimal(a4);
        z1.adicionarAnimal(a5);

        z1.removerAnimal(a1);
        z1.removerAnimal(a5);

        Toast.makeText(MainActivity.this, z1.toString(), Toast.LENGTH_SHORT).show();
    }
}