package itspay.br.com.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import itspay.br.com.itspay.R;
import itspay.br.com.model.ContaBancaria;

/**
 * Created by juniorbraga on 02/04/17.
 */


public class ContasCastradasAdapter extends RecyclerView.Adapter<ContasCastradasAdapter.ViewHolder> {

    private Context mContext;
    private List<ContaBancaria> mList;

    public ContasCastradasAdapter(Context context, List<ContaBancaria> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_conta_bancaria, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final ContaBancaria item = mList.get(position);

        if (position % 2 == 0) {
            holder.lltitulo.setBackgroundColor(mContext.getResources().getColor(R.color.light_gray));
        } else {
            holder.lltitulo.setBackgroundColor(mContext.getResources().getColor(R.color.bgContent));
        }

        holder.tvbanco.setText(item.getBanco());
        holder.tvagencia.setText(item.getAgencia());
        holder.tvconta.setText(item.getConta());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public List<ContaBancaria> getList() {
        return mList;
    }

    public void setList(List<ContaBancaria> list) {
        mList = list;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvbanco;
        private TextView tvagencia;
        private TextView tvconta;
        private android.widget.LinearLayout lltitulo;

        public ViewHolder(View v) {
            super(v);
            this.lltitulo = (LinearLayout) v.findViewById(R.id.ll_titulo);
            this.tvconta = (TextView) v.findViewById(R.id.tv_conta);
            this.tvagencia = (TextView) v.findViewById(R.id.tv_agencia);
            this.tvbanco = (TextView) v.findViewById(R.id.tv_banco);

        }
    }
}

