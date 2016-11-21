
package br.com.uniderp.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastrar_aluno = new javax.swing.JMenu();
        menu_remove_aluno = new javax.swing.JMenu();
        menu_relatorio = new javax.swing.JMenu();
        menu_sobre = new javax.swing.JMenu();
        menu_sair = new javax.swing.JMenu();
        menu_sair_confirma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        descktop.setBackground(new java.awt.Color(36, 19, 19));

        jLabel1.setText("Bem vindo ");

        lbl_user.setText("professor");

        lbl_data.setText("data");

        menu_cadastrar_aluno.setText("Cadastrar aluno");
        menu_cadastrar_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_cadastrar_alunoMouseClicked(evt);
            }
        });
        menu_cadastrar_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrar_alunoActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_cadastrar_aluno);

        menu_remove_aluno.setText("Remover aluno");
        menu_remove_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_remove_alunoMouseClicked(evt);
            }
        });
        menu_remove_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_remove_alunoActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_remove_aluno);

        menu_relatorio.setText("Relátorio de notas");
        menu_relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_relatorioMouseClicked(evt);
            }
        });
        menu_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_relatorioActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_relatorio);

        menu_sobre.setText("Sobre");
        menu_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sobreMouseClicked(evt);
            }
        });
        menu_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sobreActionPerformed(evt);
            }
        });
        jMenuBar1.add(menu_sobre);

        menu_sair.setText("Sair");

        menu_sair_confirma.setText("Sair");
        menu_sair_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sair_confirmaActionPerformed(evt);
            }
        });
        menu_sair.add(menu_sair_confirma);

        jMenuBar1.add(menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descktop, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descktop)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_data)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_user)
                .addContainerGap(466, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1043, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_sair_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sair_confirmaActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente sair? ","Atenção"
                + "",JOptionPane.YES_NO_OPTION,1);
        if(opc == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_menu_sair_confirmaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // setando usuario e data
       Date data = new Date();
       DateFormat formataData = DateFormat.getDateInstance(DateFormat.SHORT);
       lbl_data.setText(formataData.format(data));
        
        
        
    }//GEN-LAST:event_formWindowActivated

    private void menu_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sobreActionPerformed
        // tela sobre
        new TelaSobre().setVisible(true);
    }//GEN-LAST:event_menu_sobreActionPerformed

    private void menu_sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobreMouseClicked
        // TODO add your handling code here:
        // tela sobre
        new TelaSobre().setVisible(true);
    }//GEN-LAST:event_menu_sobreMouseClicked

    private void menu_cadastrar_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrar_alunoActionPerformed
        TelaCadastroAlunos cadAluno = new TelaCadastroAlunos();
        cadAluno.setVisible(true);
        descktop.add(cadAluno); 
    }//GEN-LAST:event_menu_cadastrar_alunoActionPerformed

    private void menu_cadastrar_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_cadastrar_alunoMouseClicked
        TelaCadastroAlunos cadAluno = new TelaCadastroAlunos();
        cadAluno.setVisible(true);
        descktop.add(cadAluno); 
    }//GEN-LAST:event_menu_cadastrar_alunoMouseClicked

    private void menu_remove_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_remove_alunoActionPerformed
        // instanciando a tela remover
        TelaRemoverAluno removerAluno = new TelaRemoverAluno();
        removerAluno.setVisible(true);
        descktop.add(removerAluno);
    }//GEN-LAST:event_menu_remove_alunoActionPerformed

    private void menu_remove_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_remove_alunoMouseClicked
       // instanciando a tela remover
        TelaRemoverAluno removerAluno = new TelaRemoverAluno();
        removerAluno.setVisible(true);
        descktop.add(removerAluno);
    }//GEN-LAST:event_menu_remove_alunoMouseClicked

    private void menu_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_relatorioActionPerformed
        TelaFormulario form = new TelaFormulario();
        form.setVisible(true);
        descktop.add(form);
    }//GEN-LAST:event_menu_relatorioActionPerformed

    private void menu_relatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_relatorioMouseClicked
       TelaFormulario form = new TelaFormulario();
        form.setVisible(true);
        descktop.add(form);
    }//GEN-LAST:event_menu_relatorioMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane descktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_data;
    protected static javax.swing.JLabel lbl_user;
    private javax.swing.JMenu menu_cadastrar_aluno;
    private javax.swing.JMenu menu_relatorio;
    private javax.swing.JMenu menu_remove_aluno;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenuItem menu_sair_confirma;
    private javax.swing.JMenu menu_sobre;
    // End of variables declaration//GEN-END:variables
}
