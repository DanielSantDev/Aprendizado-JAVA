package g_Poo.C_encapsulamento.Encap02;

import g_Poo.C_encapsulamento.Encap01.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {

    public static void main(String[] args) {

        Acesso_Numeros chave = new Acesso_Numeros();

        /*chave.a = 10; ENCAPSULAMENTO PUBLIC NÃO EXPLICITO
         * NÃO PERMITE ACESSO FORA DO PACOTE */
        chave.setNumero("a", 10);
        chave.publico = 20;
        //chave.c = 30; NÃO É POSSÍVEL ACESSAR VAIÁVEL PRIVATE DIRETAMENTE
        chave.setNumero("privado", 30);
        /*chave.d = 40; NÃO É POSSÍVEL ACESSAR VARIÁVEL PROTECTED DIRETAMENTE
         * FORA DO PACOTE*/
        chave.setNumero("protegido", 40);
        chave.mostra_numero();

    }

}
