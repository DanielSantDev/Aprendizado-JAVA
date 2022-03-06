package f_Collections;

import java.util.ArrayList;

public class C_Lista {

    public static void main(String[] args) {

        ArrayList<D_UsuarioLista> lista = new ArrayList<>();

        D_UsuarioLista u1 = new D_UsuarioLista("Daniel");
        lista.add(u1);
        lista.add(new D_UsuarioLista("Samuel"));
        lista.add(new D_UsuarioLista("Grabiel"));
        lista.add(new D_UsuarioLista("Iel"));
        lista.add(new D_UsuarioLista("Babel"));

        System.out.println(lista.get(3).nome + " 3 indice"); //acessar pelo indice

        lista.remove(1);
        System.out.println(lista.remove(new D_UsuarioLista("Manu")));

        System.out.println(">>>>>" + lista.remove(1));
        System.out.println(lista.remove(new D_UsuarioLista("Manu")));

        System.out.println("Tem? " + lista.contains(new D_UsuarioLista("Iel")));
        System.out.println("Tem? " + lista.contains(u1)); //funciona sem equals e hashcode

        for (D_UsuarioLista u: lista){
            System.out.println(u.nome);
        }

    }

}
