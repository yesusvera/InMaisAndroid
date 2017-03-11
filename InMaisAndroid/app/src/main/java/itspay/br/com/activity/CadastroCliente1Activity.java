package itspay.br.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.itspay.R;

public class CadastroCliente1Activity extends AppCompatActivity {

    Spinner mSpSexo;
    Spinner mSpEstadoCivil;
    Spinner mSpNacionalidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Sexo
        mSpSexo = (Spinner) findViewById(R.id.sp_sexo);

        List<String> sexoList = new ArrayList<String>();
        sexoList.add("Masculino");
        sexoList.add("Feminino");
        sexoList.add("Outros");

        ArrayAdapter<String> sexoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, sexoList);
        sexoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpSexo.setAdapter(sexoAdapter);


        //Estado Civil
        mSpEstadoCivil = (Spinner) findViewById(R.id.sp_estado_civil);

        List<String> estadoCivilList = new ArrayList<String>();
        estadoCivilList.add("Solteiro(a)");
        estadoCivilList.add("Casado(a)");
        estadoCivilList.add("Divorciado(a)");
        estadoCivilList.add("Viúvo(a)");
        estadoCivilList.add("Separado(a)");
        estadoCivilList.add("Companheiro(a)");

        ArrayAdapter<String> estadoCivilAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, estadoCivilList);
        estadoCivilAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpEstadoCivil.setAdapter(estadoCivilAdapter);


        //Nacionalidade
        mSpNacionalidade = (Spinner) findViewById(R.id.sp_nacionalidade);

        List<String> nacionalidadeList = new ArrayList<String>();
        nacionalidadeList.add("Argentino");
        nacionalidadeList.add("Brasileiro");
        nacionalidadeList.add("Peruano");

        ArrayAdapter<String> nacionalidadeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nacionalidadeList);
        nacionalidadeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpNacionalidade.setAdapter(nacionalidadeAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), CadastroEnderecoAcitvity.class);
                startActivity(intent);
            }
        });
    }

}