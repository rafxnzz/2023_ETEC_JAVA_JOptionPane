package com.mycompany.jopition09_08;

import javax.swing.JOptionPane;

public class Exercicio3 
{
    public static void main(String[] args) 
    {
        double S, SCR;
        S = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da sua conta"));
        
        SCR = (S * 0.01) + S;
        JOptionPane.showMessageDialog(null, "O saldo da conta após o reajuste de 1% é: " +SCR);
    }
}
