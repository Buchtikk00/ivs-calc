/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcLayout;

/**
 * Description: Main class for Calc UI
 * @author Michael Švasta, xsvast00@stud.fit.vutbr.cz
 */
public class Calc extends javax.swing.JFrame {

    /**
     * Creates new form Calc
     */
    public Calc() {
        initComponents();
        btn_7.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_display = new javax.swing.JLabel();
        pnl_keyboard = new javax.swing.JPanel();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_point = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_neg = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_exp = new javax.swing.JButton();
        btn_sqrt = new javax.swing.JButton();
        btn_fac = new javax.swing.JButton();
        btn_pi = new javax.swing.JButton();
        btn_abs = new javax.swing.JButton();
        bar_mainMenu = new javax.swing.JMenuBar();
        btn_edit = new javax.swing.JMenu();
        btn_mode = new javax.swing.JMenu();
        btn_help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulačka v0.1");
        setResizable(false);

        lbl_display.setBackground(new java.awt.Color(193, 224, 224));
        lbl_display.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lbl_display.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_display.setText("0123456789");
        lbl_display.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl_display.setOpaque(true);

        btn_0.setText("0");
        btn_0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_0.setNextFocusableComponent(btn_point);

        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_1.setNextFocusableComponent(btn_2);

        btn_2.setText("2");
        btn_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_2.setNextFocusableComponent(btn_3);

        btn_3.setText("3");
        btn_3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_3.setNextFocusableComponent(btn_0);

        btn_4.setText("4");
        btn_4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_4.setNextFocusableComponent(btn_5);

        btn_5.setText("5");
        btn_5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_5.setNextFocusableComponent(btn_6);

        btn_6.setText("6");
        btn_6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_6.setNextFocusableComponent(btn_1);

        btn_7.setText("7");
        btn_7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_7.setNextFocusableComponent(btn_8);

        btn_8.setText("8");
        btn_8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_8.setNextFocusableComponent(btn_9);

        btn_9.setText("9");
        btn_9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_9.setNextFocusableComponent(btn_4);

        btn_point.setText(",");
        btn_point.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_point.setNextFocusableComponent(btn_neg);

        btn_mul.setText("×");
        btn_mul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mul.setNextFocusableComponent(btn_div);

        btn_div.setText("÷");
        btn_div.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_div.setNextFocusableComponent(btn_add);

        btn_sub.setText("−");
        btn_sub.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_sub.setNextFocusableComponent(btn_equal);

        btn_add.setText("+");
        btn_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_add.setNextFocusableComponent(btn_sub);

        btn_neg.setText("+/-");
        btn_neg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_neg.setNextFocusableComponent(btn_back);

        btn_equal.setText("=");
        btn_equal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_equal.setNextFocusableComponent(btn_exp);

        btn_clear.setText("C");
        btn_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_clear.setNextFocusableComponent(btn_mul);

        btn_back.setText("←");
        btn_back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_back.setNextFocusableComponent(btn_clear);

        btn_exp.setText("xʸ");
        btn_exp.setToolTipText("umocnění x na y");
        btn_exp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_exp.setNextFocusableComponent(btn_sqrt);

        btn_sqrt.setText("√x");
        btn_sqrt.setToolTipText("Druhá odmocnina x");
        btn_sqrt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_sqrt.setNextFocusableComponent(btn_fac);

        btn_fac.setText("n!");
        btn_fac.setToolTipText("Faktoriál n");
        btn_fac.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_fac.setNextFocusableComponent(btn_abs);

        btn_pi.setText("π");
        btn_pi.setToolTipText("Pí");
        btn_pi.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pi.setNextFocusableComponent(btn_7);

        btn_abs.setText("|x|");
        btn_abs.setToolTipText("Absolutní hodnota x");
        btn_abs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_abs.setNextFocusableComponent(btn_pi);

        javax.swing.GroupLayout pnl_keyboardLayout = new javax.swing.GroupLayout(pnl_keyboard);
        pnl_keyboard.setLayout(pnl_keyboardLayout);
        pnl_keyboardLayout.setHorizontalGroup(
            pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_keyboardLayout.createSequentialGroup()
                        .addComponent(btn_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_abs, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_keyboardLayout.createSequentialGroup()
                        .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_keyboardLayout.createSequentialGroup()
                        .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_point, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        pnl_keyboardLayout.setVerticalGroup(
            pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_keyboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_abs, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_keyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_point, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_neg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_edit.setText("Úpravy");
        bar_mainMenu.add(btn_edit);

        btn_mode.setText("Režim");
        bar_mainMenu.add(btn_mode);

        btn_help.setText("Nápověda");
        bar_mainMenu.add(btn_help);

        setJMenuBar(bar_mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_keyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_display, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_keyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bar_mainMenu;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_abs;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_div;
    private javax.swing.JMenu btn_edit;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_fac;
    private javax.swing.JMenu btn_help;
    private javax.swing.JMenu btn_mode;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_neg;
    private javax.swing.JButton btn_pi;
    private javax.swing.JButton btn_point;
    private javax.swing.JButton btn_sqrt;
    private javax.swing.JButton btn_sub;
    private javax.swing.JLabel lbl_display;
    private javax.swing.JPanel pnl_keyboard;
    // End of variables declaration//GEN-END:variables
}
