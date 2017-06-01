package org.cc16;

/**
 * Created by jonathan on 5/24/17.
 */

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Container;


public class Tabela {
    private String titulo;
    private ArrayList<ListaEncadeada> linhas;
    private ArrayList<String> cabecalho;

    public Tabela(JFrame frm){
    	JOptionPane.showMessageDialog(frm, "Iniciando criação de tabela");
    	int numerolinhas = Integer.parseInt(JOptionPane.showInputDialog(frm, "Insere número de linhas:"));
    	int numerocolunas = Integer.parseInt(JOptionPane.showInputDialog(frm, "Insere número de colunas:"));
    	JTable table = new JTable(numerolinhas, numerocolunas);	
    	Container contain_table = new Container();
    	contain_table.add(table);
    	frm.add(contain_table);
    	
    	
    }

  
}
