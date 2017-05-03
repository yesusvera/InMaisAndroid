package itspay.br.com.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import itspay.br.com.activity.DadosResgateRecargaCelularActivity;
import itspay.br.com.itspay.R;




public class RecargaCelularFragment extends Fragment {

    private View mView;
//    private Button btnConfirmar;
    private LinearLayout llClaro;
    private LinearLayout llNextel;
    private LinearLayout llOi;
    private LinearLayout llTim;
    private LinearLayout llVivo;

//    View.OnClickListener irRecargaCelular = new View.OnClickListener()
//
//    {
//        @Override
//        public void onClick(View v) {
//            AlertDialog.Builder builder = new AlertDialog.Builder(RecargaCelularFragment.this);
//            builder.setMessage(getString(R.string.confirmacao_ir_saldo_extrato))
//                    .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
//                            startActivity(intent);
//                        }
//                    })
//                    .setNegativeButton("Não", null);
//            builder.create().show();
//
//        }
//    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_recarga_celular, container, false);
        llClaro = (LinearLayout) mView.findViewById(R.id.linear_claro);
        llNextel = (LinearLayout) mView.findViewById(R.id.linear_nextel);
        llOi = (LinearLayout) mView.findViewById(R.id.linear_oi);
        llTim = (LinearLayout) mView.findViewById(R.id.linear_tim);
        llVivo = (LinearLayout) mView.findViewById(R.id.linear_vivo);


        llClaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);

            }
        });

        llNextel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        llOi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        llTim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });

        llVivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosResgateRecargaCelularActivity.class);
                startActivity(intent);
            }
        });


        return mView;
    }

}
