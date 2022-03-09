package g_Poo.A_composição;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        //1 compra tem varios itens, varios itens tem uma compra

        compra1.adicionarItem("caneta", 20, 2.5);
        compra1.adicionarItem(new Item("Bolacha", 8, 3.5));
        compra1.adicionarItem(new Item("Caderno", 20, 50.5));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getaValorTotal());

        //Só para mostrar a relação bidirecional
        double total = compra1.itens.get(0).compra
                .itens.get(1).compra.getaValorTotal();
        System.out.println("O total é " + total);
    }

}
