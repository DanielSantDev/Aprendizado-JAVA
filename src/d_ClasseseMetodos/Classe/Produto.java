package d_ClasseseMetodos.Classe;

public class Produto {

    String nome;
    double preco;
    static double DESCONTO = 0.25;

    Produto(){}

    double precoComDesconto(){
        return preco * (1 - DESCONTO);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - DESCONTO + descontoDoGerente);
    }

}