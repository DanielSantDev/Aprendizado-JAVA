package g_Poo.D_SetAndGet;

import javax.swing.*;

public class Informa_Dados {

    public static void main(String[] args) {

        Dados_Contribuinte a = new Dados_Contribuinte();

//      entrada de dados de forma direta
        /*a.setNome("Daniela Bento");
		a.setCPF("065.887.443-54");
		a.setCNPJ("776 998 /0001");
		a.setCartao("9776-J");*/

        //valores dos atributos são inseridos pelo usuário
        a.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        a.setCPF(JOptionPane.showInputDialog("Digite o CPF: "));
        a.setCNPJ(JOptionPane.showInputDialog("Digite o CNPJ: "));
        a.setCartao(JOptionPane.showInputDialog("Digite o Cartao: "));

        System.out.println("nome do contribuinte " + a.getNome());
        System.out.println("CPF do contribuinte " + a.getCPF());
        System.out.println("CNPJ do contribuinte "+ a.getCNPJ());
        System.out.println("cartao do contribuinte " + a.getCartao());

    }

}
