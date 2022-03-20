package g_Poo.B_heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 20;

        Heroi j2 = new Heroi();
        j2.x = 10;
        j2.y = 11;

        Monstro m1 = new Monstro();
        m1.x = 10;
        m1.y = 11;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.OESTE);
        j1.andar(Direcao.SUL);

        System.out.println(j1.y);

        j1.atacar(j2);
        j1.atacar(j2);
        j1.atacar(j2);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

    }

}
