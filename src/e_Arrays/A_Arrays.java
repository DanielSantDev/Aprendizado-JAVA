package e_Arrays;

import java.util.Arrays;

public class A_Arrays {

    public static void main(String[] args) {

        double[] notasAlunosA = new double[4];
        System.out.println(Arrays.toString(notasAlunosA));

        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 45;
        notasAlunosA[3] = 7.9;

        /*Formas de percorrer o array*/
        System.out.println(Arrays.toString(notasAlunosA));

        double total = 0;
        for(int i=0; i <= 3; i++){
            System.out.println(notasAlunosA[i]);
            total += notasAlunosA[i];
        }
        System.out.println("\n");
        for(int i=0; i < notasAlunosA.length; i++){
            System.out.println(notasAlunosA[i]);
            total += notasAlunosA[i];
        }

        System.out.println("\n" + total / notasAlunosA.length);


        final double notaArmazenada = 0;
        double[] notasAlunosB = {6.9, 8.9, notaArmazenada, 10};

    }

}
