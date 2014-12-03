/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ws.prak.auf5;

/**
 *
 * @author NetGhost03
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jDatei = new javax.swing.JMenu();
        jBeenden = new javax.swing.JMenuItem();
        jBearbeiten = new javax.swing.JMenu();
        jWein = new javax.swing.JMenu();
        jWeinAufnehmen = new javax.swing.JMenuItem();
        jWeinAendern = new javax.swing.JMenuItem();
        jWeinLoeschen = new javax.swing.JMenuItem();
        jHelp = new javax.swing.JMenu();
        jInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDatei.setMnemonic('D');
        jDatei.setText("Datei");

        jBeenden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jBeenden.setMnemonic('B');
        jBeenden.setText("Beenden");
        jDatei.add(jBeenden);

        jMenuBar1.add(jDatei);

        jBearbeiten.setMnemonic('B');
        jBearbeiten.setText("Bearbeiten");
        jMenuBar1.add(jBearbeiten);

        jWein.setMnemonic('W');
        jWein.setText("Wein");

        jWeinAufnehmen.setMnemonic('A');
        jWeinAufnehmen.setText("Aufnehmen");
        jWein.add(jWeinAufnehmen);

        jWeinAendern.setMnemonic('n');
        jWeinAendern.setText("Ändern");
        jWein.add(jWeinAendern);

        jWeinLoeschen.setMnemonic('L');
        jWeinLoeschen.setText("Löschen");
        jWein.add(jWeinLoeschen);

        jMenuBar1.add(jWein);

        jHelp.setMnemonic('?');
        jHelp.setText("?");
        jHelp.setToolTipText("");

        jInfo.setMnemonic('I');
        jInfo.setText("Info");
        jInfo.setToolTipText("");
        jHelp.add(jInfo);

        jMenuBar1.add(jHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jBearbeiten;
    private javax.swing.JMenuItem jBeenden;
    private javax.swing.JMenu jDatei;
    private javax.swing.JMenu jHelp;
    private javax.swing.JMenuItem jInfo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jWein;
    private javax.swing.JMenuItem jWeinAendern;
    private javax.swing.JMenuItem jWeinAufnehmen;
    private javax.swing.JMenuItem jWeinLoeschen;
    // End of variables declaration//GEN-END:variables
}