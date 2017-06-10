package org.cc16;

//http://commons.apache.org/proper/commons-math/javadocs/api-3.3/org/apache/commons/math3/stat/inference/ChiSquareTest.html

import java.awt.BorderLayout;

import javax.swing.*;

public class MenuPrincipal {
	
	private static Tabela criarTabela(JFrame frm){
    	
    	JOptionPane.showMessageDialog(frm, "Iniciando criação de tabela");
    	int numlinhas = Integer.parseInt(JOptionPane.showInputDialog(frm, "Insere número de linhas:")) + 1;
    	int numcolunas = Integer.parseInt(JOptionPane.showInputDialog(frm, "Insere número de colunas:")) + 2;
    	
    	String[] linhas = new String[numlinhas];
    	String[] colunas = new String[numcolunas];
    	Object[][] info = new Object[numlinhas][numcolunas];
    	
    	for(int i = 1; i < numcolunas - 1; i++){
    		colunas[i] = JOptionPane.showInputDialog(frm, "Digite o nome da coluna " + (i) + ':');
    	}
    	for(int i = 0; i < numlinhas - 1; i++){
    		linhas[i] = JOptionPane.showInputDialog(frm, "Digite o nome da linha " + (i+1) + ":");
    	}
	    colunas[0] = "";
    	linhas[numlinhas - 1] = "∑";
	    colunas[numcolunas - 1] = "∑";
        Tabela tab = new Tabela(numlinhas,
        		                numcolunas,
        		                colunas,
        		                info,
        		                linhas);
        return tab;
	}

    public static void main(String args[]) {
       /* JFrame frm = new JFrame("Projeto InterDisciplinar");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        frm.setVisible(true);
        Tabela tab = criarTabela(frm);
        frm.add(tab.getScrollPane(), BorderLayout.WEST);        
        frm.pack();
        
        JButton gravar = new JButton("Gravar");
        GravarDados gravar_action = new GravarDados(tab);
        gravar.addActionListener(gravar_action);
        frm.add(gravar, BorderLayout.SOUTH);
        frm.pack();/*
        */      	
        
       FInicial telaPrincipal = new FInicial();
       telaPrincipal.show();
        
      

    }
}
