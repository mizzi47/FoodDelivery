/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Imbamizi
 */
public class Home extends javax.swing.JFrame {

    Register rg = new Register();
    User us = new User();
    Customer cust = new Customer();
    ManagerOrderView mov = new ManagerOrderView();
    private String username;
    private String password;
    private String phoneNumber;

    public Home(String u, String pw, String em, String rn, String pn) {
        username = u;
        password = pw;
        phoneNumber = pn;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUsername(String u) {
        username = u;
    }

    public void setPassword(String pw) {
        password = pw;
    }

    public void setPhoneNumber(String pn) {
        phoneNumber = pn;
    }

    public Home() {
        initComponents();
        showDate();
        showTime();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd|MM|yyyy");
        Datelab.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                Timelab.setText(s.format(d));
            }
        }).start();
    }

    public void getValidOrder() {
        String oname = jTextField3.getText();
        File fc = new File("DetailsFile\\CompletedOrder\\" + oname + ".txt");
        File fnc = new File("DetailsFile\\CustomerOrder\\" + oname + ".txt");
        if(fc.exists()){
            statusmsg.setText("Your order is complete. Ready to deliver!");
        }
        else if(fnc.exists()){
            statusmsg.setText("Your order is not complete. Please wait!");
        }
        else{
            statusmsg.setText("You have not order yet!");
            
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MLogin = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        oStatus = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        statusmsg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Datelab = new javax.swing.JLabel();
        Timelab = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        MLogin.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        MLogin.setAutoRequestFocus(false);
        MLogin.setLocation(new java.awt.Point(0, 0));
        MLogin.setLocationByPlatform(true);
        MLogin.setMinimumSize(new java.awt.Dimension(400, 330));
        MLogin.setResizable(false);
        MLogin.setSize(getMinimumSize());
        MLogin.setType(java.awt.Window.Type.POPUP);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Manager_96px.png"))); // NOI18N
        jLabel15.setText("Manager Login");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 280, 90));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Login_52px.png"))); // NOI18N
        jLabel13.setText("Login");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setFocusable(false);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Enter username here...");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 260, 30));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Username :");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Password :");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jPasswordField2.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField2.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });
        jPanel6.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 237, 32));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 270, 20));

        javax.swing.GroupLayout MLoginLayout = new javax.swing.GroupLayout(MLogin.getContentPane());
        MLogin.getContentPane().setLayout(MLoginLayout);
        MLoginLayout.setHorizontalGroup(
            MLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MLoginLayout.setVerticalGroup(
            MLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        oStatus.setAutoRequestFocus(false);
        oStatus.setLocationByPlatform(true);
        oStatus.setMinimumSize(new java.awt.Dimension(400, 290));
        oStatus.setResizable(false);
        oStatus.setSize(getPreferredSize());

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Data_Pending_96px.png"))); // NOI18N
        jLabel19.setText("ORDER STATUS");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 80));

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Checked_52px.png"))); // NOI18N
        jLabel20.setText("OK");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setFocusable(false);
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        statusmsg.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 20)); // NOI18N
        statusmsg.setForeground(new java.awt.Color(255, 51, 51));
        jPanel7.add(statusmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 280, 30));

        javax.swing.GroupLayout oStatusLayout = new javax.swing.GroupLayout(oStatus.getContentPane());
        oStatus.getContentPane().setLayout(oStatusLayout);
        oStatusLayout.setHorizontalGroup(
            oStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        oStatusLayout.setVerticalGroup(
            oStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Restaurant_100px.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 120));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 65)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("FOOD ORDERING SYSTEM ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 630, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("\"Customer is our priority\"");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 270, -1));

        Datelab.setBackground(new java.awt.Color(204, 204, 204));
        Datelab.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Datelab.setForeground(new java.awt.Color(204, 204, 204));
        Datelab.setText("yyyy-mm-dd");
        jPanel2.add(Datelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 20));

        Timelab.setBackground(new java.awt.Color(204, 204, 204));
        Timelab.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        Timelab.setForeground(new java.awt.Color(204, 204, 204));
        Timelab.setText("hh-mm-ss");
        jPanel2.add(Timelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 20));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Sign_Out_25px.png"))); // NOI18N
        jLabel12.setText("Manager login");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 140, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 790, 250));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Username :");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Password :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 237, 32));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Staff_100px.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, -1));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 270, 20));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Login_52px.png"))); // NOI18N
        jLabel4.setText("Login");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setFocusable(false);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Enter username here...");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 260, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 400, 290));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Male_User_96px.png"))); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Double_Right_64px.png"))); // NOI18N
        jLabel5.setText("Continue as customer");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 300, 60));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 100, 20));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Check your order :");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, -1));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Enter name");
        jTextField3.setBorder(null);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 160, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Checked_Checkbox_25px_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 30, -1));

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed", 2, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 270, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 380, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        jLabel11.setText("");
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        Home hm = new Home();
        us.setVisible(true);
            dispose();
       /* String pw;
        byte[] encodedBytes;

        String filepath = "DetailsFile\\StaffUser";
        File f = new File(filepath, jTextField1.getText());
        if (!f.exists()) {
            jLabel11.setText("User not found!");
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            String lines;
            while ((lines = br.readLine()) != null) {
                String[] dataRow = lines.split("/");
                username = dataRow[0];
                pw = dataRow[1];
                Base64.Decoder decoder = Base64.getDecoder();
                byte[] encpw2 = decoder.decode(pw);
                byte[] encpw1 = decoder.decode(encpw2);
                byte[] realpassword = decoder.decode(encpw1);
                password = new String(realpassword);

            }

            br.close();
        } catch (IOException ex) {

        }

        System.out.println("reg user " + username);
        System.out.println("reg user " + password);

        if (jTextField1.getText().equals("") || jPasswordField1.getText().equals("")) {
            jLabel11.setText("Please Complete Required Fields!");
        } else if (jTextField1.getText().equals(username) && jPasswordField1.getText().equals(password)) {
            us.setVisible(true);
            dispose();
        } else if (!jTextField1.getText().equals(username) || !jPasswordField1.getText().equals(password)) {
            jLabel11.setText("Wrong username or password.");
        }*/


    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        cust.setVisible(true);
        cust.customerView();
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jLabel11.setText("");
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        MLogin.show();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        String mUser = null;
        String mPass = null;
        String pw;
        byte[] encodedBytes;

        File f = new File("DetailsFile\\Management\\Manager.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {

            String lines;
            while ((lines = br.readLine()) != null) {
                String[] dataRow = lines.split("/");
                mUser = dataRow[0];
                pw = dataRow[1];
                Base64.Decoder decoder = Base64.getDecoder();
                byte[] encpw2 = decoder.decode(pw);
                byte[] encpw1 = decoder.decode(encpw2);
                byte[] realpassword = decoder.decode(encpw1);
                mPass = new String(realpassword);

            }

            br.close();
        } catch (IOException ex) {

        }

        System.out.println("reg user " + mUser);
        System.out.println("reg user " + mPass);

        if (jTextField2.getText().equals("") || jPasswordField2.getText().equals("")) {
            jLabel17.setText("Please Complete Required Fields!");
        } else if (jTextField2.getText().equals(mUser) && jPasswordField2.getText().equals(mPass)) {
            mov.setVisible(true);
            mov.getFilesName();
            dispose();
            MLogin.dispose();
        } else if (!jTextField2.getText().equals(mUser) || !jPasswordField2.getText().equals(mPass)) {
            jLabel17.setText("Wrong username or password.");
        }

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        jLabel17.setText("");
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        jPasswordField2.setText("");
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        jLabel17.setText("");
    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        jLabel21.setText("");
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (jTextField3.getText().equals("")) {
            jLabel21.setText("Please enter your name");
        } else {
            oStatus.setVisible(true);
            getValidOrder();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        oStatus.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelab;
    private javax.swing.JFrame MLogin;
    private javax.swing.JLabel Timelab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JFrame oStatus;
    private javax.swing.JLabel statusmsg;
    // End of variables declaration//GEN-END:variables
}
