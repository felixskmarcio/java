public class Pessoa {
    // Atributos
    private String pessoaId;
    private int dateIdaded;

    // Construtores
    public Pessoa(String pessoaId, int dateIdaded) {
        this.pessoaId = pessoaId;
        this.dateIdaded = dateIdaded;
    }

    public String getPessoaId() {
        return pessoaId;
    }

    public void setPessoaId(String pessoaId) {
        this.pessoaId = pessoaId;
    }

    public int getDateIdaded() {
        return dateIdaded;
    }

    public void setDateIdaded(int dateIdaded) {
        this.dateIdaded = dateIdaded;
    }

    // Métodos
    public void fazAniversario() {
        this.setDateIdaded(this.getDateIdaded() + 1);
    }

    public String imprimir() {
        return this.getPessoaId() + "-" + this.getDateIdaded() + " anos\n";
    }

    public void setIdade(int dateIdaded2) {
    }
}
