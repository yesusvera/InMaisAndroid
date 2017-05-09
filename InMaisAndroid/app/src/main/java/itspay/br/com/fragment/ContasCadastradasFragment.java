package itspay.br.com.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.activity.DadosBancariosActivity;
import itspay.br.com.adapter.ContasCastradasAdapter;
import itspay.br.com.itspay.R;
import itspay.br.com.model.ContaBancaria;


public class ContasCadastradasFragment extends Fragment {

    View mView;
    ContasCastradasAdapter mAdapter;
    RecyclerView mRvContas;
    TextView mtvErroListaVazia;
    Button btnSalvar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         mView = inflater.inflate(R.layout.fragment_contas_cadastradas, container, false);
        mRvContas = (RecyclerView)mView.findViewById(R.id.rv_contas_bancarias);
        mtvErroListaVazia = (TextView)mView.findViewById(R.id.tv_erro_lista_vazia);
        btnSalvar = (Button)mView.findViewById(R.id.trocar_email_button);

        List<ContaBancaria> contasBancarias= new ArrayList<ContaBancaria>();

        ContaBancaria conta1 = new ContaBancaria("Banco do Brasil", "   1239-4"," 54.125-4");
        ContaBancaria conta2 = new ContaBancaria("Caixa Economica", "1239-4"," 54.135-4");
        ContaBancaria conta3 = new ContaBancaria("Santander      ", "      2013","0011245-6");

        contasBancarias.add(conta1);
        contasBancarias.add(conta2);
        contasBancarias.add(conta3);

        if(contasBancarias == null){
            mtvErroListaVazia.setVisibility(View.VISIBLE);
        }else{
            LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
            mtvErroListaVazia.setVisibility(View.GONE);
            mRvContas.setHasFixedSize(true);
            mRvContas.setLayoutManager(mLayoutManager);

            mAdapter = new ContasCastradasAdapter(getContext(),contasBancarias);
            mRvContas.setAdapter(mAdapter);
        }

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosBancariosActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return mView;
    }

}
