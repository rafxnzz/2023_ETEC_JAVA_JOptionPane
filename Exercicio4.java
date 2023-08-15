package com.mycompany.jopition09_08;

import javax.swing.JOptionPane;

public class Exercicio4 
{
    public static void main(String[] args) 
    {
        double C1, V1, Q1, C2, V2, Q2, IPI, VLF;
        IPI = 30;
        C1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o código da peça 1"));
        V1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça 1"));
        Q1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade da peça 1"));
        C2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o código da peça 2"));
        V2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça 2"));
        Q2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da peça 2"));
        
        VLF = (V1 * Q1 + V2 * Q2)*(IPI/100 + 1);
        JOptionPane.showMessageDialog(null, "O valor final da sua compra é igual a: " +VLF);
    }
}
