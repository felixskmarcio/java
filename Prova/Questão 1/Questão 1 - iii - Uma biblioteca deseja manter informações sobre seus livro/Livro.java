import java.sql.Date;

public class Livro  {

	private int isbn;

	private String titulo;

	private Date anoEditora;

	private String autoresDesteLivro;

	public Livro(int isbn, String titulo, Date anoEditora, String autoresDesteLivro) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.anoEditora = anoEditora;
		this.autoresDesteLivro = autoresDesteLivro;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getAnoEditora() {
		return anoEditora;
	}

	public void setAnoEditora(Date anoEditora) {
		this.anoEditora = anoEditora;
	}

	public String getAutoresDesteLivro() {
		return autoresDesteLivro;
	}

	public void setAutoresDesteLivro(String autoresDesteLivro) {
		this.autoresDesteLivro = autoresDesteLivro;
	}

	

}
