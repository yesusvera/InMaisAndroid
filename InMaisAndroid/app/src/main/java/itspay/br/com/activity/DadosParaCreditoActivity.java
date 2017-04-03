package itspay.br.com.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.fragment.CartoesCadastradosFragment;
import itspay.br.com.fragment.ContasCadastradasFragment;
import itspay.br.com.itspay.R;
import itspay.br.com.util.viewpage.CustomViewPage;
import itspay.br.com.util.viewpage.CustomFragmentPagerAdapter;


public class DadosParaCreditoActivity extends AppCompatActivity {

    private CustomViewPage vpitens;
    private PagerAdapter mPagerAdapter = null;
    private CirclePageIndicator mCirclePageIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_para_credito);

        this.vpitens = (CustomViewPage) findViewById(R.id.vp_itens);
        mCirclePageIndicator = (CirclePageIndicator)findViewById(R.id.page_indicator);

        List<Fragment> fragmentsList = new ArrayList<>();
        fragmentsList.add(new ContasCadastradasFragment());
        fragmentsList.add(new CartoesCadastradosFragment());

        mPagerAdapter = new CustomFragmentPagerAdapter(getSupportFragmentManager(), this, fragmentsList);
        vpitens.setAdapter(mPagerAdapter);
        mCirclePageIndicator.setViewPager(vpitens);


    }
}
