package aula;


public class Banco {
    
    private ContaCorrente[] contas;
    private int indexConta;
    
    //Construtor
    public Banco(String nome){
        this.contas = new ContaCorrente[10];
        this.indexConta = 0;
    }
    
    
    //Métodos
    //GETTERS AND SETTERS

    public ContaCorrente[] getContas() {
        return contas;
    }

    public void setContas(ContaCorrente[] contas) {
        this.contas = contas;
    }

    public int getIndexConta() {
        return indexConta;
    }

    public void setIndexConta(int indexConta) {
        this.indexConta = indexConta;
    }
    
    
    
    public ContaCorrente criarConta(){
        
        ContaCorrente c = new ContaCorrente(indexConta + 1);
       
        contas[indexConta] = c;
        indexConta++;
        
        System.out.println("Conta " + c.getNumero() +" criada com sucesso!");
        return c;
        
        
    }
    
    public boolean excluirConta(int numero){
        
        for(int i=0; i<indexConta; i++){
            
            if(contas[i].getNumero() == numero){
                contas[i] = null;
                System.out.println("Conta excluída com sucesso!");
                return true;
            }
        }
        
        System.out.println("Erro ao excluir conta. Número não encontrado!");
        return false;
    }
    
    
    public void listarContas(){
        for(int i=0; i<indexConta ; i++){
            System.out.println(
                    contas[i].getNumero() + " - " +
                    contas[i].getSaldo() + " - "+
                    contas[i].getLimite() + " - "+ 
                    contas[i].isStatus()
                            );
        }
    }
}
