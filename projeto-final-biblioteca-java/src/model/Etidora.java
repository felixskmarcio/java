package src.model;

public class Etidora extends Livro{

    // variáveis de instância
    private int id_etidora;
    private String nome_fantasia;
    private String razao_social;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String email;
    private String site;
    private String responsavel;
    
    public Etidora(int id_etidora, String nome_fantasia, String razao_social, String cnpj, String endereco,
            String cidade, String estado, String cep, String telefone, String email, String site, String responsavel) {
        this.id_etidora = id_etidora;
        this.nome_fantasia = nome_fantasia;
        this.razao_social = razao_social;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
        this.responsavel = responsavel;
    }

    public int getId_etidora() {
        return id_etidora;
    }

    public void setId_etidora(int id_etidora) {
        this.id_etidora = id_etidora;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }    

    
}
