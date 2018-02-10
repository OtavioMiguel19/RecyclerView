package com.vidroid.com.br.apps.recyclerview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.vidroid.com.br.apps.recyclerview.R;
import com.vidroid.com.br.apps.recyclerview.RecyclerItemClickListener;
import com.vidroid.com.br.apps.recyclerview.adapter.Adapter;
import com.vidroid.com.br.apps.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Evento de clique
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getApplicationContext(),
                        recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Filme filme = listaFilmes.get(position);
                        String tituloFilme = filme.getTituloFilme();
                        Toast.makeText(getApplicationContext(),
                                "Clique em " + tituloFilme, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Filme filme = listaFilmes.get(position);
                        String tituloFilme = filme.getTituloFilme();
                        Toast.makeText(getApplicationContext(),
                                "Clique longo em " + tituloFilme, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                })
        );
    }

    public void criarFilmes(){
        Filme filme = new Filme("Incrível mundo de Gumball", "Infantil", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Deadpool 2", "Comédia", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo1", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo2", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo3", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo4", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo5", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo6", "genero", "2017");
        this.listaFilmes.add(filme);

        filme = new Filme("titulo7", "genero", "2017");
        this.listaFilmes.add(filme);

    }

}
