
import Contato.Contato;
import TipodeCliente.Categoria;

public class Main {

        

        public static void main(String[] args) {
                System.out.println("AGENDA");

                Contato nomePj = new Contato(null, null, 0, null, null, false);
                nomePj.nome = "Marcio";
                nomePj.email = "marcio@gmail.com";
                nomePj.telefone = 3551000;
                nomePj.endereco = "Rua João Ramalho";
                Contato.datadeAniversario = "05/05/1986";
                nomePj.guardar = true;
                nomePj.excluir = true;
                nomePj.sair = true;
                System.out.println("Nome: " + nomePj.nome);
                System.out.println("Email: " + nomePj.email);
                System.out.println("Telefone: " + nomePj.telefone);
                System.out.println("Data de Aniversario: " + Contato.datadeAniversario);
                System.out.println("Guardar: " + nomePj.guardar);
                System.out.println("Excluir: " + nomePj.excluir);
                System.out.println("Sair: " + nomePj.sair);

                System.out.println("CATEGORIA");
                Categoria.mostrarcliente();
                Categoria.mostrargeral();
                Categoria.mostrarfornecedor();
                Categoria.mostrarIndice(null, 4);
                Categoria.mostarUltimaCompra = "05/05/1986";

        }

}
