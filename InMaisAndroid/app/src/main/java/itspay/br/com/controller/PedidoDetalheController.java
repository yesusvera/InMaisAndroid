package itspay.br.com.controller;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import itspay.br.com.model.Pedido;

/**
 * Created by juniorbraga on 24/03/17.
 */

public class PedidoDetalheController {

    Context mContext;

    public PedidoDetalheController(Context context){
        mContext = context;
    }

    public List<Pedido> objectList(){

        List<Pedido> listTitleScheduling = new ArrayList<>();

        Pedido pedido1 = new Pedido( null,"09/03/2017", "", "09/03/2017", "Aguardando Pagamento", 0, 0,0, 10, 101, 0, 10, 5, 0,1, 21.9, 694.1);
        Pedido pedido2 = new Pedido( null,"10/03/2017", "", "10/03/2017", "Show ACDC", 0, 0,0, 10, 101, 0, 10, 5, 0,1, 21.9, 694.1);
        Pedido pedido3 = new Pedido( null,"11/03/2017", "", "11/03/2017", "Show Wesley Safadao", 0, 0,0, 10, 101, 0, 10, 5, 0,1, 21.9, 694.1);
        Pedido pedido4 = new Pedido( null,"12/03/2017", "", "12/03/2017", "Show SpokFrevo", 0, 0,0, 10, 101, 0, 10, 5, 0,1, 21.9, 694.1);

        listTitleScheduling.add(pedido1);
        listTitleScheduling.add(pedido2);
        listTitleScheduling.add(pedido3);
        listTitleScheduling.add(pedido4);
        listTitleScheduling.add(pedido2);
        listTitleScheduling.add(pedido1);
        listTitleScheduling.add(pedido4);
        listTitleScheduling.add(pedido3);

        return listTitleScheduling;
    }
}

