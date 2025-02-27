public class LojaOnline {
    public static void main(String[] args) {
        // Criar alguns produtos
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);
        Produto produto3 = new Produto("Tênis", 200.0);

        // Criar o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        // Aplicar desconto para cliente novo
        carrinho.definirEstrategiaDesconto(new DescontoClienteNovo());
        System.out.println("Total para Cliente Novo: R$ " + carrinho.calcularTotalComDesconto());

        // Aplicar desconto para cliente regular
        carrinho.definirEstrategiaDesconto(new DescontoClienteRegular());
        System.out.println("Total para Cliente Regular: R$ " + carrinho.calcularTotalComDesconto());

        // Aplicar desconto para cliente VIP
        carrinho.definirEstrategiaDesconto(new DescontoClienteVIP());
        System.out.println("Total para Cliente VIP: R$ " + carrinho.calcularTotalComDesconto());
    }
}
