package ecommerce.model;

public abstract class Produto {

	String fabricante;
	String modelo;
	int id;
	float valor;
	int quantidade;

	public Produto(String fabricante, String modelo, int id, float valor, int quantidade) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.id = id;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Produto() {

	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizarProduto() {

		System.out.println("ID do Produto: " + this.getId());
		System.out.println("Fabricante: " + this.getFabricante());
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Quantidade em estoque: " + this.getQuantidade());
		System.out.println("Preço: " + this.valor + "0");

	}

}
