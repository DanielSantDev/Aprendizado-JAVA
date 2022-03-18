package g_Poo.E_Heranca.Exemplo_3;

public class PessoaJuridica  extends Contribuinte{

    //  Pessoa_Fisica e Pessoa_Jurdica são

    public String cnpj;

    public String getCnpj() {
        return (cnpj);
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void mostraClasse() {
        System.out.println("CLASSE PessoaJuridica");
    }

}
