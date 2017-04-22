package itspay.br.com.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import itspay.br.com.controller.DadosResgateRecargaCelularController;
import itspay.br.com.itspay.R;

public class DadosResgateRecargaCelularActivity extends AppCompatActivity {

    DadosResgateRecargaCelularController mController = new DadosResgateRecargaCelularController(this);


    private android.widget.EditText edconfirmatelefonecelular;
    private android.widget.EditText edtelefonecelular;
    private android.widget.Button btnconfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_resgate_recarga_celular);

        initView();

        mController.initDataComponent();

        btnconfirmar.setOnClickListener(new View.OnClickListener() {
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

        this.btnconfirmar = (Button) findViewById(R.id.btn_confirmar);
        this.edtelefonecelular = (EditText) findViewById(R.id.ed_telefone_celular);
        this.edconfirmatelefonecelular = (EditText) findViewById(R.id.ed_confirma_telefone_celular);

    }

    public EditText getEdconfirmatelefonecelular() {
        return edconfirmatelefonecelular;
    }

    public void setEdconfirmatelefonecelular(EditText edconfirmatelefonecelular) {
        this.edconfirmatelefonecelular = edconfirmatelefonecelular;
    }

    public EditText getEdtelefonecelular() {
        return edtelefonecelular;
    }

    public void setEdtelefonecelular(EditText edtelefonecelular) {
        this.edtelefonecelular = edtelefonecelular;
    }
}
