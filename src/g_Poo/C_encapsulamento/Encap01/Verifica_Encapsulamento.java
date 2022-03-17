package g_Poo.C_encapsulamento.Encap01;

public class Verifica_Encapsulamento {

    public static void main(String[] args) {

        Acesso_Numeros chave = new Acesso_Numeros();

        chave.a = 10;
        chave.publico = 20;
        //chave.privado = 30; //Não é possível acessar a variável private diretamente
        //Variàveis encapsuladas com private, só podem ser manipuladas ou acessadas
        //através de métodos.
        chave.setNumero("privado", 30);
        chave.protegido = 40;
        chave.mostra_numero();

    }

}
