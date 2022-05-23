package TipodeCliente;

public class Categoria {

    public static String geral;
    public static String cliente;
    /* public static String mostarUltimaCompra = "14/05/2022"; */
    public static String fornecedor;
    public static int indice = 0;
    public static String mostarUltimaCompra;

    public static String getGeral() {
        return geral;
    }

    public static void setGeral(String geral) {
        Categoria.geral = geral;
    }

    public static String getCliente() {
        return cliente;
    }

    public static void setCliente(String cliente) {
        Categoria.cliente = cliente;
    }

    public static String getMostarUltimaCompra() {
        return mostarUltimaCompra;
    }

    public static void setMostarUltimaCompra(String mostarUltimaCompra) {
        Categoria.mostarUltimaCompra = mostarUltimaCompra;
    }

    public static String getFornecedor() {
        return fornecedor;
    }

    public static void setFornecedor(String fornecedor) {
        Categoria.fornecedor = fornecedor;
    }

    public static int getIndice() {
        return indice;
    }

    public static void setIndice(int indice) {
        Categoria.indice = indice;
    }

    // Parameters
    public static void mostrargeral() {
        System.out.println("Categoria: " + geral);
    }

    public static void mostrarcliente() {
        System.out.println("Categoria: " + cliente);
    }

    public static void mostrarfornecedor() {
        System.out.println("Categoria: " + fornecedor);
    }

    public static void mostrarIndice(String indice, int mostrarIndice) {
        if (mostrarIndice >= 5) {
            System.out.println(indice + "Esta no índice");
        } else if (mostrarIndice == 4)
            ;
        System.out.println(indice + "Não esta no índice");
    }

    public static void mostarUltimaCompra(String mostarUltimaCompra) {
        System.out.println("Data da ultima compra: " + mostarUltimaCompra);
    }

}
