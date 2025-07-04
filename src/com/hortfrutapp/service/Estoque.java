package com.hortfrutapp.service;
import com.hortfrutapp.model.Fruta;
import com.hortfrutapp.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Fruta>estoqueFruta;
	
	public Estoque () {
		estoqueFruta = new ArrayList<>();
		
	}
	
	public List<Fruta> getEstoqueFruta(){
		return estoqueFruta;
	}
	
	public void setEstoqueFruta (List<Fruta>estoqueFruta) {
		this.estoqueFruta = estoqueFruta;
	}

	public void gerenciadorApp (int opcao, Atendente atendente){
        switch (opcao){
            case 1 ->{
                String nome = atendente.nomeFruta();
                double preco = atendente.precoFruta();
                int quantidade = atendente.quantidadeFrutas();
				Fruta fruta = new Fruta(nome, preco, quantidade);
                estoqueFruta.add(fruta);
            }
            
            case 2 ->{
                if (estoqueFruta.isEmpty()) {
                    atendente.frutaN();
                } else {
                    for (Fruta fruta : estoqueFruta) {
                        atendente.listarFrutas(fruta);
                    }
                }
            }

            case 3 -> {
               String nome = atendente.removerFruta();
               boolean removido = false; 

               for( int indice = 0; indice < estoqueFruta.size(); indice ++) {
                   if (estoqueFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
                       estoqueFruta.remove(indice);
                       removido = true;
                       System.out.println("Fruta removida com sucesso!");
                       break;
                   }
               }
               if (!removido) {
                   atendente.frutaNaoEncontrado(nome);
            }
		}
	}
}
}