package org.cc16;

import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{

	private String[] colunas;
    private Object[][] informacao;

    public ModeloTabela(String[] colunas, Object[][] info){
        this.colunas = colunas;
        this.informacao = info;
    }
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
