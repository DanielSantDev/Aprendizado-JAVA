package d_ClasseseMetodos.DesafioModulo;

public class Jantar {

    public static void main(String[] args) {

        Comida Arroz = new Comida("Arroz", 0.300);
        Comida Feijao = new Comida("Feijao", 0.200);
        Comida Carne = new Comida("Carne", 0.500);

        Pessoa pessoa1 = new Pessoa("Daniel", 76.10);
        Pessoa pessoa2 = new Pessoa("Natalia", 65.65);

        System.out.println(pessoa1.apresentar());
        pessoa1.Comer(Arroz);
        pessoa1.Comer(Feijao);
        pessoa1.Comer(Carne);
        System.out.println(pessoa1.apresentar() + "n/");

        System.out.println(pessoa2.apresentar());
        pessoa2.Comer(Arroz);
        pessoa2.Comer(Feijao);
        pessoa2.Comer(Carne);
        System.out.println(pessoa2.apresentar());

    }

}
