package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import itspay.br.com.activity.DadosResgateRecargaCelularActivity;
import itspay.br.com.itspay.R;




public class RecargaCelularFragment extends Fragment {

    private View mView;
//    private Button btnConfirmar;
    private ImageView imgClaro;
    private ImageView imgNextel;
    private ImageView imgOi;
    private ImageView imgTim;
    private ImageView imgVivo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_recarga_celular, container, false);
//        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        imgClaro = (ImageView) mView.findViewById(R.id.img_claro);
        imgNextel = (ImageView) mView.findViewById(R.id.img_nextel);
        imgOi = (ImageView) mView.findViewById(R.id.img_oi);
        imgTim = (ImageView) mView.findViewById(R.id.img_tim);
        imgVivo = (ImageView) mView.findViewById(R.id.img_vivo);

//
//        btnConfirmar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
//                startActivity(intent);
//            }
//        });

        imgClaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        imgNextel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        imgOi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        imgTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        imgVivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });


        return mView;
    }

}