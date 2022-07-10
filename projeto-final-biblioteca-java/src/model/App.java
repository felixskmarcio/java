package src.model; // 
import javax.swing.JOptionPane; // Importação da biblioteca JOptionPane

public class App {
    public static void main(String[] args) throws Exception {
        Cliente id1 = new Cliente(null, 0); // cria um objeto do tipo Cliente de id 1
        StringBuilder mensagem = new StringBuilder(); // cria um objeto do tipo StringBuilder
        
        int id; // cria uma variável do tipo inteiro
        String nome; // cria uma variável do tipo String
        String dataNasc; // cria uma variável do tipo String
        String sexo; // cria uma variável do tipo String
        String cpf; // cria uma variável do tipo String
        String endereco; // cria uma variável do tipo String
        String fone; // cria uma variável do tipo String   
        int mn; // menu index   

        JOptionPane.showMessageDialog(null,"\nBem-Vindo \nBiblioteca em Java"); // mostra uma mensagem na tela
//cliente 1
        id = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do cliente 1:\n")); // pede para o usuário digitar o ID do cliente 1
        mensagem.append("Id cadastrado com sucesso").append("!"); // adiciona uma mensagem ao objeto StringBuilder
        
        JOptionPane.showMessageDialog(null, mensagem); // mostra a mensagem na tela   
        id1.setId(id); // atribui o valor do id ao objeto id1
        nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do cliente 1:")); // pede para o usuário digitar o nome do cliente 1
        id1.setNome(nome); // atribui o valor do nome ao objeto id1
        dataNasc = String.valueOf(JOptionPane.showInputDialog("Qual a data de nascimento do cliente 1:")); // pede para o usuário digitar a data de nascimento do cliente 1
        id1.setDataNasc(dataNasc); // atribui o valor da data de nascimento ao objeto id1
        sexo = String.valueOf(JOptionPane.showInputDialog("Qual o sexo do cliente 1:")); // pede para o usuário digitar o sexo do cliente 1
        id1.setSexo(sexo); // atribui o valor do sexo ao objeto id1
        cpf = String.valueOf(JOptionPane.showInputDialog("Qual o CPF do cliente 1:")); // pede para o usuário digitar o CPF do cliente 1
        id1.setCpf(cpf); // atribui o valor do CPF ao objeto id1
        endereco = String.valueOf(JOptionPane.showInputDialog("Qual o endereço do cliente 1:")); // pede para o usuário digitar o endereço do cliente 1
        id1.setEndereco(endereco); // atribui o valor do endereço ao objeto id1
        fone = String.valueOf(JOptionPane.showInputDialog("Qual o telefone do cliente 1:")); // pede para o usuário digitar o telefone do cliente 1
        id1.setFone(fone); // atribui o valor do telefone ao objeto id1
        
        for (;;) { // loop infinito
                mn = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO:\n" // menu de opções
                        + "Id do cliente: " + id1.getId() + "\n"
                        + "Nome do cliente: " + id1.getNome() + "\n"
                        + "Data de nascimento do cliente: " + id1.getDataNasc() + "\n"
                        + "Sexo do cliente: " + id1.getSexo() + "\n"
                        + "CPF do cliente: " + id1.getCpf() + "\n"
                        + "Endereço do cliente: " + id1.getEndereco() + "\n\n"
                        + "Escolha o número que deseja: \n"
                        + "1 - Muda Id\n"
                        + "2 - Alterar Nome\n"
                        + "3 - Alterar Data de Nascimento\n"
                        + "4 - Alterar Sexo\n"
                        + "5 - Alterar CPF\n"
                        + "6 - Alterar Endereço do Cliente\n"
                        + "7 - Alterar Telefone\n"
                        + "8 - Sair \n")); //

            if (mn == 1) { // se o usuário escolher 1
                id = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do cliente 1:\n")); //
                id1.setId(id);
            } else if (mn == 2) { // se o usuário escolher 2
                nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do cliente 1:"));
                id1.setNome(nome);
            } else if (mn == 3) { // se o usuário escolher 3
                dataNasc = String.valueOf(JOptionPane.showInputDialog("Qual a data de nascimento do cliente 1:"));
                id1.setDataNasc(dataNasc);
            } else if (mn == 4) { // se o usuário escolher 4
                sexo = String.valueOf(JOptionPane.showInputDialog("Qual o sexo do cliente 1:"));
                id1.setSexo(sexo);;
            } else if (mn == 5) { // se o usuário escolher 5
                cpf = String.valueOf(JOptionPane.showInputDialog("Qual o CPF do cliente 1:"));
                id1.setCpf(cpf);
            } else if (mn == 6) { // se o usuário escolher 6
                endereco = String.valueOf(JOptionPane.showInputDialog("Qual o endereço do cliente 1:"));
                id1.setEndereco(endereco);
            } else if (mn == 7) { // se o usuário escolher 7
                fone = String.valueOf(JOptionPane.showInputDialog("Qual o telefone do cliente 1:"));
                id1.setFone(fone);
            } else if (mn == 8) { // se o usuário escolher 8
                break; // sai do loop
            } else { 
                JOptionPane.showMessageDialog(null, "Opção Invalida"); // mostra uma mensagem na tela caso o usuário escolha uma opção inválida
            }        
        }   
    }
}
