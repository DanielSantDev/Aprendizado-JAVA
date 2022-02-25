package d_ClasseseMetodos.Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 30;
        d1.mes = 11;
        d1.ano = 1998;

        System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);

    }

}