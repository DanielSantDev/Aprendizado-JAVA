package g_Poo.E_Heranca.Exemplo_1;

public class SuperClasse {

    private String atributo_1;

    SuperClasse(){
        System.out.println("Acesso ao metodo construtor da SuperClasse");
    }

    public void set_atributo_1(String atributo_1) {
        this.atributo_1 = atributo_1;
    }

    public String get_atributo_1() {
        return atributo_1;
    }

}
