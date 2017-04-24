package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import itspay.br.com.activity.DadosResgateCartaoPrePagoActivity;
import itspay.br.com.itspay.R;


public class CartaoPrePagoFragment extends Fragment {

    private View mView;
//    private Button btnConfirmar;
    private ImageView imgBanpara;
    private ImageView imgCabal;
    private ImageView imgVisa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cartao_pre_pago, container, false);
//        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        imgBanpara = (ImageView) mView.findViewById(R.id.img_banpara);
        imgCabal = (ImageView) mView.findViewById(R.id.img_cabal);
        imgVisa = (ImageView) mView.findViewById(R.id.img_visa);

//
//        btnConfirmar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
//                startActivity(intent);
//            }
//        });

        imgBanpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        imgCabal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        imgVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }

}
