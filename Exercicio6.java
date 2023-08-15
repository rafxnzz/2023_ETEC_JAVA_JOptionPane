package com.mycompany.jopition09_08;

import javax.swing.JOptionPane;

public class Exercicio6 
{
    public static void main(String[] args) 
    {
      int NI, NA, NS;
      NI = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para descobrir o seu antecessor e seu sucessor"));
      
      NA = NI - 1;
      NS = NI + 1;
      JOptionPane.showMessageDialog(null, "Número antecessor: "+NA+" | Número sucessor: "+NS);
    }
}
