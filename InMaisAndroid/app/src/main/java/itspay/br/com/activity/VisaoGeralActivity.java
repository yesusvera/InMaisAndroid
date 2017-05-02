package itspay.br.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import itspay.br.com.itspay.R;

public class VisaoGeralActivity extends BaseDrawerActivity {

//    private BoomMenuButton bmb;
    private TextView txtAtualizarCadastro;
    private LinearLayout linearExtratoSaldo;
    private LinearLayout linearUltimosResgates;
    private LinearLayout linearUltimosCreditos;
    private LinearLayout linearPontosVencer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutView(R.layout.activity_visao_geral);
        super.onCreate(savedInstanceState);
//        posServico();

        txtAtualizarCadastro = (TextView) findViewById(R.id.tx_atualizar_castro);
        linearExtratoSaldo = (LinearLayout) findViewById(R.id.linear_extrato_saldo);
        linearUltimosCreditos = (LinearLayout) findViewById(R.id.linear_ultimos_creditos);
        linearPontosVencer = (LinearLayout) findViewById(R.id.linear_pontos_vencer);
        linearUltimosResgates = (LinearLayout) findViewById(R.id.linear_ultimos_resgates);


        txtAtualizarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlterarDadosPessoaisActivity.class);
                startActivity(intent);
            }
        });

//        txtVerExtratoSaldo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), CartaoActivity.class);
//                startActivity(intent);
//            }
//        });

        linearExtratoSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CartaoActivity.class);
                startActivity(intent);
            }
        });

        linearUltimosCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CartaoActivity.class);
                startActivity(intent);
            }
        });

        linearPontosVencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CartaoActivity.class);
                startActivity(intent);
            }
        });

        linearUltimosResgates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResgateActivity.class);
                startActivity(intent);
            }
        });



    }

//    public void posServico(){

//        bmb = (BoomMenuButton) findViewById(R.id.bmb);
//        assert bmb != null;
//        bmb.setButtonEnum(ButtonEnum.TextInsideCircle);
//
//        BuilderManagerFloatingButton.imageResourceIndex = 0;
//        BuilderManagerFloatingButton.imageResources = new int[]{
//                R.drawable.menu_icon4,
//                R.drawable.menu_icon4
//
//        };
//        BuilderManagerFloatingButton.textResources = new int[]{
//                R.string.str_icone_pontos_vencer,
//                R.string.str_icone_ultimos_lancamentos
//
//
//        };
//
//        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_2_2);
//        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_2_2);
//
//         for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++)
//
//                bmb.addBuilder(BuilderManagerFloatingButton.getTextInsideCircleButtonBuilder());
//
//
//
//
//        bmb.setOnBoomListener(new OnBoomListener() {
//            @Override
//            public void onClicked(int index, BoomButton boomButton) {
//                int strSelectedResource = BuilderManagerFloatingButton.textResources[index];
//
//                switch(strSelectedResource){
//                    case R.string.str_icone_pontos_vencer : verificarPontosVencer(); break;
//                    case R.string.str_icone_ultimos_lancamentos : ultimosLancamentos(); break;
////                    case R.string.str_icone_inserir_carga : inserirCarga(); break;
////                    case R.string.str_icone_cartoes_virtuais : cartoesVirtuais(); break;
////                    case R.string.str_icone_ajustes_seguranca : ajustesDeSeguranca(); break;
////                    case R.string.str_icone_tarifas : tarifas(); break;
////
//                }
//            }
//
//
//
//            @Override
//            public void onBackgroundClick() {
//
//            }
//
//            @Override
//            public void onBoomWillHide() {
//
//            }
//
//            @Override
//            public void onBoomDidHide() {
//
//            }
//
//            @Override
//            public void onBoomWillShow() {
//
//            }
//
//            @Override
//            public void onBoomDidShow() {
//
//            }
//        });

//    }

//    private void ultimosLancamentos() {
//
//        Intent intent = new Intent(getBaseContext(), UltimosLancamentosActivity.class);
//        startActivity(intent);
//    }
//
//
//
//    private void verificarPontosVencer() {
//
//        Intent intent = new Intent(getBaseContext(), PontosVencerActivity.class);
//        startActivity(intent);
//    }
}
