package itspay.br.com.controller;

import itspay.br.com.activity.DadosResgateRecargaCelularActivity;
import itspay.br.com.itspay.R;
import itspay.br.com.util.Utils;
import itspay.br.com.util.mask.MaskEditTextChangedListener;

/**
 * Created by ferrari on 21/04/2017.
 */

public class DadosResgateRecargaCelularController extends BaseActivityController<DadosResgateRecargaCelularActivity> {

    public DadosResgateRecargaCelularController(DadosResgateRecargaCelularActivity activity) {
        super(activity);
    }

    public void initDataComponent(){


        activity.getEdconfirmatelefonecelular().addTextChangedListener(new MaskEditTextChangedListener("(##)#####-####", activity.getEdconfirmatelefonecelular()));
        activity.getEdtelefonecelular().addTextChangedListener(new MaskEditTextChangedListener("(##)#####-####", activity.getEdtelefonecelular()));


        Utils.hideSoftKeyboardOnMaxLength(activity,activity.getEdtelefonecelular(), 13);
        Utils.nextInputOnMaxLength(activity, activity.getEdconfirmatelefonecelular(),activity.getEdtelefonecelular(), 13);
    }

    public boolean isValidateActivity(){

        boolean telefoneCelularError = false;
        boolean confirmaCelularError = false;



        if(activity.getEdconfirmatelefonecelular().getText().toString().isEmpty()){
            activity.getEdconfirmatelefonecelular().setError(activity.getString(R.string.error_invalid));
            activity.getEdconfirmatelefonecelular().requestFocus();
            telefoneCelularError = true;
        }


        if(activity.getEdtelefonecelular().getText().toString().isEmpty()){
            activity.getEdtelefonecelular().setError(activity.getString(R.string.error_invalid));
            activity.getEdtelefonecelular().requestFocus();
            telefoneCelularError = true;
        }



        if(telefoneCelularError || confirmaCelularError){
            return false;
        }else {
            return true;
        }
    }

}
