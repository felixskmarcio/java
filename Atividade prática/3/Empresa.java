package empresa;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Funcionario> empregados;
    private String cnpj;
    
    public Empresa(String cnpj){
        this.cnpj = cnpj;
        empregados = new ArrayList();
    }
    
    
    void adicionarFuncionario(Funcionario f){
        empregados.add(f);
    }
    
    void removerFuncionario(int cpf){
        
        //for(Funcionario f : empregados){
        //    if(f.getCpf() == cpf){
        //        empregados.remove(f);
        //    }
       // }
        
        for(int i=0; i<empregados.size();i++){
            Funcionario f = empregados.get(i);
         
            if(f.getCpf() == cpf){
                empregados.remove(f);
            }
        }
        
    }
    
    
    Funcionario buscarFuncionarioPeloNome(String nome){
        for(Funcionario f : empregados){
            if(f.getNome().equals(nome) ){
                return f;
            }
       }
        return null;
    }
    
    void imprimirDadosFuncionarios(){
        
       for(Funcionario f : empregados){
           System.out.println("CPF: " + f.getCpf());
           System.out.println("Nome: " + f.getNome());
           System.out.println("Cargo: " + f.getCargo());
           System.out.println("Salario: " + f.getSalario());
           System.out.println("------");
       }
    }
    void atualizarFuncionario(int cpf, String novoCargo, float novoSalario){
        
        for(int i=0; i<empregados.size();i++){
            Funcionario f = empregados.get(i);
         
            if(f.getCpf() == cpf){
                f.setCargo(novoCargo);
                f.setSalario(novoSalario);
            }
        }
        
        
    }

    @Override
    public String toString() {
        return "CNPJ: " + this.cnpj;
    }
    
    
}
