package g_Poo.E_Heranca.Exemplo_3;

public class PessoaFisica extends Contribuinte {

//  Pessoa_Fisica e Pessoa_Jurdica são subclasses

    private String rg;

    public String getRg() {
        return (rg);
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void mostraClasse() {
        System.out.println("CLASSE PessoaFisica");
    }

}
