package e_ArraysECollections;

import java.util.Date;

public class E_Equals {

    public static void main(String[] args) {

        F_Usuario u1 = new F_Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        F_Usuario u2 = new F_Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));
    }

}
