package g_Poo.E_Heranca.Exemplo_2;

public class Faculdade_CEETEPs extends Centro_Paula_Souza {

    private String faculdade;

    public Faculdade_CEETEPs() {
        super("Santos");
        /*o metodo super() acessa o metodo da classe
         * com hierarquia imediatamente superior na relacao de heranca*/
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }


    public String getFaculdade() {
        return faculdade;
    }

}
