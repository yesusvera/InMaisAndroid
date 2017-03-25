package itspay.br.com.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ramotion.foldingcell.FoldingCell;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.adapter.FoldingCellPedidosAdapter;
import itspay.br.com.controller.PedidoDetalheController;
import itspay.br.com.itspay.R;
import itspay.br.com.model.Pedido;


public class PedidoDetalheActivity extends AppCompatActivity {

    private OnFragmentInteractionListener mListener;

    public SwipeRefreshLayout swipeRefreshLayout;
    private PedidoDetalheController controller;

    public ArrayList<Integer> pedidosCarregadosIndex = new ArrayList<>();

    private ListView theListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_detalhe);

        controller = new PedidoDetalheController(this);

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
//
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
//                controller.objectList();
            }
        });


        configurarPedidos(controller.objectList());
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
