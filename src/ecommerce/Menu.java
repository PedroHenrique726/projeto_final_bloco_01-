package ecommerce;

import java.io.IOException;
import java.util.Scanner;



	public class Menu {
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String opcao = "";

			System.out.println();
			boasVindas();

			do {
				
				System.out.println("\n\n\n\nSelecione uma opção:");
				System.out.println("(C)adastrar, (A)tualizar, (L)istar, (D)eletar itens ou digite (S)air.");
				opcao = sc.nextLine().toLowerCase();

				switch (opcao) {
				case "c":
				case "cadastrar":
					System.out.println("Cadastrar produto\n");
					keyPress();
					sc.skip("\\R?");
					break;
				case "a":
				case "atualizar":
					System.out.println("Atualizar produto\n");
					keyPress();
					sc.skip("\\R?");
					break;
				case "l":
				case "listar":
					System.out.println("Listar produto\n");
					keyPress();
					sc.skip("\\R?");
					break;
				case "d":
				case "deletar":
					System.out.println("Deletar produto\n");
					keyPress();
					sc.skip("\\R?");
					break;
				case "s":
				case "sair":
					System.out.println("Obrigado por usar o nosso sistema.");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Opcao invalida\n");
					keyPress();
					sc.skip("\\R?");
					break;
				}

			} while (true);


		}

		public static void boasVindas() {
			System.out.println("");
			System.out.println("                           E-commerce");
			System.out.println("              Cadastre, Liste, Atualize e Apague itens  ");
			System.out.println("");

		}
		
		public static void keyPress() {
			try {
				System.out.println("Pressione Enter para Continuar ... \n\n\n\n\n\n");
				System.in.read();
				
			} catch (IOException e) {
				System.out.println("Você pressionou uma tecla diferente de enter!");
			}
		}
}
