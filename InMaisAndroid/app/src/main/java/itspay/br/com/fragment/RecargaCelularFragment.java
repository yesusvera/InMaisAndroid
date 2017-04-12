package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import itspay.br.com.activity.DadosResgateRecargaCelularActivity;
import itspay.br.com.itspay.R;




public class RecargaCelularFragment extends Fragment {

    private View mView;
    private Button btnConfirmar;
    private Spinner spClaro;
    private Spinner spNextel;
    private Spinner spOi;
    private Spinner spTim;
    private Spinner spVivo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_recarga_celular, container, false);
        btnConfirmar = (Button) mView.findViewById(R.id.btn_confirmar);
        spClaro = (Spinner) mView.findViewById(R.id.sp_claro);
        spNextel = (Spinner) mView.findViewById(R.id.sp_nextel);
        spOi = (Spinner) mView.findViewById(R.id.sp_oi);
        spTim = (Spinner) mView.findViewById(R.id.sp_tim);


        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });


        return mView;
    }

}
