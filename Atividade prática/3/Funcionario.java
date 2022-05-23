package empresa;

public class Funcionario {
    
    private int id;
    private int cpf;
    private String nome;
    private String cargo;
    private float salario;
    
    public Funcionario(int cpf, String nome, String cargo, float salario){
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        gerarID();
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
     return "CPF: " + this.cpf + " - NOME: " + this.nome 
             + " - CARGO: "+ this.cargo + " - SALARIO: " 
             + this.salario;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof Funcionario){
            Funcionario f = (Funcionario) obj;
            
            if(this.cpf == f.getCpf() && this.nome.equals(f.getNome())){
                return true;
            }else{
                return false;
            }
        
        }
         
        return false;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    private static int controle = 1; 
    private void gerarID(){
        this.id = controle;
        controle++;
    }
    
    public static void fazerAlgo(){
        //this.nome = "asidhaishdaishd";
        System.out.println("aodhahdaushdu");
    }
        
    
    
}
