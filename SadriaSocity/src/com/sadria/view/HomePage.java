/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.view;

import com.sadria.Dao.InvestmentSummaryDao;
import com.sadria.Dao.MembersDao;
import com.sadria.Dao.PersonDao;
import com.sadria.Dao.SummaryDao;
import com.sadria.Dao.TranstionDao;
import com.sadria.DaoImp.InvestmentSummaryDaoImp;
import com.sadria.DaoImp.MembersDaoImp;
import com.sadria.DaoImp.PersonDaoImp;
import com.sadria.DaoImp.SummaryDaoImp;
import com.sadria.DaoImp.TranstionDaoImp;
import com.sadria.pojo.Person;
import com.sadria.pojo.Summary;
import com.sadria.pojo.Transtion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form StatementView
     */
    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
        day();
        showTime();
        deposit();
        investment();
        balance();
        totalMember();
        totalProject();

    }

    public void totalMember() {
        MembersDao mDao = new MembersDaoImp();
        int totalMember = mDao.getTotalMember();
        lblTotalMember.setText(totalMember + "");
    }

    public void totalProject() {
        MembersDao mDao = new MembersDaoImp();
        int project = mDao.getProject();
        lblProject.setText(project + "");
    }

    public void deposit() {
        SummaryDao summaryDao = new SummaryDaoImp();
        int totalDeposit = summaryDao.getDeposit();
        lblDeposit.setText(String.valueOf(totalDeposit));

    }

    public void investment() {
        InvestmentSummaryDao isDao = new InvestmentSummaryDaoImp();
        double totalInvestment = isDao.getInvestment();
        lblInvestment.setText(String.valueOf(totalInvestment));
    }

    public void balance() {
        int deposit = Integer.parseInt(lblDeposit.getText());
        double investmetn = Double.parseDouble(lblInvestment.getText());
        double balance = deposit - investmetn;
        lblBalance.setText(String.valueOf(balance));
    }

    public void day() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        lblDate.setText("Date :" + day + ":" + (month + 1) + ":" + year);

    }

    void showTime() {

        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                lblTime.setText(sdf.format(d));
            }
        }).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStatement = new javax.swing.JLabel();
        lblCreateAccount1 = new javax.swing.JLabel();
        lblTranstion = new javax.swing.JLabel();
        lblInvestmentAccount = new javax.swing.JLabel();
        panalstatement = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblDeposit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblInvestment = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblProject = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotalMember = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDate.setBackground(new java.awt.Color(0, 102, 51));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 190, 40));

        lblTime.setBackground(new java.awt.Color(0, 102, 51));
        lblTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 170));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        lblStatement.setBackground(new java.awt.Color(102, 204, 0));
        lblStatement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStatement.setForeground(new java.awt.Color(255, 255, 255));
        lblStatement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_purchase_order_18px.png"))); // NOI18N
        lblStatement.setText("Statement");
        lblStatement.setOpaque(true);
        lblStatement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStatementMouseClicked(evt);
            }
        });

        lblCreateAccount1.setBackground(new java.awt.Color(102, 204, 0));
        lblCreateAccount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateAccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_bank_building_18px.png"))); // NOI18N
        lblCreateAccount1.setText("Saving Account");
        lblCreateAccount1.setOpaque(true);
        lblCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccount1MouseClicked(evt);
            }
        });

        lblTranstion.setBackground(new java.awt.Color(102, 204, 0));
        lblTranstion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTranstion.setForeground(new java.awt.Color(255, 255, 255));
        lblTranstion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTranstion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_play_property_18px_1.png"))); // NOI18N
        lblTranstion.setText("Transtion");
        lblTranstion.setOpaque(true);
        lblTranstion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTranstionMouseClicked(evt);
            }
        });

        lblInvestmentAccount.setBackground(new java.awt.Color(102, 204, 0));
        lblInvestmentAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInvestmentAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblInvestmentAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvestmentAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_key_exchange_18px_2.png"))); // NOI18N
        lblInvestmentAccount.setText("Investment Account");
        lblInvestmentAccount.setOpaque(true);
        lblInvestmentAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInvestmentAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInvestmentAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(lblTranstion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblCreateAccount1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblInvestmentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTranstion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblCreateAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(542, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 172, -1, 610));

        panalstatement.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/iconLogo.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(0, 102, 51));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_deposit_18px.png"))); // NOI18N
        jLabel11.setText("Deposit");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDeposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDeposit.setForeground(new java.awt.Color(255, 255, 255));
        lblDeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeposit.setText("0");

        jLabel9.setBackground(new java.awt.Color(0, 102, 51));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_key_exchange_18px_2.png"))); // NOI18N
        jLabel9.setText("Investment");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblInvestment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInvestment.setForeground(new java.awt.Color(255, 255, 255));
        lblInvestment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvestment.setText("0");

        jLabel12.setBackground(new java.awt.Color(0, 102, 51));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_cash_in_hand_18px.png"))); // NOI18N
        jLabel12.setText("Balance");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(255, 255, 255));
        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBalance.setText("0");

        lblProject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProject.setForeground(new java.awt.Color(255, 255, 255));
        lblProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProject.setText("0");

        jLabel13.setBackground(new java.awt.Color(0, 102, 51));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_project_18px.png"))); // NOI18N
        jLabel13.setText("Projects");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTotalMember.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotalMember.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalMember.setText("0");

        jLabel8.setBackground(new java.awt.Color(0, 102, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_conference_filled_18px_1.png"))); // NOI18N
        jLabel8.setText(" Member");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panalstatementLayout = new javax.swing.GroupLayout(panalstatement);
        panalstatement.setLayout(panalstatementLayout);
        panalstatementLayout.setHorizontalGroup(
            panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panalstatementLayout.createSequentialGroup()
                .addGroup(panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panalstatementLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panalstatementLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panalstatementLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblTotalMember, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblProject, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panalstatementLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panalstatementLayout.setVerticalGroup(
            panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panalstatementLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panalstatementLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalMember, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panalstatement, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 172, 960, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStatementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatementMouseClicked
        this.setVisible(false);
        new CreateSavingACView().setVisible(false);
        new InvestmentView().setVisible(false);
        new Transtionview().setVisible(false);
        new StatementView().setVisible(true);
    }//GEN-LAST:event_lblStatementMouseClicked

    private void lblCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccount1MouseClicked

        this.setVisible(false);
        new CreateSavingACView().setVisible(true);
        new InvestmentView().setVisible(false);
        new Transtionview().setVisible(false);
        new StatementView().setVisible(false);
    }//GEN-LAST:event_lblCreateAccount1MouseClicked

    private void lblTranstionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranstionMouseClicked
        this.setVisible(false);
        new CreateSavingACView().setVisible(false);
        new InvestmentView().setVisible(false);
        new Transtionview().setVisible(true);
        new StatementView().setVisible(false);
    }//GEN-LAST:event_lblTranstionMouseClicked

    private void lblInvestmentAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvestmentAccountMouseClicked
        this.setVisible(false);
        new CreateSavingACView().setVisible(false);
        new InvestmentView().setVisible(true);
        new Transtionview().setVisible(false);
        new StatementView().setVisible(false);
    }//GEN-LAST:event_lblInvestmentAccountMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCreateAccount1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblInvestment;
    private javax.swing.JLabel lblInvestmentAccount;
    private javax.swing.JLabel lblProject;
    private javax.swing.JLabel lblStatement;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTotalMember;
    private javax.swing.JLabel lblTranstion;
    private javax.swing.JPanel panalstatement;
    // End of variables declaration//GEN-END:variables
}
