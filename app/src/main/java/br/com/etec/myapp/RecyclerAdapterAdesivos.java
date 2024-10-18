package br.com.etec.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class RecyclerAdapterAdesivos extends RecyclerView.Adapter<RecyclerAdapterAdesivos.ViewHolder> {
    //cirando variáveis globais para representar a lista e o contexto
    private Context context;
    private List<Adesivos> lstAdesivo;
//criando contrustor


    public RecyclerAdapterAdesivos(Context context, List<Adesivos> lstAdesivo) {
        this.context = context;
        this.lstAdesivo = lstAdesivo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.fragment_adesivos, parent, false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.IdTextoAdesivoKU.setText(lstAdesivo.get(position).getTitulo());
        holder.IdAdesivoKU.setImageResource(lstAdesivo.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return lstAdesivo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView modelo_adesivos;
        ImageView IdAdesivoKU;
        TextView IdTextoAdesivoKU;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            modelo_adesivos = itemView.findViewById(R.id.modelo_adesivos);
            IdAdesivoKU = itemView.findViewById(R.id.IdadesivoKU);
            IdTextoAdesivoKU = itemView.findViewById(R.id.IdtextoadesivoKU);


        }
    }

}