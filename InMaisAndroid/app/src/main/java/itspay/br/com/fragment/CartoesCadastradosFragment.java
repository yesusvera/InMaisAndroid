package itspay.br.com.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import itspay.br.com.itspay.R;
import itspay.br.com.model.CartaoCadastrado;


public class CartoesCadastradosFragment extends Fragment {

    View mView;
    TextView mtvErroListaVazia;
    List<CartaoCadastrado> mList;
    RecyclerView mRvCartoes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cartoes_cadastrados, container, false);

        mtvErroListaVazia = (TextView)mView.findViewById(R.id.tv_erro_lista_vazia);
        mRvCartoes = (RecyclerView)mView.findViewById(R.id.rv_cartoes_cadastrados);


        if(mList == null){
            mtvErroListaVazia.setVisibility(View.VISIBLE);
        }else{
            mtvErroListaVazia.setVisibility(View.GONE);
            LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
            mRvCartoes.setLayoutManager(mLayoutManager);

//            mAdapter = new ContasCastradasAdapter(getContext(),contasBancarias);
//            mRvCartoes.setAdapter(mAdapter);
        }



        return mView;

    }

}
