package itspay.br.com.controller;

import itspay.br.com.activity.DadosResgateCreditoContaActivity;
import itspay.br.com.itspay.R;
import itspay.br.com.util.mask.MaskEditTextChangedListener;
import itspay.br.com.util.validations.ValidationsForms;

/**
 * Created by ferrari on 21/04/2017.
 */

public class DadosResgateCreditoContaController extends BaseActivityController<DadosResgateCreditoContaActivity> {

    public DadosResgateCreditoContaController(DadosResgateCreditoContaActivity activity) {
        super(activity);
    }

    public void initDataComponent(){

        activity.getEdcpf().addTextChangedListener(new MaskEditTextChangedListener("###.###.###-##", activity.getEdcpf()));

//        Utils.nextInputOnMaxLength(activity, activity.getEdcpf(),activity.getEddatanascimento(), 14);

    }

    public boolean isValidateActivity(){

        boolean cpfError = false;




        if(!ValidationsForms.isCPF(activity.getEdcpf().getText().toString())){
            activity.getEdcpf().setError(activity.getString(R.string.error_invalid_cpf));
            activity.getEdcpf().requestFocus();
            cpfError = true;
        }



        if(cpfError ){
            return false;
        }else {
            return true;
        }
    }

}
