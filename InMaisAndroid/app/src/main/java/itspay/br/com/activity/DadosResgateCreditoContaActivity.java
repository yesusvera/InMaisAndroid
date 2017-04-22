package itspay.br.com.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import itspay.br.com.controller.DadosResgateCreditoContaController;
import itspay.br.com.itspay.R;

public class DadosResgateCreditoContaActivity extends AppCompatActivity {

    DadosResgateCreditoContaController mController = new DadosResgateCreditoContaController(this);


    private android.widget.EditText edcpf;
//    private android.widget.Button btnsalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_resgate_credito_conta);

        initView();

        mController.initDataComponent();
//
//        btnsalvar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mController.isValidateActivity();
//
//                if(mController.isValidateActivity()){
//                    Toast.makeText(getApplicationContext(),"Tudo Certo",Toast.LENGTH_LONG).show();
//                }else {
//                    Toast.makeText(getApplicationContext(),"Deu Errado",Toast.LENGTH_LONG).show();
//                }
//            }
//        });
    }

    private void initView() {

        this.edcpf = (EditText) findViewById(R.id.ed_cpf);
//        this.btnsalvar = (Button) findViewById(R.id.btn_salvar);

    }


    public EditText getEdcpf() {
        return edcpf;
    }

    public void setEdcpf(EditText edcpf) {
        this.edcpf = edcpf;
    }


}
