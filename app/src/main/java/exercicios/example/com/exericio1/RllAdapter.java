package exercicios.example.com.exericio1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RllAdapter extends RecyclerView.Adapter<RllAdapter.LineHolder> {

    public List<String> lista;

    public RllAdapter(ArrayList l){
        this.lista = l;
    }


    @NonNull
    @Override
    public LineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rll, null, false);
        return new LineHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LineHolder lineHolder, int posicao) {
        lineHolder.Assinar(lista.get(posicao));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class  LineHolder extends RecyclerView.ViewHolder{
        public TextView title;

        public LineHolder(View itemView){
            super(itemView);
            title = itemView.findViewById(R.id.txtNomeDoRemetente);

        }

        public void Assinar(String s) {
            title.setText(s);
        }
    }
}
