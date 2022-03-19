package g_Poo.F_Polimorfismo.Exemplo_1;

public class Casa extends Construcao{

    Construcao casa = new Construcao();

    public Casa() {
        casa.setTipo("CASA");
    }

    public void constroi() {
        System.out.println("FAZ-SE " + casa.getTipo());
    }

}
