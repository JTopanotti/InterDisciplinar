package org.cc16;

import java.awt.BorderLayout;

/**
 * Created by jonathan on 5/24/17.
 */

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel; 


public class Tabela extends JTable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titulo = "Tabela1";
    private ArrayList<ListaEncadeada> linhas;
    private ArrayList<String> cabecalho;
    private JScrollPane tabela_scroll;
    
    public Tabela(int numlinhas, int numcolunas, String[] colunas, Object[][] info){    	
    	super(new DefaultTableModel(info, colunas));
    	JScrollPane tabela_scroll = new JScrollPane();
    	tabela_scroll.setViewportView(this);
    	this.tabela_scroll = tabela_scroll; 
    	
    }
    public JScrollPane getScrollPane(){
    	return this.tabela_scroll;
    }
    
    public ListaEncadeada getLista(int indice){
    	return linhas.get(indice);
    }
    
    public String getTitulo(){
    	return this.titulo;
    }
    
    public void gravarDados(int[][] info){
    	
    }

  
}
