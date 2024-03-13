package ecommerce.model;

public class Celular extends Produto{

	int android;


	public Celular(String fabricante, String modelo, int id, float valor, int quantidade, int android) {
		super(fabricante, modelo, id, valor, quantidade);
		this.android = android;
	}
	
	public Celular() {
		
	}

	public int getAndroid() {
		return android;
	}

	public void setAndroid(int android) {
		this.android = android;
	}
	
	@Override
	public void visualizarProduto() {
		super.visualizarProduto();
		System.out.println("Versão do android: " + this.android);
	}
	
	
}
