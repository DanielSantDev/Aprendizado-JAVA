package g_Poo.C_encapsulamento.Encap01;

public class Acesso_Numeros {

    int a;
    public int publico;
    private int privado;
    protected int protegido;

    public void setNumero(String id, int numero) {
        if(id == "a")
            this.a = numero;

        if(id == "privado")
            this.privado = numero;

        if(id == "protegido")
            this.protegido = numero;
    }

    public void mostra_numero() {
        System.out.println("numero a = " + a);
        System.out.println("numero b = " + publico);
        System.out.println("numero c = " + privado);
        System.out.println("numero d = " + protegido);

    }

}
