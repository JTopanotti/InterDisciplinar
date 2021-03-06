/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cc16;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class FInicial extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public FInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGerarTabela = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroLinhas = new javax.swing.JFormattedTextField();
        txtNumeroColunas = new javax.swing.JFormattedTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Interdisciplinar");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Número de linhas:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Número de colunas:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Projeto Interdisciplinar - Teste do Qui-Quadrado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Teste de Independência ou Associação");

        btnGerarTabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGerarTabela.setText("Gerar Tabela");
        btnGerarTabela.setActionCommand("&Gerar Tabela");
        btnGerarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarTabelaActionPerformed(evt);
            }
        });
        btnGerarTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnGerarTabelaKeyTyped(evt);
            }
        });

        jLabel5.setText("*Informe o número de linhas e colunas para gerar a tabela");

        txtNumeroLinhas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumeroLinhas.setText("0");
        txtNumeroLinhas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumeroLinhas.setSelectionEnd(0);
        txtNumeroLinhas.setSelectionStart(255);
        txtNumeroLinhas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroLinhasFocusGained(evt);
            }
        });
        txtNumeroLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroLinhasActionPerformed(evt);
            }
        });
        txtNumeroLinhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroLinhasKeyTyped(evt);
            }
        });

        txtNumeroColunas.setText("0");
        txtNumeroColunas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumeroColunas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNumeroColunasFocusGained(evt);
            }
        });
        txtNumeroColunas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroColunasKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addGap(78, 78, 78)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroColunas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumeroLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumeroColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarTabelaActionPerformed
        gerarTabela();
    }//GEN-LAST:event_btnGerarTabelaActionPerformed

    private void txtNumeroLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroLinhasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLinhasActionPerformed

    private void txtNumeroLinhasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroLinhasFocusGained
        txtNumeroLinhas.selectAll();
    }//GEN-LAST:event_txtNumeroLinhasFocusGained

    private void txtNumeroColunasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroColunasFocusGained
        txtNumeroColunas.selectAll();
    }//GEN-LAST:event_txtNumeroColunasFocusGained

    private void txtNumeroLinhasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroLinhasKeyTyped
        if ((Util.validaCampoNumerico(evt))||(evt.getKeyChar() == KeyEvent.VK_ENTER)){
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                txtNumeroColunas.requestFocus();
                return;
            }
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroLinhasKeyTyped

    private void txtNumeroColunasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroColunasKeyTyped
        if ((Util.validaCampoNumerico(evt))||(evt.getKeyChar() == KeyEvent.VK_ENTER)){
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                btnGerarTabela.requestFocus();
                return;
            }
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroColunasKeyTyped

    private void btnGerarTabelaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGerarTabelaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            gerarTabela();
        }
    }//GEN-LAST:event_btnGerarTabelaKeyTyped
    
    private void gerarTabela(){
        int numeroLinhas = 0;
        int numeroColunas = 0;
        
        numeroLinhas  = Integer.parseInt(txtNumeroLinhas.getText());
        numeroColunas = Integer.parseInt(txtNumeroColunas.getText());
        
        if (numeroLinhas < 1) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade de linhas");
            txtNumeroLinhas.requestFocus();
            return;
        }
        
        if (numeroColunas < 1) {
            JOptionPane.showMessageDialog(null, "Informe a quantidade de colunas");
            txtNumeroColunas.requestFocus();
            return;
        }
        
        FInformaLinhaColuna informa = new FInformaLinhaColuna();
        informa.informaLinhasColunas(numeroLinhas, numeroColunas);
        informa.show();
        
        this.hide();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarTabela;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JFormattedTextField txtNumeroColunas;
    private javax.swing.JFormattedTextField txtNumeroLinhas;
    // End of variables declaration//GEN-END:variables
}
