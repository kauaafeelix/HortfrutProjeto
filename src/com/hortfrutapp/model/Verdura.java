package com.hortfrutapp.model;

public class Verdura extends Produto {
    private String tipo;


    public Verdura (){
        super();
        this.tipo = "";
    }

    public Verdura(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Verdura \n[ Nome: "+getNome() +"\nPreço: "+getPreco()+"\nQuantidade"+getQuantidade()+"\nTipo: "+getTipo()+" ]";

    }
}

