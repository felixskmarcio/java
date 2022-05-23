package aula;

public class ContaCorrente {
    
    //Atributos
    private int numero;
    private double saldo, limite;
    private boolean status;
    private Movimentacao movimentacoes[];
    private int indexMovimentacao;
    
    //Construtor
    public ContaCorrente(int numero){
        this.numero = numero;
        this.saldo = 0;
        this.limite = 0;
        this.status = false;
        this.movimentacoes = new Movimentacao[10];
        this.indexMovimentacao = 0;
    }
    
    
    //Métodos
    
    //GETTERS AND SETTERS

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Movimentacao[] getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(Movimentacao[] movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public int getIndexMovimentacao() {
        return indexMovimentacao;
    }

    public void setIndexMovimentacao(int indexMovimentacao) {
        this.indexMovimentacao = indexMovimentacao;
    }
    
    
    
    public boolean sacar(double valor){
        
        if(valor > (saldo+limite) ){
            System.out.println("Não há saldo e/ou limite suficiente!");
            return false;
        }else{
            Movimentacao m = new Movimentacao("Saque", valor, 'D');
            
            movimentacoes[indexMovimentacao] = m;
            indexMovimentacao++;
            
            saldo -= valor;
            
            System.out.println("Saque realizado com sucesso!");
            
            return true;
        }
         
    }
    
    public boolean depositar(double valor){
        
     Movimentacao m = new Movimentacao("Deposito",valor,'C');
            
     movimentacoes[indexMovimentacao] = m;
     indexMovimentacao++;
            
     saldo += valor;
            
     System.out.println("Depósito realizado com sucesso!");
     return true;
   }
    
    public void emitirSaldo(){
    
        System.out.println("SALDO DA CONTA " + numero +":");
        System.out.println("R$: " + saldo);
        System.out.println("VALOR COM LIMITE: R$ " + (saldo + limite));
        
    }
    
    public void emitirExtrato(){
        
        System.out.println("EXTRATO DA CONTA " + numero + ": ");
        for(int i=0; i<indexMovimentacao;i++){
           System.out.println(
                   movimentacoes[i].getDescricao() + " - " + 
                   movimentacoes[i].getInformacao() + " - " + 
                   movimentacoes[i].getValor());    
        }
        
        System.out.println("SALDO R$: " + saldo);
        System.out.println("SALDO COM LIMITE: R$ " + (saldo + limite));
        
        
    }
    
    public boolean transferir(ContaCorrente c, double valor){
      
        if(numero == c.numero){
            System.out.println("Não é possível transferir entre a mesma conta!");
           return false; 
        }
        
        
        if(valor > (saldo+limite) ){
            System.out.println("Não há saldo e/ou limite suficiente!");
            return false;
        }else{
            
            //Movimentação para a conta de débito
            Movimentacao m = new Movimentacao("Transferência", valor,'D');
            
            movimentacoes[indexMovimentacao] = m;
            indexMovimentacao++;
            
            saldo -= valor;
            
            //Movimentação para conta de crédito
            Movimentacao m2 = new Movimentacao("Transferência", valor,'C');
            
            c.saldo += valor;
            
            c.movimentacoes[c.indexMovimentacao] = m2;
            c.indexMovimentacao++;
            
            
            
            System.out.println("Transferência realizada com sucesso!");
            
            return true;
        }
        
        
        
    }
    
    
    
}
