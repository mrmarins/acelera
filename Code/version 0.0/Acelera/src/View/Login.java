/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        CaixaSenha = new javax.swing.JPasswordField();
        CaixaUsuario = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        btCriarConta = new javax.swing.JButton();
        btCadastrese = new javax.swing.JButton();
        LabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VivaBem");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaixaSenha.setBorder(null);
        getContentPane().add(CaixaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 120, -1));

        CaixaUsuario.setBorder(null);
        getContentPane().add(CaixaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 120, 20));

        btEntrar.setText("ENTRAR");
        btEntrar.setBorder(null);
        btEntrar.setBorderPainted(false);
        getContentPane().add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 70, 30));

        btCriarConta.setText("CRIAR CONTA");
        btCriarConta.setBorder(null);
        btCriarConta.setBorderPainted(false);
        btCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarContaActionPerformed(evt);
            }
        });
        getContentPane().add(btCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 110, 30));

        btCadastrese.setText("CADASTRE-SE AQUI");
        btCadastrese.setBorderPainted(false);
        btCadastrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastreseActionPerformed(evt);
            }
        });
        getContentPane().add(btCadastrese, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 110, -1));

        LabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Login.png"))); // NOI18N
        LabelLogin.setText("jLabel1");
        LabelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(LabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 0, 1280, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarContaActionPerformed
       CadastroPaciente tela = new CadastroPaciente();
       tela.show();
    }//GEN-LAST:event_btCriarContaActionPerformed

    private void btCadastreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastreseActionPerformed
        CadastroDeProfissionais tela = new CadastroDeProfissionais();
        tela.show();
    }//GEN-LAST:event_btCadastreseActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CaixaSenha;
    private javax.swing.JTextField CaixaUsuario;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JButton btCadastrese;
    private javax.swing.JButton btCriarConta;
    private javax.swing.JButton btEntrar;
    // End of variables declaration//GEN-END:variables
}
