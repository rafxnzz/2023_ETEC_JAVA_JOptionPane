package com.mycompany.jopition09_08;

import javax.swing.JOptionPane;

public class Exercicio5 
{
    public static void main(String[] args) 
    {
        double  SM1, SL, RF;
        SM1=1000;
        
        SL = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário mensal"));
        
        RF = SL / SM1;
        JOptionPane.showMessageDialog(null, "Seu salário equivale a: " +RF+ " salário(s) minimos(s)");
    }
}
