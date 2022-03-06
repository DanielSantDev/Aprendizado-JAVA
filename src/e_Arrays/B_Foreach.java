package e_Arrays;

public class B_Foreach {

    public static void main(String[] args) {

        double[] notas = {4.7, 4.5, 6.9, 8.9};

        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for (double nota: notas //for ( tipo variavel_do_tipo_do_seuArray : seuArray){

        ) {
            System.out.print(nota + " ");
        }

    }

}
