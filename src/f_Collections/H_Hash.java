package f_Collections;

import java.util.HashSet;

public class H_Hash {

    public static void main(String[] args) {

        HashSet<D_UsuarioLista> usuarios = new HashSet<>();

        usuarios.add(new D_UsuarioLista("Daniel"));
        usuarios.add(new D_UsuarioLista("Samuel"));
        usuarios.add(new D_UsuarioLista("Gabirel"));
        usuarios.add(new D_UsuarioLista("Janiel"));

        boolean resultado = usuarios.contains(new D_UsuarioLista("Daniel"));
        System.out.println(usuarios.contains(new D_UsuarioLista("Daniel")));

    }

}
