/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.Consultar;

import DAO.ClienteDAO;
import DAO.Conexao;
import Modelo.Cliente;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lidxa
 */
public class NewJFrameConsultar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameConsultar
     */
   public NewJFrameConsultar() {
        initComponents();
        setTitle("Consultar Cliente");
        setSize(800, 450);
        AtualizaTable();
    }

    
       public void AtualizaTable(){
        Connection Con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(Con);
        
        List<Cliente> lista = new ArrayList<Cliente>();
        lista = bd.Listar_Cliente();
        
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        
        
        
        
        for(int i = tbm.getRowCount() - 1; i >= 0; i--){
            tbm.removeRow(i);
        }
        int i = 0;
                
           for (Cliente tab : lista) {
            tbm.addRow(new String[1]);
            jTable1.setValueAt(tab.getCod(),i,0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            jTable1.setValueAt(tab.getLogin(), i, 2);
            jTable1.setValueAt(tab.getSenha(), i, 3);
            i++;
        }
        Conexao.FecharConexao(Con);
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPesquisarPorNome = new javax.swing.JLabel();
        jNomePesquisa = new javax.swing.JTextField();
        jButtonPesquisa = new javax.swing.JButton();
        jLabelPesquisarporCod = new javax.swing.JLabel();
        jButtonpesquisa2 = new javax.swing.JButton();
        jCodigoPesquisa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButtonListar = new javax.swing.JButton();
        jLabelListarTodos = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabelPesquisarPorNome.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jLabelPesquisarPorNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisarPorNome.setText("Pesquisar por Nome");

        jNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomePesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/android-search_icon-icons.com_50501.png"))); // NOI18N
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jLabelPesquisarporCod.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jLabelPesquisarporCod.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPesquisarporCod.setText("Pesquisar por Código");

        jButtonpesquisa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/android-search_icon-icons.com_50501.png"))); // NOI18N
        jButtonpesquisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpesquisa2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPesquisarPorNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPesquisarporCod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCodigoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonpesquisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabelPesquisarporCod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCodigoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonpesquisa2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(102, 0, 0));

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list.png"))); // NOI18N
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jLabelListarTodos.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 10)); // NOI18N
        jLabelListarTodos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelListarTodos.setText("Listar Todos");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelListarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonSair)
                    .addComponent(jLabelListarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomePesquisaActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        // TODO add your handling code here:
        Connection Con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(Con);

        List<Cliente> lista = new ArrayList<Cliente>();
        lista = bd.Pesquisar_Nome_Cliente(jNomePesquisa.getText());

        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        /*
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }*/
        for(int i = tbm.getRowCount() - 1; i >= 0; i--){
            tbm.removeRow(i);
        }
        int i = 0;

        for(Cliente tab : lista){
            tbm.addRow(new String[1]);
            jTable1.setValueAt(tab.getCod(),i,0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            jTable1.setValueAt(tab.getLogin(), i, 2);
            jTable1.setValueAt(tab.getSenha(), i, 3);
            i++;
        }
        Conexao.FecharConexao(Con);

    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jButtonpesquisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpesquisa2ActionPerformed
        // TODO add your handling code here:
        Connection Con = Conexao.AbrirConexao();
        ClienteDAO bd = new ClienteDAO(Con);

        List<Cliente> lista = new ArrayList<Cliente>();
        lista = bd.Pesquisar_Cod_Cliente(Integer.parseInt(jCodigoPesquisa.getText()));

        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        /*
        while(tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }*/
        for(int i = tbm.getRowCount() - 1; i >= 0; i--){
            tbm.removeRow(i);
        }
        int i = 0;

        for(Cliente tab : lista){
            tbm.addRow(new String[1]);
            jTable1.setValueAt(tab.getCod(),i,0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            jTable1.setValueAt(tab.getLogin(), i, 2);
            jTable1.setValueAt(tab.getSenha(), i, 3);
            i++;
        }
        Conexao.FecharConexao(Con);

    }//GEN-LAST:event_jButtonpesquisa2ActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
        AtualizaTable();
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          new NewJFrameConsultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonpesquisa2;
    private javax.swing.JTextField jCodigoPesquisa;
    private javax.swing.JLabel jLabelListarTodos;
    private javax.swing.JLabel jLabelPesquisarPorNome;
    private javax.swing.JLabel jLabelPesquisarporCod;
    private javax.swing.JTextField jNomePesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}