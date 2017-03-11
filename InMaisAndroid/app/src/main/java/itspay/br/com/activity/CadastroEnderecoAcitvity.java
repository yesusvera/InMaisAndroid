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


public class CadastroEnderecoAcitvity extends AppCompatActivity {

    Spinner mSpCidade;
    Spinner mSpEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_endereco_acitvity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Cidade
        mSpCidade = (Spinner) findViewById(R.id.sp_cidade);

        List<String> cidadeList = new ArrayList<String>();
        cidadeList.add("Brasília");
        cidadeList.add("Uberlândia");
        cidadeList.add("Porto Alegre");

        ArrayAdapter<String> cidadeAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cidadeList);
        cidadeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpCidade.setAdapter(cidadeAdapter);


        // Estado
        mSpEstado = (Spinner) findViewById(R.id.sp_estado);

        List<String> estadoList = new ArrayList<String>();
        estadoList.add("Rio Grande do Sul");
        estadoList.add("Distrito Federal");
        estadoList.add("Rio de Janeiro");

        ArrayAdapter<String> estadoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, estadoList);
        estadoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpEstado.setAdapter(estadoAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (getApplicationContext(), DadosParaContatoActivity.class);
                startActivity(intent);
            }
        });
    }

}
