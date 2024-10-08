import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hp
 */
public class studentDetails extends javax.swing.JFrame {

    /**
     * Creates new form studentDetails
     */
    public studentDetails() {
        initComponents();
        jTextArea1.setEditable(false);
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1630, 1130));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Adobe Hebrew", 1, 40)); // NOI18N
        jLabel2.setText("FILL UP THE FORM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back student.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 1630, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Roll Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Father Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Mother Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Contact Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("10th");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("12th");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 56, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Graduation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 290, -1));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 290, -1));

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 290, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 290, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 290, -1));

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 290, -1));

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField22.setForeground(new java.awt.Color(153, 153, 153));
        jTextField22.setText("Enter University Name");
        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField22FocusLost(evt);
            }
        });
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 500, -1));

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(153, 153, 153));
        jTextField23.setText("Enter University Name");
        jTextField23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField23FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField23FocusLost(evt);
            }
        });
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 500, -1));

        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(153, 153, 153));
        jTextField24.setText("Enter Percentage");
        jTextField24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField24FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField24FocusLost(evt);
            }
        });
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 275, -1));

        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(153, 153, 153));
        jTextField25.setText("Enter Percentage");
        jTextField25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField25FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField25FocusLost(evt);
            }
        });
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 274, -1));

        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField26.setForeground(new java.awt.Color(153, 153, 153));
        jTextField26.setText("Enter Percentage");
        jTextField26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField26FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField26FocusLost(evt);
            }
        });
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 274, -1));

        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField27.setForeground(new java.awt.Color(153, 153, 153));
        jTextField27.setText("Enter Passout Year");
        jTextField27.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField27FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField27FocusLost(evt);
            }
        });
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 510, 275, -1));

        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(153, 153, 153));
        jTextField28.setText("Enter Passout Year");
        jTextField28.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField28FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField28FocusLost(evt);
            }
        });
        getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, 275, -1));

        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(153, 153, 153));
        jTextField29.setText("Enter Passout Year");
        jTextField29.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField29FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField29FocusLost(evt);
            }
        });
        getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 275, -1));

        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(153, 153, 153));
        jTextField30.setText("Enter University Name");
        jTextField30.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField30FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField30FocusLost(evt);
            }
        });
        getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 500, -1));

        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 1156, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton3.setText("Save & Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 710, 632, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Examination Management System is managing all the \nactivities related to examination management righ from \nreceipt of Enrollment Forms and Examination Forms through\nthe processing of Results and Certificates and Grading\nReports.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 710, 168));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index background.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 1130));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }                                        

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit Apllication","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }                                        

    private void jTextField22FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField22.getText().equals("Enter University Name"))
        {
            jTextField22.setText("");
            jTextField22.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField23FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField23.getText().equals("Enter University Name"))
        {
            jTextField23.setText("");
            jTextField23.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField30FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField30.getText().equals(""))
        {
            jTextField30.setText("Enter University Name");
            jTextField30.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField24FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField24.getText().equals("Enter Percentage"))
        {
            jTextField24.setText("");
            jTextField24.setForeground(new Color(0,0,0));
        }
                
    }                                        

    private void jTextField25FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
                if(jTextField25.getText().equals("Enter Percentage"))
        {
            jTextField25.setText("");
            jTextField25.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField26FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
                if(jTextField26.getText().equals("Enter Percentage"))
        {
            jTextField26.setText("");
            jTextField26.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField27FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField27.getText().equals("Enter Passout Year"))
        {
            jTextField27.setText("");
            jTextField27.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField28FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField28.getText().equals("Enter Passout Year"))
        {
            jTextField28.setText("");
            jTextField28.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField29FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField29.getText().equals("Enter Passout Year"))
        {
            jTextField29.setText("");
            jTextField29.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField22FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField22.getText().equals(""))
        {
            jTextField22.setText("Enter University Name");
            jTextField22.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField23FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField23.getText().equals(""))
        {
            jTextField23.setText("Enter University Name");
            jTextField23.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField24FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField24.getText().equals(""))
        {
            jTextField24.setText("Enter Percentage");
            jTextField24.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField25FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField25.getText().equals(""))
        {
            jTextField25.setText("Enter Percentage");
            jTextField25.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField27FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField27.getText().equals(""))
        {
            jTextField27.setText("Enter Passout Year");
            jTextField27.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField26FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField26.getText().equals(""))
        {
            jTextField26.setText("Enter Percentage");
            jTextField26.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField29FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField29.getText().equals(""))
        {
            jTextField29.setText("Enter Passout Year");
            jTextField29.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jTextField30FocusGained(java.awt.event.FocusEvent evt) {                                         
        // TODO add your handling code here:
        if(jTextField30.getText().equals("Enter University Name"))
        {
            jTextField30.setText("");
            jTextField30.setForeground(new Color(0,0,0));
        }
    }                                        

    private void jTextField28FocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(jTextField28.getText().equals(""))
        {
            jTextField28.setText("Enter Passout Year");
            jTextField28.setForeground(new Color(153,153,153));
        }
    }                                      

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String rollNo=jTextField16.getText();
        String name=jTextField17.getText();
        String fatherName=jTextField18.getText();
        String motherName=jTextField19.getText();
        String gender=(String)jComboBox2.getSelectedItem();
        String contactNo=jTextField20.getText();
        String email=jTextField21.getText();
        String tenthUniversityName=jTextField22.getText();
        String tenthPercentage=jTextField24.getText();
        String tenthPassoutYear=jTextField27.getText();
        String twelveUniversityName=jTextField23.getText();
        String twelvePercentage=jTextField25.getText();
        String twelvePassoutYear=jTextField28.getText();
        String graduationUniversityName=jTextField30.getText();
        String graduationPercentage=jTextField26.getText();
        String graduationPassoutYear=jTextField29.getText();
        String address=jTextField31.getText();
        String marks="0";
        
        try
        {
            Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,rollNo);
            ps.setString(2,name);
            ps.setString(3,fatherName);
            ps.setString(4,motherName);
            ps.setString(5,gender);
            ps.setString(6,contactNo);
            ps.setString(7,email);
            ps.setString(8,tenthUniversityName);
            ps.setString(9,tenthPercentage);
            ps.setString(10,tenthPassoutYear);
            ps.setString(11,twelveUniversityName);
            ps.setString(12,twelvePercentage);
            ps.setString(13,twelvePassoutYear);
            ps.setString(14,graduationUniversityName);
            ps.setString(15,graduationPercentage);
            ps.setString(16,graduationPassoutYear);
            ps.setString(17,address);
            ps.setString(18,marks);
            ps.executeUpdate();
            setVisible(false);
            new instructionStudent(rollNo).setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    // End of variables declaration                   
}
