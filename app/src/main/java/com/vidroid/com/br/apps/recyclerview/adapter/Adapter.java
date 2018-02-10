package com.vidroid.com.br.apps.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.vidroid.com.br.apps.recyclerview.R;
import com.vidroid.com.br.apps.recyclerview.model.Filme;

import java.util.List;

/**
 * Created by otavi on 07/02/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> lista) {
        this.listaFilmes = lista;
    }

    //VireHolder é necessário para receber os componentes do xml na view e configurar os necessarios
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titulo, ano, genero;

        public MyViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            ano = itemView.findViewById(R.id.textAno);
            genero = itemView.findViewById(R.id.textGenero);

        }
    }

    //Aqui é criado o view holder, que vai mostrar os itens depois. Infle a view e passe como parametro
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    //Com a view criada, aqui será definido o que será exibido nos campos
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Filme filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.genero.setText(filme.getGenero());
        holder.ano.setText(filme.getAno());
    }

    //No final, isso define quantos itens serão exibidos simultaneamente
    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }



}
