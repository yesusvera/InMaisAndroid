package itspay.br.com.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import itspay.br.com.controller.CadastroCliente1Controller;
import itspay.br.com.itspay.R;
import itspay.br.com.util.mask.MaskEditTextChangedListener;

public class CadastroCliente1Activity extends AppCompatActivity {

    Spinner mSpSexo;
    Spinner mSpEstadoCivil;
//    Spinner mSpNacionalidade;

    EditText mEdNome;
    EditText mEdCpf;
    EditText mEdDataNascimento;
    EditText mEdNacionalidade;

    private CadastroCliente1Controller cadastrClienteController = new CadastroCliente1Controller(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initView();

        mEdCpf.addTextChangedListener(new MaskEditTextChangedListener("###.###.###-##", mEdCpf));
        mEdDataNascimento.addTextChangedListener(new MaskEditTextChangedListener("##/##/####", mEdDataNascimento));

        cadastrClienteController.initDataComponent();

        cadastrClienteController.initDataComponent();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrClienteController.isNextPage();
            }
        });
    }

    private void initView(){
//        EditText
        mEdNome =(EditText)findViewById(R.id.ed_nome);
        mEdCpf =(EditText)findViewById(R.id.ed_cpf);
        mEdNome =(EditText)findViewById(R.id.ed_nome);
        mEdDataNascimento= (EditText)findViewById(R.id.ed_data_nascimento);
        mEdNacionalidade = (EditText)findViewById(R.id.ed_nacionalidade);

//        Spinner
        mSpSexo = (Spinner) findViewById(R.id.sp_sexo);
        mSpEstadoCivil = (Spinner) findViewById(R.id.sp_estado_civil);
//        mSpNacionalidade = (Spinner) findViewById(R.id.sp_nacionalidade);
    }

    public Spinner getmSpSexo() {
        return mSpSexo;
    }

    public void setmSpSexo(Spinner mSpSexo) {
        this.mSpSexo = mSpSexo;
    }

    public Spinner getmSpEstadoCivil() {
        return mSpEstadoCivil;
    }

    public void setmSpEstadoCivil(Spinner mSpEstadoCivil) {
        this.mSpEstadoCivil = mSpEstadoCivil;
    }

//    public Spinner getmSpNacionalidade() {
//        return mSpNacionalidade;
//    }

//    public void setmSpNacionalidade(Spinner mSpNacionalidade) {
//        this.mSpNacionalidade = mSpNacionalidade;
//    }

    public EditText getmEdNacionalidade() {
        return mEdNacionalidade;
    }

    public void setmEdNacionalidade(EditText mEdNacionalidade) {
        this.mEdNacionalidade = mEdNacionalidade;
    }

    public EditText getmEdNome() {
        return mEdNome;
    }

    public void setmEdNome(EditText mEdNome) {
        this.mEdNome = mEdNome;
    }

    public EditText getmEdCpf() {
        return mEdCpf;
    }

    public void setmEdCpf(EditText mEdCpf) {
        this.mEdCpf = mEdCpf;
    }

    public EditText getmEdDataNascimento() {
        return mEdDataNascimento;
    }

    public void setmEdDataNascimento(EditText mEdDataNascimento) {
        this.mEdDataNascimento = mEdDataNascimento;
    }
}