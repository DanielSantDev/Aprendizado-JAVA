package f_Collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class B_ConjuntoComportadoSet {

    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>();
        //TreeSet<String> listaAprovados = new TreeSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Apenas string serah aceita");
        listaAprovados.add("Ana");
        listaAprovados.add("Daniel");
        listaAprovados.add("Samuel");
        listaAprovados.add("Pedro");

        for (String candidato: listaAprovados
             ) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(32);

        for (int n : nums
        ) {
            System.out.println(n);
        }

    }

}
