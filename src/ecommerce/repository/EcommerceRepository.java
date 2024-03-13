package ecommerce.repository;

import ecommerce.model.Celular;

public interface EcommerceRepository {

	public void listarTodosProdutos();

	public void cadastrarProduto(Celular celular);

	public void deletarProduto(int id);

	public void atualizarProduto(Celular celular, int id);

}
