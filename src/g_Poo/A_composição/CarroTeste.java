package g_Poo.A_composição;

public class CarroTeste {

    public static void main(String[] args) {

        Carro c = new Carro();
        System.out.println(c.estaLigado());

        c.ligar();
        System.out.println(c.estaLigado());

        System.out.println(c.motor.giros());

        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();

        System.out.println(c.motor.giros());

        c.freiar();
        c.freiar();
        c.freiar();

//        c.motor.fatorInjecao = -30;
        
        System.out.println(c.motor.giros());

        //relação bidirecional
        System.out.println(c.motor.carro.motor.carro.motor.giros());


    }

}
