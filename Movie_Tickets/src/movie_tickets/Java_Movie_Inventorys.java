/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie_tickets;

import static com.sun.javafx.fxml.expression.Expression.set;
import static com.sun.javafx.fxml.expression.Expression.set;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import static java.lang.reflect.Array.set;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import static org.apache.derby.database.UserUtility.set;


public class Java_Movie_Inventorys extends javax.swing.JFrame {

    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st;
    
    public Java_Movie_Inventorys() {
        initComponents();
        combobox();
        table1();
        table2();
    }
    private void combobox(){
    try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/movieDB", "movie", "root");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select *from MOVIESTB WHERE RELEASEDATE <= '2017-12-12'");
            while(rs.next())
            {
                String name = rs.getString("MOVIENAME");
                Cbox1.addItem(name);
            }
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void table1(){
        
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/movieDB", "movie", "root");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select *from MOVIESTB WHERE RELEASEDATE <= '2017-12-12'");
            
            jtable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    private void table2(){
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/movieDB", "movie", "root");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select *from MOVIESTB WHERE RELEASEDATE >= '2017-12-12'");
            
            jtable2.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieDBPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("movieDBPU").createEntityManager();
        moviestbQuery = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery.getResultList();
        moviestbQuery1 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery1.getResultList();
        usertbQuery = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT u FROM Usertb u");
        usertbList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usertbQuery.getResultList();
        moviestbQuery2 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery2.getResultList();
        moviestbQuery3 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery3.getResultList();
        moviestbQuery4 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery4.getResultList();
        moviestbQuery5 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery5.getResultList();
        moviestbQuery6 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery6.getResultList();
        moviestbQuery7 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery7.getResultList();
        moviestbQuery8 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList8 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery8.getResultList();
        moviestbQuery9 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList9 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery9.getResultList();
        moviestbQuery10 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList10 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery10.getResultList();
        moviestbQuery11 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList11 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery11.getResultList();
        usertbQuery1 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT u FROM Usertb u");
        usertbList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usertbQuery1.getResultList();
        moviestbQuery12 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList12 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery12.getResultList();
        moviestbQuery13 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList13 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery13.getResultList();
        moviestbQuery14 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList14 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery14.getResultList();
        moviestbQuery15 = java.beans.Beans.isDesignTime() ? null : movieDBPUEntityManager.createQuery("SELECT m FROM Moviestb m");
        moviestbList15 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : moviestbQuery15.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        Cbox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Cbox2 = new javax.swing.JComboBox<>();
        buybt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        takap = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Java_Movie_Inventorys");
        setBackground(new java.awt.Color(255, 204, 204));
        setMinimumSize(new java.awt.Dimension(1380, 800));
        setPreferredSize(new java.awt.Dimension(1380, 800));

        jPanel1.setBackground(new java.awt.Color(0, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        jPanel1.setForeground(new java.awt.Color(0, 204, 153));

        jLabel1.setBackground(new java.awt.Color(0, 204, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buy Movie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 204, 153));

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Now Showing");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        logoutbtn.setBackground(new java.awt.Color(0, 0, 0));
        logoutbtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutbtn.setForeground(new java.awt.Color(255, 255, 51));
        logoutbtn.setText("I Want to logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        jtable1.setBackground(new java.awt.Color(0, 0, 0));
        jtable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtable1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtable1.setForeground(new java.awt.Color(255, 255, 255));
        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(jtable1);

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(0, 204, 153));

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Up Comming");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(0, 204, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Movie Name:");

        Cbox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbox1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tickets ammount:");

        Cbox2.setBackground(new java.awt.Color(0, 204, 204));
        Cbox2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cbox2.setForeground(new java.awt.Color(0, 0, 0));
        Cbox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        Cbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cbox2ActionPerformed(evt);
            }
        });

        buybt.setBackground(new java.awt.Color(0, 204, 204));
        buybt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buybt.setForeground(new java.awt.Color(0, 0, 0));
        buybt.setText("BUY");
        buybt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buybtActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Price:");

        takap.setBackground(new java.awt.Color(255, 255, 255));
        takap.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        takap.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Cbox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Cbox2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(buybt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(takap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Cbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(takap, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)
                        .addComponent(Cbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(buybt, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(takap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(buybt)
                .addGap(26, 26, 26))
        );

        jtable2.setBackground(new java.awt.Color(0, 0, 0));
        jtable2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtable2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jtable2.setForeground(new java.awt.Color(255, 255, 255));
        jtable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jtable2);

        txtReceipt.setColumns(20);
        txtReceipt.setForeground(new java.awt.Color(0, 0, 255));
        txtReceipt.setRows(5);
        jScrollPane1.setViewportView(txtReceipt);

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Receipt");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel5)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(72, 72, 72)
                                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(159, 159, 159)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(109, 109, 109)
                                    .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:

        CloseMe3();
        userlogin login = new userlogin();
        login.setVisible(true);

    }//GEN-LAST:event_logoutbtnActionPerformed

    private void Cbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbox2ActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_Cbox2ActionPerformed

    private void buybtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buybtActionPerformed
        
////////////////////////////////////////////////////
// TODO add your handling code here:                                        *BUY BUTTON*
       ///////////////////////////////////////////////////////// 
        String mn = (String)Cbox1.getSelectedItem();
        int amo=Integer.parseInt((String) Cbox2.getSelectedItem());
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");    //}
	LocalDate localDate = LocalDate.now();                                //}For DATE
        System.out.println(dtf.format(localDate)); //2016/11/16               //}
        
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/movieDB", "movie", "root");
            st = (Statement) conn.createStatement();
            rs = st.executeQuery("select *from MOVIESTB WHERE MOVIENAME = '" + mn + "'");
            
            while(rs.next())
            {
                String name = rs.getString("PRICE");
                int P = Integer.parseInt(name);
                
                int temp=P*amo;
                takap.setText(String.valueOf(temp+"BDT."));
                
                txtReceipt.append("\t\tMovie Tickets\n\n"
                        + "===========================================\n\n"
                        + "Movie name:  " +mn+ "     Hall No: 01\n\n"
                        + "Sit No:  D10        DATE:12/12/18"+"\n\n"
                        + "Ticket Price:  "+ temp +"BDT.(NO VAT) for "+amo+" ticket\n\n"
                        + "===========================================\n");
                
            }           
            
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }//GEN-LAST:event_buybtActionPerformed

    private void Cbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cbox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Cbox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            txtReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Java_Movie_Inventorys.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void CloseMe3() {
        WindowEvent meClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(meClose);

    }
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
            java.util.logging.Logger.getLogger(Java_Movie_Inventorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Movie_Inventorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Movie_Inventorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Movie_Inventorys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Movie_Inventorys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbox1;
    private javax.swing.JComboBox<String> Cbox2;
    private javax.swing.JButton buybt;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtable1;
    private javax.swing.JTable jtable2;
    private javax.swing.JButton logoutbtn;
    private javax.persistence.EntityManager movieDBPUEntityManager;
    private java.util.List<movie_tickets.Moviestb> moviestbList;
    private java.util.List<movie_tickets.Moviestb> moviestbList1;
    private java.util.List<movie_tickets.Moviestb> moviestbList10;
    private java.util.List<movie_tickets.Moviestb> moviestbList11;
    private java.util.List<movie_tickets.Moviestb> moviestbList12;
    private java.util.List<movie_tickets.Moviestb> moviestbList13;
    private java.util.List<movie_tickets.Moviestb> moviestbList14;
    private java.util.List<movie_tickets.Moviestb> moviestbList15;
    private java.util.List<movie_tickets.Moviestb> moviestbList2;
    private java.util.List<movie_tickets.Moviestb> moviestbList3;
    private java.util.List<movie_tickets.Moviestb> moviestbList4;
    private java.util.List<movie_tickets.Moviestb> moviestbList5;
    private java.util.List<movie_tickets.Moviestb> moviestbList6;
    private java.util.List<movie_tickets.Moviestb> moviestbList7;
    private java.util.List<movie_tickets.Moviestb> moviestbList8;
    private java.util.List<movie_tickets.Moviestb> moviestbList9;
    private javax.persistence.Query moviestbQuery;
    private javax.persistence.Query moviestbQuery1;
    private javax.persistence.Query moviestbQuery10;
    private javax.persistence.Query moviestbQuery11;
    private javax.persistence.Query moviestbQuery12;
    private javax.persistence.Query moviestbQuery13;
    private javax.persistence.Query moviestbQuery14;
    private javax.persistence.Query moviestbQuery15;
    private javax.persistence.Query moviestbQuery2;
    private javax.persistence.Query moviestbQuery3;
    private javax.persistence.Query moviestbQuery4;
    private javax.persistence.Query moviestbQuery5;
    private javax.persistence.Query moviestbQuery6;
    private javax.persistence.Query moviestbQuery7;
    private javax.persistence.Query moviestbQuery8;
    private javax.persistence.Query moviestbQuery9;
    private javax.swing.JLabel takap;
    private javax.swing.JTextArea txtReceipt;
    private java.util.List<movie_tickets.Usertb> usertbList;
    private java.util.List<movie_tickets.Usertb> usertbList1;
    private javax.persistence.Query usertbQuery;
    private javax.persistence.Query usertbQuery1;
    // End of variables declaration//GEN-END:variables
}
