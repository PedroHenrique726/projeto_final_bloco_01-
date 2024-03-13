package ecommerce.repository;

import ecommerce.model.Produto;

public interface EcommerceRepository {

	public void listarTodosProdutos();
	public void cadastrarProduto();
	public void deletarProduto();
	public void atualizarProduto();
	
	
}
