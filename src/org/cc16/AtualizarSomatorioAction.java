/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cc16;

/**
 *
 * @author jonathan
 */

/*Acao chamada para atualizar o somatorio*/

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.Action;
import javax.swing.JTable;

public class AtualizarSomatorioAction implements Action {

    @Override
    public Object getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putValue(String key, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int linha = ((TableCellListener)e.getSource()).getRow();
        int coluna = ((TableCellListener)e.getSource()).getColumn() - 1;
        int valorAnt = ((TableCellListener)e.getSource()).getOldValue() == null ? 0 : Integer.parseInt(((TableCellListener)e.getSource()).getOldValue().toString());
        int valorPost = ((TableCellListener)e.getSource()).getNewValue() == null ? 0 : Integer.parseInt(((TableCellListener)e.getSource()).getNewValue().toString());
        
        Tabela tabela = (Tabela)((TableCellListener)e.getSource()).getTable();
        
        tabela.setSomatorioLinha(linha, valorAnt, valorPost);
        tabela.setSomatorioColuna(coluna, valorAnt, valorPost);
        tabela.setSomatorioTotal(valorAnt, valorPost);
        tabela.setValorNo(valorPost, linha, coluna);
        tabela.getLinha(0).consultarLista();
        tabela.getLinha(1).consultarLista();
    }
    
}
