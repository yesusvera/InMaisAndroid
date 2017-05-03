package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import itspay.br.com.activity.DadosResgateCartaoPrePagoActivity;
import itspay.br.com.itspay.R;


public class CartaoPrePagoFragment extends Fragment {

    private View mView;
//    private Button btnConfirmar;
    private LinearLayout llBanpara;
    private LinearLayout llCabal;
    private LinearLayout llVisa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cartao_pre_pago, container, false);
        llBanpara = (LinearLayout) mView.findViewById(R.id.linear_banpara);
        llCabal = (LinearLayout) mView.findViewById(R.id.linear_cabal);
        llVisa = (LinearLayout) mView.findViewById(R.id.linear_visa);


        llBanpara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        llCabal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        llVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }

}
