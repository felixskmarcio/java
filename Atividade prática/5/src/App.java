import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario f = new Funcionario(null, null);
        
        String funcionario;
        int indentification;
        int login;
                            

        funcionario = String.valueOf(JOptionPane.showInputDialog("Digite o nome do funcionário: "));
        f.setNomeFuncioanrio(funcionario);

        indentification = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário: "));
        f.setId(indentification);

        for (;;) {
            login = Integer.parseInt(JOptionPane.showInputDialog("USUÁRIO: \n"
                    + "Nome do funcionário: " + f.getNomeFuncioanrio(f) + "\n"
                    + "ID: " + f.getId() + "\n"
                    
                    + "\n"
                    + "Escolha o número que deseja: \n"
                    + "1 - Novo funcionário\n"
                    + "2 - Alterar funcionário \n"
                    + "3 - Alterar ID \n"
                    + "4 - Sair \n"));
        
        if (login == 1) {
            f = new Funcionario(JOptionPane.showInputDialog("Digite o nome do funcionario"),
            JOptionPane.showInputDialog("Digite o id do funcionario"));        
        } else if (login == 2) {
            indentification = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário: "));
            f.setId(indentification);
        } else if (login == 3) {
            indentification = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do funcionário: "));
            f.setId(indentification);
        } else if (login == 4) {
            System.exit(0);
        }
        }
    }
}


