package com.hortfrutapp.view;
import com.hortfrutapp.model.*;

import java.util.Scanner;

public class Atendente {
	Scanner leia = new Scanner (System.in);


			public int menu () {
			
				System.out.println("\n=====FRUTARIA DEUS REINA=====");
				System.out.println("|| 1 - Cadastrar Fruta ||");
				System.out.println("|| 2 - Cadastrar Verdura ||");
				System.out.println("|| 3 - Listar Frutas   ||");
				System.out.println("|| 4 - Listar Verduras   ||");
				System.out.println("|| 5 - Remover Fruta   ||");
				System.out.println("|| 6 - Remover Verdura   ||");

				System.out.println("=============================");
				System.out.println("||       7 - Sair      ||");
				System.out.println("Digite a opção desejada: ");
				int opcao = leia.nextInt();
				return opcao;
			}

			public Fruta cadastrarFrutas() {
				System.out.println("\nDigite o nome da Fruta: ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("Digite o Preço da Fruta: ");
				double preco = leia.nextDouble();
				leia.nextLine();
				System.out.println("Digite a Quantidade de Frutas: ");
				int quantidade = leia.nextInt();
				leia.nextLine();
				System.out.println("Digite o Peso da Fruta (em Kg): ");
				double peso = leia.nextDouble();
				leia.nextLine();
				System.out.println("\nFruta cadastrada com sucesso!");

				return new Fruta(nome, preco, quantidade, peso);


			}
		
			public Verdura cadastrarVerduras() {
				System.out.println("\nDigite o Nome da Verdura: ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("Digite o Preço da Verdura: ");
				double preco = leia.nextDouble();
				leia.nextLine();
				System.out.println("Digite a Quantidade de Verduras: ");
				int quantidade = leia.nextInt();
				leia.nextLine();
				System.out.println("Digite o Tipo da Verdura: ");
				String tipo = leia.nextLine();
				System.out.println("\nVerdura cadastrada com sucesso!");

				return new Verdura(nome, preco, quantidade, tipo);
			}


			public void listarFrutas (Fruta fruta){
					System.out.println("\nLista de Frutas cadastrados:");
					System.out.println("\n---------------------------------");
					System.out.println("\nNome: " + fruta.getNome());
					System.out.println("Preço: " + fruta.getPreco());
					System.out.println("Quantidade: " + fruta.getQuantidade());
					System.out.println("Peso: "+fruta.getPeso()+" kg");
				}

				public void listarVerduras (Verdura verdura){
					System.out.println("\nLista de Verduras cadastrados:");
					System.out.println("\n---------------------------------");
					System.out.println("\nNome: " + verdura.getNome());
					System.out.println("Preço: " + verdura.getPreco());
					System.out.println("Quantidade: " + verdura.getQuantidade());
					System.out.println("Tipo: "+verdura.getTipo());
				}

				public void frutaN() {
					System.out.println("Nenhuma Fruta cadastrada!");
				}
				public void VerduraN() {
					System.out.println("Nenhuma Verdura cadastrada!");
				}

				public String removerFruta() {
					System.out.println("Digite o nome da Fruta que deseja remover:");
					leia.nextLine(); 
					String nome = leia.nextLine();
					return nome;
				}

				public String removerVerdura() {
					System.out.println("Digite o nome da Verdura que deseja remover:");
					leia.nextLine(); 
					String nome = leia.nextLine();
					return nome;
				}


				public void frutaNaoEncontrado(String nome) {
					System.out.println("A Fruta "+nome+" não foi encontrada.");
				}

				public void verduraNaoEncontrado(String nome) {
					System.out.println("A verdura "+nome+" não foi encontrada.");
				}
			
			
		
				public void frutaRemovida (){
					System.out.println("Fruta removido com sucesso!");
				}

				public void verduraRemovida (){
					System.out.println("Verdura removida com sucesso!");
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

	