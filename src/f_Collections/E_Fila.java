package f_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class E_Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer - Addd ---> adiciona elementos na fila
        // Diferença do comportamento ocorre quando a fila está cheia !
        fila.add("Daniel"); //retorna falso
        fila.offer("Melry"); //lança uma exceção
        fila.offer("Ana");
        fila.add("Chris");
        fila.offer("Jailma");

        //peek e element ---> obtem o proximo elemento da fila sem remoção
        // Diferença do comportamento ocorre quando a fila está vazia !
        System.out.println(fila.peek()); //retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lança uma exceção
        System.out.println(fila.element());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();

        //poll e remove ---> obtem o proximo elemento da fila e remove
        // Diferença do comportamento ocorre quando a fila está vazia !
        System.out.println(fila.poll()); //retorna null
        System.out.println(fila.remove());//lança uma exceção
        System.out.println();

    }

}
