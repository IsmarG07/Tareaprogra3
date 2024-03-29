/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectprogra2;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import clases.pacientes;
import clases.pacientes2;
import clases.postgreeconexion;
import static java.awt.SystemColor.menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anaca
 */
public class ModifcarReporte extends javax.swing.JFrame {

    /**
     * Creates new form ModifcarReporte
     */
     paciente pacin = new paciente();
     pacientes2 varpacin = new pacientes2();
    public ModifcarReporte() {
        initComponents();
        mostrareport();
        color();
        SetDate();
        
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
        jPanel2 = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        menus = new javax.swing.JPanel();
        mensaje2 = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        newreporte = new javax.swing.JButton();
        elireporte = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ATRAS4 = new javax.swing.JButton();
        fondo2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alergias3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        horaingreso3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        horaegreso3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nopaciente3 = new javax.swing.JTextField();
        papellido3 = new javax.swing.JTextField();
        nombres3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dpi3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cabeza = new javax.swing.JPanel();
        mensaje1 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(127, 181, 181));

        mensaje.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        mensaje.setText("MODIFICAR HISTORIAL CLINICO");

        menus.setBackground(new java.awt.Color(127, 181, 181));
        menus.setForeground(new java.awt.Color(51, 51, 255));
        menus.setPreferredSize(new java.awt.Dimension(270, 640));

        mensaje2.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        mensaje2.setText("HOSPITAL DE DIOS");

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setPreferredSize(new java.awt.Dimension(160, 22));

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(127, 181, 181));
        jButton1.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIO");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(10);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        newreporte.setBackground(new java.awt.Color(127, 181, 181));
        newreporte.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        newreporte.setForeground(new java.awt.Color(255, 255, 255));
        newreporte.setText("MODIFICAR REPORTE");
        newreporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newreporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        newreporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newreporte.setMaximumSize(new java.awt.Dimension(42, 20));
        newreporte.setMinimumSize(new java.awt.Dimension(42, 20));
        newreporte.setPreferredSize(new java.awt.Dimension(42, 20));
        newreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newreporteActionPerformed(evt);
            }
        });

        elireporte.setBackground(new java.awt.Color(127, 181, 181));
        elireporte.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        elireporte.setForeground(new java.awt.Color(255, 255, 255));
        elireporte.setText("ELIMINAR");
        elireporte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        elireporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        elireporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        elireporte.setMaximumSize(new java.awt.Dimension(42, 20));
        elireporte.setMinimumSize(new java.awt.Dimension(42, 20));
        elireporte.setPreferredSize(new java.awt.Dimension(42, 20));
        elireporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elireporteActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(127, 181, 181));
        jButton2.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIO");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(10);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ATRAS4.setBackground(new java.awt.Color(127, 181, 181));
        ATRAS4.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        ATRAS4.setForeground(new java.awt.Color(255, 255, 255));
        ATRAS4.setText("ATRAS");
        ATRAS4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ATRAS4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ATRAS4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ATRAS4.setMaximumSize(new java.awt.Dimension(42, 20));
        ATRAS4.setMinimumSize(new java.awt.Dimension(42, 20));
        ATRAS4.setPreferredSize(new java.awt.Dimension(42, 20));
        ATRAS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRAS4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menusLayout = new javax.swing.GroupLayout(menus);
        menus.setLayout(menusLayout);
        menusLayout.setHorizontalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(elireporte, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ATRAS4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menusLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menusLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mensaje2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(mensaje2)
                .addGap(6, 6, 6)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menusLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(elireporte, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menusLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(ATRAS4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menusLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(newreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menusLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        fondo2.setBackground(new java.awt.Color(127, 181, 181));

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel1.setText("Diagnostico del Afiliado");

        alergias3.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        alergias3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-", "Alergia a alimentos.", "Alergia a fármacos.", "Asma alérgico.", "Dermatitis atópica.", "Poliposis nasal.", "Rinitis alérgica.", "Urticaria crónica." }));

        jLabel2.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel2.setText("Observacón del Afiliado");

        observacion3.setColumns(20);
        observacion3.setRows(5);
        jScrollPane1.setViewportView(observacion3);

        jLabel3.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel3.setText("Fecha y hora del ingreso del Afiliado");

        horaingreso3.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel4.setText("Fecha y hora de salida del Afiliado");

        horaegreso3.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel5.setText("Correlativo del Afiliado");

        jLabel6.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel6.setText("Nombre del Afiliado");

        jLabel7.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel7.setText("Apellido del paciente");

        jLabel8.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jLabel8.setText("DPI ");

        javax.swing.GroupLayout fondo2Layout = new javax.swing.GroupLayout(fondo2);
        fondo2.setLayout(fondo2Layout);
        fondo2Layout.setHorizontalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(fondo2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(214, 214, 214))
                                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondo2Layout.createSequentialGroup()
                                        .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nombres3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nopaciente3)
                                            .addComponent(papellido3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(102, 102, 102))
                                    .addGroup(fondo2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(228, 228, 228))))
                            .addGroup(fondo2Layout.createSequentialGroup()
                                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(alergias3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(horaingreso3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                        .addComponent(horaegreso3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(84, 84, 84)))
                        .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondo2Layout.createSequentialGroup()
                                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(fondo2Layout.createSequentialGroup()
                                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dpi3)
                                    .addGroup(fondo2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(126, 126, 126)))
                                .addContainerGap())))))
        );
        fondo2Layout.setVerticalGroup(
            fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addComponent(nopaciente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombres3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addComponent(papellido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(fondo2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alergias3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaingreso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaegreso3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        cabeza.setBackground(new java.awt.Color(127, 181, 181));
        cabeza.setPreferredSize(new java.awt.Dimension(750, 150));

        mensaje1.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        mensaje1.setText("SISTEMA PARA MODIFICAR O ELIMINAR UN REPORTE EXISTENTE");

        hora.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        hora.setText("FECHA:  {dayname}  {day} de {month} de {year}");

        javax.swing.GroupLayout cabezaLayout = new javax.swing.GroupLayout(cabeza);
        cabeza.setLayout(cabezaLayout);
        cabezaLayout.setHorizontalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                    .addComponent(mensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cabezaLayout.setVerticalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(mensaje1)
                .addGap(18, 18, 18)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(menus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(cabeza, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(cabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fondo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void color(){
        mensaje.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        mensaje.setForeground(Color.black);
        mensaje1.putClientProperty( "FlatLaf.style", "font: 15 $light.font" );
        mensaje1.setForeground(Color.black);
        mensaje2.putClientProperty( "FlatLaf.style", "font: 20 $light.font" );
        mensaje2.setForeground(Color.white);
        hora.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
        hora.setForeground(Color.black);
    }
    
     private void SetDate(){
        
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        hora.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'De' MMMM 'De' yyyy", spanishLocale)));
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void newreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newreporteActionPerformed

        varpacin.setNopaciente1(nopaciente3.getText());
        varpacin.setPrimerapellido1(papellido3.getText());
        varpacin.setNombres1(nombres3.getText());
        varpacin.setDpi1(dpi3.getText());
        varpacin.setObservacion1(observacion3.getText());
        varpacin.setHoraingreso1(horaingreso3.getText());
        varpacin.setAlergias1(alergias3.getSelectedItem().toString());
        varpacin.setHoraegreso1(horaegreso3.getText());
            
        actualizar(varpacin.getNopaciente1(), varpacin.getPrimerapellido1(),  varpacin.getNombres1(), varpacin.getDpi1(), varpacin.getAlergias1(), 
               varpacin.getObservacion1(), varpacin.getHoraingreso1(), varpacin.getHoraegreso1());
        
         Reporte reporte = new Reporte();
        reporte.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_newreporteActionPerformed

      private void actualizar(String nopaciente, String primerapellido, String nombres, String dpi, String alergias,
            String observacion, String horaingreso, String horaegreso){
        try {
              postgreeconexion conexion = new postgreeconexion();
            Connection CONEXION = conexion.connectarPostgree();
             Statement statement;

            statement = CONEXION.createStatement(); 
            
             String SQL = "UPDATE public.registro "+
                     "set primer_apellido = '"+primerapellido+"', nombres = '"+nombres+"', dpi = '"+dpi+"',"+
                     " observacion = '"+observacion+"', hora_ingreso = '"+horaingreso+"', alergias = '"+alergias+"', hora_egreso = '"+horaegreso+"' WHERE no_paciente = '"+nopaciente+"'; ";
             statement.executeUpdate(SQL);
             CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
            CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conexion = null;
          JOptionPane.showMessageDialog(null,"el registro se actualizo", "Exito", JOptionPane.INFORMATION_MESSAGE);
         
        } catch (Exception e) {
       JOptionPane.showMessageDialog(null,"Error al actualizar"+e, "Error", JOptionPane.ERROR_MESSAGE);

        }
    }
    
     private void eliminar(String nopaciente ){
        try {
            
             postgreeconexion conexion = new postgreeconexion();
            Connection CONEXION = conexion.connectarPostgree();
             Statement statement;

            statement = CONEXION.createStatement(); 
            
            String SQL = "DELETE FROM public.registro WHERE no_paciente = '"+nopaciente+"'; ";
            statement.executeUpdate(SQL);
            CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
            CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conexion = null;
            JOptionPane.showMessageDialog(null,"el registro eliminado correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
 
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error al eliminar el registro"+e, "Error", JOptionPane.ERROR_MESSAGE);

        }
   
    }
    
    private void elireporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elireporteActionPerformed
        // TODO add your handling code here:
        
         varpacin.setNopaciente1(nopaciente3.getText());
        eliminar(varpacin.getNopaciente1());
        
         Reporte reporte = new Reporte();
        reporte.setVisible(true);
         this.dispose();
        
    }//GEN-LAST:event_elireporteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ATRAS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRAS4ActionPerformed
        // TODO add your handling code here:
           Reporte reporte = new Reporte();
        reporte.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_ATRAS4ActionPerformed

    
      private void mostrareport(){
      nopaciente3.setEditable(false);
      nopaciente3.setText(varpacin.getNopaciente1());
      papellido3.setText(varpacin.getPrimerapellido1());
      nombres3.setText(varpacin.getNombres1());
      dpi3.setText(varpacin.getDpi1());
      alergias3.setSelectedItem(varpacin.getAlergias1());
      observacion3.setText(varpacin.getObservacion1());
      horaingreso3.setText(varpacin.getHoraingreso1());
      horaegreso3.setText(varpacin.getHoraegreso1());
      
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
            java.util.logging.Logger.getLogger(ModifcarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifcarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifcarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifcarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifcarReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS4;
    private javax.swing.JComboBox<String> alergias3;
    private javax.swing.JPanel barra;
    private javax.swing.JPanel cabeza;
    private javax.swing.JTextField dpi3;
    private javax.swing.JButton elireporte;
    private javax.swing.JPanel fondo2;
    private javax.swing.JLabel hora;
    private javax.swing.JTextField horaegreso3;
    private javax.swing.JTextField horaingreso3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel mensaje1;
    private javax.swing.JLabel mensaje2;
    private javax.swing.JPanel menus;
    private javax.swing.JButton newreporte;
    private javax.swing.JTextField nombres3;
    private javax.swing.JTextField nopaciente3;
    private javax.swing.JTextArea observacion3;
    private javax.swing.JTextField papellido3;
    // End of variables declaration//GEN-END:variables
}
