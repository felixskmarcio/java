import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa id1 = new Pessoa(null, 0);
        Pessoa id2 = new Pessoa(null, 0);

        String nome;
        int idade;
        int mn;

        nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do cliente 1:"));
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do cliente 1:"));

        id1.setPessoaId(nome);
        id1.setIdade(idade);

        nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do cliente 2:"));
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do cliente :"));

        id2.setPessoaId(nome);
        id2.setIdade(idade);

        // Menu
        for (;;) {
            mn = Integer.parseInt(JOptionPane.showInputDialog("Aniversariante:\n" 
                    + "1 - " + id1.getPessoaId() + "\n"
                    + "2 - " + id2.getPessoaId() + "\n"
                    + "3 - Sair"));

            if (mn == 1) {
                id1.fazAniversario();
            } else if (mn == 2) {
                id2.fazAniversario();
            } else if (mn == 3) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção invalida");
            }

            JOptionPane.showMessageDialog(null, id1.imprimir() + id2.imprimir());
        }
    }
}
