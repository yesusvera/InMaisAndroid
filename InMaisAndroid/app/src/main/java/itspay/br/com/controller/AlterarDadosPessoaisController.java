package itspay.br.com.controller;

import itspay.br.com.activity.AlterarDadosPessoaisActivity;
import itspay.br.com.itspay.R;
import itspay.br.com.util.mask.MaskEditTextChangedListener;
import itspay.br.com.util.validations.ValidationsForms;

/**
 * Created by juniorbraga on 24/03/17.
 */

public class AlterarDadosPessoaisController extends BaseActivityController<AlterarDadosPessoaisActivity> {


    public AlterarDadosPessoaisController(AlterarDadosPessoaisActivity activity) {
        super(activity);
    }

    public void initDataComponent(){

        activity.getEdcpf().addTextChangedListener(new MaskEditTextChangedListener("###.###.###-##", activity.getEdcpf()));
        activity.getEddatanascimento().addTextChangedListener(new MaskEditTextChangedListener("##/##/####", activity.getEddatanascimento()));
        activity.getEdcep().addTextChangedListener(new MaskEditTextChangedListener("#####-###", activity.getEdcep()));
        activity.getEdtelefoneresidencial().addTextChangedListener(new MaskEditTextChangedListener("(##)####-####", activity.getEdtelefoneresidencial()));
        activity.getEdtelefonecelular().addTextChangedListener(new MaskEditTextChangedListener("(##)#####-####", activity.getEdtelefonecelular()));
    }

    public boolean isValidateActivity(){
        boolean nome = false;
        boolean cpf = false;
        boolean dataDeAniverssário = false;


        if(activity.getEdnome().getText().toString().isEmpty()){
            activity.getEdnome().setError(activity.getString(R.string.error_invalid));
            activity.getEdnome().requestFocus();
            return false;
        }


        if(activity.getEdnacionalidade().getText().toString().isEmpty()){
            activity.getEdnacionalidade().setError(activity.getString(R.string.error_invalid));
            activity.getEdnacionalidade().requestFocus();
            return false;
        }


        if(activity.getEddatanascimento().getText().toString().length() < 10){
            activity.getEddatanascimento().setError(activity.getString(R.string.error_data_nascimento_invalida));
            activity.getEddatanascimento().requestFocus();
            return false;
        }

        if(!ValidationsForms.isCPF(activity.getEdcpf().getText().toString())){
            activity.getEdcpf().setError(activity.getString(R.string.error_invalid_cpf));
            activity.getEdcpf().requestFocus();
            return false;
        }

        if(!ValidationsForms.isEmail(activity.getEdemail().getText().toString())){
            activity.getEdemail().setError(activity.getString(R.string.error_invalid_email));
            activity.getEdemail().requestFocus();
            return false;
        }


        if(nome && cpf && dataDeAniverssário){
            return true;
        }else {
            return false;
        }
    }
}
