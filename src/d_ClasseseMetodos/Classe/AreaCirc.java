package d_ClasseseMetodos.Classe;

import java.awt.geom.Area;

public class AreaCirc {

    double raio;

    //não precisa se criar uma instancia para acessar esse atributo
    static final double PI = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return PI * Math.pow(raio,2);
    }

    //não precisa se criar uma instancia para acessar esse método
    static double area(double raio){
        return PI * Math.pow(raio,2);
    }

}
