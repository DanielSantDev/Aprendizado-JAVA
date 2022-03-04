package d_ClasseseMetodos.Metodo;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
    }

    String obterDataFormatada(){
        //variavel local
        String formato = "%d/%d/%d";
        return String.format(formato, this.dia,mes,ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

}

