package org.cc16;


/**
 * Created by jonathan on 5/24/17.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
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
        super(new DefaultTableModel(nomeColunas, numLinhas));
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
    	JScrollPane tabela_scroll = new JScrollPane(this);
    	this.titulo_linhas = nomeLinhas;
    	for(int i = 0; i < numLinhas; i++){
    		this.setValueAt(nomeLinhas[i], i, 0);
    	}
        iniciaDados();
        editarSomatorio = new AtualizaDadosAction();
        this.celulaListener = new TableCellListener(this, editarSomatorio);
        this.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }
    
    
    
    public BigDecimal calcularEsperado(int linha, int coluna){
        float valor = ( somatorio_linhas.consultaIndice(linha).getValor()
                         *  somatorio_colunas.consultaIndice(coluna).getValor()) / (float) somatorio_total;
        BigDecimal bd = new BigDecimal(((Float)valor).toString());
        bd = bd.setScale(2, BigDecimal.ROUND_CEILING);
        System.out.println(valor);
        System.out.println(bd.toString());
        return bd;  
    }
    
  
    public ListaEncadeada getLinha(int indice){
    	return dados[indice];
    }
    
    public void setValorNo(int valor, int linha, int coluna){
        dados[linha].consultaIndice(coluna).setValor(valor);
    }
    
    public long[][] getDados(){
        long[][] m_dados = new long[dados.length][dados[0].getQuantidadeNos()];
        for (int i = 0; i < dados.length; i++) {
            for(int j = 0; j < dados[i].getQuantidadeNos(); j++){
                m_dados[i][j] = dados[i].consultaIndice(j).getValor();
            }
        }
        return m_dados;
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
        long valor_no = somatorio_colunas.consultaIndice(indice).getValor();
        valor_no = (valor_no - valorAnt) + valorPost;
        somatorio_colunas.consultaIndice(indice).setValor(valor_no);
    }

    public void setSomatorioLinha(int indice, int valorAnt, int valorPost){
        long valor_no = somatorio_linhas.consultaIndice(indice).getValor();
        valor_no = (valor_no - valorAnt) + valorPost;
        somatorio_linhas.consultaIndice(indice).setValor(valor_no);
    }
    
    public void setSomatorioTotal(int valorAnt, int valorPost){
        somatorio_total = (somatorio_total - valorAnt) + valorPost;
    }
    

  
}
