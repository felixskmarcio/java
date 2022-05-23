package empresa;


public class Main {
    
    public static void main(String[] args) {
        
        String[] a = new String[3];
        
        
        
        Empresa empresa = new Empresa("12.151.154/0001-01");
        
        Funcionario funcionario = new Funcionario(123,"João", "Programador",
        5000);
        
        Funcionario funcionario2 = new Funcionario(123,"João", "Programador",
        5000);
        
        Funcionario f3 = new Funcionario(1,"Maria", "Gerente",10000);
        
        Funcionario.fazerAlgo();
        
        System.out.println(funcionario.getId());
        System.out.println(funcionario2.getId());
        System.out.println(f3.getId());
        
        
       
        
        
        
        
        //empresa.adicionarFuncionario(funcionario);
        //empresa.imprimirDadosFuncionarios();
        
        //empresa.atualizarFuncionario(123, "Gerente", 10000);
        
        
        //empresa.imprimirDadosFuncionarios();
        
    }
}
