package g_Poo.E_Heranca.Exemplo_3;

public class Funcionario extends PessoaFisica {

    //subclasse

    private String cartao;

    public String getCartao() {
        return (cartao);
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public void mostraClasse() {
        System.out.println("CLASSE Funcionario");
    }

}
