import java.sql.Date;

public class Mae {

	private String nome;

	private String endereco;

	private int telefone;

	private Date datadeNascimento;

	private int identidade;

	public Mae(String nome, String endereco, int telefone, Date datadeNascimento, int identidade) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.datadeNascimento = datadeNascimento;
		this.identidade = identidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Date getDatadeNascimento() {
		return datadeNascimento;
	}

	public void setDatadeNascimento(Date datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

}
