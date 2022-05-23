import Categoria.Categoria;
import Cliente.Cliente;
import Endereco.Endereco;
import Produto.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SOFTWARE COMERCIAL");
        // Produto
        Produto id = new Produto(0, null, null, 0, 0, 0);
        id.numeroCodigo(10);
        Produto nP = new Produto(0, null, null, 0, 0, 0);
        nP.novoProduto("Água Sanitária");

        // Categoria
        Categoria c = new Categoria(0, null, null, 0, 0, 0, null, null, null, null);
        System.out.println("CATEGORIA");
        c.detergente(null);
        c.sabao(null);
        c.sabonete(null);
        c.etc(null);

        // Cliente
        System.out.println("ID: 10");
        Cliente nC = new Cliente(0, null, null, 0, 0, 0, null, null, 0, 0, null, 0);
        nC.nCliente("Marcio Felix");
        nC.ntelefone(3551 - 4080);
        System.out.println("ENDEREÇO");

        Endereco nE = new Endereco(0, null, null, 0, 0, 0, null, null, 0, 0, null, 0, null, null, null, null, 0, null);
        nE.nrua("Rua João Ramalho");
        nE.nnumero(598);
        nE.nsala("A");
        nE.ncidade("Penedo");
        nE.nuf("Penedo");

        System.out.println("FILIAÇÃO");
        nC.nfiliacao(1);

        System.out.println("STATUS");
        nC.nstatus("BOM");

        System.out.println("LIMITE");
        nC.nlimiteCredito(50.000);

    }
}
