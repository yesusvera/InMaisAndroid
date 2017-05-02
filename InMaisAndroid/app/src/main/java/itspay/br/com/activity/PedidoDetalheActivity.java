package itspay.br.com.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;

import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.adapter.FoldingCellPedidosAdapter;
import itspay.br.com.controller.PedidoDetalheController;
import itspay.br.com.itspay.R;
import itspay.br.com.model.Credencial;
import itspay.br.com.model.Pedido;


public class PedidoDetalheActivity extends AppCompatActivity {

    private OnFragmentInteractionListener mListener;
    private TabHost host;
    private String periodo = "15";
    public static Credencial credencialDetalhe;
    public SwipeRefreshLayout swipeRefreshLayout;
    private PedidoDetalheController controller;

    public ArrayList<Integer> pedidosCarregadosIndex = new ArrayList<>();

    private ListView theListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_detalhe);

        posServico();

        controller = new PedidoDetalheController(this);

//        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
////
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                controller.objectList();
//            }
//        });


        configurarPedidos(controller.objectList());
    }

    public void posServico(){


        host = (TabHost)findViewById(R.id.tabhost);
        host.setup();

        configureTabs();
//
//        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
////
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                controller.objectList();
//            }
//        });

    }

    public void configureTabs(){
        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("30");
        spec.setContent(R.id.tab1);
        spec.setIndicator("30 Dias");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("60");
        spec.setContent(R.id.tab2);
        spec.setIndicator("60 Dias");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("90");
        spec.setContent(R.id.tab3);
        spec.setIndicator("90 Dias");
        host.addTab(spec);

        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                setPeriodo(s);
                controller.objectList();
            }
        });
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


    public void configurarPedidos(final List<Pedido> listaPedidos) {

        theListView = (ListView) findViewById(R.id.mainListView);

        final FoldingCellPedidosAdapter adapter = new FoldingCellPedidosAdapter(this, listaPedidos);

        theListView.setAdapter(adapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                if (!((FoldingCell) view).isUnfolded()) {
                    //Somente busca no serviço se ele já não foi carregado.


                }
                // toggle clicked celula_pedido state
                ((FoldingCell) view).toggle(false);
                // register in adapter that state for selected celula_pedido is toggled
                adapter.registerToggle(pos);
            }
        });
    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
