/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.awt.Toolkit;

/**
 *
 * @author abdal
 */
public class QuadraticEquation extends javax.swing.JFrame {

    /**
     * Creates new form QuadraticEquation
     */
    public QuadraticEquation() {
        imageIcon();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEqualz = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jTextFieldSquareX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabelNotfound = new javax.swing.JLabel();
        jTextFieldX = new javax.swing.JTextField();
        jTextFieldConstant = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEqual1 = new javax.swing.JTextField();
        jTextFieldEqual2 = new javax.swing.JTextField();
        jButtonCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 182, 26));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quadratic Equation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 182, 26));
        jLabel2.setText("X^2      +");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 182, 26));
        jLabel3.setText("X          +");

        jTextFieldEqualz.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEqualz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEqualzActionPerformed(evt);
            }
        });
        jTextFieldEqualz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEqualzKeyPressed(evt);
            }
        });

        jButtonBack.setText("Back <=");
        jButtonBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextFieldSquareX.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldSquareX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSquareXActionPerformed(evt);
            }
        });
        jTextFieldSquareX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSquareXKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNotfound.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabelNotfound.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNotfound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextFieldX.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldXActionPerformed(evt);
            }
        });
        jTextFieldX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldXKeyPressed(evt);
            }
        });

        jTextFieldConstant.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldConstant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConstantActionPerformed(evt);
            }
        });
        jTextFieldConstant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldConstantKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 182, 26));
        jLabel5.setText("=");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 182, 26));
        jLabel6.setText("X 2       =");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 182, 26));
        jLabel7.setText("X 1       =");

        jTextFieldEqual1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEqual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEqual1ActionPerformed(evt);
            }
        });
        jTextFieldEqual1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEqual1KeyPressed(evt);
            }
        });

        jTextFieldEqual2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldEqual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEqual2ActionPerformed(evt);
            }
        });
        jTextFieldEqual2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEqual2KeyPressed(evt);
            }
        });

        jButtonCalculate.setText("Calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSquareX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabelNotfound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldConstant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEqualz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEqual2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEqualz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSquareX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldConstant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCalculate)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEqual2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNotfound, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEqualzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEqualzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEqualzActionPerformed

    private void jTextFieldEqualzKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEqualzKeyPressed
        jTextFieldEqualz.setEditable(false);
    }//GEN-LAST:event_jTextFieldEqualzKeyPressed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        welcome_page wp = new welcome_page();
        wp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldSquareXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSquareXActionPerformed

    }//GEN-LAST:event_jTextFieldSquareXActionPerformed

    private void jTextFieldSquareXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSquareXKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldSquareX.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldSquareX.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldSquareXKeyPressed

    private void jTextFieldXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldXActionPerformed

    private void jTextFieldXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldXKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldX.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldX.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldXKeyPressed

    private void jTextFieldConstantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConstantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConstantActionPerformed

    private void jTextFieldConstantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConstantKeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldConstant.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldConstant.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldConstantKeyPressed

    private void jTextFieldEqual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEqual1ActionPerformed
        
    }//GEN-LAST:event_jTextFieldEqual1ActionPerformed

    private void jTextFieldEqual1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEqual1KeyPressed
        jTextFieldEqual1.setEditable(false);
    }//GEN-LAST:event_jTextFieldEqual1KeyPressed

    private void jTextFieldEqual2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEqual2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEqual2ActionPerformed

    private void jTextFieldEqual2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEqual2KeyPressed
        jTextFieldEqual2.setEditable(false);
    }//GEN-LAST:event_jTextFieldEqual2KeyPressed

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        double a = Double.parseDouble(jTextFieldSquareX.getText()); 
        double b = Double.parseDouble(jTextFieldX.getText()); 
        double c = Double.parseDouble(jTextFieldConstant.getText()); 
         
        Quadratic Qu = new Quadratic();
        double x1=Qu.Quadraticx1(a, b, c);
        double x2=Qu.Quadraticx2(a, b, c);
        jTextFieldEqual1.setText(Double.toString(x1));
        jTextFieldEqual2.setText(Double.toString(x2));
    }//GEN-LAST:event_jButtonCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuadraticEquation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuadraticEquation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNotfound;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextFieldConstant;
    private javax.swing.JTextField jTextFieldEqual1;
    private javax.swing.JTextField jTextFieldEqual2;
    public static javax.swing.JTextField jTextFieldEqualz;
    public static javax.swing.JTextField jTextFieldSquareX;
    public static javax.swing.JTextField jTextFieldX;
    // End of variables declaration//GEN-END:variables
private void imageIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

}
