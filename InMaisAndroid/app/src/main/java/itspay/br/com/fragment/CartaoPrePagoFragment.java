package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import itspay.br.com.activity.DadosResgateCartaoPrePagoActivity;
import itspay.br.com.itspay.R;


public class CartaoPrePagoFragment extends Fragment {

    private View mView;
    private Button btnConfirmar;
    private Spinner spBanpara;
    private Spinner spCabal;
    private Spinner spVisa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cartao_pre_pago, container, false);
        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        spBanpara = (Spinner) mView.findViewById(R.id.sp_banpara);
        spCabal = (Spinner) mView.findViewById(R.id.sp_cabal);
        spVisa = (Spinner) mView.findViewById(R.id.sp_visa);


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        return mView;
    }

}
