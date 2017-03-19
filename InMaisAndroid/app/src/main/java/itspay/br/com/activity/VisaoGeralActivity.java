package itspay.br.com.activity;

import android.os.Build;
import android.os.Bundle;

import itspay.br.com.itspay.R;

public class VisaoGeralActivity extends BaseDrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setLayoutView(R.layout.activity_visao_geral);
        super.onCreate(savedInstanceState);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            initFloatinButon(ModuleType.SEUS_PONTOS);
        }

    }


}
