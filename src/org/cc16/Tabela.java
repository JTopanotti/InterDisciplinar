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
    private int[] somatorio_colunas;
    
    public Tabela(int numlinhas, int numcolunas, String[] colunas, Object[][] info, String[] linhas){    	
    	super(new DefaultTableModel(info, colunas));
    	JScrollPane tabela_scroll = new JScrollPane(this);
    	this.titulo_linhas = linhas;
    	
    	for(int i = 0; i < numlinhas; i++){
    		this.setValueAt(linhas[i], i, 0);
    	}
    	
    	//tabela_scroll.setViewportView(this);
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
    	for(int i = 0; i < info.length ; i++){
    		for(int j = 1; j < info[i].length; j++){
    			if( j == 1 )
    				linhas[i] = new ListaEncadeada(info[i][j]);
    			else
    				linhas[i].criarNo(info[i][j]);
    			
    		}
    	}
    	for(int i = 0; i < linhas.length; i++){
    		linhas[i].consultarLista();
    	}
    }

    public int getSomatorioColuna(int indice){
        return this.somatorio_colunas[indice];
    }

    public void somaColunas(){
        this.somatorio_colunas = new int[linhas[0].getQuantidadeNos()];
        for(int i = 0; i < linhas[0].getQuantidadeNos(); i++){
            somatorio_colunas[i] = 0;
            for(int j = 0; j < linhas.length; j++){
                somatorio_colunas[i] += linhas[j].consultaIndice(i).getValor();
            }
        }
    }

    public int getSomatorioGeral(){
        int sum = 0;
        somatorio_colunas = new int[linhas[0].getQuantidadeNos()];
        somaColunas();
        for(int i = 0; i < linhas.length; i++){
            sum += linhas[0].getSomatorio();
        }
        for(int i = 0; i < somatorio_colunas.length; i++){
            sum += somatorio_colunas[i];
        }
        return sum;
    }

    public int[][] calcularValorEsperado(JFrame frm){
        int[][] matriz_esperado = new int[linhas.length][linhas[0].getQuantidadeNos()];
        for(int i = 0; i < linhas.length; i++ ){
            for(int j = 0; j < linhas[i].getQuantidadeNos(); j++){
                matriz_esperado[i][j] = (linhas[i].getSomatorio() * getSomatorioColuna(j)) / getSomatorioGeral() ;
            }
        }
        return matriz_esperado;
    }

  
}
