package Simulation;

import javax.swing.JOptionPane;

public class StartWindow extends javax.swing.JFrame {

    /**
     * Creates new form StartSimulationWindow
     */
    public StartWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private Controller simulationController;
    
    public void setController(Controller simulationController){
        this.simulationController = simulationController;
    }


/**
 * This method is called from within the constructor to initialize the form.
 * WARNING: Do NOT modify this code. The content of this method is always
 * regenerated by the Form Editor.
 */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonSetConfig = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("DBMS Simulation ");

        jButtonSetConfig.setText("Set simulation parameters");
        jButtonSetConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetConfigActionPerformed(evt);
            }
        });

        jButton1.setText("Start simulation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("See the current parameters");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSetConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButtonSetConfig)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Set simulation parameters button
    private void jButtonSetConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetConfigActionPerformed
        SetConfigWindow configWindow = new SetConfigWindow();
        configWindow.setPreviousWindow(this);
        configWindow.setController(simulationController);
        configWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSetConfigActionPerformed

    //See the current parameters button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (simulationController.getConfigSet()) {
            DisplayConfigWindow currentParams = new DisplayConfigWindow();
            currentParams.setPreviousWindow(this);
            currentParams.setController(simulationController);
            currentParams.setWindowText();
            currentParams.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "The parameters have not been set");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //Start simulation button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(simulationController.getConfigSet()) {
            this.simulationController.startSimulation();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "The parameters have not been set");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    //@param args the command line arguments     
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
            java.util.logging.Logger.getLogger(StartWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSetConfig;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
