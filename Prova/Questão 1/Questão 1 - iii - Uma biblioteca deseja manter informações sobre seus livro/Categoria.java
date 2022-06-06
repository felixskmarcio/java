public class Categoria {

	private int codigoId;

	private String descricaoLivro;

	public Categoria(int codigoId, String descricaoLivro) {
		this.codigoId = codigoId;
		this.descricaoLivro = descricaoLivro;
	}

	public int getCodigoId() {
		return codigoId;
	}

	public void setCodigoId(int codigoId) {
		this.codigoId = codigoId;
	}

	public String getDescricaoLivro() {
		return descricaoLivro;
	}

	public void setDescricaoLivro(String descricaoLivro) {
		this.descricaoLivro = descricaoLivro;
	}

}
