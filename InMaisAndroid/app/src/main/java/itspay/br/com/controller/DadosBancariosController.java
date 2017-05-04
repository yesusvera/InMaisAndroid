package itspay.br.com.controller;

import itspay.br.com.activity.DadosBancariosActivity;
import itspay.br.com.itspay.R;
import itspay.br.com.util.Utils;
import itspay.br.com.util.mask.MaskEditTextChangedListener;
import itspay.br.com.util.validations.ValidationsForms;

/**
 * Created by ferrari on 04/05/2017.
 */
public class DadosBancariosController extends BaseActivityController<DadosBancariosActivity> {


    public DadosBancariosController(DadosBancariosActivity activity) {
        super(activity);
    }

    public void initDataComponent(){

        activity.getEdcpf().addTextChangedListener(new MaskEditTextChangedListener("###.###.###-##", activity.getEdcpf()));

        Utils.nextInputOnMaxLength(activity, activity.getEdcpf(),activity.getEddatanascimento(), 14);
    }

    public boolean isValidateActivity(){
        boolean nomeError = false;
        boolean cpfError = false;
        boolean dataDeAniverssárioError = false;
        boolean emailError = false;
        boolean nacionalidadeError = false;
        boolean telefoneCelularError = false;
        boolean cepError = false;





        if(activity.getEddatanascimento().getText().toString().length() < 10){
            activity.getEddatanascimento().setError(activity.getString(R.string.error_data_nascimento_invalida));
            activity.getEddatanascimento().requestFocus();
            dataDeAniverssárioError = true;
        }


        if(activity.getEdnacionalidade().getText().toString().isEmpty()){
            activity.getEdnacionalidade().setError(activity.getString(R.string.error_invalid));
            activity.getEdnacionalidade().requestFocus();
            nacionalidadeError = true;
        }

        if(!ValidationsForms.isCPF(activity.getEdcpf().getText().toString())){
            activity.getEdcpf().setError(activity.getString(R.string.error_invalid_cpf));
            activity.getEdcpf().requestFocus();
            cpfError = true;
        }



        if(cpfError || dataDeAniverssárioError ||emailError || nacionalidadeError ||
                cepError ||telefoneCelularError){
            return false;
        }else {
            return true;
        }
    }
}
