package itspay.br.com.activity;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import itspay.br.com.controller.BaseController;
import itspay.br.com.itspay.R;
import itspay.br.com.util.mask.MaskEditTextChangedListener;

/**
 * Created by juniorbraga on 13/03/17.
 */

public class BaseDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private int mLayoutView;
    private Context mContext;
    private View mMainView;
    private LayerDrawable icon;
    private BaseController meusCartoesController = new BaseController(this,this);

    protected TextView mAccountItemListName;
    protected TextView mItemCpf;

    protected TextView mTvPoints;

    NavigationView mNavigationView;

    private View mDrawerHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMainView = getLayoutInflater().inflate(getLayoutView(), null);

        inintView();

        setContentView(mMainView);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void abrirMarketPlace(){
        Intent intent = new Intent(this, MarketPlaceActivity.class);
        startActivity(intent);
    }

    private void inintView(){

        Toolbar toolbar = (Toolbar) mMainView.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) mMainView.findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        mNavigationView = (NavigationView) mMainView.findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);

        mDrawerHeader = mNavigationView.inflateHeaderView(R.layout.nav_header_meus_cartoes);


        mTvPoints = (TextView) mDrawerHeader.findViewById(R.id.tv_points);
        mAccountItemListName = (TextView) mDrawerHeader.findViewById(R.id.account_item_list_name);
        mItemCpf = (TextView) mDrawerHeader.findViewById(R.id.item_cpf);

        MaskEditTextChangedListener maskCPF = new MaskEditTextChangedListener("###.###.###-##", mItemCpf);
        mItemCpf.addTextChangedListener(maskCPF);

        mTvPoints.setText("100.800");
        mAccountItemListName.setText("Rodrigo Palmeira");
//        mItemCpf.setText(IdentityItsPay.getInstance().getLoginPortador().getCpf());

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    @TargetApi(Build.VERSION_CODES.M)
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        //if (id == R.id.nav_trocar_email_portador) {
        //    meusCartoesController.abrirTrocarEmail();
        //} else if (id == R.id.nav_trocar_senha) {
        //    meusCartoesController.abrirTrocarSenha();
        if (id == R.id.nav_visão_geral) {
            Intent intent = new Intent(this, VisaoGeralActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_extrato) {
            Intent intent = new Intent(this, CartaoActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_acompanhar_resgates){
            Intent intent = new Intent(this, PedidoDetalheActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_alterar_dados_pessoais){
            Intent intent = new Intent(this, AlterarDadosPessoaisActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_meus_dados_para_creditos){
            Intent intent = new Intent(this, DadosParaCreditoActivity.class);
            startActivity(intent);
        }else if(id == R.id.nav_alterar_senha){
            Intent intent = new Intent(this, TrocarSenhaActivity.class);
            startActivity(intent);
        }  else if (id == R.id.nav_resgate) {
            Intent intent = new Intent(this, ResgateActivity.class);
            startActivity(intent);
        }    else if(id == R.id.nav_shopping){
            abrirMarketPlace();
        } else if(id == R.id.nav_fale_conosco){
            Intent intent = new Intent(this, FaleConoscoActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_conheca_in_mais){
            Intent intent = new Intent(this, ConhecaInMaisActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_logout){
            meusCartoesController.logout();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public int getmLayoutView() {
        return mLayoutView;
    }

    public void setmLayoutView(int mLayoutView) {
        this.mLayoutView = mLayoutView;
    }

    public Context getmContext() {
        return mContext;
    }

    public void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public LayerDrawable getIcon() {
        return icon;
    }

    public void setIcon(LayerDrawable icon) {
        this.icon = icon;
    }

    public int getLayoutView() {
        return this.mLayoutView;
    }

    public void setLayoutView(int layoutView) {
        this.mLayoutView = layoutView;
    }

}
