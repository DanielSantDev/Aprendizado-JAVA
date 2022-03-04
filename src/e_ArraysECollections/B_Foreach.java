package e_ArraysECollections;

public class B_Foreach {

    public static void main(String[] args) {

        double[] notas = {4.7, 4.5, 6.9, 8.9};

        for(int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for (double nota: notas
             ) {
            System.out.print(nota + " ");
        }

    }

}
