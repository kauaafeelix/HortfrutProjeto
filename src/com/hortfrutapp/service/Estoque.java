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

    Scanner leiaStr = new Scanner (System.in);
    Scanner leiaNum = new Scanner (System.in);
    
	public void gerenciadorApp (int opcao, Atendente atendente){
        switch (opcao){
            case 1 ->{
                int opcaoSubMenu = atendente.subMenu();
                switch (opcaoSubMenu) {
                    case 1 ->{
                        Fruta fruta = atendente.cadastrarFrutas(leiaStr, leiaNum);
                        if (fruta != null) {
                            estoqueProduto.add(fruta);
                        }
                    }
                    case 2 ->{
                        Verdura verdura = atendente.cadastrarVerduras(leiaStr, leiaNum);
                        if (verdura != null) {
                            estoqueProduto.add(verdura); 
                        }
                    }
                }
            }
            case 2 ->{
                    int opcaopesquisa = atendente.menuLista();               
                    switch (opcaopesquisa) {
                        case 1 -> {
                        	boolean encontrado = false;
                            for (Produto produto : estoqueProduto) {
                            	if (produto instanceof Fruta fruta) {
                                    System.out.println(fruta);
                                    encontrado = true;
                                    }else if (produto instanceof Verdura verdura) {
                                    System.out.println(verdura);
                                    encontrado = true;
                                }
                            }
                            
                            if (encontrado == false) {
                            	atendente.frutaN();
                            }
                        }
                        case 2 -> {
                            for (Produto produto : estoqueProduto) {
                                if (produto instanceof Fruta fruta) {
                                    System.out.println(fruta);
                                }
                            }
                        }
                        case 3 -> {
                            for (Produto produto : estoqueProduto) {
                                if (produto instanceof Verdura verdura) {
                                    System.out.println(verdura);
                                }
                            }
                        }
                        default -> System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            
            case 3 ->{
               int opcaoRemover = atendente.menuRemover();
                switch (opcaoRemover) {
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