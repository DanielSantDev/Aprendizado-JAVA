package g_Poo.Z_Desafios.A_Composicao;

public class Sistema {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Daniel");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 2, 10);
        compra1.adicionarItem("Notbook", 4000, 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Folha de Sufite", 0.45, 300);
        compra2.adicionarItem("Impressora", 450, 1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());

    }

}
