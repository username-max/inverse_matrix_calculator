package javaapplication5;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;
public class Menu extends javax.swing.JFrame {
    public int size = 2;
    float[][] matrix;
    float[][] E;
    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDialog3 = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
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
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jTextField86 = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jTextField88 = new javax.swing.JTextField();
        jTextField89 = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        jTextField91 = new javax.swing.JTextField();
        jTextField92 = new javax.swing.JTextField();
        jTextField93 = new javax.swing.JTextField();
        jTextField94 = new javax.swing.JTextField();
        jTextField95 = new javax.swing.JTextField();
        jTextField96 = new javax.swing.JTextField();
        jTextField97 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jDialog1.setLocation(new java.awt.Point(500, 500));
        jDialog1.setName("Calculator"); // NOI18N

        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel8.setText("3) Нажмите на кнопку подсчета");

        jLabel7.setText("2) Напишите значение исходной матрицы");

        jLabel6.setText("1) Выберите размер матрицы, который Вам нужен");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Инструкция: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(304, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel8)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, 401, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Ошибка!");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Введено не верное значение в исходную матрицу");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Информация о программе:");

        jLabel14.setText("Разработал студент Козлов Максим Сергеевич");

        jLabel15.setText("Группы КУБО-02-17");

        jLabel16.setText("Москва 2019");

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addGroup(jDialog3Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel16)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Подсчет A^(-1)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("A = ");
        jLabel1.setToolTipText("");

        jTextField1.setText("0");

        jTextField2.setText("0");

        jTextField3.setText("0");
        jTextField3.setEnabled(false);

        jTextField4.setText("0");
        jTextField4.setEnabled(false);

        jTextField5.setText("0");

        jTextField6.setText("0");

        jTextField7.setText("0");
        jTextField7.setEnabled(false);

        jTextField8.setText("0");
        jTextField8.setEnabled(false);

        jTextField9.setText("0");
        jTextField9.setEnabled(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2 x 2", "3 x 3", "4 x 4", "5 x 5", "6 x 6", "7 x 7" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField10.setText("0");
        jTextField10.setEnabled(false);

        jTextField11.setText("0");
        jTextField11.setEnabled(false);

        jTextField12.setText("0");
        jTextField12.setEnabled(false);

        jTextField13.setText("0");
        jTextField13.setEnabled(false);

        jTextField14.setText("0");
        jTextField14.setEnabled(false);

        jTextField15.setText("0");
        jTextField15.setEnabled(false);

        jTextField16.setText("0");
        jTextField16.setEnabled(false);

        jLabel2.setText("Выберете размер матрицы");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Калькулятор нахождения обратной матрицы");

        jLabel4.setText("Введите значение матрицы:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField17.setText("0");
        jTextField17.setEnabled(false);

        jTextField18.setText("0");
        jTextField18.setEnabled(false);

        jTextField19.setText("0");
        jTextField19.setEnabled(false);

        jTextField20.setText("0");
        jTextField20.setEnabled(false);

        jTextField21.setText("0");
        jTextField21.setEnabled(false);

        jTextField22.setText("0");
        jTextField22.setEnabled(false);

        jTextField23.setText("0");
        jTextField23.setEnabled(false);

        jTextField24.setText("0");
        jTextField24.setEnabled(false);

        jTextField25.setText("0");
        jTextField25.setEnabled(false);

        jTextField26.setText("0");
        jTextField26.setEnabled(false);

        jTextField27.setText("0");
        jTextField27.setEnabled(false);

        jTextField28.setText("0");
        jTextField28.setEnabled(false);

        jTextField29.setText("0");
        jTextField29.setEnabled(false);

        jTextField30.setText("0");
        jTextField30.setEnabled(false);

        jTextField31.setText("0");
        jTextField31.setEnabled(false);

        jTextField32.setText("0");
        jTextField32.setEnabled(false);

        jTextField33.setText("0");
        jTextField33.setEnabled(false);

        jTextField34.setText("0");
        jTextField34.setEnabled(false);

        jTextField35.setText("0");
        jTextField35.setEnabled(false);

        jTextField36.setText("0");
        jTextField36.setEnabled(false);

        jTextField37.setText("0");
        jTextField37.setEnabled(false);

        jTextField38.setText("0");
        jTextField38.setEnabled(false);

        jTextField39.setText("0");
        jTextField39.setEnabled(false);

        jTextField40.setText("0");
        jTextField40.setEnabled(false);

        jTextField41.setText("0");
        jTextField41.setEnabled(false);

        jTextField42.setText("0");
        jTextField42.setEnabled(false);

        jTextField43.setText("0");
        jTextField43.setEnabled(false);
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        jTextField44.setText("0");
        jTextField44.setEnabled(false);

        jTextField45.setText("0");
        jTextField45.setEnabled(false);

        jTextField46.setText("0");
        jTextField46.setEnabled(false);

        jTextField47.setText("0");
        jTextField47.setEnabled(false);

        jTextField48.setText("0");
        jTextField48.setEnabled(false);

        jTextField49.setText("0");
        jTextField49.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("A^(-1) = ");
        jLabel9.setToolTipText("");

        jTextField50.setText("0");
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        jTextField51.setText("0");

        jTextField52.setText("0");
        jTextField52.setEnabled(false);

        jTextField53.setText("0");
        jTextField53.setEnabled(false);

        jTextField54.setText("0");

        jTextField55.setText("0");

        jTextField56.setText("0");
        jTextField56.setEnabled(false);

        jTextField57.setText("0");
        jTextField57.setEnabled(false);

        jTextField58.setText("0");
        jTextField58.setEnabled(false);

        jTextField59.setText("0");
        jTextField59.setEnabled(false);

        jTextField60.setText("0");
        jTextField60.setEnabled(false);

        jTextField61.setText("0");
        jTextField61.setEnabled(false);

        jTextField62.setText("0");
        jTextField62.setEnabled(false);

        jTextField63.setText("0");
        jTextField63.setEnabled(false);

        jTextField64.setText("0");
        jTextField64.setEnabled(false);

        jTextField65.setText("0");
        jTextField65.setEnabled(false);

        jTextField66.setText("0");
        jTextField66.setEnabled(false);

        jTextField67.setText("0");
        jTextField67.setEnabled(false);

        jTextField68.setText("0");
        jTextField68.setEnabled(false);

        jTextField69.setText("0");
        jTextField69.setEnabled(false);

        jTextField70.setText("0");
        jTextField70.setEnabled(false);

        jTextField71.setText("0");
        jTextField71.setEnabled(false);

        jTextField72.setText("0");
        jTextField72.setEnabled(false);

        jTextField73.setText("0");
        jTextField73.setEnabled(false);

        jTextField74.setText("0");
        jTextField74.setEnabled(false);

        jTextField75.setText("0");
        jTextField75.setEnabled(false);

        jTextField76.setText("0");
        jTextField76.setEnabled(false);

        jTextField77.setText("0");
        jTextField77.setEnabled(false);

        jTextField78.setText("0");
        jTextField78.setEnabled(false);

        jTextField79.setText("0");
        jTextField79.setEnabled(false);

        jTextField80.setText("0");
        jTextField80.setEnabled(false);

        jTextField81.setText("0");
        jTextField81.setEnabled(false);

        jTextField82.setText("0");
        jTextField82.setEnabled(false);

        jTextField83.setText("0");
        jTextField83.setEnabled(false);

        jTextField84.setText("0");
        jTextField84.setEnabled(false);

        jTextField85.setText("0");
        jTextField85.setEnabled(false);

        jTextField86.setText("0");
        jTextField86.setEnabled(false);

        jTextField87.setText("0");
        jTextField87.setEnabled(false);

        jTextField88.setText("0");
        jTextField88.setEnabled(false);

        jTextField89.setText("0");
        jTextField89.setEnabled(false);

        jTextField90.setText("0");
        jTextField90.setEnabled(false);

        jTextField91.setText("0");
        jTextField91.setEnabled(false);

        jTextField92.setText("0");
        jTextField92.setEnabled(false);

        jTextField93.setText("0");
        jTextField93.setEnabled(false);

        jTextField94.setText("0");
        jTextField94.setEnabled(false);

        jTextField95.setText("0");
        jTextField95.setEnabled(false);

        jTextField96.setText("0");
        jTextField96.setEnabled(false);

        jTextField97.setText("0");
        jTextField97.setEnabled(false);

        jTextField98.setText("0");
        jTextField98.setEnabled(false);

        jLabel10.setText("Обратная матрица:");

        jButton3.setText("Справка");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(76, 76, 76))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel10)))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 33, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().toString().equals("2 x 2")) {  //если значение в списке равно 2x2, 
            jTextField4.setEnabled(false);                              //то делаем видимыми определенные значения матрицы
            jTextField12.setEnabled(false);
            jTextField3.setEnabled(false);
            jTextField11.setEnabled(false);
            jTextField9.setEnabled(false);
            jTextField8.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField10.setEnabled(false);
            jTextField16.setEnabled(false);
            jTextField15.setEnabled(false);
            jTextField14.setEnabled(false);
            jTextField13.setEnabled(false);
            jTextField25.setEnabled(false);
            jTextField24.setEnabled(false);
            jTextField23.setEnabled(false);
            jTextField22.setEnabled(false);
            jTextField21.setEnabled(false);
            jTextField17.setEnabled(false);
            jTextField18.setEnabled(false);
            jTextField19.setEnabled(false);
            jTextField20.setEnabled(false);
            jTextField36.setEnabled(false);
            jTextField35.setEnabled(false);
            jTextField34.setEnabled(false);
            jTextField33.setEnabled(false);
            jTextField32.setEnabled(false);
            jTextField31.setEnabled(false);
            jTextField30.setEnabled(false);
            jTextField29.setEnabled(false);
            jTextField28.setEnabled(false);
            jTextField27.setEnabled(false);
            jTextField26.setEnabled(false);
            jTextField37.setEnabled(false);
            jTextField38.setEnabled(false);
            jTextField39.setEnabled(false);
            jTextField40.setEnabled(false);
            jTextField41.setEnabled(false);
            jTextField42.setEnabled(false);
            jTextField43.setEnabled(false);
            jTextField44.setEnabled(false);
            jTextField45.setEnabled(false);
            jTextField46.setEnabled(false);
            jTextField47.setEnabled(false);
            jTextField48.setEnabled(false);
            jTextField49.setEnabled(false);
            //работаем с видимостью обратной матрицы
            jTextField52.setEnabled(false);                              
            jTextField53.setEnabled(false);
            jTextField56.setEnabled(false);
            jTextField57.setEnabled(false);
            jTextField58.setEnabled(false);
            jTextField77.setEnabled(false);
            jTextField76.setEnabled(false);
            jTextField75.setEnabled(false);
            jTextField74.setEnabled(false);
            jTextField59.setEnabled(false);
            jTextField60.setEnabled(false);
            jTextField61.setEnabled(false);
            jTextField78.setEnabled(false);
            jTextField79.setEnabled(false);
            jTextField80.setEnabled(false);
            jTextField81.setEnabled(false);
            jTextField82.setEnabled(false);
            jTextField73.setEnabled(false);
            jTextField64.setEnabled(false);
            jTextField63.setEnabled(false);
            jTextField62.setEnabled(false);
            jTextField91.setEnabled(false);
            jTextField90.setEnabled(false);
            jTextField89.setEnabled(false);
            jTextField88.setEnabled(false);
            jTextField87.setEnabled(false);
            jTextField86.setEnabled(false);
            jTextField83.setEnabled(false);
            jTextField72.setEnabled(false);
            jTextField65.setEnabled(false);
            jTextField66.setEnabled(false);
            jTextField67.setEnabled(false);
            jTextField92.setEnabled(false);
            jTextField93.setEnabled(false);
            jTextField94.setEnabled(false);
            jTextField95.setEnabled(false);
            jTextField96.setEnabled(false);
            jTextField97.setEnabled(false);
            jTextField98.setEnabled(false);
            jTextField85.setEnabled(false);
            jTextField84.setEnabled(false);
            jTextField71.setEnabled(false);
            jTextField70.setEnabled(false);
            jTextField69.setEnabled(false);
            jTextField68.setEnabled(false);
            
            this.size = 2;
        }
        if (jComboBox1.getSelectedItem().toString().equals("3 x 3")) {
            jTextField4.setEnabled(true);
            jTextField12.setEnabled(false);
            jTextField3.setEnabled(true);
            jTextField11.setEnabled(false);
            jTextField9.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField10.setEnabled(false);
            jTextField16.setEnabled(false);
            jTextField15.setEnabled(false);
            jTextField14.setEnabled(false);
            jTextField13.setEnabled(false);
            jTextField25.setEnabled(false);
            jTextField24.setEnabled(false);
            jTextField23.setEnabled(false);
            jTextField22.setEnabled(false);
            jTextField21.setEnabled(false);
            jTextField17.setEnabled(false);
            jTextField18.setEnabled(false);
            jTextField19.setEnabled(false);
            jTextField20.setEnabled(false);
            jTextField36.setEnabled(false);
            jTextField35.setEnabled(false);
            jTextField34.setEnabled(false);
            jTextField33.setEnabled(false);
            jTextField32.setEnabled(false);
            jTextField31.setEnabled(false);
            jTextField30.setEnabled(false);
            jTextField29.setEnabled(false);
            jTextField28.setEnabled(false);
            jTextField27.setEnabled(false);
            jTextField26.setEnabled(false);
            jTextField37.setEnabled(false);
            jTextField38.setEnabled(false);
            jTextField39.setEnabled(false);
            jTextField40.setEnabled(false);
            jTextField41.setEnabled(false);
            jTextField42.setEnabled(false);
            jTextField43.setEnabled(false);
            jTextField44.setEnabled(false);
            jTextField45.setEnabled(false);
            jTextField46.setEnabled(false);
            jTextField47.setEnabled(false);
            jTextField48.setEnabled(false);
            jTextField49.setEnabled(false);
            //работаем с видимостью обратной матрицы
            jTextField52.setEnabled(true);                              
            jTextField53.setEnabled(true);
            jTextField56.setEnabled(true);
            jTextField57.setEnabled(true);
            jTextField58.setEnabled(true);
            jTextField77.setEnabled(false);
            jTextField76.setEnabled(false);
            jTextField75.setEnabled(false);
            jTextField74.setEnabled(false);
            jTextField59.setEnabled(false);
            jTextField60.setEnabled(false);
            jTextField61.setEnabled(false);
            jTextField78.setEnabled(false);
            jTextField79.setEnabled(false);
            jTextField80.setEnabled(false);
            jTextField81.setEnabled(false);
            jTextField82.setEnabled(false);
            jTextField73.setEnabled(false);
            jTextField64.setEnabled(false);
            jTextField63.setEnabled(false);
            jTextField62.setEnabled(false);
            jTextField91.setEnabled(false);
            jTextField90.setEnabled(false);
            jTextField89.setEnabled(false);
            jTextField88.setEnabled(false);
            jTextField87.setEnabled(false);
            jTextField86.setEnabled(false);
            jTextField83.setEnabled(false);
            jTextField72.setEnabled(false);
            jTextField65.setEnabled(false);
            jTextField66.setEnabled(false);
            jTextField67.setEnabled(false);
            jTextField92.setEnabled(false);
            jTextField93.setEnabled(false);
            jTextField94.setEnabled(false);
            jTextField95.setEnabled(false);
            jTextField96.setEnabled(false);
            jTextField97.setEnabled(false);
            jTextField98.setEnabled(false);
            jTextField85.setEnabled(false);
            jTextField84.setEnabled(false);
            jTextField71.setEnabled(false);
            jTextField70.setEnabled(false);
            jTextField69.setEnabled(false);
            jTextField68.setEnabled(false);
            this.size = 3;
        }
        if (jComboBox1.getSelectedItem().toString().equals("4 x 4")) {
            jTextField4.setEnabled(true);
            jTextField12.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField11.setEnabled(true);
            jTextField9.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField10.setEnabled(true);
            jTextField16.setEnabled(true);
            jTextField15.setEnabled(true);
            jTextField14.setEnabled(true);
            jTextField13.setEnabled(true);
            jTextField25.setEnabled(false);
            jTextField24.setEnabled(false);
            jTextField23.setEnabled(false);
            jTextField22.setEnabled(false);
            jTextField21.setEnabled(false);
            jTextField17.setEnabled(false);
            jTextField18.setEnabled(false);
            jTextField19.setEnabled(false);
            jTextField20.setEnabled(false);
            jTextField36.setEnabled(false);
            jTextField35.setEnabled(false);
            jTextField34.setEnabled(false);
            jTextField33.setEnabled(false);
            jTextField32.setEnabled(false);
            jTextField31.setEnabled(false);
            jTextField30.setEnabled(false);
            jTextField29.setEnabled(false);
            jTextField28.setEnabled(false);
            jTextField27.setEnabled(false);
            jTextField26.setEnabled(false);
            jTextField37.setEnabled(false);
            jTextField38.setEnabled(false);
            jTextField39.setEnabled(false);
            jTextField40.setEnabled(false);
            jTextField41.setEnabled(false);
            jTextField42.setEnabled(false);
            jTextField43.setEnabled(false);
            jTextField44.setEnabled(false);
            jTextField45.setEnabled(false);
            jTextField46.setEnabled(false);
            jTextField47.setEnabled(false);
            jTextField48.setEnabled(false);
            jTextField49.setEnabled(false);
            //работаем с видимостью обратной матрицы
            jTextField52.setEnabled(true);                              
            jTextField53.setEnabled(true);
            jTextField56.setEnabled(true);
            jTextField57.setEnabled(true);
            jTextField58.setEnabled(true);
            jTextField77.setEnabled(true);
            jTextField76.setEnabled(true);
            jTextField75.setEnabled(true);
            jTextField74.setEnabled(true);
            jTextField59.setEnabled(true);
            jTextField60.setEnabled(true);
            jTextField61.setEnabled(true);
            jTextField78.setEnabled(false);
            jTextField79.setEnabled(false);
            jTextField80.setEnabled(false);
            jTextField81.setEnabled(false);
            jTextField82.setEnabled(false);
            jTextField73.setEnabled(false);
            jTextField64.setEnabled(false);
            jTextField63.setEnabled(false);
            jTextField62.setEnabled(false);
            jTextField91.setEnabled(false);
            jTextField90.setEnabled(false);
            jTextField89.setEnabled(false);
            jTextField88.setEnabled(false);
            jTextField87.setEnabled(false);
            jTextField86.setEnabled(false);
            jTextField83.setEnabled(false);
            jTextField72.setEnabled(false);
            jTextField65.setEnabled(false);
            jTextField66.setEnabled(false);
            jTextField67.setEnabled(false);
            jTextField92.setEnabled(false);
            jTextField93.setEnabled(false);
            jTextField94.setEnabled(false);
            jTextField95.setEnabled(false);
            jTextField96.setEnabled(false);
            jTextField97.setEnabled(false);
            jTextField98.setEnabled(false);
            jTextField85.setEnabled(false);
            jTextField84.setEnabled(false);
            jTextField71.setEnabled(false);
            jTextField70.setEnabled(false);
            jTextField69.setEnabled(false);
            jTextField68.setEnabled(false);
            size = 4;
        }
        if (jComboBox1.getSelectedItem().toString().equals("5 x 5")) {
            jTextField4.setEnabled(true);
            jTextField12.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField11.setEnabled(true);
            jTextField9.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField10.setEnabled(true);
            jTextField16.setEnabled(true);
            jTextField15.setEnabled(true);
            jTextField14.setEnabled(true);
            jTextField13.setEnabled(true);
            jTextField25.setEnabled(true);
            jTextField24.setEnabled(true);
            jTextField23.setEnabled(true);
            jTextField22.setEnabled(true);
            jTextField21.setEnabled(true);
            jTextField17.setEnabled(true);
            jTextField18.setEnabled(true);
            jTextField19.setEnabled(true);
            jTextField20.setEnabled(true);
            jTextField36.setEnabled(false);
            jTextField35.setEnabled(false);
            jTextField34.setEnabled(false);
            jTextField33.setEnabled(false);
            jTextField32.setEnabled(false);
            jTextField31.setEnabled(false);
            jTextField30.setEnabled(false);
            jTextField29.setEnabled(false);
            jTextField28.setEnabled(false);
            jTextField27.setEnabled(false);
            jTextField26.setEnabled(false);
            jTextField37.setEnabled(false);
            jTextField38.setEnabled(false);
            jTextField39.setEnabled(false);
            jTextField40.setEnabled(false);
            jTextField41.setEnabled(false);
            jTextField42.setEnabled(false);
            jTextField43.setEnabled(false);
            jTextField44.setEnabled(false);
            jTextField45.setEnabled(false);
            jTextField46.setEnabled(false);
            jTextField47.setEnabled(false);
            jTextField48.setEnabled(false);
            jTextField49.setEnabled(false);
            //работаем с видимостью обратной матрицы
            jTextField52.setEnabled(true);                              
            jTextField53.setEnabled(true);
            jTextField56.setEnabled(true);
            jTextField57.setEnabled(true);
            jTextField58.setEnabled(true);
            jTextField77.setEnabled(true);
            jTextField76.setEnabled(true);
            jTextField75.setEnabled(true);
            jTextField74.setEnabled(true);
            jTextField59.setEnabled(true);
            jTextField60.setEnabled(true);
            jTextField61.setEnabled(true);
            jTextField78.setEnabled(true);
            jTextField79.setEnabled(true);
            jTextField80.setEnabled(true);
            jTextField81.setEnabled(true);
            jTextField82.setEnabled(true);
            jTextField73.setEnabled(true);
            jTextField64.setEnabled(true);
            jTextField63.setEnabled(true);
            jTextField62.setEnabled(true);
            jTextField91.setEnabled(false);
            jTextField90.setEnabled(false);
            jTextField89.setEnabled(false);
            jTextField88.setEnabled(false);
            jTextField87.setEnabled(false);
            jTextField86.setEnabled(false);
            jTextField83.setEnabled(false);
            jTextField72.setEnabled(false);
            jTextField65.setEnabled(false);
            jTextField66.setEnabled(false);
            jTextField67.setEnabled(false);
            jTextField92.setEnabled(false);
            jTextField93.setEnabled(false);
            jTextField94.setEnabled(false);
            jTextField95.setEnabled(false);
            jTextField96.setEnabled(false);
            jTextField97.setEnabled(false);
            jTextField98.setEnabled(false);
            jTextField85.setEnabled(false);
            jTextField84.setEnabled(false);
            jTextField71.setEnabled(false);
            jTextField70.setEnabled(false);
            jTextField69.setEnabled(false);
            jTextField68.setEnabled(false);
            size = 5;
        }
        if (jComboBox1.getSelectedItem().toString().equals("6 x 6")) {
            jTextField4.setEnabled(true);
            jTextField12.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField11.setEnabled(true);
            jTextField9.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField10.setEnabled(true);
            jTextField16.setEnabled(true);
            jTextField15.setEnabled(true);
            jTextField14.setEnabled(true);
            jTextField13.setEnabled(true);
            jTextField25.setEnabled(true);
            jTextField24.setEnabled(true);
            jTextField23.setEnabled(true);
            jTextField22.setEnabled(true);
            jTextField21.setEnabled(true);
            jTextField17.setEnabled(true);
            jTextField18.setEnabled(true);
            jTextField19.setEnabled(true);
            jTextField20.setEnabled(true);
            jTextField36.setEnabled(true);
            jTextField35.setEnabled(true);
            jTextField34.setEnabled(true);
            jTextField33.setEnabled(true);
            jTextField32.setEnabled(true);
            jTextField31.setEnabled(true);
            jTextField30.setEnabled(true);
            jTextField29.setEnabled(true);
            jTextField28.setEnabled(true);
            jTextField27.setEnabled(true);
            jTextField26.setEnabled(true);
            jTextField37.setEnabled(false);
            jTextField38.setEnabled(false);
            jTextField39.setEnabled(false);
            jTextField40.setEnabled(false);
            jTextField41.setEnabled(false);
            jTextField42.setEnabled(false);
            jTextField43.setEnabled(false);
            jTextField44.setEnabled(false);
            jTextField45.setEnabled(false);
            jTextField46.setEnabled(false);
            jTextField47.setEnabled(false);
            jTextField48.setEnabled(false);
            jTextField49.setEnabled(false);
            //работаем с видимостью обратной матрицы
            jTextField52.setEnabled(true);                              
            jTextField53.setEnabled(true);
            jTextField56.setEnabled(true);
            jTextField57.setEnabled(true);
            jTextField58.setEnabled(true);
            jTextField77.setEnabled(true);
            jTextField76.setEnabled(true);
            jTextField75.setEnabled(true);
            jTextField74.setEnabled(true);
            jTextField59.setEnabled(true);
            jTextField60.setEnabled(true);
            jTextField61.setEnabled(true);
            jTextField78.setEnabled(true);
            jTextField79.setEnabled(true);
            jTextField80.setEnabled(true);
            jTextField81.setEnabled(true);
            jTextField82.setEnabled(true);
            jTextField73.setEnabled(true);
            jTextField64.setEnabled(true);
            jTextField63.setEnabled(true);
            jTextField62.setEnabled(true);
            jTextField91.setEnabled(true);
            jTextField90.setEnabled(true);
            jTextField89.setEnabled(true);
            jTextField88.setEnabled(true);
            jTextField87.setEnabled(true);
            jTextField86.setEnabled(true);
            jTextField83.setEnabled(true);
            jTextField72.setEnabled(true);
            jTextField65.setEnabled(true);
            jTextField66.setEnabled(true);
            jTextField67.setEnabled(true);
            jTextField92.setEnabled(false);
            jTextField93.setEnabled(false);
            jTextField94.setEnabled(false);
            jTextField95.setEnabled(false);
            jTextField96.setEnabled(false);
            jTextField97.setEnabled(false);
            jTextField98.setEnabled(false);
            jTextField85.setEnabled(false);
            jTextField84.setEnabled(false);
            jTextField71.setEnabled(false);
            jTextField70.setEnabled(false);
            jTextField69.setEnabled(false);
            jTextField68.setEnabled(false);
            size = 6;
        }
        if (jComboBox1.getSelectedItem().toString().equals("7 x 7")) {
            jTextField4.setEnabled(true);
            jTextField12.setEnabled(true);
            jTextField3.setEnabled(true);
            jTextField11.setEnabled(true);
            jTextField9.setEnabled(true);
            jTextField8.setEnabled(true);
            jTextField7.setEnabled(true);
            jTextField10.setEnabled(true);
            jTextField16.setEnabled(true);
            jTextField15.setEnabled(true);
            jTextField14.setEnabled(true);
            jTextField13.setEnabled(true);
            jTextField25.setEnabled(true);
            jTextField24.setEnabled(true);
            jTextField23.setEnabled(true);
            jTextField22.setEnabled(true);
            jTextField21.setEnabled(true);
            jTextField17.setEnabled(true);
            jTextField18.setEnabled(true);
            jTextField19.setEnabled(true);
            jTextField20.setEnabled(true);
            jTextField36.setEnabled(true);
            jTextField35.setEnabled(true);
            jTextField34.setEnabled(true);
            jTextField33.setEnabled(true);
            jTextField32.setEnabled(true);
            jTextField31.setEnabled(true);
            jTextField30.setEnabled(true);
            jTextField29.setEnabled(true);
            jTextField28.setEnabled(true);
            jTextField27.setEnabled(true);
            jTextField26.setEnabled(true);
            jTextField37.setEnabled(true);
            jTextField38.setEnabled(true);
            jTextField39.setEnabled(true);
            jTextField40.setEnabled(true);
            jTextField41.setEnabled(true);
            jTextField42.setEnabled(true);
            jTextField43.setEnabled(true);
            jTextField44.setEnabled(true);
            jTextField45.setEnabled(true);
            jTextField46.setEnabled(true);
            jTextField47.setEnabled(true);
            jTextField48.setEnabled(true);
            jTextField49.setEnabled(true);
            //работаем с видимостью обратной матрицы
            jTextField52.setEnabled(true);                              
            jTextField53.setEnabled(true);
            jTextField56.setEnabled(true);
            jTextField57.setEnabled(true);
            jTextField58.setEnabled(true);
            jTextField77.setEnabled(true);
            jTextField76.setEnabled(true);
            jTextField75.setEnabled(true);
            jTextField74.setEnabled(true);
            jTextField59.setEnabled(true);
            jTextField60.setEnabled(true);
            jTextField61.setEnabled(true);
            jTextField78.setEnabled(true);
            jTextField79.setEnabled(true);
            jTextField80.setEnabled(true);
            jTextField81.setEnabled(true);
            jTextField82.setEnabled(true);
            jTextField73.setEnabled(true);
            jTextField64.setEnabled(true);
            jTextField63.setEnabled(true);
            jTextField62.setEnabled(true);
            jTextField91.setEnabled(true);
            jTextField90.setEnabled(true);
            jTextField89.setEnabled(true);
            jTextField88.setEnabled(true);
            jTextField87.setEnabled(true);
            jTextField86.setEnabled(true);
            jTextField83.setEnabled(true);
            jTextField72.setEnabled(true);
            jTextField65.setEnabled(true);
            jTextField66.setEnabled(true);
            jTextField67.setEnabled(true);
            jTextField92.setEnabled(true);
            jTextField93.setEnabled(true);
            jTextField94.setEnabled(true);
            jTextField95.setEnabled(true);
            jTextField96.setEnabled(true);
            jTextField97.setEnabled(true);
            jTextField98.setEnabled(true);
            jTextField85.setEnabled(true);
            jTextField84.setEnabled(true);
            jTextField71.setEnabled(true);
            jTextField70.setEnabled(true);
            jTextField69.setEnabled(true);
            jTextField68.setEnabled(true);
            size = 7;
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(true);
        jDialog1.setSize(400,200);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        jDialog1.setLocation(dim.width/4, dim.height/4);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i,j,k;
        matrix = new float[size][size];
        E = new float[size][size];
        
        //Берем значения из интерфейса
        try{
        matrix[0][0] = Float.valueOf(jTextField6.getText());
        matrix[1][0] = Float.valueOf(jTextField5.getText());
        matrix[0][1] = Float.valueOf(jTextField1.getText());
        matrix[1][1] = Float.valueOf(jTextField2.getText());
        if (size>=3) {       //размер матрицы 3 или >
             matrix[2][0] = Float.valueOf(jTextField4.getText());
            matrix[2][1] = Float.valueOf(jTextField3.getText());
            matrix[0][2] = Float.valueOf(jTextField9.getText());
            matrix[1][2] = Float.valueOf(jTextField8.getText());
            matrix[2][2] = Float.valueOf(jTextField7.getText());
        }
        if (size>=4) {       //размер матрицы 4 или >
            matrix[3][0] = Float.valueOf(jTextField12.getText());
            matrix[3][1] = Float.valueOf(jTextField11.getText());
            matrix[3][2] = Float.valueOf(jTextField10.getText());
            matrix[0][3] = Float.valueOf(jTextField16.getText());
            matrix[1][3] = Float.valueOf(jTextField15.getText());
            matrix[2][3] = Float.valueOf(jTextField14.getText());
            matrix[3][3] = Float.valueOf(jTextField13.getText());
        }
        if (size>=5) {       //размер матрицы 5 или >
            matrix[4][0] = Float.valueOf(jTextField20.getText());
            matrix[4][1] = Float.valueOf(jTextField19.getText());
            matrix[4][2] = Float.valueOf(jTextField18.getText());
            matrix[4][3] = Float.valueOf(jTextField17.getText());
            matrix[0][4] = Float.valueOf(jTextField25.getText());
            matrix[1][4] = Float.valueOf(jTextField24.getText());
            matrix[2][4] = Float.valueOf(jTextField23.getText());
            matrix[3][4] = Float.valueOf(jTextField22.getText());
            matrix[4][4] = Float.valueOf(jTextField21.getText());
        }
        if (size>=6) {      //размер матрицы 6 или >
            matrix[5][0] = Float.valueOf(jTextField26.getText());
            matrix[5][1] = Float.valueOf(jTextField27.getText());
            matrix[5][2] = Float.valueOf(jTextField28.getText());
            matrix[5][3] = Float.valueOf(jTextField29.getText());
            matrix[5][4] = Float.valueOf(jTextField30.getText());
            matrix[0][5] = Float.valueOf(jTextField36.getText());
            matrix[1][5] = Float.valueOf(jTextField35.getText());
            matrix[2][5] = Float.valueOf(jTextField34.getText());
            matrix[3][5] = Float.valueOf(jTextField33.getText());
            matrix[4][5] = Float.valueOf(jTextField32.getText());
            matrix[5][5] = Float.valueOf(jTextField31.getText());
        }
        if (size==7) {      //размер матрицы 7
            matrix[6][0] = Float.valueOf(jTextField49.getText());
            matrix[6][1] = Float.valueOf(jTextField48.getText());
            matrix[6][2] = Float.valueOf(jTextField47.getText());
            matrix[6][3] = Float.valueOf(jTextField46.getText());
            matrix[6][4] = Float.valueOf(jTextField45.getText());
            matrix[6][5] = Float.valueOf(jTextField44.getText());
            matrix[0][6] = Float.valueOf(jTextField37.getText());
            matrix[1][6] = Float.valueOf(jTextField38.getText());
            matrix[2][6] = Float.valueOf(jTextField39.getText());
            matrix[3][6] = Float.valueOf(jTextField40.getText());
            matrix[4][6] = Float.valueOf(jTextField41.getText());
            matrix[5][6] = Float.valueOf(jTextField42.getText());
            matrix[6][6] = Float.valueOf(jTextField43.getText());
        }
        }catch(IllegalArgumentException e){
            System.err.println("Ошибка: " + e);
            jDialog2.setVisible(true);
            jDialog2.setSize(460,200);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            jDialog2.setLocation(dim.width/4, dim.height/4);
        }
        //заполнение единичной матрицы
        for (i=0;i<size;i++){
            for (j=0;j<size;j++){    
                if (i==j) 
                    E[i][j]=1;
                else 
                    E[i][j]=0;
            }
        }
        //Задаём номер ведущей строки (сначала 0,1...size)
        try{
            for (k=0;k<size;k++){    
                for (j=k+1;j<size;j++){
                    matrix[k][j]=matrix[k][j]/matrix[k][k];//все элементы k-ой строки матрицы A, кроме k-ого и до него, делим на разрешающий элемент - a[k][k]  
                }
            for (j=0;j<size;j++){
                E[k][j]=E[k][j]/matrix[k][k];//все элементы k-ой строки матрицы e, делим на разрешающий элемент - a[k][k]    
            }
            matrix[k][k]=matrix[k][k]/matrix[k][k];//элемент соответствующий  разрещающему - делим на самого себя(т.е получит. 1 )
            //идём сверху вниз, обходя k-ую строку 
            if (k>0) {//если номер ведущей строки не первый
                for (i=0;i<k;i++){   //строки, находящиеся выше k-ой
                    for (j=0;j<size;j++){
                        E[i][j]=E[i][j]-E[k][j]*matrix[i][k];//Вычисляем элементы матрицы e,идя по столбцам с 0 -ого  к последнему  
                    }
                    for (j=size-1;j>=k;j--){
                        matrix[i][j]=matrix[i][j]-matrix[k][j]*matrix[i][k];//Вычисляем элементы матрицы a,идя по столбцам с последнего к k-ому
                    }
                }    
            }
            for (i=k+1;i<size;i++){   //строки, находящиеся ниже k-ой 
                for (j=0;j<size;j++){    
                    E[i][j]=E[i][j]-E[k][j]*matrix[i][k];
                }
                for (j=size-1;j>=k;j--){
                    matrix[i][j]=matrix[i][j]-matrix[k][j]*matrix[i][k];
                }
            }
            }
        for (int l = 0; l < size; l++) {
            System.out.println();
            for (int m = 0; m < size; m++) {
                System.out.print(E[l][m] + " ");
            }
        }
        }catch(ArithmeticException e){
            System.err.println("Ошибка: " + e );
            
        }
        //Выводим на экран результаты
        jTextField51.setText(String.valueOf(E[0][0]));
        jTextField55.setText(String.valueOf(E[1][0]));
        jTextField50.setText(String.valueOf(E[0][1]));
        jTextField54.setText(String.valueOf(E[1][1]));
        if (size>=3) {       //размер матрицы 3 или >
            jTextField56.setText(String.valueOf(E[2][0]));
            jTextField57.setText(String.valueOf(E[2][1]));
            jTextField52.setText(String.valueOf(E[0][2]));
            jTextField53.setText(String.valueOf(E[1][2]));
            jTextField58.setText(String.valueOf(E[2][2]));
        }
        if (size>=4) {       //размер матрицы 4 или >
            jTextField61.setText(String.valueOf(E[3][0]));
            jTextField60.setText(String.valueOf(E[3][1]));
            jTextField59.setText(String.valueOf(E[3][2]));
            jTextField77.setText(String.valueOf(E[0][3]));
            jTextField76.setText(String.valueOf(E[1][3]));
            jTextField75.setText(String.valueOf(E[2][3]));
            jTextField74.setText(String.valueOf(E[3][3]));
        }
        if (size>=5) {       //размер матрицы 5 или >
            jTextField62.setText(String.valueOf(E[4][0]));
            jTextField63.setText(String.valueOf(E[4][1]));
            jTextField64.setText(String.valueOf(E[4][2]));
            jTextField73.setText(String.valueOf(E[4][3]));
            jTextField78.setText(String.valueOf(E[0][4]));
            jTextField79.setText(String.valueOf(E[1][4]));
            jTextField80.setText(String.valueOf(E[2][4]));
            jTextField81.setText(String.valueOf(E[3][4]));
            jTextField82.setText(String.valueOf(E[4][4]));
        }
        if (size>=6) {      //размер матрицы 6 или >
            jTextField67.setText(String.valueOf(E[5][0]));
            jTextField66.setText(String.valueOf(E[5][1]));
            jTextField65.setText(String.valueOf(E[5][2]));
            jTextField72.setText(String.valueOf(E[5][3]));
            jTextField83.setText(String.valueOf(E[5][4]));
            jTextField91.setText(String.valueOf(E[0][5]));
            jTextField90.setText(String.valueOf(E[1][5]));
            jTextField89.setText(String.valueOf(E[2][5]));
            jTextField88.setText(String.valueOf(E[3][5]));
            jTextField87.setText(String.valueOf(E[4][5]));
            jTextField86.setText(String.valueOf(E[5][5]));
        }
        if (size==7) {      //размер матрицы 7
            jTextField68.setText(String.valueOf(E[6][0]));
            jTextField69.setText(String.valueOf(E[6][1]));
            jTextField70.setText(String.valueOf(E[6][2]));
            jTextField71.setText(String.valueOf(E[6][3]));
            jTextField84.setText(String.valueOf(E[6][4]));
            jTextField85.setText(String.valueOf(E[6][5]));
            jTextField92.setText(String.valueOf(E[0][6]));
            jTextField93.setText(String.valueOf(E[1][6]));
            jTextField94.setText(String.valueOf(E[2][6]));
            jTextField95.setText(String.valueOf(E[3][6]));
            jTextField96.setText(String.valueOf(E[4][6]));
            jTextField97.setText(String.valueOf(E[5][6]));
            jTextField98.setText(String.valueOf(E[6][6]));
        }
        //------------------------------------------------
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jDialog3.setVisible(true);
        jDialog3.setSize(400,200);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        jDialog3.setLocation(dim.width/4, dim.height/4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

        public static void main(String args[]) {
        
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    private javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    private javax.swing.JTextField jTextField88;
    private javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField91;
    private javax.swing.JTextField jTextField92;
    private javax.swing.JTextField jTextField93;
    private javax.swing.JTextField jTextField94;
    private javax.swing.JTextField jTextField95;
    private javax.swing.JTextField jTextField96;
    private javax.swing.JTextField jTextField97;
    private javax.swing.JTextField jTextField98;
    // End of variables declaration//GEN-END:variables
}
