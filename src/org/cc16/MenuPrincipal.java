package org.cc16;

import java.awt.BorderLayout;

import javax.swing.*;

public class MenuPrincipal {
	
	private static Tabela criarTabela(JFrame frm){
    	
    	JOptionPane.showMessageDialog(frm, "Iniciando criação de tabela");
    	int numlinhas = Integer.parseInt(JOptionPane.showInputDialog(frm, "Insere número de linhas:"));
    	int numcolunas = Integer.parseInt(JOptionPane.showInputDialog(frm, "Insere número de colunas:"));
    	
    	String[] colunas = new String[numcolunas + 1];
	    colunas[0] = "i";
    	Object[][] info = new Object[numlinhas][numcolunas + 1];
    	
    	for(int i = 1; i <= numcolunas; i++){
    		colunas[i] = JOptionPane.showInputDialog(frm, "Digite o nome da coluna " + (i) + ':');
    	}
        Tabela tab = new Tabela(numlinhas,
        		                numcolunas,
        		                colunas,
        		                info);
        return tab;
	}

    public static void main(String args[]) {
        JFrame frm = new JFrame("Projeto InterDisciplinar");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frm.setVisible(true);
        Tabela tab = criarTabela(frm);
        frm.add(tab.getScrollPane(), BorderLayout.CENTER);        
        frm.pack();
        
        System.out.println(frm.getComponents()[0].);
        
        for(int i = 0; i < frm.getComponentCount(); i++){
        	System.out.println(frm.getComponents()[i]);
        }
        
        JButton gravar = new JButton("Gravar");
        GravarDados gravar_action = new GravarDados(frm);
        gravar.addActionListener(gravar_action);
        frm.add(gravar, BorderLayout.SOUTH);
        frm.pack();
        

        
      

    }
}