package com.mycompany.jopition09_08;

import javax.swing.JOptionPane;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        int A, A1, M, M1, D, DR;
        A=0;
        A1=365;
        M=0;
        M1=30;
        D=0;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você"));
        M = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses você"));
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos dias você"));
        
        DR = (A1 * A) + (M1 * M) + D ;
        JOptionPane.showMessageDialog(null, "O resultado é: " + DR + " dias vividos");
    }
}
