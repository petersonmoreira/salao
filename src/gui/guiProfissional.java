/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import JPA.funcaoJpaController;
import JPA.profissionalJpaController;
import java.util.List;
import javax.swing.JOptionPane;
import model.funcao;
import model.profissional;

/**
 *
 * @author Peterson
 */
public class guiProfissional extends javax.swing.JFrame {

    /**
     * Creates new form guiProfissional
     */
    public guiProfissional() {
        initComponents();
         this.setTitle("CADASTRAR PROFISSIONAL" );
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtdatanasc = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optf = new javax.swing.JRadioButton();
        optm = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtendereco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbofuncao = new javax.swing.JComboBox();
        btnsalvar = new javax.swing.JToggleButton();
        btnalterar = new javax.swing.JToggleButton();
        btnexcluir = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        try {
            txtdatanasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatanasc.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        txtnome.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel3.setText("Data Nascimento:");

        jLabel4.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel4.setText("Sexo:");

        buttonGroup1.add(optf);
        optf.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        optf.setText("F");

        buttonGroup1.add(optm);
        optm.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        optm.setText("M");

        jLabel5.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        txtendereco.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel6.setText("Função:");

        cbofuncao.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cbofuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbofuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbofuncaoActionPerformed(evt);
            }
        });

        btnsalvar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalvarMouseClicked(evt);
            }
        });
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnalterar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar.png"))); // NOI18N
        btnalterar.setText("Alterar");

        btnexcluir.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AR ESSENCE", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/profissional.png"))); // NOI18N
        jLabel1.setText(" CADASTRAR PROFISSIONAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtnome)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(optm)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtendereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnexcluir)
                                .addGap(43, 43, 43)
                                .addComponent(btnalterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btnsalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cbofuncao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(optf)
                    .addComponent(optm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbofuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar)
                    .addComponent(btnalterar)
                    .addComponent(btnexcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvarMouseClicked


        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalvarMouseClicked

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed

        profissional p = new profissional();
        p.setNome(txtnome.getText());
        p.setData_Nasc(txtdatanasc.getText());
        
        if (optf.isSelected()){
            p.setSexo("Feminino");
          }else{
              p.setSexo("Masculino");
         }
        p.setFuncao((funcao)cbofuncao.getSelectedItem());
        
        new profissionalJpaController().create(p);
        
        JOptionPane.showMessageDialog(null, "PROFISSIONAL CADASTRADO COM SUCESSO!");  
        
         txtnome.setText("");
         txtdatanasc.setText("");
         txtendereco.setText("");
                  
         txtnome.grabFocus();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
cbofuncao.removeAllItems();
        List l = new funcaoJpaController().findfuncaoEntities();

        for (int i = 0; i < l.size(); i++) {
            funcao f = (funcao) l.get(i);
            cbofuncao.addItem(f);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void cbofuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbofuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbofuncaoActionPerformed

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
            java.util.logging.Logger.getLogger(guiProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiProfissional().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnalterar;
    private javax.swing.JToggleButton btnexcluir;
    private javax.swing.JToggleButton btnsalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbofuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton optf;
    private javax.swing.JRadioButton optm;
    private javax.swing.JFormattedTextField txtdatanasc;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
