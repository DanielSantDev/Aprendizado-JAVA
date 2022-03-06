package f_Collections;

import java.util.HashMap;
import java.util.Map;

public class G_Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios =  new HashMap<>();

        usuarios.put(1, "Daniel");
        usuarios.put(2, "Gabriel");
        usuarios.put(3, "Samuel");
        usuarios.put(4, "Janiel");
        usuarios.put(5, "Cabiel");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet()); //chaves
        System.out.println(usuarios.values()); //valores
        System.out.println(usuarios.entrySet()); //ambos
        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Daniel"));
        System.out.println(usuarios.get(2));
        System.out.println(usuarios.remove(1));

        //percorrer chaves
        for (int chave: usuarios.keySet()
             ) {
            System.out.println(chave);
        }

        for (String valor: usuarios.values()
             ) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()
             ) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }

}
