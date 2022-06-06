public class Cliente {

	private int rg;

	private String nome;

	private int telefone;

	private String endereço;

	public Cliente(int rg, String nome, int telefone, String endereço) {
		this.rg = rg;
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
