package br.edu.fateczl.projetoandroid06_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.edu.fateczl.projetoandroid06_1.model.Professor;
import br.edu.fateczl.projetoandroid06_1.model.ProfessorHorista;
import br.edu.fateczl.projetoandroid06_1.model.ProfessorTitular;

public class MainActivity extends AppCompatActivity {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */

    private EditText etValor;
    private EditText etTempo;
    private Button btnCalcular;
    private RadioButton rbHorista;
    private RadioButton rbTitular;
    private TextView tvResultado;
    private Professor professor;



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
        etValor= findViewById(R.id.etValor);
        etTempo= findViewById(R.id.etTempo);
        btnCalcular = findViewById(R.id.btnCalcular);
        rbHorista = findViewById(R.id.rbHorista);
        rbTitular = findViewById(R.id.rbTitular);
        tvResultado = findViewById(R.id.tvResultado);

        rbHorista.setChecked(true);

        rbTitular.setOnClickListener(e->{
            etTempo.setText("");
            etValor.setText("");
            etTempo.setHint(R.string.etAnosInstituicao);
            etValor.setHint(R.string.etValorSalario);
        });
        rbHorista.setOnClickListener(e->{
            etTempo.setText("");
            etValor.setText("");
            etTempo.setHint(R.string.etHoraAula);
            etValor.setHint(R.string.etValorHora);
        });


        btnCalcular.setOnClickListener(e->calcularSalario());
    }

    private void calcularSalario() {
        if (rbHorista.isChecked()){
            professor = new ProfessorHorista(Integer.parseInt( etTempo.getText().toString()),Integer.parseInt(etValor.getText().toString()));
            tvResultado.setText(getString(R.string.tvResultado)+ professor.calcSalario());
        }else {
            professor = new ProfessorTitular(Integer.parseInt( etTempo.getText().toString()),Integer.parseInt(etValor.getText().toString()));
            tvResultado.setText(getString(R.string.tvResultado)+ professor.calcSalario());
        }
    }

}