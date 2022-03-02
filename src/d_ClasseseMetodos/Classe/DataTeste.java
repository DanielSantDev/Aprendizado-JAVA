package d_ClasseseMetodos.Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data(31, 12, 2020);

        Data d2 = new Data(31, 12, 2020);
        d2.ano = 2021;

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());

    }

}