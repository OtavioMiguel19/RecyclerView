package com.vidroid.com.br.apps.recyclerview.model;

/**
 * Created by otavi on 07/02/2018.
 */

public class Filme {

    private String tituloFilme, genero, ano;

    public Filme(){

    }

    public Filme(String tituloFilme, String genero, String ano){
        this.ano = ano;
        this.genero = genero;
        this.tituloFilme = tituloFilme;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}