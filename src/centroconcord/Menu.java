/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centroconcord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 4
 */
public class Menu extends javax.swing.JFrame {
 Connection conexion;
    String usuario,password;
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion claseCon = new Conexion();
    /**
     * Creates new form Menu
     */
 public Menu(String usr, String pass) {
        //Asignar la conexion del login a la instancia de clase        
        this.usuario = usr;
        this.password = pass;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CBoxSucursales = new javax.swing.JComboBox<>();
        btnIngresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCli = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableRes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableVen = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableHab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CBoxSucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Concord_Cabos", "Concord_Cancun", "Concord_Acapulco", " " }));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        TableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "A. Paterno", "A. Materno", "Telefono", "Calle", "No.Ext", "No.Intl", "Colonia", "Municipio", "CP", "Estado", "Pais"
            }
        ));
        jScrollPane1.setViewportView(TableCli);

        TableRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Reserva", "Cant Hab", "No. Hab", "Fecha Inicio", "Dia de Hospedaje", "ID Cliente", "Status", "Costo"
            }
        ));
        jScrollPane2.setViewportView(TableRes);

        TableVen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Venta", "ID Cliente", "No Habitacion", "Codigo de Reserva", "Costo", "IVA", "Dias Hos", "TOTAL"
            }
        ));
        jScrollPane3.setViewportView(TableVen);

        TableHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Hab.", "Capacidad", "Tipo", "Status", "Costo"
            }
        ));
        jScrollPane4.setViewportView(TableHab);

        jLabel1.setText("CLIENTES");

        jLabel2.setText("RESERVAS");

        jLabel3.setText("HABITACIONES");

        jLabel4.setText("VENTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresar)
                            .addComponent(CBoxSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(531, 531, 531)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(CBoxSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnIngresar)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(568, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String ip,puerto,bd;
        
                          
        try
        {
            
            //Conexion al gdd 
            conexion = claseCon.obtenerConexion("localhost", "3306","GDD",usuario,password);
            //Selecciona la base de datos segun el BOX del JFrame 
            ps = conexion.prepareStatement("Select * from Directory where bd = ?");
           
            ps.setString(1, CBoxSucursales.getItemAt(CBoxSucursales.getSelectedIndex()));
            ps.execute();
            rs=ps.getResultSet();
            if(rs.next())
            {
                //Extrae puerto e IP
                ip = rs.getString("ip");
                puerto= rs.getString("puerto");
                System.out.println(ip);
                bd = rs.getString("bd");
                //Cerrar conexión 
                conexion.close();

                //Lanzar conexion a la sucursal correspondiente
                conexion = claseCon.obtenerConexion(ip, puerto, bd, usuario, password);
               //Si la conexion funciona
                if(conexion!=null)
                {
                    //Preparar 2 enteros mostrar datos en tablas
                    int num1=0, num2=0;
                   
                      Statement st;
                      //Si hay un siguiente
                    ps = conexion.prepareStatement("select * from Habitacion");
                    ps.execute();
                    rs = ps.getResultSet();
                   
                      while(rs.next()){
                        //SELECCIONAMOS TABLA Y LA MOSTRAMOS EN TableHab
                   TableHab.setValueAt(rs.getString("No_Hab"), num1,num2);
                   num2=num2+1;
                   TableHab.setValueAt(rs.getString("Cap_Per"), num1,num2);
                   num2=num2+1;
                   TableHab.setValueAt(rs.getString("Tipo_Hab"), num1,num2);
                   num2=num2+1;
                   TableHab.setValueAt(rs.getString("Status"), num1,num2);
                   num2=num2+1;
                   TableHab.setValueAt(rs.getString("Costo"), num1,num2);
                   num2=0;
                   num1=num1+1;
                 
                        }
                      num1=0;
                      num2=0;
                    
                    ps = conexion.prepareStatement("select * from Cliente");
                    ps.execute();
                    rs = ps.getResultSet();
                   
                    while(rs.next()){
                        
                        //SELECCIONAMOS TABLA Y LA MOSTRAMOS EN TableCli
                   TableCli.setValueAt(rs.getString("ID_Client"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Nombre"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Ap_Pat"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Ap_Mat"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("TEL"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("No_Ext"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("No_Int"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Calle"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Colonia"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Municipio"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("CP"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Estado"), num1,num2);
                   num2=num2+1;
                   TableCli.setValueAt(rs.getString("Pais"), num1,num2);
                   num2=0;
                   num1=num1+1;
                 
                        }
                      num1=0;
                      num2=0;
                    
                    ps = conexion.prepareStatement("select * from Venta");
                    ps.execute();
                    rs = ps.getResultSet();
                   
                    while(rs.next()){
                        
                        //SELECCIONAMOS TABLA Y LA MOSTRAMOS EN TableVen
                   TableVen.setValueAt(rs.getString("ID_Ven"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("ID_Client"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("No_Hab"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("Cod_Reser"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("Costo"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("IVA"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("Dias_Hos"), num1,num2);
                   num2=num2+1;
                   TableVen.setValueAt(rs.getString("Total"), num1,num2);
                   num2=0;
                   
                   num1=num1+1;
                 
                        }
                   num1=0;
                      num2=0;
                    
                       ps = conexion.prepareStatement("select * from Reserva");
                    ps.execute();
                    rs = ps.getResultSet();
                 
                    
                    while(rs.next()){
                        
                        //SELECCIONAMOS TABLA Y LA MOSTRAMOS EN TableRes
                   TableRes.setValueAt(rs.getString("Cod_Reser"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("Cant_Hab"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("No_Hab"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("Fec_Ini"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("Dias_Hos"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("ID_Client"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("Status"), num1,num2);
                   num2=num2+1;
                   TableRes.setValueAt(rs.getString("Costo"), num1,num2);
                   num2=0;
                   
                   num1=num1+1;
                 
                        }
                      num1=0;
                      num2=0;
                    
                   
                }
               
            }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBoxSucursales;
    private javax.swing.JTable TableCli;
    private javax.swing.JTable TableHab;
    private javax.swing.JTable TableRes;
    private javax.swing.JTable TableVen;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
