package br.edu.ifsp.ads.pdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.ads.pdm.cadastro.R;

public class MainActivity extends AppCompatActivity {
    private Button LimparBt;
    private Button SalvarBt;
    private EditText nCompleto;
    private EditText cadTelefone;
    private EditText nEmail;
    private CheckBox checkBox;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private EditText nCidade;
    private Spinner nEstado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nCompleto = findViewById(R.id.Completo);
        cadTelefone = findViewById(R.id.CadTelefone);
        nEmail = findViewById(R.id.Email);
        checkBox = findViewById(R.id.ncheckBox);
        radioButton2 = findViewById(R.id.radioButton1);
        radioButton3 = findViewById(R.id.radioButton2);
        nCidade = findViewById(R.id.Cidade);
        nEstado = findViewById(R.id.Estado);


        SalvarBt = findViewById(R.id.salvarBt);
        SalvarBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();

                sb.append(nCompleto.getText().toString());

                sb.append(cadTelefone.getText().toString());

                sb.append(nEmail.getText().toString());

                sb.append(nCidade.getText().toString());

                sb.append("\n");

                sb.append(((TextView) nEstado.getSelectedView()).getText());
                sb.append("\n");

                sb.append(radioButton2.isChecked() ? radioButton2.getText() : radioButton3.getText());
                sb.append("\n");

                sb.append(checkBox.isChecked() ? checkBox.getText() : "Não foi selecionado");
                sb.append("\n");

                Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();

                Toast.makeText(MainActivity.this, "Você clicou no Salvar", Toast.LENGTH_SHORT).show();

            }
        });

        LimparBt = findViewById(R.id.limparBt);
        LimparBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nCompleto.setText("");
                cadTelefone.setText("");
                nEmail.setText("");
                checkBox.setChecked(false);
                nCidade.setText("");


                Toast.makeText(MainActivity .this,"Você clicou no Limpar",Toast.LENGTH_SHORT).show();


            }

        });

    }
}