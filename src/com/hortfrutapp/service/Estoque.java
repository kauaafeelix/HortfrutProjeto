package com.hortfrutapp.service;
import com.hortfrutapp.model.*;
import com.hortfrutapp.view.Atendente;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    private List <Produto>estoqueProduto;

	public Estoque () {
        estoqueProduto = new ArrayList<>();

	}

    public List <Produto> getEstoqueProduto (){
        return estoqueProduto;
    }
    public void setEstoqueProduto (List <Produto>estoqueProduto){
        this.estoqueProduto = estoqueProduto;
    }

    Scanner leia = new Scanner (System.in);
	public void gerenciadorApp (int opcao, Atendente atendente){
        switch (opcao){
            case 1 ->{
                int opcaoSubMenu = atendente.subMenu();
                switch (opcaoSubMenu) {
                    case 1 ->{
                        Produto frutaProduto = atendente.cadastrarFrutas(leia);
                        if (frutaProduto != null) {
                            estoqueProduto.add(frutaProduto);
                        }
                    }
                    case 2 ->{
                        Produto verduraProduto = atendente.cadastrarVerduras(leia);
                        if (verduraProduto != null) {
                            estoqueProduto.add(verduraProduto); 
                        }
                    }
                }
            }
            case 2 ->{
                    atendente.menuLista();               
                    switch (opcao) {
                        case 1 -> {
                            for (Produto produto : estoqueProduto) {
                                atendente.listarProdutos(produto);
                            }
                        }
                        case 2 -> {
                            for (Produto produto : estoqueProduto) {
                                if (produto instanceof Fruta) {
                                    atendente.listarProdutos(produto);
                                }
                            }
                        }
                        case 3 -> {
                            for (Produto produto : estoqueProduto) {
                                if (produto instanceof Verdura) {
                                    atendente.listarProdutos(produto);
                                }
                            }
                        }
                        default -> System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            
            case 3 ->{
                atendente.menuRemover();
                switch (opcao) {
                    case 1 ->{
                        String nome = atendente.removerFruta();
                        boolean removido = false; 

               for( int indice = 0; indice < estoqueProduto.size(); indice ++) {
                   if (estoqueProduto.get(indice).getNome().equalsIgnoreCase(nome)) {
                       estoqueProduto.remove(indice);
                       removido = true;
                       atendente.removerProduto();
                       break;
                   }
               }
                if (!removido) {
                   atendente.frutaN();
               }

                    }
                    case 2 ->{
                        String nome = atendente.removerVerdura();
                        boolean removido = false;
                        for( int indice = 0; indice < estoqueProduto.size(); indice ++) {
                            if (estoqueProduto.get(indice).getNome().equalsIgnoreCase(nome)) {
                                estoqueProduto.remove(indice);
                                removido = true;
                                atendente.removerProduto();
                                break;
                            }
                        }
                         if (!removido) {
                            atendente.VerduraN();
                        }
                    }
                }
            }
            case 4 ->{
                atendente.encerrando();
            }
}
}
}