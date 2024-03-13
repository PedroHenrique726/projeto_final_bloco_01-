package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.EcommerceController;
import ecommerce.model.Celular;

public class Menu {
	public static void main(String[] args) {

		EcommerceController produtos = new EcommerceController();

		Scanner sc = new Scanner(System.in);
		String opcao = "";
		String fabricante, modelo;
		int quantidade, android, id;
		float valor;

		boasVindas();

		do {

			System.out.println("\n\n\n\nSelecione uma opção:");
			System.out.println("(C)adastrar, (A)tualizar, (L)istar, (D)eletar itens ou digite (S)air.");

			try {
				String input = sc.nextLine().toLowerCase();
				if (input.matches("[a-z]+")) {
					opcao = input;
				}
			} catch (InputMismatchException e) {
				System.out.println("\nEntrada Invalida. Digite apenas letras\n");
				sc.nextLine();
				opcao = "";
				;
			}

			switch (opcao) {
			case "c":
			case "cadastrar":
				System.out.println("Cadastrar novo Celular\n");
				System.out.println("Digite o Fabricante: ");
				fabricante = sc.nextLine();
				System.out.println("Digite o Modelo: ");
				modelo = sc.nextLine();
				System.out.println("Digite a Quantidade: ");
				quantidade = sc.nextInt();
				System.out.println("Digite o valor: ");
				valor = sc.nextFloat();
				System.out.println("Digite o Android do celular: ");
				android = sc.nextInt();

				produtos.cadastrarProduto(
						new Celular(fabricante, modelo, produtos.gerarID(), valor, quantidade, android));
				;
				keyPress();
				sc.skip("\\R?");
				sc.skip("\\R?");
				break;
			case "a":
			case "atualizar":
				System.out.println("Atualizar Produto\n");
				System.out.println("Digite o ID do Produto a ser atualizado: ");
				id = sc.nextInt();
				System.out.println("Atualize o Novo Fabricante do Produto: ");
				sc.skip("\\R?");
				fabricante = sc.nextLine();
				System.out.println("Atualize o Novo Modelo do Produto: ");
				modelo = sc.nextLine();
				System.out.println("Atualize a Nova Quantidade do Produto: ");
				quantidade = sc.nextInt();
				System.out.println("Atualize o Novo Valor do Produto: ");
				valor = sc.nextFloat();
				System.out.println("Atualize o Novo Android do Produto: ");
				android = sc.nextInt();

				produtos.atualizarProduto(new Celular(fabricante, modelo, id, valor, quantidade, android), id);

				keyPress();
				sc.skip("\\R?");
				sc.skip("\\R?");
				break;
			case "l":
			case "listar":
				System.out.println("Lista de Produtos: \n");
				produtos.listarTodosProdutos();

				keyPress();
				sc.skip("\\R?");
				break;
			case "d":
			case "deletar":
				System.out.println("Deletar Produto\n");
				System.out.println("Digite o ID do produto a ser deletado: ");
				id = sc.nextInt();

				produtos.deletarProduto(id);

				keyPress();
				sc.skip("\\R?");
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
