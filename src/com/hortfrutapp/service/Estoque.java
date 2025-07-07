package com.hortfrutapp.service;
import com.hortfrutapp.model.*;
import com.hortfrutapp.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Fruta>estoqueFruta;
	private List <Verdura>estoqueVerdura;

	public Estoque () {
		estoqueFruta = new ArrayList<>();
		estoqueVerdura = new ArrayList<>();
	}
	
	public List<Fruta> getEstoqueFruta(){
		return estoqueFruta;
	}
	
	public void setEstoqueFruta (List<Fruta>estoqueFruta) {
		this.estoqueFruta = estoqueFruta;
	}

    public List <Verdura> getEstoqueVerdura (){
        return estoqueVerdura;
    }

    public void setEstoqueVerdura (List <Verdura>estoqueVerdura){
        this.estoqueVerdura = estoqueVerdura;
    }

	public void gerenciadorApp (int opcao, Atendente atendente){
        switch (opcao){
            case 1 ->{
                Fruta fruta = atendente.cadastrarFrutas(); 
            if (fruta != null) {
                estoqueFruta.add(fruta);
            }
            }
            case 2 ->{
                Verdura verdura = atendente.cadastrarVerduras();
                if (verdura != null) {
                    estoqueVerdura.add(verdura); 
                }
            }
            
            case 3 ->{
                if (estoqueFruta.isEmpty()) {
                    atendente.frutaN();
                } else {
                    for (Fruta fruta : estoqueFruta) {
                        atendente.listarFrutas(fruta);
                    }
                }
            }

            case 4 ->{
                if (estoqueVerdura.isEmpty()) {
                    atendente.VerduraN();
                } else {
                    for (Verdura verdura : estoqueVerdura) {
                        atendente.listarVerduras(verdura);
                    }
                }
            }

            case 5 -> {
               String nome = atendente.removerFruta();
               boolean removido = false; 

               for( int indice = 0; indice < estoqueFruta.size(); indice ++) {
                   if (estoqueFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
                       estoqueFruta.remove(indice);
                       removido = true;
                       atendente.frutaRemovida();
                       break;
                   }
               }
               if (!removido) {
                   atendente.frutaNaoEncontrado(nome);
            }
		}

        case 6 -> {
            String nome = atendente.removerVerdura();
            boolean removido = false; 

            for( int indice = 0; indice < estoqueVerdura.size(); indice ++) {
                if (estoqueVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
                    estoqueVerdura.remove(indice);
                    removido = true;
                    atendente.verduraRemovida();
                    break;
                }
            }
            if (!removido) {
                atendente.verduraNaoEncontrado(nome);
         }
     }
	}
}
}