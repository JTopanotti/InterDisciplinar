package org.cc16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GravarDados implements ActionListener {
	private Tabela tab;
	
	public GravarDados(Tabela tab){
		this.tab = tab;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Integer[][] dados = new Integer[tab.getRowCount()][tab.getColumnCount()];
		for(int i = 0; i < tab.getRowCount(); i++){
			for(int j = 1; j < tab.getColumnCount(); j++){
				dados[i][j] = Integer.parseInt(tab.getValueAt(i, j).toString());
			}
		}
		tab.gravarDados(dados);
	}
	
	
}
