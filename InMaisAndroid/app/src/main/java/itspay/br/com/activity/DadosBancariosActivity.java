package itspay.br.com.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import itspay.br.com.controller.DadosBancariosController;
import itspay.br.com.itspay.R;


public class DadosBancariosActivity extends AppCompatActivity {

    DadosBancariosController mController = new DadosBancariosController(this);

    private android.widget.EditText edcpf;
    private android.widget.EditText eddatanascimento;
    private android.widget.EditText ednacionalidade;
    private android.widget.Button btnsalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_bancarios);
        initView();

        mController.initDataComponent();

        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mController.isValidateActivity();

                if(mController.isValidateActivity()){
                    Toast.makeText(getApplicationContext(),"Tudo Certo",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Deu Errado",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void initView() {

        this.btnsalvar = (Button) findViewById(R.id.btn_salvar);
        this.ednacionalidade = (EditText) findViewById(R.id.ed_nacionalidade);
        this.eddatanascimento = (EditText) findViewById(R.id.ed_data_nascimento);
        this.edcpf = (EditText) findViewById(R.id.ed_cpf);
    }




    //get Set de Views


    public EditText getEdcpf() {
        return edcpf;
    }

    public void setEdcpf(EditText edcpf) {
        this.edcpf = edcpf;
    }

    public EditText getEddatanascimento() {
        return eddatanascimento;
    }

    public void setEddatanascimento(EditText eddatanascimento) {
        this.eddatanascimento = eddatanascimento;
    }

    public EditText getEdnacionalidade() {
        return ednacionalidade;
    }

    public void setEdnacionalidade(EditText ednacionalidade) {
        this.ednacionalidade = ednacionalidade;
    }


}
