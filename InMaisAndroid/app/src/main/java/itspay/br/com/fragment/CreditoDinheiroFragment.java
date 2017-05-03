package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import itspay.br.com.activity.DadosResgateCreditoCartaoPrePagoActivity;
import itspay.br.com.activity.DadosResgateCreditoContaActivity;
import itspay.br.com.itspay.R;


public class CreditoDinheiroFragment extends Fragment {

    private View mView;
    private LinearLayout llCaixa;
    private LinearLayout llCarteira;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_credito_dinheiro, container, false);
        llCaixa = (LinearLayout) mView.findViewById(R.id.linear_caixa);
        llCarteira = (LinearLayout) mView.findViewById(R.id.linear_carteira);

        llCaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCreditoCartaoPrePagoActivity.class);
                startActivity(intent);
            }
        });

        llCarteira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCreditoContaActivity.class);
                startActivity(intent);
            }
        });


        return mView;
    }

}
