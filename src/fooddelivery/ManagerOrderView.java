/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddelivery;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Imbamizi
 */
public class ManagerOrderView extends javax.swing.JFrame {

    public ManagerOrderView() {
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

    public static boolean inNumVal(String in) {
        return in.length() == 1 || in.length() == 2;
    }

    public void getFilesName() {
        javax.swing.table.DefaultTableModel dt = new javax.swing.table.DefaultTableModel();
        ViewTable.setModel(dt);
        dt.setColumnIdentifiers(new String[]{"Day"});
        dt.addColumn("Month");
        dt.addColumn("Year");
        dt.addColumn("Customer");
        dt.addColumn("TotalPrice");
        String filepath = "DetailsFile\\Management\\totalorderdetails.txt";
        File f = new File(filepath);

        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(f));

            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                dt.addRow(dataRow);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
        }
        countPrice();
    }

    public class LengthRestrictedDocument extends PlainDocument {

        private int limit;

        public LengthRestrictedDocument(int limit) {
            this.limit = limit;
        }

        public void insertString(int offs, String str, AttributeSet a)
                throws BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offs, str, a);
            }
        }
    }

    public void countPrice() {
        double total = 0.0;
        String tp;
        for (int i = 0; i < ViewTable.getRowCount(); i++) {
            total = total + Double.parseDouble((String) ViewTable.getModel().getValueAt(i, 4));
        }
        tp = String.valueOf(total);
        ttsales.setText(tp);
    }

    @SuppressWarnings("uncecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MSet = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SignOutButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Timelab = new javax.swing.JLabel();
        Datelab = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ViewTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabe1 = new javax.swing.JLabel();
        query1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ttsales = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        query2 = new javax.swing.JLabel();
        query3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabe2 = new javax.swing.JLabel();
        jLabe3 = new javax.swing.JLabel();
        ImportButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        MSet.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        MSet.setAutoRequestFocus(false);
        MSet.setLocation(new java.awt.Point(0, 0));
        MSet.setLocationByPlatform(true);
        MSet.setMinimumSize(new java.awt.Dimension(400, 330));
        MSet.setResizable(false);
        MSet.setType(java.awt.Window.Type.POPUP);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Manager_96px.png"))); // NOI18N
        jLabel15.setText("New username/password");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 90));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Checked_52px.png"))); // NOI18N
        jLabel13.setText("Confirm");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setFocusable(false);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("Enter username here...");
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 260, 30));

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

        javax.swing.GroupLayout MSetLayout = new javax.swing.GroupLayout(MSet.getContentPane());
        MSet.getContentPane().setLayout(MSetLayout);
        MSetLayout.setHorizontalGroup(
            MSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MSetLayout.setVerticalGroup(
            MSetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("MANAGER INTERFACE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Calculate your sales");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        SignOutButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 30)); // NOI18N
        SignOutButton.setForeground(new java.awt.Color(204, 204, 204));
        SignOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Sign_Out_25px.png"))); // NOI18N
        SignOutButton.setText("Log out");
        SignOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignOutButtonMouseClicked(evt);
            }
        });
        jPanel2.add(SignOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Manager_96px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 10, 100));

        Timelab.setBackground(new java.awt.Color(204, 204, 204));
        Timelab.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Timelab.setForeground(new java.awt.Color(204, 204, 204));
        Timelab.setText("hh:MM:ss a");
        jPanel2.add(Timelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 100, 20));

        Datelab.setBackground(new java.awt.Color(204, 204, 204));
        Datelab.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        Datelab.setForeground(new java.awt.Color(204, 204, 204));
        Datelab.setText("dd|MM|yyyy");
        jPanel2.add(Datelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 100, 20));

        ViewTable.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        ViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Customer", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ViewTable.setEnabled(false);
        ViewTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(ViewTable);
        if (ViewTable.getColumnModel().getColumnCount() > 0) {
            ViewTable.getColumnModel().getColumn(0).setResizable(false);
            ViewTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            ViewTable.getColumnModel().getColumn(1).setResizable(false);
            ViewTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 500, 280));

        jTextField1.setDocument(new LengthRestrictedDocument(4));
        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 130, 30));

        jLabe1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabe1.setForeground(new java.awt.Color(204, 204, 204));
        jLabe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Checked_25px_1.png"))); // NOI18N
        jLabe1.setText("View ");
        jLabe1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabe1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, 30));

        query1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 25)); // NOI18N
        query1.setForeground(new java.awt.Color(204, 204, 204));
        query1.setText("YEAR:");
        jPanel2.add(query1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 50, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("TOTAL SALES:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, 30));

        ttsales.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 25)); // NOI18N
        ttsales.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(ttsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("TOTAL ORDERS");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Sign_Up_25px.png"))); // NOI18N
        jLabel4.setText("REGISTER STAFF");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 120, 30));

        jTextField1.setDocument(new LengthRestrictedDocument(4));
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 120, 30));

        query2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 25)); // NOI18N
        query2.setForeground(new java.awt.Color(204, 204, 204));
        query2.setText("MONTH:");
        jPanel2.add(query2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 60, 30));

        query3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 25)); // NOI18N
        query3.setForeground(new java.awt.Color(204, 204, 204));
        query3.setText("DAY:");
        jPanel2.add(query3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 50, 30));

        jTextField1.setDocument(new LengthRestrictedDocument(4));
        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 140, 30));

        jLabe2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabe2.setForeground(new java.awt.Color(204, 204, 204));
        jLabe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Checked_25px_1.png"))); // NOI18N
        jLabe2.setText("View ");
        jLabe2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabe2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, 30));

        jLabe3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        jLabe3.setForeground(new java.awt.Color(204, 204, 204));
        jLabe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Checked_25px_1.png"))); // NOI18N
        jLabe3.setText("View ");
        jLabe3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabe3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabe3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, -1, 30));

        ImportButton.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 25)); // NOI18N
        ImportButton.setForeground(new java.awt.Color(204, 204, 204));
        ImportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Import_25px_1.png"))); // NOI18N
        ImportButton.setText("Reset");
        ImportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ImportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImportButtonMouseClicked(evt);
            }
        });
        jPanel2.add(ImportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fooddelivery/icons8_Sign_Up_25px.png"))); // NOI18N
        jLabel5.setText("RESET USERNAME/PASSWORD");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutButtonMouseClicked
        Home hm = new Home();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignOutButtonMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Register rg = new Register();
        rg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabe1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabe1MouseClicked
        String year;
        String month;
        String day;
        javax.swing.table.DefaultTableModel dt = new javax.swing.table.DefaultTableModel();
        ViewTable.setModel(dt);
        ViewTable.setDefaultEditor(Object.class, null);
        dt.addColumn("Day");
        dt.addColumn("Month");
        dt.addColumn("Year");
        dt.addColumn("Customer");
        dt.addColumn("Total Price");
        File f = new File("DetailsFile\\Management\\totalorderdetails.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                day = dataRow[0];
                month = dataRow[1];
                year = dataRow[2];
                if (jTextField1.getText().equals(year)) {
                    dt.addRow(dataRow);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerOrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
        countPrice();
    }//GEN-LAST:event_jLabe1MouseClicked

    private void jLabe2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabe2MouseClicked
        String year;
        String month;
        String day;
        javax.swing.table.DefaultTableModel dt = new javax.swing.table.DefaultTableModel();
        ViewTable.setModel(dt);
        ViewTable.setDefaultEditor(Object.class, null);
        dt.addColumn("Day");
        dt.addColumn("Month");
        dt.addColumn("Year");
        dt.addColumn("Customer");
        dt.addColumn("Total Price");
        File f = new File("DetailsFile\\Management\\totalorderdetails.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Object[] tableLines = br.lines().toArray();

            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                day = dataRow[0];
                month = dataRow[1];
                year = dataRow[2];
                if (jTextField2.getText().equals(month) && jTextField1.getText().equals(year)) {
                    dt.addRow(dataRow);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerOrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
        countPrice();
    }//GEN-LAST:event_jLabe2MouseClicked

    private void jLabe3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabe3MouseClicked
        String year;
        String month;
        String day;
        javax.swing.table.DefaultTableModel dt = new javax.swing.table.DefaultTableModel();
        ViewTable.setModel(dt);
        ViewTable.setDefaultEditor(Object.class, null);
        dt.addColumn("Day");
        dt.addColumn("Month");
        dt.addColumn("Year");
        dt.addColumn("Customer");
        dt.addColumn("Total Price");
        File f = new File("DetailsFile\\Management\\totalorderdetails.txt");
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                day = dataRow[0];
                month = dataRow[1];
                year = dataRow[2];
                if (jTextField3.getText().equals(day) && jTextField2.getText().equals(month) && jTextField1.getText().equals(year)) {
                    dt.addRow(dataRow);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerOrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
        countPrice();
    }//GEN-LAST:event_jLabe3MouseClicked

    private void ImportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImportButtonMouseClicked
        getFilesName();
    }//GEN-LAST:event_ImportButtonMouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jTextField2.setText("");
        jTextField3.setText("");
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        jTextField3.setText("");
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        char vchar = evt.getKeyChar();
        if (!(Character.isDigit(vchar))
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText("");
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        String mUser = null;
        String mPass = null;
        byte[] encodedBytes;

        String u = jTextField4.getText();
        String pw = jPasswordField2.getText();

        if (!jTextField4.getText().equals("") && !jPasswordField2.getText().equals("")) {

            try {
                File f = new File("DetailsFile\\Management\\Manager.txt");

                Base64.Encoder encoder = Base64.getEncoder();
                String encpw1 = encoder.encodeToString(pw.getBytes());
                String encpw2 = encoder.encodeToString(encpw1.getBytes());
                String encpw3 = encoder.encodeToString(encpw2.getBytes());
                FileWriter fw = new FileWriter(f.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(jTextField4.getText() + "/" + encpw3 + "/");
                bw.close();
                fw.close();
                MSet.dispose();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else {
            jLabel17.setText("Please complete required fields!");
        }

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText("");
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        jLabel17.setText("");
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        jPasswordField2.setText("");
    }//GEN-LAST:event_jPasswordField2MouseClicked

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
        jLabel17.setText("");
    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        MSet.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(ManagerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerOrderView().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelab;
    private javax.swing.JLabel ImportButton;
    private javax.swing.JFrame MSet;
    private javax.swing.JLabel SignOutButton;
    private javax.swing.JLabel Timelab;
    private javax.swing.JTable ViewTable;
    private javax.swing.JLabel jLabe1;
    private javax.swing.JLabel jLabe2;
    private javax.swing.JLabel jLabe3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel query1;
    private javax.swing.JLabel query2;
    private javax.swing.JLabel query3;
    private javax.swing.JLabel ttsales;
    // End of variables declaration//GEN-END:variables
}
