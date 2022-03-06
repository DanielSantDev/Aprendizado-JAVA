package e_Arrays;

public class F_Usuario {

    String nome;
    String email;

    public boolean equals(Object obj) {
        if(obj instanceof F_Usuario){
            F_Usuario outro = (F_Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else{
            return false;
        }

    }

    @Override
    public int hashCode() {
        return 0;
    }

}
