package src.model;
public class Cliente extends Emprestimo{ // classe Cliente extends Emprestimo
    
    // variáveis de instância
    private int id; 
    private String nome; 
    private String dataNasc;
    private String sexo;
    private String cpf;
    private String endereco;
    private String fone;
    private String alterar;

    // construtor
    public Cliente(String nome, String dataNasc, String sexo, String cpf, String endereco, String fone, String alterar) { 
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
        this.alterar = alterar;

    // chamando o método 
    }
    
     public Cliente(Object object, int i) {
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int imprimir() {
        return 0;
    }  

    public String getAlterar() {
        return alterar;
    }

    public void setAlterar(String alterar) {
        this.alterar = alterar;
    }
       
}
