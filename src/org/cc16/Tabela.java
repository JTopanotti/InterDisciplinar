package org.cc16;


/**
 * Created by jonathan on 5/24/17.
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class Tabela extends JTable   {
    
    private static final long serialVersionUID = 1L;
    private ListaEncadeada[] dados;
    private ListaEncadeada somatorio_colunas;
    private ListaEncadeada somatorio_linhas;
    private int somatorio_total;
    private String[] titulo_linhas;
    private TableCellListener celulaListener;
    private Action editarSomatorio;
    
    public Tabela(int numlinhas, int numcolunas, String[] nomeLinhas, String[] nomeColunas){    	
    	//super(new ModeloTabela(nomeColunas, new Object[numlinhas][numcolunas]));
        super(new DefaultTableModel(nomeColunas, numlinhas));
    	JScrollPane tabela_scroll = new JScrollPane(this);
    	this.titulo_linhas = nomeLinhas;
    	for(int i = 0; i < numlinhas; i++){
    		this.setValueAt(nomeLinhas[i], i, 0);
    	}
        
        editarSomatorio = new AtualizarSomatorioAction();
        this.celulaListener = new TableCellListener(this, editarSomatorio);
    }
    
    
  
    public ListaEncadeada getLinha(int indice){
    	return dados[indice];
    }
    
    public void gravarDados(Integer[][] info){
    	this.dados = new ListaEncadeada[info.length];
    	for(int i = 0; i < info.length ; i++){
    		for(int j = 1; j < info[i].length; j++){
    			if( j == 1 )
    				dados[i] = new ListaEncadeada(info[i][j]);
    			else
    				dados[i].criarNo(info[i][j]);
    			
    		}
    	}
    	for(int i = 0; i < dados.length; i++){
    		dados[i].consultarLista();
    	}
    }

    public ListaEncadeada getSomatorioColunas(){
        return this.somatorio_colunas;
    }

    public ListaEncadeada getSomatorioLinhas(){
        return this.somatorio_linhas;
    }
    
    public int getSomatorioTotal(){
        return this.somatorio_total;
    }
    
    public void setSomatorioColuna(int indice, int valorAnt, int valorPost){
        int valor_no = somatorio_colunas.consultaIndice(indice).getValor();
        valor_no = (valor_no - valorAnt) + valorPost;
        somatorio_colunas.consultaIndice(indice).setValor(valor_no);
    }

    public void setSomatorioLinha(int indice, int valorAnt, int valorPost){
        int valor_no = somatorio_linhas.consultaIndice(indice).getValor();
        valor_no = (valor_no - valorAnt) + valorPost;
        somatorio_linhas.consultaIndice(indice).setValor(valor_no);
    }
    
    public void setSomatorioTotal(int valorAnt, int valorPost){
        somatorio_total = (somatorio_total - valorAnt) + valorPost;
    }
    

  
}
