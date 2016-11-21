package br.com.uniderp.telas;

import br.com.uniderp.dao.ModuloDeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaRemoverAluno extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private void remove() {
        String sql = "delete from tbl_aluno where ra = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(txt_remover_ra.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso", "confirmação", 2);
            pst.close();
            txt_remover_ra.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar " + e + " ", "confirmação", 2);

        }
    }

    private void pesquisarPorRa() {
        String sql = "select nome from tbl_aluno where ra =?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(txt_findRa.getText()));
            pst.execute();
            if (rs.next()) {
                lbl_aluno.setText(rs.getString(3));
                txt_findRa.setText(null);
            }
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado", "confirmação", 2);
            txt_findRa.setText(null);

        }
    }

    public TelaRemoverAluno() {
        initComponents();
        conexao = ModuloDeConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_remover_ra = new javax.swing.JTextField();
        btn_cancela = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        lbl_pesquisa = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_findRa = new javax.swing.JTextField();
        btn_find = new javax.swing.JButton();
        lbl_aluno = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Remover alunos");

        jLabel2.setText("Ra ");

        txt_remover_ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_remover_raActionPerformed(evt);
            }
        });

        btn_cancela.setText("Cancelar");
        btn_cancela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelaMouseClicked(evt);
            }
        });
        btn_cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelaActionPerformed(evt);
            }
        });

        btn_remove.setText("Remover");
        btn_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeMouseClicked(evt);
            }
        });
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        lbl_pesquisa.setText("Pesquisar por RA:");

        jLabel4.setText("Remover Aluno");

        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uniderp/icons/find.png"))); // NOI18N
        btn_find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_findMouseClicked(evt);
            }
        });
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        lbl_aluno.setText("Aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_findRa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_find))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btn_cancela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_remove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_remover_ra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(lbl_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_findRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_find))
                .addGap(18, 18, 18)
                .addComponent(lbl_aluno)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_remover_ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancela)
                    .addComponent(btn_remove))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelaActionPerformed
        // btn_canela
        dispose();
    }//GEN-LAST:event_btn_cancelaActionPerformed

    private void btn_cancelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelaMouseClicked
        dispose();
    }//GEN-LAST:event_btn_cancelaMouseClicked

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover aluno?", "Ação "
                + "não pode ser desfeita", 2);
        if (opc == JOptionPane.YES_OPTION) {
            remove();
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeMouseClicked
        // TODO add your handling code here:
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover aluno?", "Ação "
                + "não pode ser desfeita", 2);
        if (opc == JOptionPane.YES_OPTION) {
            remove();
        }
    }//GEN-LAST:event_btn_removeMouseClicked

    private void txt_remover_raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_remover_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_remover_raActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // pesquisar por ra
        pesquisarPorRa();
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_findMouseClicked
        // pesquisar por ra
        pesquisarPorRa();
    }//GEN-LAST:event_btn_findMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancela;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_aluno;
    private javax.swing.JLabel lbl_pesquisa;
    private javax.swing.JTextField txt_findRa;
    private javax.swing.JTextField txt_remover_ra;
    // End of variables declaration//GEN-END:variables
}
