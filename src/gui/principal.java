/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import JPA.produtoJpaController;
import Relatórios.Aniversarios;
import Relatórios.JDBC.ConectaBanco;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Peterson
 */
public class principal extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        this.setTitle("          . . . . . : : : : : . . . . .  SALÃO NOVO STILO - UNISSEX  - (Versão 1.0) . . . . . : : : : : . . . . ." );
        conecta.conexao();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menucadastros = new javax.swing.JMenu();
        cadastrarfuncao = new javax.swing.JMenuItem();
        cadastrarservico = new javax.swing.JMenuItem();
        cadastrarprofissional = new javax.swing.JMenuItem();
        cadastrarcliente = new javax.swing.JMenuItem();
        cadastrarcliente1 = new javax.swing.JMenuItem();
        cadastrarcliente2 = new javax.swing.JMenuItem();
        cadastrarcliente3 = new javax.swing.JMenuItem();
        cadastrarpromocao = new javax.swing.JMenuItem();
        menuatendimento = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuAtendimento = new javax.swing.JMenuItem();
        menuAgendamento = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuAgendar = new javax.swing.JMenuItem();
        menurelatorioclientes = new javax.swing.JMenu();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        RelClientes = new javax.swing.JMenuItem();
        cadastrarfuncao2 = new javax.swing.JMenuItem();
        RelAniversariantes = new javax.swing.JMenuItem();
        RelEquipamentos = new javax.swing.JMenuItem();
        RelServicosXprofissional = new javax.swing.JMenuItem();
        LucroXProfissional = new javax.swing.JMenuItem();
        menusair = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("AR CENA", 0, 14)); // NOI18N
        jPanel1.setName("SALÃO NOVO STILO - UNISSEX"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 0, 0));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 204), new java.awt.Color(153, 0, 0), new java.awt.Color(255, 255, 153)));

        menucadastros.setBackground(new java.awt.Color(153, 0, 0));
        menucadastros.setForeground(new java.awt.Color(255, 255, 255));
        menucadastros.setText("        |     CADASTROS     |");
        menucadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menucadastros.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N

        cadastrarfuncao.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarfuncao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/funcao.png"))); // NOI18N
        cadastrarfuncao.setText("Cadastrar Função");
        cadastrarfuncao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarfuncaoMouseClicked(evt);
            }
        });
        cadastrarfuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarfuncaoActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarfuncao);

        cadastrarservico.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarservico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/servico.png"))); // NOI18N
        cadastrarservico.setText("Cadastrar Serviço");
        cadastrarservico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarservicoMouseClicked(evt);
            }
        });
        cadastrarservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarservicoActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarservico);

        cadastrarprofissional.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarprofissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/profissional.png"))); // NOI18N
        cadastrarprofissional.setText("Cadastrar Profissional");
        cadastrarprofissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarprofissionalMouseClicked(evt);
            }
        });
        cadastrarprofissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarprofissionalActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarprofissional);

        cadastrarcliente.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes.png"))); // NOI18N
        cadastrarcliente.setText("Cadastrar Cliente");
        cadastrarcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarclienteMouseClicked(evt);
            }
        });
        cadastrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarclienteActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarcliente);

        cadastrarcliente1.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarcliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fornecedor.png"))); // NOI18N
        cadastrarcliente1.setText("Cadastrar Fornecedor");
        cadastrarcliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarcliente1MouseClicked(evt);
            }
        });
        cadastrarcliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarcliente1ActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarcliente1);

        cadastrarcliente2.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarcliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produto.png"))); // NOI18N
        cadastrarcliente2.setText("Cadastrar Produto");
        cadastrarcliente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarcliente2MouseClicked(evt);
            }
        });
        cadastrarcliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarcliente2ActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarcliente2);

        cadastrarcliente3.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarcliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/equipamentos.png"))); // NOI18N
        cadastrarcliente3.setText("Cadastrar Equipamento");
        cadastrarcliente3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarcliente3MouseClicked(evt);
            }
        });
        cadastrarcliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarcliente3ActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarcliente3);

        cadastrarpromocao.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarpromocao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/promocao.png"))); // NOI18N
        cadastrarpromocao.setText("Cadastrar Promoção");
        cadastrarpromocao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarpromocaoMouseClicked(evt);
            }
        });
        cadastrarpromocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarpromocaoActionPerformed(evt);
            }
        });
        menucadastros.add(cadastrarpromocao);

        jMenuBar1.add(menucadastros);

        menuatendimento.setForeground(new java.awt.Color(255, 255, 255));
        menuatendimento.setText("|     ATENDIMENTO     |");
        menuatendimento.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        menuatendimento.add(jSeparator1);

        MenuAtendimento.setFont(new java.awt.Font("AR CENA", 0, 24)); // NOI18N
        MenuAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caixa.png"))); // NOI18N
        MenuAtendimento.setText("Gerar Atendimento");
        MenuAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtendimentoActionPerformed(evt);
            }
        });
        menuatendimento.add(MenuAtendimento);

        jMenuBar1.add(menuatendimento);

        menuAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        menuAgendamento.setText("|     AGENDAMENTO     |");
        menuAgendamento.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        menuAgendamento.add(jSeparator2);
        menuAgendamento.add(jSeparator3);

        MenuAgendar.setFont(new java.awt.Font("AR CENA", 0, 24)); // NOI18N
        MenuAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agendar - pe.png"))); // NOI18N
        MenuAgendar.setText("Agendar Cliente");
        MenuAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAgendarActionPerformed(evt);
            }
        });
        menuAgendamento.add(MenuAgendar);

        jMenuBar1.add(menuAgendamento);

        menurelatorioclientes.setBackground(new java.awt.Color(153, 0, 0));
        menurelatorioclientes.setForeground(new java.awt.Color(255, 255, 255));
        menurelatorioclientes.setText("|     RELATÓRIOS     |");
        menurelatorioclientes.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        menurelatorioclientes.add(jSeparator5);
        menurelatorioclientes.add(jSeparator6);

        RelClientes.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        RelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Clientes.png"))); // NOI18N
        RelClientes.setText("Clientes Cadastrados");
        RelClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelClientesMouseClicked(evt);
            }
        });
        RelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelClientesActionPerformed(evt);
            }
        });
        menurelatorioclientes.add(RelClientes);

        cadastrarfuncao2.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        cadastrarfuncao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produto.png"))); // NOI18N
        cadastrarfuncao2.setText("Controle de Estoque");
        cadastrarfuncao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarfuncao2MouseClicked(evt);
            }
        });
        cadastrarfuncao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarfuncao2ActionPerformed(evt);
            }
        });
        menurelatorioclientes.add(cadastrarfuncao2);

        RelAniversariantes.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        RelAniversariantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/aniversario.png"))); // NOI18N
        RelAniversariantes.setText("Aniversariantes");
        RelAniversariantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelAniversariantesMouseClicked(evt);
            }
        });
        RelAniversariantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelAniversariantesActionPerformed(evt);
            }
        });
        menurelatorioclientes.add(RelAniversariantes);

        RelEquipamentos.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        RelEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/equipamentos.png"))); // NOI18N
        RelEquipamentos.setText("Equipamentos");
        RelEquipamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelEquipamentosMouseClicked(evt);
            }
        });
        RelEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelEquipamentosActionPerformed(evt);
            }
        });
        menurelatorioclientes.add(RelEquipamentos);

        RelServicosXprofissional.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        RelServicosXprofissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        RelServicosXprofissional.setText("Serviços X Profissional (Mês)");
        RelServicosXprofissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelServicosXprofissionalMouseClicked(evt);
            }
        });
        RelServicosXprofissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelServicosXprofissionalActionPerformed(evt);
            }
        });
        menurelatorioclientes.add(RelServicosXprofissional);

        LucroXProfissional.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        LucroXProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        LucroXProfissional.setText("Lucro X Profissional (Mês)");
        LucroXProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LucroXProfissionalMouseClicked(evt);
            }
        });
        LucroXProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LucroXProfissionalActionPerformed(evt);
            }
        });
        menurelatorioclientes.add(LucroXProfissional);

        jMenuBar1.add(menurelatorioclientes);

        menusair.setBackground(new java.awt.Color(153, 0, 0));
        menusair.setForeground(new java.awt.Color(255, 255, 255));
        menusair.setText("|     SAIR     |");
        menusair.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        menusair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusairActionPerformed(evt);
            }
        });
        menusair.add(jSeparator7);
        menusair.add(jSeparator8);

        exit.setBackground(new java.awt.Color(153, 0, 0));
        exit.setFont(new java.awt.Font("AR ESSENCE", 0, 24)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menusair.add(exit);

        jMenuBar1.add(menusair);

        setJMenuBar(jMenuBar1);

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

    private void cadastrarfuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarfuncaoActionPerformed

        new guiFuncao().setVisible(true);
        
                // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarfuncaoActionPerformed

    private void cadastrarfuncaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarfuncaoMouseClicked
     
    }//GEN-LAST:event_cadastrarfuncaoMouseClicked

    private void cadastrarservicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarservicoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarservicoMouseClicked

    private void cadastrarservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarservicoActionPerformed

        new guiServico().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarservicoActionPerformed

    private void cadastrarprofissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarprofissionalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarprofissionalMouseClicked

    private void cadastrarprofissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarprofissionalActionPerformed

        new guiProfissional().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarprofissionalActionPerformed

    private void cadastrarclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarclienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarclienteMouseClicked

    private void cadastrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarclienteActionPerformed

        new guiClientenovo().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarclienteActionPerformed

    private void MenuAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAgendarActionPerformed

        new guiAgendamentoNovo().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAgendarActionPerformed

    private void cadastrarcliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarcliente1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarcliente1MouseClicked

    private void cadastrarcliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarcliente1ActionPerformed
        new guiFornecedor().setVisible(true);
    }//GEN-LAST:event_cadastrarcliente1ActionPerformed

    private void cadastrarcliente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarcliente2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarcliente2MouseClicked

    private void cadastrarcliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarcliente2ActionPerformed
        new guiProduto().setVisible(true);
    }//GEN-LAST:event_cadastrarcliente2ActionPerformed

    private void cadastrarcliente3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarcliente3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarcliente3MouseClicked

    private void cadastrarcliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarcliente3ActionPerformed
        new guiEquipamento().setVisible(true);
    }//GEN-LAST:event_cadastrarcliente3ActionPerformed

    private void RelClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelClientesMouseClicked
         
// TODO add your handling code here:
    }//GEN-LAST:event_RelClientesMouseClicked

    private void RelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelClientesActionPerformed
 try{
            conecta.executaSQL("SELECT * FROM\n" +
"     clientenovo\n" +
"ORDER BY\n" +
"     clientenovo.\"nome\"");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("C:\\Users\\Peterson\\Dropbox\\Faculdade\\2014 - 01\\Desenvolvimento II\\Sistema Salão de Beleza\\salao.beleza-05-05-14\\salao.beleza\\src\\Relatórios/RelatorioClientes.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer (jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
        }
      
       // new abrirRelatorioCliente().abrirRelatorioClientes();
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_RelClientesActionPerformed

    private void cadastrarfuncao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarfuncao2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarfuncao2MouseClicked

    private void cadastrarfuncao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarfuncao2ActionPerformed
        new guiControleEstoque().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarfuncao2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    this.setBackground(Color.WHITE);
      
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void RelAniversariantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelAniversariantesMouseClicked
       
        // TODO add your handling code here:
    }//GEN-LAST:event_RelAniversariantesMouseClicked

    private void RelAniversariantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelAniversariantesActionPerformed
        
        new Aniversarios().setVisible(true);
        /*
        try{
            conecta.executaSQL("select * from clientenovo");
            System.out.println("PASSOU CONECTA");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("C:\\Users\\Peterson\\Dropbox\\Faculdade\\2014 - 01\\Desenvolvimento II\\Sistema Salão de Beleza\\salao.beleza-05-05-14\\salao.beleza\\src\\Relatórios/RelatorioAniversariantes.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer (jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
        }*/// TODO add your handling code here:
    }//GEN-LAST:event_RelAniversariantesActionPerformed

    private void MenuAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtendimentoActionPerformed

        new guiAtendimentonovo().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAtendimentoActionPerformed

    private void cadastrarpromocaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarpromocaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarpromocaoMouseClicked

    private void cadastrarpromocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarpromocaoActionPerformed

        new guiPromocao().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_cadastrarpromocaoActionPerformed

    private void RelServicosXprofissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelServicosXprofissionalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RelServicosXprofissionalMouseClicked

    private void RelServicosXprofissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelServicosXprofissionalActionPerformed

           
        Date datai = null, dataf = null;
        
        try {
           //   datai = convertUtilDateToSqlDate(JOptionPane.showInputDialog("Digite a Data Inicial:" ));
           //   dataf = convertUtilDateToSqlDate(JOptionPane.showInputDialog("Digite a Data Final:" ));
            
           // datai = formataData(JOptionPane.showInputDialog("Digite a Data Inicial:" ));
           // dataf = formataData(JOptionPane.showInputDialog("Digite a Data Final:" ));
       
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       // System.out.println("data ini = "+ datai);
       // System.out.println("data fim = " + dataf);
        
        
        try{
             datai = convertUtilDateToSqlDate(JOptionPane.showInputDialog("Digite a Data Inicial:" ));
             dataf = convertUtilDateToSqlDate(JOptionPane.showInputDialog("Digite a Data Final:" ));
            conecta.executaSQL("SELECT\n" +
"     profissional.\"nome\" AS nome_profissional,\n" +
"     atendimento.\"dataatendimento\" AS atendimento_dataatendimento,\n" +
"     serviconovo.\"descricao\" AS servico\n" +
"FROM\n" +
"     \"atendimento\" atendimento,\n" +
"     \"serviconovo\" serviconovo,\n" +
"     \"profissional\" profissional\n" + 
"WHERE\n" +
"    atendimento.dataatendimento BETWEEN " + datai + " AND " + dataf + "\n" +
"ORDER BY\n" +
"     atendimento.\"dataatendimento\" ASC,\n" +
"     profissional.\"nome\" ASC");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs);
           // Map parametros = new HashMap(); 
          //  parametros.put("DATA_INICIO","to_date("+19/06/2014+",'DD/MM/YYYY')");    
           // parametros.put("DATA_FIM","to_date("+23/06/2014+",'DD/MM/YYYY')");   
            JasperPrint jpPrint = JasperFillManager.fillReport("C:\\Users\\Peterson\\Dropbox\\Faculdade\\2014 - 01\\Desenvolvimento II\\Sistema Salão de Beleza\\salao.beleza-05-05-14\\salao.beleza\\src\\Relatórios/ServicoXMes.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer (jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
        } catch (Exception ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("data ini = "+ datai);
        System.out.println("data fim = " + dataf);
        
// TODO add your handling code here:
    }//GEN-LAST:event_RelServicosXprofissionalActionPerformed

    private void RelEquipamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelEquipamentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RelEquipamentosMouseClicked

    private void RelEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelEquipamentosActionPerformed
 try{
            conecta.executaSQL("SELECT\n" +
"     equipamento.\"descricao\" AS nome,\n" +
"     equipamento.\"data_utilizacao\" AS equipamento_data_utilizacao\n" +
"FROM\n" +
"     \"equipamento\" equipamento\n" +
"ORDER BY\n" +
"     equipamento.\"descricao\" ASC");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("C:\\Users\\Peterson\\Dropbox\\Faculdade\\2014 - 01\\Desenvolvimento II\\Sistema Salão de Beleza\\salao.beleza-05-05-14\\salao.beleza\\src\\Relatórios/RelatorioEquipamento.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer (jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_RelEquipamentosActionPerformed
public static Date formataData(String data) throws Exception {   
        if (data == null || data.equals(""))  
            return null;  
          
        Date date = null;  
        try {  
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            date =  new java.sql.Date( ((java.util.Date)formatter.parse(data)).getTime());   
        } catch (ParseException e) {              
            throw e;  
        }  
        return date;  
    }  

public java.sql.Date convertUtilDateToSqlDate( String str) {

    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    java.util.Date dataUtil = new java.util.Date();
    try { dataUtil = df.parse( str ); 
    } catch (ParseException ex) {
} 
    java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());

return dataSql; } 
    
    
    private void LucroXProfissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LucroXProfissionalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LucroXProfissionalMouseClicked

    private void LucroXProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LucroXProfissionalActionPerformed
 try{
            conecta.executaSQL("SELECT\n" +
"  SUM (atendimento.total) AS total,\n" + 
"  atendimento.profissional_id\n" +
"\n" +
"FROM\n" +
"  atendimento,\n" +
"  profissional\n" +
"\n" +
"WHERE\n" +
"extract(month from atendimento.dataatendimento) = " + (JOptionPane.showInputDialog("Digite o mês:" ))+
"\n" +
"GROUP BY\n" +
"  atendimento.profissional_id\n" +
"\n" +
"ORDER BY\n" +
"  atendimento.profissional_id ASC");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conecta.rs);
           // Map parametros = new HashMap();
           // parametros.put("$P{MES}", 8);  
            JasperPrint jpPrint;
            jpPrint = JasperFillManager.fillReport("C:\\Users\\Peterson\\Dropbox\\Faculdade\\2014 - 01\\Desenvolvimento II\\Sistema Salão de Beleza\\salao.beleza-05-05-14\\salao.beleza\\src\\Relatórios/LucroXProfissionalXMes.jasper", new HashMap(), relatResul);
            JasperViewer jv = new JasperViewer (jpPrint,false);
            jv.setVisible(true);
            jv.toFront();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatorio!\nErro:" + ex);
        }
        

    }//GEN-LAST:event_LucroXProfissionalActionPerformed

    private void menusairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusairActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_menusairActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
                JOptionPane.showMessageDialog(null,"ATENÇÃO:\n PRODUTOS COM ESTOQUE MÍNIMO\n" + (List) new produtoJpaController().checarestoque());
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem LucroXProfissional;
    private javax.swing.JMenuItem MenuAgendar;
    private javax.swing.JMenuItem MenuAtendimento;
    private javax.swing.JMenuItem RelAniversariantes;
    private javax.swing.JMenuItem RelClientes;
    private javax.swing.JMenuItem RelEquipamentos;
    private javax.swing.JMenuItem RelServicosXprofissional;
    private javax.swing.JMenuItem cadastrarcliente;
    private javax.swing.JMenuItem cadastrarcliente1;
    private javax.swing.JMenuItem cadastrarcliente2;
    private javax.swing.JMenuItem cadastrarcliente3;
    private javax.swing.JMenuItem cadastrarfuncao;
    private javax.swing.JMenuItem cadastrarfuncao2;
    private javax.swing.JMenuItem cadastrarprofissional;
    private javax.swing.JMenuItem cadastrarpromocao;
    private javax.swing.JMenuItem cadastrarservico;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JMenu menuAgendamento;
    private javax.swing.JMenu menuatendimento;
    private javax.swing.JMenu menucadastros;
    private javax.swing.JMenu menurelatorioclientes;
    private javax.swing.JMenu menusair;
    // End of variables declaration//GEN-END:variables
}
