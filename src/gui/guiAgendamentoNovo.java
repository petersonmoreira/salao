/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import JPA.agendamentoJpaController;
import JPA.clientenovoJpaController;
import JPA.profissionalJpaController;
import JPA.servicoNovoJpaController;
import static java.lang.String.format;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.agendamento;
import model.clientenovo;
import model.profissional;
import model.servicoNovo;
import static org.codehaus.groovy.runtime.DateGroovyMethods.format;

/**
 *
 * @author Peterson
 */
public class guiAgendamentoNovo extends javax.swing.JFrame {
    
    agendamento a = new agendamento();
    /**
     * Creates new form guiAgendamentoNovo
     */
    public guiAgendamentoNovo() {
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
        jLabel1 = new javax.swing.JLabel();
        dados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboCliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cboProfissional = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cboServico = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cboHoraInicio = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cboHoraFim = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jDateAgenda = new com.toedter.calendar.JDateChooser();
        btnagendar = new javax.swing.JToggleButton();
        btnalterar = new javax.swing.JToggleButton();
        btnexcluir = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jDatebuscar = new com.toedter.calendar.JDateChooser();
        btnlistar = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstagendamentos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("AR ESSENCE", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agendar - pe.png"))); // NOI18N
        jLabel1.setText("AGENDAR CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        dados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel2.setText("Cliente:");

        cboCliente.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel3.setText("Profissional:");

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

        jLabel5.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel5.setText("Serviço:");

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

        jLabel7.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel7.setText("Hora Início:");

        cboHoraInicio.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboHoraInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00 ", "09:30 ", "10:00 ", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00 ", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00  ", " " }));
        cboHoraInicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHoraInicioItemStateChanged(evt);
            }
        });
        cboHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHoraInicioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel8.setText("Hora Fim:");

        cboHoraFim.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        cboHoraFim.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00 ", "09:30 ", "10:00 ", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00 ", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00  ", " " }));
        cboHoraFim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHoraFimItemStateChanged(evt);
            }
        });
        cboHoraFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHoraFimActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        jLabel6.setText("Data:");

        jDateAgenda.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N

        btnagendar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok.png"))); // NOI18N
        btnagendar.setText("Agendar");
        btnagendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagendarMouseClicked(evt);
            }
        });
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });

        btnalterar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Alterar.png"))); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        btnexcluir.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosLayout = new javax.swing.GroupLayout(dados);
        dados.setLayout(dadosLayout);
        dadosLayout.setHorizontalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51)
                                .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(47, 47, 47)
                                .addComponent(cboServico, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnexcluir)
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cboHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dadosLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnalterar)
                                .addGap(47, 47, 47)
                                .addComponent(btnagendar)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        dadosLayout.setVerticalGroup(
            dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cboHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(dadosLayout.createSequentialGroup()
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cboProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cboServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)))
                .addGroup(dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagendar)
                    .addComponent(btnalterar)
                    .addComponent(btnexcluir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jDatebuscar.setBackground(new java.awt.Color(255, 255, 204));
        jDatebuscar.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N

        btnlistar.setBackground(new java.awt.Color(255, 255, 204));
        btnlistar.setFont(new java.awt.Font("AR ESSENCE", 0, 18)); // NOI18N
        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buscar-pequeno.png"))); // NOI18N
        btnlistar.setText("Listar Agenda");
        btnlistar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlistarMouseClicked(evt);
            }
        });
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jDatebuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnlistar)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlistar)
                    .addComponent(jDatebuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Agendamentos"));

        lstagendamentos.setFont(new java.awt.Font("AR CENA", 0, 18)); // NOI18N
        lstagendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstagendamentos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstagendamentosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstagendamentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboClienteActionPerformed

    private void cboProfissionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProfissionalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProfissionalItemStateChanged

    private void cboProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProfissionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProfissionalActionPerformed

    private void cboServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboServicoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicoItemStateChanged

    private void cboServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboServicoActionPerformed

    private void cboHoraInicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHoraInicioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoraInicioItemStateChanged

    private void cboHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoraInicioActionPerformed

    private void cboHoraFimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHoraFimItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoraFimItemStateChanged

    private void cboHoraFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHoraFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoraFimActionPerformed

    private void btnagendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagendarMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnagendarMouseClicked

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed

        // agendamento a = new agendamento();
        a.setCliente((clientenovo)cboCliente.getSelectedItem());
        a.setProfissional((profissional)cboProfissional.getSelectedItem());
        a.setServicoNovo((servicoNovo)cboServico.getSelectedItem());
        a.setDataAgenda(jDateAgenda.getCalendar());
        a.setHoraInicio((String) cboHoraInicio.getSelectedItem());
        a.setHoraFim ((String) cboHoraFim.getSelectedItem());

        try {
            new agendamentoJpaController().create(a);
        } catch (Exception ex) {
            Logger.getLogger(guiAgendamentoNovo.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "CLIENTE AGENDADO COM SUCESSO!");

    }//GEN-LAST:event_btnagendarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
/*
        if (agendamento==null) return;
        agendamento a = (agendamento)lstagendamentos.getSelectedValue();

        a.setCliente((clientenovo)cboCliente.getSelectedItem());
        a.setProfissional((profissional)cboProfissional.getSelectedItem());
        a.setServicoNovo((servicoNovo)cboServico.getSelectedItem());
        a.setDataAgenda(jDateAgenda.getCalendar());
        a.setHoraInicio((String) cboHoraInicio.getSelectedItem());
        a.setHoraFim ((String) cboHoraFim.getSelectedItem());

        try{
            new agendamentoJpaController().edit(a);
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + " Procure o Administrador do Sistema");
        }

        JOptionPane.showMessageDialog(null,"Agendamento Alterados");
*/
    }//GEN-LAST:event_btnalterarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
/*
        int resposta;

        agendamento a = (agendamento)lstagendamentos.getSelectedValue();

        try {
            resposta = JOptionPane.showConfirmDialog(null, "DESEJA EXCLUIR ESTE AGENDAMENTO?", "Deseja apagar?", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION){
                new agendamentoJpaController().destroy(a.getId().toString());
                JOptionPane.showMessageDialog(null, "AGENDAMENTO EXCLUIDO!");
            } else {

            }
        } catch (NonexistentEntityException ex) {

        }
*/
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     cboCliente.removeAllItems();
        List l = new clientenovoJpaController().findclientenovoEntities();

        for (int i = 0; i < l.size(); i++) {
            clientenovo c = (clientenovo) l.get(i);
            cboCliente.addItem(c);
        }
        
        
        cboProfissional.removeAllItems();
        List l1 = new profissionalJpaController().findprofissionalEntities();

        for (int i = 0; i < l1.size(); i++) {
            profissional p = (profissional) l1.get(i);
            cboProfissional.addItem(p);}
            
                   
        cboServico.removeAllItems();
        List l3 = new servicoNovoJpaController().findservicoNovoEntities();

        for (int i = 0; i < l3.size(); i++) {
            servicoNovo s = (servicoNovo) l3.get(i);
            cboServico.addItem(s);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btnlistarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlistarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlistarMouseClicked

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed

        // new agendamentoJpaController().getAgendamento(jDatebuscar.getDate());
    
       
        
        List l = null;
        try {
            l = new agendamentoJpaController().getAgendamento(formataData("26/06/2014"));
        } catch (Exception ex) {
            Logger.getLogger(guiAgendamentoNovo.class.getName()).log(Level.SEVERE, null, ex);
        }
        lstagendamentos.setListData(l.toArray());

        // TODO add your handling code here:
    }//GEN-LAST:event_btnlistarActionPerformed

    public static Date formataData(String data) throws Exception {   
        if (data == null || data.equals(""))  
            return null;  
          
        Date date = null;  
        try {  
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            date =  new java.sql.Date( ((java.util.Date)formatter.parse(data)).getTime());   
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    }  
    
    private void lstagendamentosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstagendamentosValueChanged

        agendamento a = (agendamento)lstagendamentos.getSelectedValue();

        cboCliente.setSelectedItem(a.getCliente());
        cboProfissional.setSelectedItem(a.getProfissional());
        cboServico.setSelectedItem(a.getServico());
        jDateAgenda.setCalendar(a.getDataAgenda());
        cboHoraInicio.setSelectedItem(a.getHoraInicio());
        cboHoraFim.setSelectedItem(a.getHoraFim());

    }//GEN-LAST:event_lstagendamentosValueChanged

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
            java.util.logging.Logger.getLogger(guiAgendamentoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAgendamentoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAgendamentoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAgendamentoNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiAgendamentoNovo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnagendar;
    private javax.swing.JToggleButton btnalterar;
    private javax.swing.JToggleButton btnexcluir;
    private javax.swing.JToggleButton btnlistar;
    private javax.swing.JComboBox cboCliente;
    private javax.swing.JComboBox cboHoraFim;
    private javax.swing.JComboBox cboHoraInicio;
    private javax.swing.JComboBox cboProfissional;
    private javax.swing.JComboBox cboServico;
    private javax.swing.JPanel dados;
    private com.toedter.calendar.JDateChooser jDateAgenda;
    private com.toedter.calendar.JDateChooser jDatebuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstagendamentos;
    // End of variables declaration//GEN-END:variables

    private Date toDate(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}