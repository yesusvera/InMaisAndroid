package itspay.br.com.controller;

import android.content.Intent;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.activity.CadastroCliente1Activity;
import itspay.br.com.activity.CadastroEnderecoAcitvity;
import itspay.br.com.itspay.R;
import itspay.br.com.singleton.CadastroSingleton;
import itspay.br.com.util.Utils;
import itspay.br.com.util.validations.ValidationsForms;

/**
 * Created by juniorbraga on 14/03/17.
 */

public class CadastroCliente1Controller extends BaseActivityController<CadastroCliente1Activity>{

    public CadastroCliente1Controller(CadastroCliente1Activity activity) {
        super(activity);
    }


    public void isNextPage(){
        if (isValidateActivity()){
            CadastroSingleton.sharedInstance.setCpf(activity.getmEdCpf().getText().toString().replace(".", "").replace("-",""));
            CadastroSingleton.sharedInstance.setDataDeNascimento(Utils.formatDate(activity.getmEdDataNascimento().toString()));
            CadastroSingleton.sharedInstance.setEstadoCivil(activity.getmSpEstadoCivil().toString());
            CadastroSingleton.sharedInstance.setNacionalidade(activity.getmSpNacionalidade().toString());
            CadastroSingleton.sharedInstance.setSexo(activity.getmSpSexo().toString());

            Intent intent = new Intent (activity, CadastroEnderecoAcitvity.class);
            activity.startActivity(intent);

        }
    }


    private boolean isValidateActivity(){
        boolean nome = false;
        boolean cpf = false;
        boolean dataDeAniverssário = false;

        if(activity.getmEdNome().equals("")|| activity.getmEdNome() == null){
            activity.getmEdNome().setError(activity.getString(R.string.error_invalid_nome));
            activity.getmEdNome().requestFocus();
            nome = false;
//            return false;
        }else {
            nome = true;
        }

        if(!ValidationsForms.isCPF(activity.getmEdCpf().getText().toString())){
            activity.getmEdCpf().setError(activity.getString(R.string.error_invalid_cpf));
            activity.getmEdCpf().requestFocus();
            cpf = false;
//            return false;
        }else{
            cpf = true;
        }

        if(activity.getmEdDataNascimento().getText().toString().length() < 10){
            activity.getmEdDataNascimento().setError(activity.getString(R.string.error_data_nascimento_invalida));
            activity.getmEdDataNascimento().requestFocus();
            dataDeAniverssário = false;
//            return false;
        }else {
            dataDeAniverssário = true;
        }

        if(nome && cpf && dataDeAniverssário){
            return true;
        }else {
            return false;
        }
    }

    public void initDataComponent() {
        // Sexo

        List<String> sexoList = new ArrayList<String>();
        sexoList.add("Masculino");
        sexoList.add("Feminino");
        sexoList.add("Outros");

        ArrayAdapter<String> sexoAdapter = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item, sexoList);
        sexoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activity.getmSpSexo().setAdapter(sexoAdapter);


        //Estado Civil

        List<String> estadoCivilList = new ArrayList<String>();
        estadoCivilList.add("Solteiro(a)");
        estadoCivilList.add("Casado(a)");
        estadoCivilList.add("Divorciado(a)");
        estadoCivilList.add("Viúvo(a)");
        estadoCivilList.add("Separado(a)");
        estadoCivilList.add("Companheiro(a)");

        ArrayAdapter<String> estadoCivilAdapter = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item, estadoCivilList);
        estadoCivilAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activity.getmSpEstadoCivil().setAdapter(estadoCivilAdapter);


        //Nacionalidade

        List<String> nacionalidadeList = new ArrayList<String>();
        nacionalidadeList.add("Argentino");
        nacionalidadeList.add("Brasileiro");
        nacionalidadeList.add("Peruano");

        ArrayAdapter<String> nacionalidadeAdapter = new ArrayAdapter<String>(activity, android.R.layout.simple_spinner_item, nacionalidadeList);
        nacionalidadeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activity.getmSpNacionalidade().setAdapter(nacionalidadeAdapter);

    }

}
