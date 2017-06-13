package org.cc16;


/**
 * Created by jonathan on 5/24/17.
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;




public class Tabela extends JTable   {
    
    private static final long serialVersionUID = 1L;
    private int numLinhas;
    private int numColunas;
    private ListaEncadeada[] dados;
    private ListaEncadeada somatorio_colunas;
    private ListaEncadeada somatorio_linhas;
    private int somatorio_total;
    private String[] titulo_linhas;
    private TableCellListener celulaListener;
    private Action editarSomatorio;
    
    public Tabela(int numLinhas, int numColunas, String[] nomeLinhas, String[] nomeColunas){    	
    	//super(new ModeloTabela(nomeColunas, new Object[numlinhas][numcolunas]));
        super(new DefaultTableModel(nomeColunas, numLinhas));
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
    	JScrollPane tabela_scroll = new JScrollPane(this);
    	this.titulo_linhas = nomeLinhas;
    	for(int i = 0; i < numLinhas; i++){
    		this.setValueAt(nomeLinhas[i], i, 0);
    	}
        iniciaDados();
        editarSomatorio = new AtualizarSomatorioAction();
        this.celulaListener = new TableCellListener(this, editarSomatorio);
    }
    
    public double calcularEsperado(int linha, int coluna){
        return (somatorio_linhas.consultaIndice(linha).getValor()
                 + somatorio_colunas.consultaIndice(coluna).getValor()) / somatorio_total;
    }
  
    public ListaEncadeada getLinha(int indice){
    	return dados[indice];
    }
    
    public void setValorNo(int valor, int linha, int coluna){
        dados[linha].consultaIndice(coluna).setValor(valor);
    }
    
    private void iniciaDados(){
        dados = new ListaEncadeada[numLinhas];
        for(int i = 0; i < numLinhas; i++){
            if(somatorio_linhas == null)
                somatorio_linhas = new ListaEncadeada(0);
            else
                somatorio_linhas.criarNo(0);
            for(int j = 0; j < numColunas; j++){
                if(dados[i] == null)
                    dados[i] = new ListaEncadeada(0);
                else
                    dados[i].criarNo(0);
            }
        }
        for(int i = 0; i < numColunas; i++){
            if(somatorio_colunas == null)
                somatorio_colunas = new ListaEncadeada(0);
            else
                somatorio_colunas.criarNo(0);
        }
        somatorio_total = 0;
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
