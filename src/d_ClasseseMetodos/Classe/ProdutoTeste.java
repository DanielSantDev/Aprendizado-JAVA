package d_ClasseseMetodos.Classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        /*Criando um objeto do Tipo Produto
         * p1 é o nome do objeto
         * 'new' aloca o espaço na memória para criação do objeto
         * Produto(); é o construtor do meu objeto*/
        Produto p1 = new Produto();
        p1.nome = "laptop";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "mochila";
        p2.preco = 422.20;
        p2.desconto = 10.00;

        System.out.println("Nome do produto 1: " + p1.nome);
        System.out.println("Preço do produto 1: " + p1.preco);
        System.out.println("Desconto de " + p1.desconto + "%");
        double precoFinal1 = p1.preco - ((p1.preco / 100) * p1.desconto);
        System.out.println("Preço Final com desconto R$" + precoFinal1);
        System.out.println("\n");
        System.out.println("Nome do produto 2: " + p2.nome);
        System.out.println("Preço do produto 2: " + p2.preco);
        System.out.println("Desconto de " + p2.desconto + "%");
        double precoFinal2 = p2.preco - ((p2.preco / 100) * p2.desconto);
        System.out.println("Preço Final com desconto R$" + precoFinal2);

    }

}