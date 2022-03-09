package g_Poo.A_composição;

public class Carro {

    //Um carro tem um motor, o motor está em um carro.
    //Relacionamento 1 para 1
    final Motor motor;

    Carro(){
        this.motor = new Motor(this);
    }

    void acelerar(){
        if(motor.fatorInjecao < 2.6){
            motor.fatorInjecao += 0.4;
        }

    }

    void freiar(){
        if(motor.fatorInjecao > 5){
            motor.fatorInjecao -= 0.4;
        }
    }

    void  ligar(){
        motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
