package Contato;

public class Contato {
    public String nome;
    public String email;
    public int telefone;
    public String endereco;
    public static String datadeAniversario;
    public boolean guardar = true;
    public boolean excluir = true;
    public boolean sair;

    // Atributos
    
    public Contato(String nome, String email, int telefone, String endereco, boolean guardar, boolean excluir,
            boolean sair) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.guardar = guardar;
        this.excluir = excluir;
        this.sair = sair;
    }

    public Contato(Object object, Object object2, int i, Object object3, Object object4, boolean b) {
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public static String getDatadeAniversario() {
        return datadeAniversario;
    }
    public static void setDatadeAniversario(String datadeAniversario) {
        Contato.datadeAniversario = datadeAniversario;
    }
    public boolean isGuardar() {
        return guardar;
    }
    public void setGuardar(boolean guardar) {
        this.guardar = guardar;
    }
    public boolean isExcluir() {
        return excluir;
    }
    public void setExcluir(boolean excluir) {
        this.excluir = excluir;
    }
    public boolean isSair() {
        return sair;
    }
    public void setSair(boolean sair) {
        this.sair = sair;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    // Métodos




}