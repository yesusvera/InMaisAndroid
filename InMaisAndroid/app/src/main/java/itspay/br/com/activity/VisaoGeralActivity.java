package itspay.br.com.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import itspay.br.com.itspay.R;

public class VisaoGeralActivity extends BaseDrawerActivity {

    //    private BoomMenuButton bmb;
//    private TextView txtAtualizarCadastro;
    private LinearLayout linearExtratoSaldo;
    private LinearLayout linearUltimosResgates;
    private LinearLayout linearUltimosCreditos;
    private LinearLayout linearPontosVencer;
    private LinearLayout linearAtualizarCadastro;


    View.OnClickListener irTelaExtratoListener = new View.OnClickListener()

    {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(VisaoGeralActivity.this);
            builder.setMessage(getString(R.string.confirmacao_ir_saldo_extrato))
                    .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), CartaoActivity.class);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Não", null);
            builder.create().show();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutView(R.layout.activity_visao_geral);
        super.onCreate(savedInstanceState);

        linearAtualizarCadastro = (LinearLayout) findViewById(R.id.linear_atualizar_cadastro);
        linearExtratoSaldo = (LinearLayout) findViewById(R.id.linear_extrato_saldo);
        linearUltimosCreditos = (LinearLayout) findViewById(R.id.linear_ultimos_creditos);
        linearPontosVencer = (LinearLayout) findViewById(R.id.linear_pontos_vencer);
        linearUltimosResgates = (LinearLayout) findViewById(R.id.linear_ultimos_resgates);


        linearAtualizarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VisaoGeralActivity.this);
                builder.setMessage(getString(R.string.confirmacao_ir_editar_cadastro))
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getApplicationContext(), AlterarDadosPessoaisActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Não", null);
                builder.create().show();
            }
        });

        linearExtratoSaldo.setOnClickListener(irTelaExtratoListener);
        linearUltimosCreditos.setOnClickListener(irTelaExtratoListener);
        linearPontosVencer.setOnClickListener(irTelaExtratoListener);

        linearUltimosResgates.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VisaoGeralActivity.this);
                builder.setMessage(getString(R.string.confirmacao_ir_ultimos_resgates))
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Intent intent = new Intent(getApplicationContext(), ResgateActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Não", null);
                builder.create().show();
            }
        });


    }




}
