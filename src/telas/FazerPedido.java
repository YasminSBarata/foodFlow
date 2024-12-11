/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import classes.Checagem;
import classes.Cliente;
import classes.Produto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class FazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form FazerPedido
     */
    public FazerPedido() {
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

        jPanel1 = new javax.swing.JPanel();
        jlCadastros = new javax.swing.JLabel();
        jlNomeProduto1 = new javax.swing.JLabel();
        jlNomeCliente = new javax.swing.JLabel();
        jlNomeProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Endereco = new javax.swing.JTextArea();
        jlFormaDePagamento = new javax.swing.JLabel();
        cmbFormaDePagamento = new javax.swing.JComboBox<>();
        jlTotal = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnNovoProduto4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 720));

        jlCadastros.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
        jlCadastros.setForeground(new java.awt.Color(255, 255, 255));
        jlCadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastros.setText("Confirmação");

        jlNomeProduto1.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlNomeProduto1.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeProduto1.setText("Nome:");

        jlNomeCliente.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        jlNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlNomeCliente.setText("Nome do Cliente");

        jlNomeProduto.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlNomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        jlNomeProduto.setText("Endereço:");

        Endereco.setBackground(new java.awt.Color(204, 0, 0));
        Endereco.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        Endereco.setForeground(new java.awt.Color(255, 255, 255));
        Endereco.setRows(5);
        Endereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jScrollPane1.setViewportView(Endereco);

        jlFormaDePagamento.setFont(new java.awt.Font("Sul Sans", 0, 14)); // NOI18N
        jlFormaDePagamento.setForeground(new java.awt.Color(255, 255, 255));
        jlFormaDePagamento.setText("Categoria:");

        cmbFormaDePagamento.setFont(new java.awt.Font("Sul Sans", 0, 13)); // NOI18N
        cmbFormaDePagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlTotal.setFont(new java.awt.Font("Sul Sans", 0, 24)); // NOI18N
        jlTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTotal.setText("Total: R$0,00");

        btnFinalizar.setBackground(new java.awt.Color(234, 29, 44));
        btnFinalizar.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_verificar_branco.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setBorder(null);
        btnFinalizar.setBorderPainted(false);
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnNovoProduto4.setBackground(new java.awt.Color(234, 29, 44));
        btnNovoProduto4.setFont(new java.awt.Font("Sul Sans", 0, 18)); // NOI18N
        btnNovoProduto4.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoProduto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone_fechar_branco.png"))); // NOI18N
        btnNovoProduto4.setText("Cancelar");
        btnNovoProduto4.setBorder(null);
        btnNovoProduto4.setBorderPainted(false);
        btnNovoProduto4.setContentAreaFilled(false);
        btnNovoProduto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProduto4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(btnNovoProduto4)
                            .addGap(18, 18, 18)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlNomeProduto)
                                                .addComponent(jlNomeProduto1)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlFormaDePagamento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cmbFormaDePagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(31, 31, 31))))
                                .addComponent(jlTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(23, 23, 23)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jlCadastros)
                    .addGap(32, 32, 32)
                    .addComponent(jlNomeProduto1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jlNomeCliente)
                    .addGap(18, 18, 18)
                    .addComponent(jlNomeProduto)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(64, 64, 64)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlFormaDePagamento)
                        .addComponent(cmbFormaDePagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                    .addComponent(jlTotal)
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoProduto4)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(53, 53, 53)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnNovoProduto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProduto4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnNovoProduto4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Endereco;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnNovoProduto4;
    private javax.swing.JComboBox<String> cmbFormaDePagamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCadastros;
    private javax.swing.JLabel jlFormaDePagamento;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLabel jlNomeProduto;
    private javax.swing.JLabel jlNomeProduto1;
    private javax.swing.JLabel jlTotal;
    // End of variables declaration//GEN-END:variables
}
