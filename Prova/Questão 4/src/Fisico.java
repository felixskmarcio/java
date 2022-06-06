public class Fisico {

	private double consumo;
	private double preco;
	
	public Fisico(double consumo, double preco) {
		this.consumo = consumo;
		this.preco = preco;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double valorMinimo(double getConsumo){
		if (consumo <= 220) {
			return preco * 6.80;
		} else {
			return preco;
		}
	}
}