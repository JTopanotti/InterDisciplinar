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
        int coluna = ((TableCellListener)e.getSource()).getColumn();
        int valorAnt = (int) ((TableCellListener)e.getSource()).getOldValue();
        int valorPost = (int) ((TableCellListener)e.getSource()).getNewValue();
        
        ((Tabela)e.getSource()).setSomatorioLinha(linha, valorAnt, valorPost);
        ((Tabela)e.getSource()).setSomatorioColuna(coluna, valorAnt, valorPost);
        ((Tabela)e.getSource()).setSomatorioTotal(valorAnt, valorPost);
        
        
        
    }
    
}
