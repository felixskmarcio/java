import java.sql.Date;

public class Bebe {

	private String nome;

	private Date datadoDascimento;

	private int pesodoPascimento;

	private int altura;

	private Mae maedoBebe;

	private String medico;

	public Bebe(String nome, Date datadoDascimento, int pesodoPascimento, int altura, Mae maedoBebe, String medico) {
		this.nome = nome;
		this.datadoDascimento = datadoDascimento;
		this.pesodoPascimento = pesodoPascimento;
		this.altura = altura;
		this.maedoBebe = maedoBebe;
		this.medico = medico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatadoDascimento() {
		return datadoDascimento;
	}

	public void setDatadoDascimento(Date datadoDascimento) {
		this.datadoDascimento = datadoDascimento;
	}

	public int getPesodoPascimento() {
		return pesodoPascimento;
	}

	public void setPesodoPascimento(int pesodoPascimento) {
		this.pesodoPascimento = pesodoPascimento;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public Mae getMaedoBebe() {
		return maedoBebe;
	}

	public void setMaedoBebe(Mae maedoBebe) {
		this.maedoBebe = maedoBebe;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	

}
