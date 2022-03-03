package d_ClasseseMetodos.Classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);

        //a1.PI = 10; //no static
        //AreaCirc.PI = 3.1415; //with static

        System.out.println(a1.area());
        //---------------------------------------

        AreaCirc a2 = new AreaCirc(5);

        //a2.PI = 5; //no static
        //AreaCirc.PI = 3.1415; //with static

        System.out.println(a2.area());//no static
        System.out.println(AreaCirc.area(100));//with static
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }

}
