package org.cc16;

import com.sun.glass.events.KeyEvent;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class FInformaLinhaColuna extends javax.swing.JFrame {

    private int numeroLinhas;
    private int numeroColunas;
    private String[] nomeLinhas;
    private String[] nomeColunas;
    
    public FInformaLinhaColuna() {
        initComponents();
        tbLinhas.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbLinhas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbColunas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnGerarTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Interdisciplinar");
        setResizable(false);

        tbLinhas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linha", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLinhas.setRowSelectionAllowed(false);
        tbLinhas.getTableHeader().setReorderingAllowed(false);
        tbLinhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbLinhasKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbLinhas);
        if (tbLinhas.getColumnModel().getColumnCount() > 0) {
            tbLinhas.getColumnModel().getColumn(0).setMinWidth(50);
            tbLinhas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbLinhas.getColumnModel().getColumn(0).setMaxWidth(50);
            tbLinhas.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Linhas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Projeto Interdisciplinar - Teste do Qui-Quadrado");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Teste de Independência ou Associação");

        tbColunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coluna", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbColunas.setRowSelectionAllowed(false);
        tbColunas.getTableHeader().setReorderingAllowed(false);
        tbColunas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbColunasKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tbColunas);
        if (tbColunas.getColumnModel().getColumnCount() > 0) {
            tbColunas.getColumnModel().getColumn(0).setMinWidth(50);
            tbColunas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbColunas.getColumnModel().getColumn(0).setMaxWidth(50);
            tbColunas.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setLabelFor(tbColunas);
        jLabel2.setText("Colunas");

        btnGerarTabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGerarTabela.setText("Gerar Tabela");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 184, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGerarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(btnGerarTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarTabelaActionPerformed
       gerarTabela();
    }//GEN-LAST:event_btnGerarTabelaActionPerformed

    private void tbLinhasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbLinhasKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            proximaLinha(tbLinhas);
        } 
    }//GEN-LAST:event_tbLinhasKeyTyped

    private void tbColunasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbColunasKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            proximaLinha(tbColunas);
        }
    }//GEN-LAST:event_tbColunasKeyTyped

    private void btnGerarTabelaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnGerarTabelaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            gerarTabela();
        }
    }//GEN-LAST:event_btnGerarTabelaKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInformaLinhaColuna().setVisible(true);
            }
        });
    }
    
    public void informaLinhasColunas(int linhas, int colunas){
        this.numeroLinhas = linhas;
        this.numeroColunas = colunas;
        
        this.nomeLinhas =  new String[this.numeroLinhas];
        this.nomeColunas =  new String[this.numeroColunas];
        
        for (int i=0; i < numeroLinhas; i++) {
            inserirLinha(tbLinhas, i);
            tbLinhas.setRowSelectionInterval(0, 0);
            tbLinhas.requestFocus();
        }
        for (int i=0; i < numeroColunas; i++) {
            inserirLinha(tbColunas, i);
        }
        
    }
    
    public void inserirLinha(JTable tabela, int numLinha){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel(); 
        modelo.addRow(new Object[]{String.valueOf(numLinha+1), ""});
    }
    
    public boolean adicionarNome(JTable tabela, int numLinha, String[] valor){
        String valorLinha = (String) tabela.getModel().getValueAt(numLinha, 1);
        
        if (valorLinha.equals("")) return false;
        
        valor[numLinha] = valorLinha;
                
        return true;
    }
    
    public void proximaLinha(JTable tabela){
        if (tabela.getSelectedRow() == this.numeroLinhas - 1){
            if (tabela == tbLinhas) {
                tbColunas.requestFocus();
                tbColunas.setRowSelectionInterval(0, 0);
            } else btnGerarTabela.requestFocus();
        }else{
            tabela.setRowSelectionInterval(tabela.getSelectedRow()+1, tabela.getSelectedRow()+1);
        }
    }
    
    public void gerarTabela(){
        TableCellEditor editor = tbLinhas.getCellEditor();
        if (editor != null) {
          editor.stopCellEditing();
        }
        
        editor = tbColunas.getCellEditor();
        if (editor != null) {
          editor.stopCellEditing();
        }
        
        
        for (int i=0; i < numeroLinhas; i++) {
            if (!adicionarNome(tbLinhas, i, nomeLinhas)){
                JOptionPane.showMessageDialog(null, "Informe o nome da Linha na posição "+String.valueOf(i+1));
                tbLinhas.requestFocus();
                tbLinhas.setRowSelectionInterval(i, i);
                return;
            }
        }
        for (int i=0; i < numeroColunas; i++) {
            if (!adicionarNome(tbColunas, i, nomeColunas)){
                JOptionPane.showMessageDialog(null, "Informe o nome da Coluna na posição "+String.valueOf(i+1));
                tbColunas.requestFocus();
                tbColunas.setRowSelectionInterval(i, i);
                return;
            }
        }
        
        // DEPOIS QUE GERAR A TABELA TEM QUE CRIAR UMA NOVA TELA PRA INFORMAR OS DADOS DE CADA CÉLULA, NO CASO VAI SER A TELA PRINCIPAL
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbColunas;
    private javax.swing.JTable tbLinhas;
    // End of variables declaration//GEN-END:variables
}
