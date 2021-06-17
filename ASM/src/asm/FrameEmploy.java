
package asm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nguyen Truc
 */
public class FrameEmploy extends javax.swing.JFrame {

    private ServiceEmployee _sv = new ServiceEmployee();
    private Employee _employee = new Employee();
    private DefaultTableModel model = new DefaultTableModel();
    private int _index;
    public FrameEmploy() {
        initComponents();
        initTable();
        filltoTable();
        setLocationRelativeTo(null);
        if (_sv._lstemployee.size() > 0) {
            _index = 0;   // Hiển thị phần tử đầu tiên lên form
            showDetail();//Hiển thị phần tử hiện tại lên form
        }
        new Thread() { //Start - Create a clock
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aa");
                while (true) {                    
                    Date d = new Date();
                    txtclock.setText(sdf.format(d));
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        break;
                    }
                }
            }
        }.start();
        //End - Create a clock
    }
    private void initTable() {
        String[] colums = new String[] {
          "Mã nhân viên","Họ và Tên","Tuổi","Email","Lương"  
        };
        model.setColumnIdentifiers(colums);
        txttable.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnfind = new javax.swing.JButton();
        btnopen = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btndau = new javax.swing.JButton();
        btngiam = new javax.swing.JButton();
        btntang = new javax.swing.JButton();
        btncuoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        txtclock = new javax.swing.JLabel();
        lbindex = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setBackground(new java.awt.Color(51, 255, 204));
        setForeground(new java.awt.Color(0, 255, 204));
        setSize(new java.awt.Dimension(780, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        id.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        id.setText("Mã nhân viên");

        name.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        name.setText("Họ và Tên");

        age.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        age.setText("Tuổi");

        email.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        email.setText("Email");

        salary.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        salary.setText("Lương");

        txtid.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        txtname.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        txtage.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        txtemail.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        txtsalary.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(51, 255, 204));

        btnnew.setBackground(new java.awt.Color(255, 0, 102));
        btnnew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnnew.setForeground(new java.awt.Color(255, 255, 255));
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(255, 0, 102));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 0, 102));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnfind.setBackground(new java.awt.Color(255, 0, 102));
        btnfind.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnfind.setForeground(new java.awt.Color(255, 255, 255));
        btnfind.setText("Find");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        btnopen.setBackground(new java.awt.Color(255, 0, 102));
        btnopen.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnopen.setForeground(new java.awt.Color(255, 255, 255));
        btnopen.setText("Open");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(255, 0, 102));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 255));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnew)
                .addGap(18, 18, 18)
                .addComponent(btnsave)
                .addGap(18, 18, 18)
                .addComponent(btndelete)
                .addGap(18, 18, 18)
                .addComponent(btnfind)
                .addGap(18, 18, 18)
                .addComponent(btnopen)
                .addGap(18, 18, 18)
                .addComponent(btnexit)
                .addGap(21, 21, 21))
        );

        btndau.setBackground(new java.awt.Color(255, 0, 102));
        btndau.setText("|<");
        btndau.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btndau.setMaximumSize(new java.awt.Dimension(35, 35));
        btndau.setMinimumSize(new java.awt.Dimension(35, 35));
        btndau.setPreferredSize(new java.awt.Dimension(35, 35));
        btndau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndauActionPerformed(evt);
            }
        });

        btngiam.setBackground(new java.awt.Color(255, 0, 102));
        btngiam.setText("<<");
        btngiam.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btngiam.setMaximumSize(new java.awt.Dimension(35, 35));
        btngiam.setMinimumSize(new java.awt.Dimension(35, 35));
        btngiam.setPreferredSize(new java.awt.Dimension(35, 35));
        btngiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiamActionPerformed(evt);
            }
        });

        btntang.setBackground(new java.awt.Color(255, 0, 102));
        btntang.setText(">>");
        btntang.setMaximumSize(new java.awt.Dimension(35, 35));
        btntang.setMinimumSize(new java.awt.Dimension(35, 35));
        btntang.setPreferredSize(new java.awt.Dimension(35, 35));
        btntang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntangActionPerformed(evt);
            }
        });

        btncuoi.setBackground(new java.awt.Color(255, 0, 102));
        btncuoi.setText(">|");
        btncuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuoiActionPerformed(evt);
            }
        });

        txttable.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ và Tên", "Tuổi", "Email", "Lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        txttable.setRowHeight(24);
        txttable.setSelectionBackground(new java.awt.Color(255, 0, 102));
        txttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txttable);

        txtclock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtclock.setForeground(new java.awt.Color(255, 0, 102));
        txtclock.setText("11:30:00 AM");

        lbindex.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbindex.setForeground(new java.awt.Color(255, 0, 102));
        lbindex.setText("Record :     ...  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btndau, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btngiam, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btntang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btncuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtsalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbindex)
                                        .addGap(120, 120, 120))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtclock, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntang, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btngiam, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndau, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbindex))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtclock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndauActionPerformed
        _index =0;
        showDetail();
    }//GEN-LAST:event_btndauActionPerformed

    private void btncuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuoiActionPerformed
        _index = _sv._lstemployee.size() -1;
        showDetail();
    }//GEN-LAST:event_btncuoiActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtage.setText(null);
        txtemail.setText(null);
        txtid.setText(null);
        txtname.setText(null);
        txtsalary.setText(null);
        lbindex.setText("Record :     ...  "); 
        _index=-1;
    }//GEN-LAST:event_btnnewActionPerformed

    private void btngiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiamActionPerformed
        if(_index>0) {
            _index--;
            showDetail();
        }
    }//GEN-LAST:event_btngiamActionPerformed

    private void btntangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntangActionPerformed
        if(_index<_sv._lstemployee.size()-1) {
            _index++;
            showDetail();
        }
    }//GEN-LAST:event_btntangActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
        if (txtname.getText().length()==0 || txtid.getText().length()==0 || txtemail.getText().length()==0 || txtsalary.getText().length()==0
                || txtage.getText().length()==0) {
            JOptionPane.showMessageDialog(this, "Không được để trống !");
            return;
        } else {
            // Start check email
            String regex1 = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; // check regex email 
            boolean matchFound1 = Pattern.matches(regex1, txtemail.getText());
            if (!matchFound1) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập lại email !");
                return;
            }// End check email
            // Start check salary
            String regex2 = "[\\d]+.[\\d]+|[\\d]+$"; // check regex isnumber 
            boolean matchFound2 = Pattern.matches(regex2, txtsalary.getText());
            if (!matchFound2) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập lại lương nhân viên !");
                return;
            } else {
                if (Integer.parseInt(txtsalary.getText()) < 5000000) {
                    JOptionPane.showMessageDialog(this, "Lương nhân viên phải lớn hơn 5 triệu  !");
                    return;
                }
            }// End check salary  
            // Start check age
            boolean matchFound3 = Pattern.matches(regex2, txtage.getText());
            if (!matchFound3) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập lại tuổi nhân viên !");
                return;
            } else {
                if (Integer.parseInt(txtage.getText()) < 16 || Integer.parseInt(txtage.getText()) > 55) {
                    JOptionPane.showMessageDialog(this, "Độ tuổi không phù hợp !");
                    return;
                }
            }
            // End check age
            //lấy thông tin trên form
            String id = txtid.getText();
            String hoten = txtname.getText();
            int tuoi = Integer.parseInt(txtage.getText());
            String email = txtemail.getText();
            float luong = Float.parseFloat(txtsalary.getText());
            for (Employee x : _sv._lstemployee) {
                if(txtid.getText().equalsIgnoreCase(x.getId())){
                    JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại !");
                    return;
                }
            }
         //   if(btnnewActionPerformed(evt)) {
             // thêm vào list
            _sv._lstemployee.add(new Employee(id, hoten, tuoi, email, luong));
            // thêm vào model
            model.addRow(new Object[]{id, hoten, tuoi, email, luong});
             // Xử lý sau khi thêm   
            _index = _sv._lstemployee.size()-1;
            showDetail();
           // }
        } } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "New trước khi thêm !");
            return;
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttableMouseClicked

        try {
            _index = txttable.getSelectedRow();
            showDetail();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi click table !");
        }
    }//GEN-LAST:event_txttableMouseClicked

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       try {
        // Ghi list vào file
        //B1: Mở luồng - Tạo đối tượng đọc/ghi
               JFileChooser fc = new JFileChooser();
           int chon = fc.showSaveDialog(this);
           if (chon == JFileChooser.APPROVE_OPTION) {
               String filename = fc.getSelectedFile().getAbsolutePath();
               FileOutputStream fos = new FileOutputStream(filename);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
               //B2:Thực hiện đọc/ghi: goi phương thức của đối tượng vừa tạo
               oos.writeObject(_sv._lstemployee);
               //Xả và đóng luồng
               oos.flush();
               fos.flush();
               oos.close();
               fos.close();
       } else  {
               JOptionPane.showMessageDialog(this, "Bạn đã hủy lưu file !");
               System.exit(0);
           } 
        JOptionPane.showMessageDialog(this, "Ghi thành công !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi ghi file !");
        }
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
            try {
            int choice= JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa nhân viên:"+ txtname.getText()+"?");
            if(choice!=JOptionPane.YES_OPTION) return;
            int index = txttable.getSelectedRow();
            if (index >= 0) {
                for (Employee x : _sv._lstemployee) {
                      if(x.getId().equals(txtid.getText())) {
                          _sv._lstemployee.remove(x);
                          JOptionPane.showMessageDialog(this, "Xóa thành công !");
                          break;
                      }
                }
                filltoTable();
                btnnewActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần xóa tại bảng chọn");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        // TODO add your handling code here:
            try {
            // Ghi list vào file
           // Jfilechooser
            JFileChooser fc = new JFileChooser();
            int chon = fc.showOpenDialog(this);
            if (chon == JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getAbsolutePath();
            //B1: Mở luồng - Tạo đối tượng đọc/ghi
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //B2:Thực hiện đọc/ghi: goi phương thức của đối tượng vừa tạo
            _sv._lstemployee = (ArrayList<Employee>) ois.readObject();
            //đóng luồng
            ois.close();
            fis.close();
            //Xử lý sau khi đọc
            }
            if (_sv._lstemployee.size() > 0) {
                filltoTable();// duyệt list đổ dữ liệu vào bảng
                _index = 0;
                showDetail();// hiển thị phần tử đàu tiên
            } else {
                btnnewActionPerformed(evt);
            }
            JOptionPane.showMessageDialog(this, "Đọc thành công !");
        } catch (Exception e) {
            System.out.println("Lỗi đọc file !");
        }
    }//GEN-LAST:event_btnopenActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(null,"Nhập vào mã nhân viên cần tìm ; ");
        for (int i = 0; i < _sv._lstemployee.size(); i++) {
            if(_sv._lstemployee.get(i).getId().equalsIgnoreCase(id)){
                JOptionPane.showMessageDialog(this, "Đã tìm thấy nhân viên :"+id);
                _index=i;
                showDetail();
                break;
            } else {
                JOptionPane.showMessageDialog(this, "Không tồn tại mã nhân viên :" +id);
                _index =-1;
                btnnewActionPerformed(evt);
                break;
            }
        }
    }//GEN-LAST:event_btnfindActionPerformed

    public static void main(String args[]) throws IOException ,ClassNotFoundException{
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
            java.util.logging.Logger.getLogger(FrameEmploy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEmploy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEmploy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEmploy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEmploy().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton btncuoi;
    private javax.swing.JButton btndau;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btngiam;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnopen;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntang;
    private javax.swing.JLabel email;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbindex;
    private javax.swing.JLabel name;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField txtage;
    private javax.swing.JLabel txtclock;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTable txttable;
    // End of variables declaration//GEN-END:variables

    private void filltoTable() {
            model.setRowCount(0);
            for (Employee x : _sv._lstemployee) {
                model.addRow(new Object[]{x.getId(), x.getFullName(), x.getAge()
                        , x.getEmail(), x.getSalary()});
            }
            model.fireTableDataChanged();
    }
    private void showDetail() {
        Employee epl = _sv._lstemployee.get(_index);
        txtid.setText(epl.getId());
        txtname.setText(epl.getFullName());
        txtage.setText(epl.getAge() + "");
        txtemail.setText(epl.getEmail());
        txtsalary.setText(epl.getSalary()+"");
        //hiên thi vi tri hien tai
        lbindex.setText("Record : "+(_index + 1) + " of " + _sv._lstemployee.size());
        txttable.setRowSelectionInterval(_index, _index);// table chọn dòng index
    } }
