package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import itspay.br.com.activity.DadosResgateCinemaProdutoActivity;
import itspay.br.com.itspay.R;




public class CinemaProdutosFragment extends Fragment {

    private View mView;
//    private Button btnConfirmar;
    private ImageView imgAmericanas;
    private ImageView imgCinemark;
    private ImageView imgCinemarkPadrao;
    private ImageView imgShoptime;
    private ImageView imgSubmarino;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cinema_produtos, container, false);
//        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        imgAmericanas = (ImageView) mView.findViewById(R.id.img_americanas);
        imgCinemark = (ImageView) mView.findViewById(R.id.img_cinemark);
        imgCinemarkPadrao = (ImageView) mView.findViewById(R.id.img_cinemark_padrao);
        imgShoptime = (ImageView) mView.findViewById(R.id.img_shoptime);
        imgSubmarino = (ImageView) mView.findViewById(R.id.img_submarino);



//
//        btnConfirmar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
//                startActivity(intent);
//            }
//        });

        imgAmericanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        imgCinemark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        imgCinemarkPadrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        imgShoptime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        imgSubmarino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }

}
