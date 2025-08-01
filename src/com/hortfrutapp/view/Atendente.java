package com.hortfrutapp.view;
import com.hortfrutapp.model.*;

import java.util.Scanner;

public class Atendente {
	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);


			public int menu () {
			
				System.out.println("\n=====FRUTARIA DEUS REINA=====");
				System.out.println("|| 1 - Cadastrar Produto ||");
				System.out.println("|| 2 - Listar Produtos   ||");
				System.out.println("|| 3 - Remover Produto   ||");

				System.out.println("=============================");
				System.out.println("||       4 - Sair        ||");
				System.out.println("Digite a opção desejada: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}

			public int subMenu(){
				System.out.println("1 - Cadastrar Fruta");
				System.out.println("2 - Cadastrar Verdura");
				System.out.println("Digite a opção desejada: ");
				int opcaoSubMenu = leiaNum.nextInt();
				return opcaoSubMenu;
			}

			public Fruta cadastrarFrutas(Scanner leiaStr, Scanner leiaNum) {
				Fruta fruta = new Fruta();
				System.out.println("\nDigite o nome da Fruta: ");
				fruta.setNome(leiaStr.nextLine()); 
				System.out.println("Digite o Preço da Fruta: ");
				fruta.setPreco(leiaNum.nextDouble()); 
				System.out.println("Digite a Quantidade de Frutas: ");
				fruta.setQuantidade(leiaNum.nextInt());
				System.out.println("Digite o Peso da Fruta (em Kg): ");
				fruta.setPeso(leiaNum.nextDouble());
				System.out.println("\nFruta cadastrada com sucesso!");
				return fruta;

			}
		
			public Verdura cadastrarVerduras(Scanner leiaStr, Scanner leiaNum) {
				Verdura verdura = new Verdura();	
				System.out.println("\nDigite o Nome da Verdura: ");
				verdura.setNome(leiaStr.nextLine());
				System.out.println("Digite o Preço da Verdura: ");
				verdura.setPreco(leiaNum.nextDouble());
				System.out.println("Digite a Quantidade de Verduras: ");
				verdura.setQuantidade(leiaNum.nextInt());
				System.out.println("Digite o Tipo da Verdura: ");
				verdura.setTipo(leiaStr.nextLine());
				System.out.println("\nVerdura cadastrada com sucesso!");
				
				return verdura;
			}

			public void listarProdutos (Produto produto){
				System.out.println(produto);
			}

			public int menuLista(){
				System.out.println("\n=====FRUTARIA DEUS REINA=====");
				System.out.println("|| 1 - Listar Todos os Produtos      ||");
				System.out.println("|| 2 - Listar Frutas        ||");
				System.out.println("|| 3 - Listar Verduras      ||");
				System.out.println("=============================");
				System.out.println("||       4 - Sair           ||");
				System.out.println("Digite a opção desejada: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}

			public int menuRemover(){
				System.out.println("\n=====FRUTARIA DEUS REINA=====");
				System.out.println("|| 1 - Remover Fruta      ||");
				System.out.println("|| 2 - Remover Verdura    ||");
				System.out.println("=============================");
				System.out.println("||       3 - Sair         ||");
				System.out.println("Digite a opção desejada: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}

			public String removerFruta(){
				System.out.println("\nDigite o nome da fruta que deseja remover: ");
				String nomeFruta = leiaStr.nextLine();
				return nomeFruta;
			}

			public String removerVerdura(){
				System.out.println("\nDigite o nome da verdura que deseja remover: ");
				String nomeVerdura = leiaStr.nextLine();
				return nomeVerdura;
			}

			public void frutaN() {
				System.out.println("\nNenhuma fruta cadastrada no momento.");
			}
			public void VerduraN() {
				System.out.println("\nNenhuma verdura cadastrada no momento.");
			}

			public void produtoN() {
				System.out.println("\nNenhum produto cadastrado no momento.");
			}

			public void removerProduto() {
				System.out.println("\nProduto removido com sucesso!");
			}

			public void erro(){
				System.out.println("Erro: Opção inválida! Por favor, escolha uma opção entre 1 e 7.");
			}
		
			public void encerrando() {
				try {
					System.out.print("\nS");
					Thread.sleep(500); 
					System.out.print("i");
					Thread.sleep(500);
					System.out.print("s");
					Thread.sleep(500);
					System.out.print("t");
					Thread.sleep(500);
					System.out.print("e");
					Thread.sleep(500);
					System.out.print("m");
					Thread.sleep(500);
					System.out.print("a");
					Thread.sleep(500);
					System.out.println("\n");
					Thread.sleep(500);
					System.out.print("E");
					Thread.sleep(500);
					System.out.print("n");
					Thread.sleep(500);
					System.out.print("c");
					Thread.sleep(500);
					System.out.print("e");
					Thread.sleep(500);
					System.out.print("r");
					Thread.sleep(500);
					System.out.print("r");
					Thread.sleep(500);
					System.out.print("a");
					Thread.sleep(500);
					System.out.print("d");
					Thread.sleep(500);
					System.out.print("o");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace(); 
				}
		
		
			}
		
		
		}

	