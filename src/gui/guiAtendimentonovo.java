/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import JPA.AtendimentoJpaController;
import JPA.clientenovoJpaController;
import JPA.exceptions.NonexistentEntityException;
import JPA.profissionalJpaController;
import JPA.promocaonovoJpaController;
import JPA.servicoNovoJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Atendimento;
import model.clientenovo;
import model.profissional;
import model.promocaonovo;
import model.servicoNovo;
import static org.apache.xalan.lib.ExsltDatetime.date;
import static org.eclipse.persistence.expressions.ExpressionOperator.today;

/**
 *
 * @author Peterson
 */
public class guiAtendimentonovo extends javax.swing.JFrame {
    
    private clientenovo cliente; 
    Atendimento Atendimento = new Atendimento();

    /**
     * Creates new form guiAtendimento
     */
    public guiAtendimentonovo() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboProfissional = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboPromocao = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstservicos = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jData = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnconcluir = new javax.swing.JToggleButton();
        btniniciar = new javax.swing.JToggleButton();
        btnadicionar = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        cboCliente = new javax.swing.JComboBox();
        cboServico = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AR ESSENCE", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuário.png"))); // NOI18N
        jLabel1.setText("ATENDIMENTO AO CLIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jLabel3.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel3.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel5.setText("Profissional:");

        cboProfissional.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboProfissional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProfissionalItemStateChanged(evt);
            }
        });
        cboProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProfissionalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel6.setText("Serviço:");

        jLabel7.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel7.setText("Promoção:");

        cboPromocao.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboPromocao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboPromocaoItemStateChanged(evt);
            }
        });
        cboPromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPromocaoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviços"));

        lstservicos.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        lstservicos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstservicosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstservicos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel8.setText("TOTAL:   R$");

        txttotal.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        jData.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel4.setText("Data:");

        btnconcluir.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnconcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok.png"))); // NOI18N
        btnconcluir.setText("Concluir Atendimento");
        btnconcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconcluirMouseClicked(evt);
            }
        });
        btnconcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcluirActionPerformed(evt);
            }
        });

        btniniciar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btniniciar.setText("INICIAR");
        btniniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btniniciarMouseClicked(evt);
            }
        });
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        btnadicionar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok.png"))); // NOI18N
        btnadicionar.setText("Adicionar");
        btnadicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadicionarMouseClicked(evt);
            }
        });
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel9.setText("Código:");

        txtcodigo.setEditable(false);
        txtcodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtcodigo.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        cboCliente.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboClienteItemStateChanged(evt);
            }
        });
        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });

        cboServico.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboServicoItemStateChanged(evt);
            }
        });
        cboServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 441, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnadicionar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboPromocao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(122, 122, 122)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btniniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboProfissional, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btniniciar)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(cboPromocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnadicionar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(484, 484, 484)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnconcluir)
                        .addContainerGap(14, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProfissionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProfissionalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProfissionalItemStateChanged

    private void cboProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProfissionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProfissionalActionPerformed

    private void cboPromocaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboPromocaoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPromocaoItemStateChanged

    private void cboPromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPromocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboPromocaoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

          


    cboProfissional.removeAllItems();
    List l1 = new profissionalJpaController().findprofissionalEntities();

        for (int i = 0; i < l1.size(); i++) {
            profissional pf = (profissional) l1.get(i);
            cboProfissional.addItem(pf);
        }
        
            
    cboPromocao.removeAllItems();
    List l3 = new promocaonovoJpaController().findpromocaonovoEntities();
    
        for (int i = 0; i< l3.size(); i++){
            promocaonovo pm = (promocaonovo) l3.get(i);
            cboPromocao.addItem(pm);
        }
    
    }//GEN-LAST:event_formWindowActivated

    private void lstservicosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstservicosValueChanged


    }//GEN-LAST:event_lstservicosValueChanged

    private void btnconcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconcluirMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnconcluirMouseClicked

    private void btnconcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcluirActionPerformed



        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_btnconcluirActionPerformed

    private void btniniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btniniciarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btniniciarMouseClicked

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
               
        Atendimento = new Atendimento();
        Atendimento.setDataAtendimento(jData.getDate());
        Atendimento.setClientenovo((clientenovo) cboCliente.getSelectedItem());
        Atendimento.setProfissional((profissional) cboProfissional.getSelectedItem());
        //Atendimento.setServicoNovo((servicoNovo)cboServico.getSelectedItem());
       
                    
        new AtendimentoJpaController().create(Atendimento);
        
        txtcodigo.setText(Atendimento.getId());

        new AtendimentoJpaController().findAtendimento(txtcodigo.getText());
       
       //List l = new AtendimentoJpaController().findAtendimentoEntities();
       //lstservicos.setListData(l.toArray()); 

       
       
// TODO add your handling code here:
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnadicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadicionarMouseClicked

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
       
        if (Atendimento == null) return;
        
        new AtendimentoJpaController().findAtendimento(txtcodigo.getText());
        
        
        //Atendimento.setServicoNovo((servicoNovo)cboServico.getSelectedItem());
        
        try {
            new AtendimentoJpaController().edit(Atendimento);
         } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " Procure o Administrador do Sistema");
        }
        // List l = new AtendimentoJpaController().findAtendimentoEntities();
            //lstservicos.setListData(l.toArray()); 
      
    }//GEN-LAST:event_btnadicionarActionPerformed

    private void cboClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboClienteItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboClienteItemStateChanged

    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboClienteActionPerformed

    private void cboServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboServicoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicoItemStateChanged

    private void cboServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicoActionPerformed

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
            java.util.logging.Logger.getLogger(guiAtendimentonovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAtendimentonovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAtendimentonovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAtendimentonovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiAtendimentonovo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnadicionar;
    private javax.swing.JToggleButton btnconcluir;
    private javax.swing.JToggleButton btniniciar;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboProfissional;
    private javax.swing.JComboBox cboPromocao;
    private javax.swing.JComboBox cboServico;
    private com.toedter.calendar.JDateChooser jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstservicos;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}