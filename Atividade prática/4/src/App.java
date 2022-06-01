

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Casa c1 = new Casa(null, null, null, null, null, false);

        Casa p1 = new Casa(null, null, null, null, null, false);
        Casa p2 = new Casa(null, null, null, null, null, false);
        Casa p3 = new Casa(null, null, null, null, null, false);

        String casa;
        String cor;        
        int estado;
        String porta1;
        String porta2;
        String porta3;
        int port;        
        int qtdPortasAbertas;

        casa = String.valueOf(JOptionPane.showInputDialog("PROPRIETÁRIO"));
        c1.setCasa(casa);


        cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor da casa:"));
        c1.setCor(cor);

        estado = Integer.parseInt(JOptionPane.showInputDialog("Qual o estado da porta:\n"
                + "Porta 1\n"
                + "Porta 2\n"
                + "Porta 3\n"));        

        porta1 = String.valueOf(JOptionPane.showInputDialog("Qual o estado da porta 1:\n"));
        p1.setPorta1(porta1);
        porta2 = String.valueOf(JOptionPane.showInputDialog("Qual o estado da porta 2:\n"));
        p2.setPorta2(porta2);
        porta3 = String.valueOf(JOptionPane.showInputDialog("Qual o estado da porta 3:\n"));
        p3.setPorta3(porta3);
        qtdPortasAbertas = Integer.parseInt(JOptionPane.showInputDialog("Quantas portas estão abertas?"));
             
        if (estado == 1) {
            p1.setEstado(true);
        } else {
            p1.setEstado(false);
        }
        if (estado == 2) {
            p2.setEstado(true);
        } else {
            p2.setEstado(false);
        }
        if (estado == 3) {
            p3.setEstado(true);
        } else {
            p3.setEstado(false);
        }

        for (;;) {
            port = Integer.parseInt(JOptionPane.showInputDialog("CASA \n"
                    + "Dono da casa: " + c1.getCasa() + "\n"
                    + "Cor da casa: " + c1.getCor() + "\n"
                    + "\n"
                    + "SITUAÇÃO DAS PORTAS \n" 
                    + "Porta 1: " + p1.getPorta1() + "\n"
                    + "Porta 2: " + p2.getPorta2() + "\n"
                    + "Porta 3: " + p3.getPorta3() + "\n"
                    + "Total de portas abertas: " + qtdPortasAbertas + "\n"
                    + "\n"
                    + "Escolha o número que deseja: \n"
                    + "1 - Alterar Proprietário\n"
                    + "2 - Alterar cor\n"
                    + "3 - Alterar Porta 1\n"
                    + "4 - Alterar Porta 2\n"
                    + "5 - Alterar Porta 3\n"
                    + "6 - Sair \n"));

        if (port == 1){        
            casa = String.valueOf(JOptionPane.showInputDialog("PROPRIETÁRIO"));
            c1.setCasa(casa);                
        } else if (port == 2){
            cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor da casa"));
            c1.setCor(cor);
        } else if (port == 3){
            porta1 = String.valueOf(JOptionPane.showInputDialog("Qual o estado da porta 1:\n"));
            p1.setPorta1(porta1);
        } else if (port == 4){
            porta2 = String.valueOf(JOptionPane.showInputDialog("Qual o estado da porta 2:\n"));
            p2.setPorta2(porta2);
        } else if (port == 5){
            porta3 = String.valueOf(JOptionPane.showInputDialog("Qual o estado da porta 3:\n"));
            p3.setPorta3(porta3);
        } else if (port == 6) {
            break;
        } else {
            JOptionPane.showMessageDialog(null, "Opção Invalida");
        }       
                    
        }
    }

}
