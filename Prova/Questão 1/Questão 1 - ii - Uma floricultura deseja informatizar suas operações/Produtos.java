public class Produtos {

	private int codigoProduto;

	private String nomeProduto;

	private String tipoProdutobute8;

	private int valorProduto;

	private int QuantidadenEstoque;

	public Produtos(int codigoProduto, String nomeProduto, String tipoProdutobute8, int valorProduto,
			int quantidadenEstoque) {
		this.codigoProduto = codigoProduto;
		this.nomeProduto = nomeProduto;
		this.tipoProdutobute8 = tipoProdutobute8;
		this.valorProduto = valorProduto;
		QuantidadenEstoque = quantidadenEstoque;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipoProdutobute8() {
		return tipoProdutobute8;
	}

	public void setTipoProdutobute8(String tipoProdutobute8) {
		this.tipoProdutobute8 = tipoProdutobute8;
	}

	public int getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(int valorProduto) {
		this.valorProduto = valorProduto;
	}

	public int getQuantidadenEstoque() {
		return QuantidadenEstoque;
	}

	public void setQuantidadenEstoque(int quantidadenEstoque) {
		QuantidadenEstoque = quantidadenEstoque;
	}

}
