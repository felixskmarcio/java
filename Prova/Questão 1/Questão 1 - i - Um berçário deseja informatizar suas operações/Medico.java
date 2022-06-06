public class Medico {

	private int crm;

	private String nome;

	private int telefoneCelular;

	private String especialidade;

	private String endereço;

	public Medico(int crm, String nome, int telefoneCelular, String especialidade, String endereço) {
		this.crm = crm;
		this.nome = nome;
		this.telefoneCelular = telefoneCelular;
		this.especialidade = especialidade;
		this.endereço = endereço;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(int telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

}
