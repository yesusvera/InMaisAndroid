package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import itspay.br.com.activity.DadosResgateCinemaProdutoActivity;
import itspay.br.com.itspay.R;




public class CinemaProdutosFragment extends Fragment {

    private View mView;
    private Button btnConfirmar;
    private Spinner spAmericanas;
    private Spinner spCinemark;
    private Spinner spCinemarkPadrao;
    private Spinner spShoptime;
    private Spinner spSubmarino;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_cinema_produtos, container, false);
        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        spAmericanas = (Spinner) mView.findViewById(R.id.sp_americanas);
        spCinemark = (Spinner) mView.findViewById(R.id.sp_cinemark);
        spCinemarkPadrao = (Spinner) mView.findViewById(R.id.sp_cinemark_padrao);
        spShoptime = (Spinner) mView.findViewById(R.id.sp_shoptime);




        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateCinemaProdutoActivity.class);
                startActivity(intent);
            }
        });


        return mView;
    }

}
