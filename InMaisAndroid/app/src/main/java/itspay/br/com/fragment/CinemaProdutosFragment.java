package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import itspay.br.com.activity.DadosResgateCinemaProdutoActivity;
import itspay.br.com.itspay.R;




public class CinemaProdutosFragment extends Fragment {

    private View mView;
//    private Button btnConfirmar;
    private LinearLayout llAmericanas;
    private LinearLayout llCinemark;
    private LinearLayout llCinemarkPadrao;
    private LinearLayout llShoptime;
    private LinearLayout llSubmarino;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cinema_produtos, container, false);
//        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        llAmericanas = (LinearLayout) mView.findViewById(R.id.linear_americanas);
        llCinemark = (LinearLayout) mView.findViewById(R.id.linear_cinemark);
        llCinemarkPadrao = (LinearLayout) mView.findViewById(R.id.linear_cinemark_padrao);
        llShoptime = (LinearLayout) mView.findViewById(R.id.linear_shoptime);
        llSubmarino = (LinearLayout) mView.findViewById(R.id.linear_submarino);



//
//        btnConfirmar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
//                startActivity(intent);
//            }
//        });

        llAmericanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        llCinemark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        llCinemarkPadrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        llShoptime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        llSubmarino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }

}
