package org.cc16;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] colunas;
    private Object[][] informacao;

    public ModeloTabela(String[] colunas, Object[][] info){
        this.colunas = colunas;
        this.informacao = info;
    }
	
	
	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return informacao.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return informacao[arg0][arg1];
	}

}
