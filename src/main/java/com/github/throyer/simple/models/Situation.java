package com.github.throyer.simple.models;

public enum Situation {

    DONE("DONE"), TO_DO("TO DO"), DOING("DOING");

    public String situacao;

    Situation(String tipo) {
        this.situacao = tipo;
    }

    @Override
    public String toString() {
        return this.situacao;
    }

}
