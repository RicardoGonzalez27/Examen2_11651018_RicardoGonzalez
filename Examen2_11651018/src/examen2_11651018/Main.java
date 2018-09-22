/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_11651018;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Richard
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {

        initComponents();

        hora h = new hora(lb_hora);
        Thread proceso1 = new Thread(h);
        proceso1.start();
        hora hh = new hora(lb_hora2);
        Thread proceso2 = new Thread(hh);
        proceso2.start();
        try {
            administraratm ap = new administraratm("./ATMS.lab");
            ap.cargarArchivoATM();
            for (int i = 0; i < ap.getATMs().size(); i++) {
                ids_atms.add(((ATM) ap.getATMs().get(i)).getId());
            }
            for (int i = 0; i < ids_atms.size(); i++) {
                System.out.println((Integer) ids_atms.get(i));
            }

            administrarbinario au = new administrarbinario("./Usuario.lab");
            au.cargarArchivoUsuario();
            for (int i = 0; i < au.getUsuarios().size(); i++) {
                ids_usuarios.add(((Usuario) au.getUsuarios().get(i)).getId());
            }
            for (int i = 0; i < ids_atms.size(); i++) {
                System.out.println((Integer) ids_usuarios.get(i));
            }

            intentos = 0;
            System.out.println(intentos);
        } catch (Exception e) {
            System.out.println("Oh no");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CreacionUsuario = new javax.swing.JDialog();
        panel_usuarios = new javax.swing.JPanel();
        usuario_nombre = new javax.swing.JTextField();
        usuario_nombredos = new javax.swing.JTextField();
        usuario_apellido = new javax.swing.JTextField();
        usuario_apellidodos = new javax.swing.JTextField();
        usuario_id = new javax.swing.JTextField();
        usuario_contraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        nuevousuario = new javax.swing.JButton();
        usuario_nacimiento = new javax.swing.JSpinner();
        CreacionATM = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        newatm_ubicacion = new javax.swing.JTextField();
        newatm_id = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        newatm_quinientos = new javax.swing.JSpinner();
        newatm_cien = new javax.swing.JSpinner();
        cb_atmtemp = new javax.swing.JComboBox<>();
        cb_atmnum = new javax.swing.JComboBox<>();
        newatm_año = new javax.swing.JSpinner();
        ClienteLogIn = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        MantenimientoLogIn = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        NuevaCuenta = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        cuenta_saldo = new javax.swing.JTextField();
        cuenta_numero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_hora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        login_user = new javax.swing.JTextField();
        login_pass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lb_hora2 = new javax.swing.JLabel();

        panel_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuario_nombreActionPerformed(evt);
            }
        });
        panel_usuarios.add(usuario_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));
        panel_usuarios.add(usuario_nombredos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));
        panel_usuarios.add(usuario_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, -1));
        panel_usuarios.add(usuario_apellidodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));
        panel_usuarios.add(usuario_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, -1));
        panel_usuarios.add(usuario_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 170, -1));

        jLabel2.setText("Nombre");
        panel_usuarios.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Segundo Nombre");
        panel_usuarios.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Apellido");
        panel_usuarios.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setText("Segundo Apellido");
        panel_usuarios.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setText("ID");
        panel_usuarios.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel7.setText("Año de Nacimiento");
        panel_usuarios.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel8.setText("Contraseña");
        panel_usuarios.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel9.setText("NUEVO USUARIO");
        panel_usuarios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 20));

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Mantenimiento" }));
        panel_usuarios.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 270, -1));

        nuevousuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nuevousuario.setText("Crear");
        nuevousuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevousuarioMouseClicked(evt);
            }
        });
        panel_usuarios.add(nuevousuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 260, 100));

        usuario_nacimiento.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2000, 1));
        panel_usuarios.add(usuario_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 170, -1));

        javax.swing.GroupLayout CreacionUsuarioLayout = new javax.swing.GroupLayout(CreacionUsuario.getContentPane());
        CreacionUsuario.getContentPane().setLayout(CreacionUsuarioLayout);
        CreacionUsuarioLayout.setHorizontalGroup(
            CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CreacionUsuarioLayout.setVerticalGroup(
            CreacionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newatm_ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newatm_ubicacionActionPerformed(evt);
            }
        });
        jPanel3.add(newatm_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));
        jPanel3.add(newatm_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        jLabel18.setText("Ubicacion");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel19.setText("ID");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel20.setText("Año");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel21.setText("Mantenimiento");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel22.setText("Billetes Quinientos");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel23.setText("Billetes Cien");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel25.setText("NUEVO ATM");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, 20));

        jButton6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton6.setText("Crear");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 260, 100));

        newatm_quinientos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(newatm_quinientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, -1));

        newatm_cien.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel3.add(newatm_cien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 170, -1));

        cb_atmtemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diario", "Semanal", "Mensual", "Anual" }));
        jPanel3.add(cb_atmtemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 190, 100, -1));

        cb_atmnum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(cb_atmnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 60, -1));

        newatm_año.setModel(new javax.swing.SpinnerNumberModel(1970, 1970, 2018, 1));
        jPanel3.add(newatm_año, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, -1));

        javax.swing.GroupLayout CreacionATMLayout = new javax.swing.GroupLayout(CreacionATM.getContentPane());
        CreacionATM.getContentPane().setLayout(CreacionATMLayout);
        CreacionATMLayout.setHorizontalGroup(
            CreacionATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        CreacionATMLayout.setVerticalGroup(
            CreacionATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreacionATMLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 550, -1));

        jButton7.setText("Ingresar dinero a una de las de otra persona");
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 310, 40));

        jButton8.setText("Crear una nueva cuenta");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 310, 40));

        jButton9.setText("Revisar el estado de una cuenta");
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 310, 40));

        jButton10.setText("Transacciones Realizadas sobre sus cuentas");
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 310, 40));

        jButton5.setText("Retirar dinero de cualquiera de las cuentas");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 310, 40));

        jButton11.setText("Ingresar dinero a cualquiera de las cuentas");
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 310, 40));
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 40, 10));

        javax.swing.GroupLayout ClienteLogInLayout = new javax.swing.GroupLayout(ClienteLogIn.getContentPane());
        ClienteLogIn.getContentPane().setLayout(ClienteLogInLayout);
        ClienteLogInLayout.setHorizontalGroup(
            ClienteLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLogInLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ClienteLogInLayout.setVerticalGroup(
            ClienteLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteLogInLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jButton12.setText("jButton12");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("jButton4");
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 41, -1, -1));

        javax.swing.GroupLayout MantenimientoLogInLayout = new javax.swing.GroupLayout(MantenimientoLogIn.getContentPane());
        MantenimientoLogIn.getContentPane().setLayout(MantenimientoLogInLayout);
        MantenimientoLogInLayout.setHorizontalGroup(
            MantenimientoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(MantenimientoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MantenimientoLogInLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MantenimientoLogInLayout.setVerticalGroup(
            MantenimientoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(MantenimientoLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MantenimientoLogInLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(cuenta_saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 170, -1));

        cuenta_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuenta_numeroActionPerformed(evt);
            }
        });
        jPanel6.add(cuenta_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, -1));

        jLabel12.setText("Saldo");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel14.setText("Numero de la Cuenta");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jButton13.setText("Crear");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 130, -1));

        javax.swing.GroupLayout NuevaCuentaLayout = new javax.swing.GroupLayout(NuevaCuenta.getContentPane());
        NuevaCuenta.getContentPane().setLayout(NuevaCuentaLayout);
        NuevaCuentaLayout.setHorizontalGroup(
            NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NuevaCuentaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        NuevaCuentaLayout.setVerticalGroup(
            NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(NuevaCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NuevaCuentaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Creacion de Usuario");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 320, -1));

        jButton2.setText("Creacion de ATM");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 320, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("BANCO LOS CHAMBEADORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        lb_hora.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lb_hora.setText("00:00:00");
        jPanel1.add(lb_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTabbedPane1.addTab("Creacion", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 430, -1));
        jPanel2.add(login_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 430, -1));

        jLabel10.setText("INICIO DE SESION");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jButton3.setText("Log In");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        lb_hora2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lb_hora2.setText("00:00:00");
        jPanel2.add(lb_hora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTabbedPane1.addTab("Acceso", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuario_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuario_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuario_nombreActionPerformed

    private void newatm_ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newatm_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newatm_ubicacionActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        CreacionUsuario.setModal(true);
        CreacionUsuario.pack();
        CreacionUsuario.setLocationRelativeTo(this);
        CreacionUsuario.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        CreacionATM.setModal(true);
        CreacionATM.pack();
        CreacionATM.setLocationRelativeTo(this);
        CreacionATM.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void nuevousuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevousuarioMouseClicked

        try {
            String nombre = usuario_nombre.getText();
            String nombredos = usuario_nombredos.getText();
            String apellido = usuario_apellido.getText();
            String apellidodos = usuario_apellidodos.getText();
            String contraseña = usuario_contraseña.getText();
            int Nacimiento = (int) usuario_nacimiento.getValue();
            int id = Integer.parseInt(usuario_id.getText());
            int afiliacion = 2018;

            if (cb_tipo.getSelectedItem().equals("Cliente")) {
                administrarbinario ap = new administrarbinario("./Usuarios.lab");
                ap.cargarArchivoUsuario();
                Cliente u = new Cliente(id, contraseña, nombre, nombredos, apellido, apellidodos, Nacimiento, afiliacion);
                ap.getUsuarios().add(u);
                ap.escribirArchivoUsuario();
                JOptionPane.showMessageDialog(CreacionUsuario, "Guardado con exito");
                System.out.println("Se guardo");

            } else if (cb_tipo.getSelectedItem().equals("Mantenimiento")) {
                administrarbinario ap = new administrarbinario("./Usuarios.lab");
                ap.cargarArchivoUsuario();
                Mantenimiento m = new Mantenimiento(id, contraseña, nombre, nombredos, apellido, apellidodos, Nacimiento, afiliacion);
                ap.getUsuarios().add(m);
                ap.escribirArchivoUsuario();
                JOptionPane.showMessageDialog(CreacionUsuario, "Guardado con exito");
                System.out.println("Se guardo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(CreacionUsuario, "Error en Creacion");
        }

    }//GEN-LAST:event_nuevousuarioMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked

        try {
            String ubicacion = newatm_ubicacion.getText();
            int ID = Integer.parseInt(newatm_id.getText());
            int año = (int) newatm_año.getValue();
            String mantenimiento = (cb_atmnum.getSelectedItem() + " " + cb_atmtemp.getSelectedItem());
            int cien = (int) newatm_cien.getValue();
            int quin = (int) newatm_cien.getValue();
            administraratm ap = new administraratm("./ATMs.lab");
            ap.cargarArchivoATM();
            ATM a = new ATM(ubicacion, ID, año, mantenimiento, cien, quin);
            ap.getATMs().add(a);
            ap.escribirArchivoATM();
            JOptionPane.showMessageDialog(CreacionUsuario, "Guardado con exito");
            System.out.println("Se guardo");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(CreacionUsuario, "Error en Creacion");
        }

    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        administrarbinario ap = new administrarbinario("./Usuarios.lab");
        ap.cargarArchivoUsuario();
        int id = Integer.parseInt(login_user.getText());
        String pass = login_pass.getText();
        System.out.println(intentos);
        int control = 1;
        if (intentos < 6) {

            for (int i = 0; i < ap.getUsuarios().size(); i++) {
                if (((Usuario) ap.getUsuarios().get(i)).getId() == id && ((Usuario) ap.getUsuarios().get(i)).getContra().equals(pass)) {
                    if (((Usuario) ap.getUsuarios().get(i)) instanceof Cliente) {
                        ClienteLogIn.setModal(true);
                        ClienteLogIn.pack();
                        ClienteLogIn.setLocationRelativeTo(this);
                        ClienteLogIn.setVisible(true);
                        intentos = 0;
                        control = 0;
                    } else if (((Usuario) ap.getUsuarios().get(i)) instanceof Mantenimiento) {
                        MantenimientoLogIn.setModal(true);
                        MantenimientoLogIn.pack();
                        MantenimientoLogIn.setLocationRelativeTo(this);
                        MantenimientoLogIn.setVisible(true);
                        intentos = 0;
                        control = 0;
                    }

                }
            }

            if (control == 1) {
                intentos++;
                JOptionPane.showMessageDialog(this, "Intentos restantes: " + (6 - intentos));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No se permiten mas intentos");
        }


    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

        NuevaCuenta.setModal(true);
        NuevaCuenta.pack();
        NuevaCuenta.setLocationRelativeTo(this);
        NuevaCuenta.setVisible(true);

    }//GEN-LAST:event_jButton8MouseClicked

    private void cuenta_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuenta_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuenta_numeroActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked

        administrarbinario ap = new administrarbinario("./Usuarios.lab");
        ap.cargarArchivoUsuario();
        int ident = Integer.parseInt(login_user.getText());
        for (int i = 0; i < ap.getUsuarios().size(); i++) {
            if (((Usuario) ap.getUsuarios().get(i)).getId() == ident) {
                try {
                    int cuenta = Integer.parseInt(cuenta_numero.getText());
                    int saldo = Integer.parseInt(cuenta_saldo.getText());
                    Cuenta c = new Cuenta(cuenta, saldo, ident);
                    ((Cliente) ap.getUsuarios().get(i)).getCuentas().add(c);
                    ap.escribirArchivoUsuario();
                    JOptionPane.showMessageDialog(NuevaCuenta, "Guardado con Exito");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(NuevaCuenta, "Revisar valores");
                }
            }
        }
        NuevaCuenta.setVisible(false);

    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        administrarbinario ap = new administrarbinario("./Usuarios.lab");
        ap.cargarArchivoUsuario();
        int ident = Integer.parseInt(login_user.getText());
        int cuenta = Integer.parseInt(JOptionPane.showInputDialog(ClienteLogIn, "Cuenta de la cual retirar dinero"));
        for (int i = 0; i < ap.getUsuarios().size(); i++) {
            if (((Usuario) ap.getUsuarios().get(i)).getId() == ident) {
                try {
                    for (int j = 0; j < ((Cliente) ap.getUsuarios().get(i)).getCuentas().size(); j++) {
                        if (((Cliente) ap.getUsuarios().get(i)).getCuentas().get(j).getNumCuenta() == cuenta) {
                            
                            int retiro = Integer.parseInt(JOptionPane.showInputDialog(ClienteLogIn, "Cuanto desea retirar?"));
                            if (retiro > ((Cliente) ap.getUsuarios().get(i)).getCuentas().get(j).getSaldo()) {
                                JOptionPane.showMessageDialog(NuevaCuenta, "Transaccion invalida");
                            } else {
                                int cambio = ((Cliente) ap.getUsuarios().get(i)).getCuentas().get(j).getSaldo() - retiro;
                                ((Cliente) ap.getUsuarios().get(i)).getCuentas().get(j).setSaldo(cambio);
                                ap.escribirArchivoUsuario();
                                JOptionPane.showMessageDialog(NuevaCuenta, "Guardado con Exito");
                            }

                        }

                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(NuevaCuenta, "Revisar valores");
                }
            }
        }

    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ClienteLogIn;
    private javax.swing.JDialog CreacionATM;
    private javax.swing.JDialog CreacionUsuario;
    private javax.swing.JDialog MantenimientoLogIn;
    private javax.swing.JDialog NuevaCuenta;
    private javax.swing.JComboBox<String> cb_atmnum;
    private javax.swing.JComboBox<String> cb_atmtemp;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JTextField cuenta_numero;
    private javax.swing.JTextField cuenta_saldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_hora;
    private javax.swing.JLabel lb_hora2;
    private javax.swing.JTextField login_pass;
    private javax.swing.JTextField login_user;
    private javax.swing.JSpinner newatm_año;
    private javax.swing.JSpinner newatm_cien;
    private javax.swing.JTextField newatm_id;
    private javax.swing.JSpinner newatm_quinientos;
    private javax.swing.JTextField newatm_ubicacion;
    private javax.swing.JButton nuevousuario;
    private javax.swing.JPanel panel_usuarios;
    private javax.swing.JTextField usuario_apellido;
    private javax.swing.JTextField usuario_apellidodos;
    private javax.swing.JTextField usuario_contraseña;
    private javax.swing.JTextField usuario_id;
    private javax.swing.JSpinner usuario_nacimiento;
    private javax.swing.JTextField usuario_nombre;
    private javax.swing.JTextField usuario_nombredos;
    // End of variables declaration//GEN-END:variables

    ArrayList<Integer> ids_usuarios = new ArrayList();
    ArrayList<Integer> ids_atms = new ArrayList();
    int intentos;
    Usuario usuario_seleccionado;
}
