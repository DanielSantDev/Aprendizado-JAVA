package d_ClasseseMetodos.Classe;

public class Data {

    int dia;
    int mes;
    int ano;

    /*VALORES PADRÃO*/
    //byte, short, int, long -> 0
    //float, double -> 0.0
    //boolean -> false
    //char -> '\u0000'
    //objetos -> null
    String s = null;

    Data(){
        /*dia = 1;
        mes = 1;
        ano = 1970;*/
        this(1, 1, 1997);
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

