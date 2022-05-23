package src;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Porta por = new Porta(false, null, 0, 0, 0);

        int estado;
        String cor;
        double dimensaoX;
        double dimensaoY;
        double dimensaoZ;
        int port;

        estado = Integer.parseInt(JOptionPane.showInputDialog("Qual o estado da porta:\n"
        + "1 - Aberta\n"
        + "2 - Fechada"));

        if (estado == 1) {
            por.setEstado(true);
        } else {
            por.setEstado(false);
        }

        cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor da porta"));
        por.setCor(cor);

        dimensaoX = Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão de X"));
        por.setDimensaoX(dimensaoX);
        dimensaoY = Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão de Y"));
        por.setDimensaoY(dimensaoY);
        dimensaoZ = Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão de Z"));
        por.setIntdimensaoZ(dimensaoZ);

        for (;;){
            port = Integer.parseInt(JOptionPane.showInputDialog("Situação da porta:\n"
            + "Estado: " + por.retonarEstado()+"\n"
            + "Cor: " +por.getCor()+"\n"
            + "Dimensao: " +por.getDimensaoX()+"\n"
            + "Dimensao: " +por.getDimensaoY()+"\n"
            + "Dimensao: " +por.getIntdimensaoZ()+"\n"
            + "Escolha o número que deseja: \n"
            + "1 - Abrir / Fechar\n"
            + "2 - Alterar cor\n"
            + "3 - Alterar Dimensão X\n"
            + "4 - Alterar Dimensão Y\n"
            + "5 - Alterar Dimensão Z\n"
            + "6 - Sair \n"));

        if (port==1){
            por.mudaEstado();
        } else if(port==2){
            cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor da porta"));
            por.setCor(cor);
        } else if(port==3){
            dimensaoX = Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão de X"));
            por.setDimensaoX(dimensaoX);
        } else if(port==4){
            dimensaoY = Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão de Y"));
            por.setDimensaoY(dimensaoY);
        } else if(port==5){
            dimensaoZ = Double.parseDouble(JOptionPane.showInputDialog("Qual a dimensão de Z"));
        } else if(port==6){
            break;
        } else {
            JOptionPane.showMessageDialog(null,"Opção Invalida");
        }
    }
}
    
}
