package f_Collections;

import java.util.Objects;

public class D_UsuarioLista {

    String nome;

    D_UsuarioLista(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D_UsuarioLista D_UsuarioLista = (D_UsuarioLista) o;
        return Objects.equals(nome, D_UsuarioLista.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

//    @Override
//    public boolean equals(Object obj) {
//        D_UsuarioLista outroUsuario = (D_UsuarioLista) obj;
//        return this.nome.equals(outroUsuario.nome);
//    }

}
