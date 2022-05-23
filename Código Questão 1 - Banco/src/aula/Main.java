package aula;

public class Main {
 
    public static void main(String[] args) {
        
        Banco bb = new Banco("Banco do Brasil");
        Banco caixa = new Banco("Caixa Econômica");
        
        ContaCorrente c1 = bb.criarConta();
        ContaCorrente c2 = bb.criarConta();
        
        c1.depositar(1000);
        c1.transferir(c2, 600);
        
        c1.setLimite(500);
        c1.setStatus(true);
        
        /* ContaCorrente c3 = caixa.criarConta(); */
        caixa.listarContas();
        
        
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
