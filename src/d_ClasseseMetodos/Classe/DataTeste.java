package d_ClasseseMetodos.Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 30;
        d1.mes = 11;
        d1.ano = 1998;


        System.out.println(d1.obterData());

    }

}