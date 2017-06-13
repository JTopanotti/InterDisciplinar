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
		Integer[][] dados = new Integer[tab.getRowCount() - 1][tab.getColumnCount() - 1];
		System.out.println(dados.length);
		System.out.println(dados[0].length);
		for(int i = 0; i < tab.getRowCount() - 1; i++){
			for(int j = 1; j < tab.getColumnCount() - 1; j++){
				dados[i][j - 1] = Integer.parseInt(tab.getValueAt(i, j).toString());
			}
		}
		tab.gravarDados(dados);
	}
	
	
}
