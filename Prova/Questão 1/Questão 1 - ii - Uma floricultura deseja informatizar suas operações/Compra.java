import java.sql.Date;

public class Compra {

	private int idCompra;

	private int rg;

	private int idProduto;

	private Date dataCompra;

	private int valorCompra;

	private int quantidade;

	public Compra(int idCompra, int rg, int idProduto, Date dataCompra, int valorCompra, int quantidade) {
		this.idCompra = idCompra;
		this.rg = rg;
		this.idProduto = idProduto;
		this.dataCompra = dataCompra;
		this.valorCompra = valorCompra;
		this.quantidade = quantidade;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
