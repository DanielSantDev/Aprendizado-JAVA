package d_ClasseseMetodos.Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        /*Criando um objeto do Tipo Produto
         * p1 é o nome do objeto
         * 'new' aloca o espaço na memória para criação do objeto
         * Produto(); é o construtor do meu objeto*/
        Produto p1 = new Produto();
        p1.nome = "laptop";
        p1.preco = 4000.00;

        //p1.desconto = 0.25;
        Produto.DESCONTO = 0.50;

        Produto p2 = new Produto();
        p2.nome = "caneta";
        p2.preco = 12.56;
        //p2.desconto = 0.29;

        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p1.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2 ) / 2;
        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);

    }

}