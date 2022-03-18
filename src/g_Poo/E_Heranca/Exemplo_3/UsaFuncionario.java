package g_Poo.E_Heranca.Exemplo_3;

import javax.swing.*;

public class UsaFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        PessoaJuridica func = new PessoaJuridica();

        String u, v, t, z;
        int x;

        z = JOptionPane.showInputDialog("Digite 1 se o contribuinte é pessoa" +
                " fisica\nDigite 2 se o contribuinte é pessoa juridica");

        x = Integer.parseInt( z );
        if (z.length() == 1){
            switch (x) {
                case 1:
                    u = JOptionPane.showInputDialog("Escreva o nome do contribuinte: ");
                    v = JOptionPane.showInputDialog("Escreva o RG do contribuinte: ");
                    t = JOptionPane.showInputDialog("Escreva a identificacao do catao do contribuinte: ");
                funcionario.setNome(u);
                funcionario.setRg(v);
                funcionario.setCartao(t);
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("RG: " + funcionario.getRg());
                    System.out.println("Cartao: " + funcionario.getCartao());
                    break;
                case 2:
                    u = JOptionPane.showInputDialog("Escreva o nome do contribuinte: ");
                    v = JOptionPane.showInputDialog("Escreva o CNPJ do contribuinte: ");
                    t = JOptionPane.showInputDialog("Escreva a identificacao do catao do contribuinte: ");
                funcionario.setNome(u);
                func.setCnpj(v);
                funcionario.setCartao(t);
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("RG: " + func.getCnpj());
                    System.out.println("Cartao: " + funcionario.getCartao());
                    break;
            }
        }

        /*funcionario.setNome("Daniel");
        funcionario.setRg("456456465");
        funcionario.setCartao("MGHA456");

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());*/

    }

}
