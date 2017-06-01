package org.cc16;

import javax.swing.JFrame;

public class MenuPrincipal {

    public static void main(String args[]) {
        JFrame frm = new JFrame("Projeto InterDisciplinar");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        frm.setSize(500, 1000);
        frm.setVisible(true);
        Tabela tab = new Tabela(frm);
        
      

    }
}