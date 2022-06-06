import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import Contato.Contato;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Contato> contatos = new HashSet<Contato>();
        Contato user = new Contato(null, null, 0, null, false, false, false);
        Contato user1 = new Contato(null, null, 0, null, false, false, false);
        Contato user2 = new Contato(null, null, 0, null, false, false, false);
        Contato user3 = new Contato(null, null, 0, null, false, false, false);

        contatos.add(user);
        contatos.add(user1);
        contatos.add(user2);
        contatos.add(user3);

        String nome;
        String email;
        int telefone;
        String endereco;
        int datadeAniversario;
        int menu;
        String excluir;

        nome = String.valueOf(JOptionPane.showInputDialog("Digite seu nome: "));
        user.setNome(nome);// ADICIONando O O NOME AO USUARIO
        email = String.valueOf(JOptionPane.showInputDialog("Digite seu email: "));
        user.setEmail(email);
        telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone"));
        user.setTelefone(telefone);
        endereco = String.valueOf(JOptionPane.showInputDialog("Digite seu endereco: "));
        user.setEndereco(endereco);
        datadeAniversario = Integer.parseInt(JOptionPane.showInputDialog("Digite sua data de aniversario: "));
        user.setDatadeAniversario(datadeAniversario);

        for (;;) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("AGENDA\n"
                    + "Nome: " + user.getNome() + "\n"
                    + "Email: " + user.getEmail() + "\n"
                    + "Endereco: " + user.getEndereco() + "\n"
                    + "Telefone: " + user.getTelefone() + "\n"
                    + "Data de Aniversario: " + Contato.getDatadeAniversario() + "\n"
                    + "\n"
                    + "1 - Novo contatos\n"
                    + "2 - Excluir\n"
                    + "3 - Listar contatos\n"
                    + "4 - Consultar contatos por nome\n"
                    + "5 - Sair \n"));

            if (menu == 1) { // FALTA IMPLANTAR
                nome = String.valueOf(JOptionPane.showInputDialog("Digite novo contato: "));
            } else if (menu == 2) {
                excluir = JOptionPane.showInputDialog("Deseja excluir o contato? 1-Sim 2-Não");
                for (Contato contato : contatos) {
                    if (excluir.equals("1")) {
                        contatos.remove(contato);
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não excluído");
                    } /* JOptionPane.showMessageDialog(null, "Opção Invalida"); */
                }
            } else if (menu == 3) {// FALTA IMPLANTAR
                for (Contato contato : contatos) {
                    System.out.println(contato);
                }
                for (Contato contato : contatos) {
                    System.out.println(contato);
                }
            } else if (menu == 4) { // FALTA IMPLANTAR
                String.valueOf(JOptionPane.showInputDialog("Consultar contatos por nome"));
            } else if (menu == 5) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção Invalida");

            }
        }
    }
}
