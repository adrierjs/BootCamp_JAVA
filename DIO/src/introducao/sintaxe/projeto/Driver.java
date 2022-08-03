package introducao.sintaxe.projeto;

import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNome((JOptionPane.showInputDialog("Conta\n"
                + "Digite seu nome:")));
        c1.setAgencia((JOptionPane.showInputDialog("Digite a Agência:")));
        c1.setNumero((Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"))));
        c1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:")));
        JOptionPane.showMessageDialog(null, "Olá "+c1.getNome()+", obrigado por criar uma conta em nosso banco, sua agência é "+c1.getAgencia()+", conta "+ c1.getNumero()+", seu saldo "+c1.getSaldo()+" já está disponível para saque");

    }
}
