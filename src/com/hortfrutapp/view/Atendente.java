package com.hortfrutapp.view;
import com.hortfrutapp.model.Fruta;

import java.util.Scanner;

public class Atendente {
	Scanner leia = new Scanner (System.in);


			public int menu () {
			
				System.out.println("=====FRUTARIA DEUS REINA=====");
				System.out.println("|| 1 - Cadastrar Fruta ||");
				System.out.println("|| 2 - Listar Frutas   ||");
				System.out.println("|| 3 - Remover Fruta   ||");
				System.out.println("=============================");
				System.out.println("||       4 - Sair      ||");
				System.out.println("Digite a opção desejada: ");
				int opcao = leia.nextInt();
				return opcao;
			}

			public String nomeFruta(){
				System.out.println("Digite o nome da Fruta: ");
				leia.nextLine();
        		String nome = leia.nextLine();
        		return nome;
			}
		
			public double precoFruta(){
				System.out.println("Digite o Preço da Fruta: ");
				double preco = leia.nextDouble();
        		return preco;
			}
		
			public int quantidadeFrutas(){
				System.out.println("Digite a Quantidade de Frutas: ");
				int quantidade = leia.nextInt();
				return quantidade;
			}

			public void listarFrutas (Fruta fruta){
					System.out.println("\nLista de Frutas cadastrados:");
					System.out.println("\n---------------------------------");
					System.out.println("\nNome: " + fruta.getNome());
					System.out.println("Preço: " + fruta.getPreco());
					System.out.println("Quantidade: " + fruta.getQuantidade());
				}

				public void frutaN() {
					System.out.println("Nenhuma Fruta cadastrada!");
				}

				public String removerFruta() {
					System.out.println("Digite o nome da Fruta que deseja remover:");
					leia.nextLine(); 
					String nome = leia.nextLine();
					return nome;
				}

				public void frutaNaoEncontrado(String nome) {
					System.out.println("A Fruta "+nome+" não foi encontrada.");
				}
			
		
				public void frutaRemovida (){
					System.out.println("Fruta removido com sucesso!");
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
						System.out.printf("\n");
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

	