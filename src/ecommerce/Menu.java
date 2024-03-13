package ecommerce;

import java.io.IOException;
import java.util.Scanner;

import ecommerce.model.Celular;

public class Menu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcao = "";

		Celular c1 = new Celular("Motorola", "Moto G04", 1, 762.00f, 100, 14);
		Celular c2 = new Celular();
		
		c2.setFabricante("Asus");
		c2.setId(2);
		c2.setModelo("Zenfone 10");
		c2.setAndroid(13);
		c2.setQuantidade(500);
		c2.setValor(4468.0f);
		
		c1.visualizarProduto();
		System.out.println();
		c2.visualizarProduto();
		
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
