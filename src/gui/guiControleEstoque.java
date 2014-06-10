/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import JPA.exceptions.NonexistentEntityException;
import model.produto;
import JPA.produtoJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Peterson
 */
public class guiControleEstoque extends javax.swing.JFrame {
    
     private produto produto;

    /**
     * Creates new form guiControleEstoque
     */
    public guiControleEstoque() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtqtd = new javax.swing.JTextField();
        btnentradaproduto = new javax.swing.JToggleButton();
        btnsaidaproduto = new javax.swing.JToggleButton();
        btnchecar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstprodutos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AR ESSENCE", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produtos.png"))); // NOI18N
        jLabel1.setText("CONTROLE DE ESTOQUE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel2.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel2.setText("Código de Barras:");

        txtcodigo.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        btnbuscar.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buscar-pequeno.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        txtnome.setEditable(false);
        txtnome.setBackground(new java.awt.Color(204, 204, 204));
        txtnome.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel9.setText("Quantidade:");

        txtqtd.setEditable(false);
        txtqtd.setBackground(new java.awt.Color(204, 204, 204));
        txtqtd.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        btnentradaproduto.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnentradaproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Entrada de Produtos.png"))); // NOI18N
        btnentradaproduto.setText("ENTRADA DE PRODUTO");
        btnentradaproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentradaprodutoActionPerformed(evt);
            }
        });

        btnsaidaproduto.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnsaidaproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Saída de Produtos.png"))); // NOI18N
        btnsaidaproduto.setText("SAÍDA DE PRODUTO");
        btnsaidaproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaidaprodutoActionPerformed(evt);
            }
        });

        btnchecar.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        btnchecar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buscar-pequeno.png"))); // NOI18N
        btnchecar.setText("CHECAR ESTOQUE");
        btnchecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchecarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos em Estoque Mínimo"));

        lstprodutos.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        lstprodutos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstprodutosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstprodutos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnbuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(44, 44, 44)
                            .addComponent(txtnome))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnentradaproduto)
                                .addGap(18, 18, 18)
                                .addComponent(btnsaidaproduto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnchecar)
                                .addGap(155, 155, 155))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnentradaproduto)
                    .addComponent(btnsaidaproduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnchecar)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        
        try {
           produto  = new produtoJpaController().getProduto(txtcodigo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            return;
        }

        txtcodigo.setText(produto.getCodigo());
        txtnome.setText(produto.getNome());
        txtqtd.setText(String.valueOf(produto.getQtd()));
   
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnentradaprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentradaprodutoActionPerformed

       // produto Produto;
        
         try {
           produto  = new produtoJpaController().getProduto(txtcodigo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            return;
        }
        int qtd;
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade a ser Acrescentada:" ));
        
        //SOMA À VARIÁVEL O VALOR DIGITADO
        qtd += (Integer.parseInt(txtqtd.getText()));
        //EXIBE NA JTEXTFIELD O NOVO VALOR
        txtqtd.setText(String.valueOf(qtd));
        //txtqtd.setText(String.valueOf(produto.getQtd()));
        //new produtoJpaController().edit(produto.setQtd(qtd));
       // produto.setQtd(Integer.parseInt(txtqtd.getText()));
      
        produto.setCodigo(txtcodigo.getText());
        produto.setNome(txtnome.getText());
        produto.setQtd(Integer.parseInt(txtqtd.getText()));
    
            try {
                new produtoJpaController().edit(produto);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(guiControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(guiControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
  
           
            

            JOptionPane.showMessageDialog(null,"ESTOQUE ATUALIZADO");

            // produto.setQtd(Integer.parseInt(txtqtd.getText()));

            // JOptionPane.showMessageDialog(null,"A quantidade atual em estoque é: " + qtd + " unidades");

            /*private void atualizaHistorico() {
                int quantidade;

                // Faz a pesquisa do valor no banco de dados e atribui na variável quantidade.

                //
                if (somar) {
                    quantidade += Integer.parseInt(txtValorAtualizar.getText());
                } else {
                    quantidade -= Integer.parseInt(txtValorAtualizar.getText());
                }   */

                // O valor da quantidade já está atualizada, agora é só gravar no banco de dados.
                // TODO add your handling code here:
    }//GEN-LAST:event_btnentradaprodutoActionPerformed

    private void btnsaidaprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaidaprodutoActionPerformed
  
        try {
           produto  = new produtoJpaController().getProduto(txtcodigo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
            return;
        }
        int qtd;
        
        qtd = (Integer.parseInt(txtqtd.getText())) - Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade a ser Retirada:" ));
        
       // qtd = (Integer.parseInt(txtqtd.getText()));
        
      // qtd -= Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade a ser Retirada:" ));
        
        
        
        //EXIBE NA JTEXTFIELD O NOVO VALOR
        txtqtd.setText(String.valueOf(qtd));
        //txtqtd.setText(String.valueOf(produto.getQtd()));
        //new produtoJpaController().edit(produto.setQtd(qtd));
       // produto.setQtd(Integer.parseInt(txtqtd.getText()));
      
        produto.setCodigo(txtcodigo.getText());
        produto.setNome(txtnome.getText());
        produto.setQtd(Integer.parseInt(txtqtd.getText()));
    
            try {
                new produtoJpaController().edit(produto);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(guiControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(guiControleEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
  
           
            

            JOptionPane.showMessageDialog(null,"ESTOQUE ATUALIZADO");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaidaprodutoActionPerformed

    private void btnchecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchecarActionPerformed

       List l = (List) new produtoJpaController().checarestoque();
       //List l = new produtoJpaController().findprodutoEntities();
        System.out.println("LISTA: "+l);
       lstprodutos.setListData(l.toArray());

        // TODO add your handling code here:
    }//GEN-LAST:event_btnchecarActionPerformed

    private void lstprodutosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstprodutosValueChanged

        produto  = (produto)lstprodutos.getSelectedValue();

        txtcodigo.setText(produto.getCodigo());
        txtnome.setText(produto.getNome());
        txtqtd.setText(String.valueOf(produto.getQtd()));
        
    }//GEN-LAST:event_lstprodutosValueChanged

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
            java.util.logging.Logger.getLogger(guiControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new guiControleEstoque().setVisible(true);
            }
        });
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnchecar;
    private javax.swing.JToggleButton btnentradaproduto;
    private javax.swing.JToggleButton btnsaidaproduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstprodutos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtqtd;
    // End of variables declaration//GEN-END:variables
}
