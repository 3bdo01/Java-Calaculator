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
public class TwoMultiplication extends javax.swing.JFrame {

    /**
     * Creates new form TwoMultiplication
     */
    public TwoMultiplication() {
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
        jTextFieldColumns2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldColumns1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldColumns6 = new javax.swing.JTextField();
        jTextFieldColumns5 = new javax.swing.JTextField();
        jTextFieldColumns7 = new javax.swing.JTextField();
        jTextFieldColumns8 = new javax.swing.JTextField();
        jTextFieldColumns4 = new javax.swing.JTextField();
        jTextFieldColumns3 = new javax.swing.JTextField();
        jTextFieldColumnsResult1 = new javax.swing.JTextField();
        jTextFieldColumnsResult2 = new javax.swing.JTextField();
        jTextFieldColumnsResult4 = new javax.swing.JTextField();
        jTextFieldColumnsResult3 = new javax.swing.JTextField();
        jButtonResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 182, 26));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Your Dimension");

        jLabel2.setForeground(new java.awt.Color(255, 182, 26));
        jLabel2.setText("Matrix1");

        jLabel3.setForeground(new java.awt.Color(255, 182, 26));
        jLabel3.setText("Matrix2");

        jTextFieldColumns2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns2ActionPerformed(evt);
            }
        });
        jTextFieldColumns2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns2KeyPressed(evt);
            }
        });

        jButton1.setText("main page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back <=");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldColumns1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns1ActionPerformed(evt);
            }
        });
        jTextFieldColumns1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns1KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextFieldColumns6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns6ActionPerformed(evt);
            }
        });
        jTextFieldColumns6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns6KeyPressed(evt);
            }
        });

        jTextFieldColumns5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns5ActionPerformed(evt);
            }
        });
        jTextFieldColumns5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns5KeyPressed(evt);
            }
        });

        jTextFieldColumns7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns7ActionPerformed(evt);
            }
        });
        jTextFieldColumns7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns7KeyPressed(evt);
            }
        });

        jTextFieldColumns8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns8ActionPerformed(evt);
            }
        });
        jTextFieldColumns8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns8KeyPressed(evt);
            }
        });

        jTextFieldColumns4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns4ActionPerformed(evt);
            }
        });
        jTextFieldColumns4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns4KeyPressed(evt);
            }
        });

        jTextFieldColumns3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumns3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumns3ActionPerformed(evt);
            }
        });
        jTextFieldColumns3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumns3KeyPressed(evt);
            }
        });

        jTextFieldColumnsResult1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumnsResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnsResult1ActionPerformed(evt);
            }
        });
        jTextFieldColumnsResult1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumnsResult1KeyPressed(evt);
            }
        });

        jTextFieldColumnsResult2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumnsResult2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnsResult2ActionPerformed(evt);
            }
        });
        jTextFieldColumnsResult2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumnsResult2KeyPressed(evt);
            }
        });

        jTextFieldColumnsResult4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumnsResult4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnsResult4ActionPerformed(evt);
            }
        });
        jTextFieldColumnsResult4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumnsResult4KeyPressed(evt);
            }
        });

        jTextFieldColumnsResult3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldColumnsResult3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnsResult3ActionPerformed(evt);
            }
        });
        jTextFieldColumnsResult3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldColumnsResult3KeyPressed(evt);
            }
        });

        jButtonResult.setText("Result");
        jButtonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButton1))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldColumns1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldColumns2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldColumns3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldColumns4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldColumns5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldColumns7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldColumns6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldColumns8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldColumnsResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldColumnsResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldColumnsResult3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldColumnsResult4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldColumns5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumns1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumns2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumns6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldColumns7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumns3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumns4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumns8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonResult)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldColumnsResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumnsResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldColumnsResult3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldColumnsResult4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldColumns2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns2ActionPerformed
        int t2 = Integer.parseInt(jTextFieldColumns2.getText());

    }//GEN-LAST:event_jTextFieldColumns2ActionPerformed

    private void jTextFieldColumns2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns2KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns2.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns2.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns2KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        welcome_page wp = new welcome_page();
        wp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EnterArrayFirst a1 = new EnterArrayFirst();
        a1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldColumns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns1ActionPerformed

        int t1 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns1ActionPerformed

    private void jTextFieldColumns1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns1KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns1.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns1.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns1KeyPressed

    private void jTextFieldColumns6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns6ActionPerformed
        int t6 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns6ActionPerformed

    private void jTextFieldColumns6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns6KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns6.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns6.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns6KeyPressed

    private void jTextFieldColumns5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns5ActionPerformed
        int t5 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns5ActionPerformed

    private void jTextFieldColumns5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns5KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns5.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns5.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns5KeyPressed

    private void jTextFieldColumns7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns7ActionPerformed
        int t7 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns7ActionPerformed

    private void jTextFieldColumns7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns7KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns7.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns7.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns7KeyPressed

    private void jTextFieldColumns8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns8ActionPerformed
        int t8 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns8ActionPerformed

    private void jTextFieldColumns8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns8KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns8.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns8.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns8KeyPressed

    private void jTextFieldColumns4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns4ActionPerformed
        int t4 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns4ActionPerformed

    private void jTextFieldColumns4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns4KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns4.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns4.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns4KeyPressed

    private void jTextFieldColumns3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumns3ActionPerformed
        int t3 = Integer.parseInt(jTextFieldColumns2.getText());
    }//GEN-LAST:event_jTextFieldColumns3ActionPerformed

    private void jTextFieldColumns3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumns3KeyPressed
        char c = evt.getKeyChar();
        if (Character.isLetter(c)){
            jTextFieldColumns3.setEditable(false);
            jLabel4.setText("Please Enter Numbers only !");
        }else{
            jTextFieldColumns3.setEditable(true);
        }
    }//GEN-LAST:event_jTextFieldColumns3KeyPressed

    private void jTextFieldColumnsResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult1ActionPerformed

    }//GEN-LAST:event_jTextFieldColumnsResult1ActionPerformed

    private void jTextFieldColumnsResult1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult1KeyPressed
        jTextFieldColumnsResult1.setEditable(false);
    }//GEN-LAST:event_jTextFieldColumnsResult1KeyPressed

    private void jTextFieldColumnsResult2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColumnsResult2ActionPerformed

    private void jTextFieldColumnsResult2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult2KeyPressed
        jTextFieldColumnsResult2.setEditable(false);
    }//GEN-LAST:event_jTextFieldColumnsResult2KeyPressed

    private void jTextFieldColumnsResult4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColumnsResult4ActionPerformed

    private void jTextFieldColumnsResult4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult4KeyPressed
        jTextFieldColumnsResult4.setEditable(false);
    }//GEN-LAST:event_jTextFieldColumnsResult4KeyPressed

    private void jTextFieldColumnsResult3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColumnsResult3ActionPerformed

    private void jTextFieldColumnsResult3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldColumnsResult3KeyPressed
        jTextFieldColumnsResult3.setEditable(false);
    }//GEN-LAST:event_jTextFieldColumnsResult3KeyPressed

    private void jButtonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultActionPerformed
        int a = Integer.parseInt(jTextFieldColumns1.getText());
        int b = Integer.parseInt(jTextFieldColumns2.getText());
        int c1 = Integer.parseInt(jTextFieldColumns3.getText());
        int d = Integer.parseInt(jTextFieldColumns4.getText());
        int e = Integer.parseInt(jTextFieldColumns5.getText());
        int f = Integer.parseInt(jTextFieldColumns6.getText());
        int g = Integer.parseInt(jTextFieldColumns7.getText());
        int h = Integer.parseInt(jTextFieldColumns8.getText());

        int a1 = (a*e)+(b*g);
        int a2 = (a*f) + (b*h);
        int a3 = (c1*e) + (d*g);
        int a4 = (c1*f) + (d*h);
        //        int r;
        //        int c;
        //        r =Integer.parseInt(EnterArrayFirst.jTextFieldRows.getText());
        //        c =Integer.parseInt(EnterArrayFirst.jTextFieldColumnn.getText());
        //        int[][]x = new int [r][c];
        //        int[][]y = new int [r][c];
        //        int[][]z;
        //        z = new int [r][c];
        jTextFieldColumnsResult1.setText(a1+"");
        jTextFieldColumnsResult2.setText(a2+"");
        jTextFieldColumnsResult3.setText(a3+"");
        jTextFieldColumnsResult4.setText(a4+"");

        //        ArrayOpertion ar = new ArrayOpertion();
        //        ar.Addarray(x, y);
    }//GEN-LAST:event_jButtonResultActionPerformed

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
            java.util.logging.Logger.getLogger(TwoMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TwoMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TwoMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TwoMultiplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TwoMultiplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButtonResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextFieldColumns1;
    public static javax.swing.JTextField jTextFieldColumns2;
    public static javax.swing.JTextField jTextFieldColumns3;
    public static javax.swing.JTextField jTextFieldColumns4;
    public static javax.swing.JTextField jTextFieldColumns5;
    public static javax.swing.JTextField jTextFieldColumns6;
    public static javax.swing.JTextField jTextFieldColumns7;
    public static javax.swing.JTextField jTextFieldColumns8;
    public static javax.swing.JTextField jTextFieldColumnsResult1;
    public static javax.swing.JTextField jTextFieldColumnsResult2;
    public static javax.swing.JTextField jTextFieldColumnsResult3;
    public static javax.swing.JTextField jTextFieldColumnsResult4;
    // End of variables declaration//GEN-END:variables
    private void imageIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
