package academy.devdojo.maratonajava.introducao;

import javax.swing.*;

/* Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
 */
public class Aula03TiposPrimitosExercicio {
    public static void main(String[] args) {
        String nome, endereco, data;
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:"));
        endereco = JOptionPane.showInputDialog("Digite o seu endereço");
        data = JOptionPane.showInputDialog("Digite a data:");
        System.out.println("Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+" , na data "+data+".");





    }


}
