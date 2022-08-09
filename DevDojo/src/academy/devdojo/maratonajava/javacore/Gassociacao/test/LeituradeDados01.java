package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class LeituradeDados01 {
    public static void main(String[] args) {
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite o seu nome: ");
//        String nome = entrada.nextLine();
//        System.out.println("Digite a sua idade: ");
//        int idade = entrada.nextInt();
//        System.out.println("Você se chama: "+nome + "\nIdade: " + idade);
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        JOptionPane.showMessageDialog(null,"Olá, "+ nome); //só para mostrar a mensagem





    }
}
