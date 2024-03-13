package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Celular;
import ecommerce.model.Produto;
import ecommerce.repository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Celular> listaProdutos = new ArrayList<Celular>();
	int id = 0;

	@Override
	public void listarTodosProdutos() {
		for (Produto produto : listaProdutos) {
			produto.visualizarProduto();
		}

	}

	@Override
	public void cadastrarProduto(Celular celular) {
		listaProdutos.add(celular);
		System.out.println("\nO Produto " + celular.getModelo() + " foi adicionado com sucesso.");
	}

	@Override
	public void deletarProduto(int id) {
		Celular deletar = new Celular();
		;
		if (listaProdutos.size() >= id) {
			for (var prod : listaProdutos) {
				if (prod.getId() == id) {
					deletar = prod;
				}

			}
		}

		if (deletar.getId() == id) {
			listaProdutos.remove(deletar);
			System.out.println("\nO Produto foi deletado da lista.");
		} else {
			System.out.println("ID não encontrado na lista de Produtos");
		}

	}

	@Override
	public void atualizarProduto(Celular celular, int id) {
		if (listaProdutos.size() >= id) {
			for (var prod : listaProdutos) {
				if (prod.getId() == id) {
					prod.setFabricante(celular.getFabricante());
					prod.setModelo(celular.getModelo());
					prod.setQuantidade(celular.getQuantidade());
					prod.setValor(celular.getValor());
					prod.setAndroid(celular.getAndroid());

					System.out.println("\nO produto foi atualizado com sucesso!");
				}
			}
		} else {
			System.out.println("O id digitado não foi encontrado, nenhuma alteração foi feita.");
		}
	}

	public int gerarID() {
		return ++id;
	}

}
