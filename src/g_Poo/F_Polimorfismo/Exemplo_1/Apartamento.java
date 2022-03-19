package g_Poo.F_Polimorfismo.Exemplo_1;

public class Apartamento extends Construcao{

    Construcao apartamento = new Construcao();

    Apartamento(){
        apartamento.setTipo("APARTAMENTO");
    }

    public void constroi() {
        System.out.println("FAZ-SE " + apartamento.getTipo());
    }

}
