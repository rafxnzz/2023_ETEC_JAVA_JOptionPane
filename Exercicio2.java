package com.mycompany.jopition09_08;

import javax.swing.JOptionPane;

public class Exercicio2 
{
    public static void main(String[] args) 
    {
        double A, B, C, MD1, D, E, F, MD2, MDF;
        A=8;
        B=9;
        C=7;
        D=4;
        E=5;
        F=6;
        
        MD1 = (A+B+C)/3;
        MD2 = (D+E+F)/3;
        MDF = (MD1 + MD2)/2;
        
        JOptionPane.showMessageDialog(null, "O resultado do 1º: " +MD1);
        JOptionPane.showMessageDialog(null, "O resultado do 2º: " +MD2);
        JOptionPane.showMessageDialog(null, "O resultado final: " +MDF);
        
    }
}
