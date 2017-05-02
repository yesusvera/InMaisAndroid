package itspay.br.com.activity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

import itspay.br.com.fragment.CartaoPrePagoFragment;
import itspay.br.com.fragment.CinemaProdutosFragment;
import itspay.br.com.fragment.CreditoDinheiroFragment;
import itspay.br.com.fragment.RecargaCelularFragment;
import itspay.br.com.itspay.R;

public class ResgateActivity extends AppCompatActivity {


    /**
     * Para configurar as tabs
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgate);

        configuraTabs();
    }

    public void configuraTabs() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tabLayout.setSelectedTabIndicatorColor(getColor(R.color.indicator_tab));
        }

        tabLayout.getTabAt(0).setCustomView(R.layout.tab_loja_personalizado);
        tabLayout.getTabAt(1).setCustomView(R.layout.tab_loja_personalizado);
        tabLayout.getTabAt(2).setCustomView(R.layout.tab_loja_personalizado);
        tabLayout.getTabAt(3).setCustomView(R.layout.tab_loja_personalizado);

        configuraTabPersonalizado(tabLayout.getTabAt(0).getCustomView(),
                R.drawable.icone_dinheiro,
                View.GONE,
                getResources().getString(R.string.titulo_tab_dinheiro)
        );
        configuraTabPersonalizado(tabLayout.getTabAt(1).getCustomView(),
                R.drawable.icone_celular,
                View.GONE,
                getResources().getString(R.string.titulo_tab_celular)
        );
        configuraTabPersonalizado(tabLayout.getTabAt(2).getCustomView(),
                R.drawable.icone_cinema,
                View.GONE,
                getResources().getString(R.string.titulo_tab_cinema)
        );
        configuraTabPersonalizado(tabLayout.getTabAt(3).getCustomView(),
                R.drawable.cartaoprepago,
                View.GONE,
                getResources().getString(R.string.titulo_tab_cartao)
        );
    }


    public void configuraTabPersonalizado(View view, int icone, int visibility, String nomeTab){

        TextView txtIcone = (TextView)view.findViewById(R.id.txt_icone);
        TextView txtBadget = (TextView)view.findViewById(R.id.txt_badged);
        TextView txtNomeTab = (TextView)view.findViewById(R.id.txt_nome_tab);

        txtIcone.setBackgroundResource(icone);
        txtBadget.setVisibility(visibility);
        txtNomeTab.setText(nomeTab);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        Drawable myDrawable;

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = new CreditoDinheiroFragment();

            switch (position) {
                case 0:
                    fragment = new CreditoDinheiroFragment();
                    break;
                case 1:
                    fragment = new RecargaCelularFragment();
                    break;
                case 2:
                    fragment = new CinemaProdutosFragment();
                    break;
                case 3:
                    fragment = new CartaoPrePagoFragment();
                    break;
                default:
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            String title = "";
            switch (position) {
                case 0:
                    title = getResources().getString(R.string.titulo_tab_dinheiro);
                    break;
                case 1:
                    title = getResources().getString(R.string.titulo_tab_celular);
                    break;
                case 2:
                    title = getResources().getString(R.string.titulo_tab_cinema);
                    break;
                case 3:
                    title = getResources().getString(R.string.titulo_tab_cartao);
                    break;
                default:
                    break;
            }
            SpannableStringBuilder sb = new SpannableStringBuilder("   " + title); // space added before text for convenience

            return sb;
        }
    }
}
