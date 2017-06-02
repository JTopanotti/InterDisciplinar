package org.cc16;


/**
 * Created by jonathan on 5/24/17.
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Tabela extends JTable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titulo = "Tabela1";
    private ListaEncadeada[] linhas;
    private JScrollPane tabela_scroll;
    private String[] titulo_linhas;
    
    public Tabela(int numlinhas, int numcolunas, String[] colunas, Object[][] info, String[] linhas){    	
    	super(new DefaultTableModel(info, colunas));
    	JScrollPane tabela_scroll = new JScrollPane();
    	this.titulo_linhas = linhas;
    	
    	for(int i = 0; i < numlinhas; i++){
    		this.setValueAt(linhas[i], i, 0);
    	}
    	
    	tabela_scroll.setViewportView(this);
    	this.tabela_scroll = tabela_scroll; 
    	
    }
    public JScrollPane getScrollPane(){
    	return this.tabela_scroll;
    }
    
    public ListaEncadeada getLista(int indice){
    	return linhas[indice];
    }
    
    public String getTitulo(){
    	return this.titulo;
    }
    
    public void gravarDados(Integer[][] info){
    	this.linhas = new ListaEncadeada[info.length];
    	for(int i = 0; i < info.length; i++){
    		for(int j = 1; j < info[i].length; j++){
    			if( j == 1 )
    				linhas[i] = new ListaEncadeada(info[i][j]);
    			else
    				linhas[i].criarNo(info[i][j]);
    			
    		}
    	}
    }

  
}
