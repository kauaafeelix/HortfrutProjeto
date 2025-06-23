package com.hortfrutapp.view;

import java.util.Scanner;

public class Atendente {
	

	private Scanner leia;
	
		public Atendente() {
			leia = new Scanner (System.in);
		}

			public int menu () {
			
				System.out.println("=====FRUTARIA DEUS REINA=====");
				System.out.println("|| 1 - Cadastrar Fruta ||");
				System.out.println("|| 2 - Listar Frutas   ||");
				System.out.println("|| 3 - Remover Fruta   ||");
				System.out.println("=============================");
				System.out.println("||       4 - Sair      ||");
				int opcao = leia.nextInt();
				
				return opcao;
			}
			public Scanner getLeia() {
				return leia;
			}
			
			public void setLeia(Scanner leia) {
				this.leia = leia;
			}
}

	