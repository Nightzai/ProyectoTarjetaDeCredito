/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template

  Desarrollado por Emmanuel Carrillo
 */
package graficas;

import dto.Operaciones;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.GestionDeTarjeta;
import dto.CrearTarjeta;
import dto.Opciones;
import dto.OpcionesTipoDocu;
import dto.Tarjeta;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import utilidades.GArchivos;




/**
*
 * @author pipet
 */
public class VentanaAdministracion extends javax.swing.JFrame {
    private Opciones opcion;
    private OpcionesTipoDocu opcionE;
    private OpcionesTipoDocu opcion1;
    private int cupoVal = 0, deudaVal=0;
    private String codigoT;
    Map<String, Integer> mapDatosT= new HashMap<String, Integer>();
    Map<String, Integer> mapDeudasT= new HashMap<String, Integer>();
    
    //private DefaultTableModel modelTabla;
    DefaultTableModel tableModel  = new DefaultTableModel();
    ArrayList<CrearTarjeta> listaTarjeta = new ArrayList<CrearTarjeta>();
    ArrayList registroTarjetas = new ArrayList();
    /**
     * Creates new form VentanaCreacionTarjeta
     */
    public VentanaAdministracion() {
        initComponents();
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Num T.");
        tableModel.addColumn("Tipo I.");
        tableModel.addColumn("Num I.");
        tableModel.addColumn("Tipo T.");
        tableModel.addColumn("Fecha C.");
        bCompra.setEnabled(false);
        bPago.setEnabled(false);
//        String[] titulo= new String[]{"Num T.", "Nombre", "Tipo I.", "Num I.", "Tipo T.", "Fecha C."};
//        tableModel.setColumnIdentifiers(titulo);
        this.cargarTarjetas();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        grupoBotones2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bCodeUserS = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cjNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cjIdenti = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cjSalario = new javax.swing.JTextField();
        bCreacionTarjeta = new javax.swing.JButton();
        cjSalir = new javax.swing.JButton();
        bCompra = new javax.swing.JButton();
        bPago = new javax.swing.JButton();
        bMaster = new javax.swing.JRadioButton();
        bVisa = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bCedula = new javax.swing.JRadioButton();
        bTIdentidad = new javax.swing.JRadioButton();
        bOtro = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cjCodeUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sCC = new javax.swing.JRadioButton();
        sTI = new javax.swing.JRadioButton();
        sOtro = new javax.swing.JRadioButton();
        bComprobar = new javax.swing.JButton();

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
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Sistema de Administracion de Tarjeta de Credito");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 340, 16);
        getContentPane().add(cjNombre);
        cjNombre.setBounds(180, 50, 540, 22);

        jLabel3.setText("Numero de Identificación: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 200, 16);
        getContentPane().add(cjIdenti);
        cjIdenti.setBounds(390, 90, 330, 22);

        jLabel4.setText("Salario del Titular");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 140, 110, 10);
        getContentPane().add(cjSalario);
        cjSalario.setBounds(140, 140, 250, 30);

        bCreacionTarjeta.setText("Crear Tarjeta ");
        bCreacionTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreacionTarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(bCreacionTarjeta);
        bCreacionTarjeta.setBounds(460, 140, 220, 50);

        cjSalir.setText("Salir");
        cjSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cjSalir);
        cjSalir.setBounds(640, 10, 80, 25);

        bCompra.setText("Realizar Compra");
        bCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCompraActionPerformed(evt);
            }
        });
        getContentPane().add(bCompra);
        bCompra.setBounds(280, 500, 170, 25);

        bPago.setText("Pago Tarjeta");
        bPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagoActionPerformed(evt);
            }
        });
        getContentPane().add(bPago);
        bPago.setBounds(520, 500, 170, 25);

        grupoBotones.add(bMaster);
        bMaster.setText("MASTERCARD");
        bMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasterActionPerformed(evt);
            }
        });
        getContentPane().add(bMaster);
        bMaster.setBounds(290, 190, 220, 25);

        grupoBotones.add(bVisa);
        bVisa.setText("VISA");
        bVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVisaActionPerformed(evt);
            }
        });
        getContentPane().add(bVisa);
        bVisa.setBounds(290, 220, 240, 25);

        jLabel5.setText("Seleccione el tipo de tarjeta que desea");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 190, 230, 16);

        jLabel6.setText("solicitar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 210, 120, 16);

        grupoBotones2.add(bCedula);
        bCedula.setText("C.C.");
        bCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(bCedula);
        bCedula.setBounds(180, 90, 70, 25);

        grupoBotones2.add(bTIdentidad);
        bTIdentidad.setText("T.I.");
        bTIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTIdentidadActionPerformed(evt);
            }
        });
        getContentPane().add(bTIdentidad);
        bTIdentidad.setBounds(250, 90, 50, 25);

        grupoBotones2.add(bOtro);
        bOtro.setText("Otro");
        bOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOtroActionPerformed(evt);
            }
        });
        getContentPane().add(bOtro);
        bOtro.setBounds(310, 90, 70, 25);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 260, 690, 110);

        jLabel7.setText("(sin puntos ni comas)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 150, 120, 20);

        jLabel8.setText("Nombre completo del titular: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 50, 170, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Registro de Compras y Pagos");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(270, 380, 170, 16);

        cjCodeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjCodeUserActionPerformed(evt);
            }
        });
        getContentPane().add(cjCodeUser);
        cjCodeUser.setBounds(250, 420, 340, 30);

        jLabel10.setText("Ingrese su numero de identificación ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 420, 220, 16);

        jLabel11.setText("y seleccione el tipo de identificación");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 440, 210, 16);

        bCodeUserS.add(sCC);
        sCC.setText("C.C.");
        sCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sCCActionPerformed(evt);
            }
        });
        getContentPane().add(sCC);
        sCC.setBounds(250, 460, 80, 25);

        bCodeUserS.add(sTI);
        sTI.setText("T.I.");
        sTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTIActionPerformed(evt);
            }
        });
        getContentPane().add(sTI);
        sTI.setBounds(380, 460, 90, 25);

        bCodeUserS.add(sOtro);
        sOtro.setText("Otro");
        sOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sOtroActionPerformed(evt);
            }
        });
        getContentPane().add(sOtro);
        sOtro.setBounds(500, 460, 49, 25);

        bComprobar.setText("Comprobar Tarjeta");
        bComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobarActionPerformed(evt);
            }
        });
        getContentPane().add(bComprobar);
        bComprobar.setBounds(40, 500, 160, 25);

        setSize(new java.awt.Dimension(748, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cjSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cjSalirActionPerformed

    private void bCreacionTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreacionTarjetaActionPerformed
        this.CrearTarjeta();
    }//GEN-LAST:event_bCreacionTarjetaActionPerformed

    private void bCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCompraActionPerformed
        this.compra();
    }//GEN-LAST:event_bCompraActionPerformed

    private void bPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPagoActionPerformed
       this.pagoTarjeta();
    }//GEN-LAST:event_bPagoActionPerformed

    private void bMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasterActionPerformed
       this.clickOpcion(1);
    }//GEN-LAST:event_bMasterActionPerformed

    private void bVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisaActionPerformed
       this.clickOpcion(2);
    }//GEN-LAST:event_bVisaActionPerformed

    private void bCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCedulaActionPerformed
       this.clickOpcionDocu(1);
    }//GEN-LAST:event_bCedulaActionPerformed

    private void bTIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTIdentidadActionPerformed
       this.clickOpcionDocu(2);
    }//GEN-LAST:event_bTIdentidadActionPerformed

    private void bOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOtroActionPerformed
       this.clickOpcionDocu(3);
    }//GEN-LAST:event_bOtroActionPerformed

    private void cjCodeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjCodeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjCodeUserActionPerformed

    private void bComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobarActionPerformed
        buscarTarjeta();
    }//GEN-LAST:event_bComprobarActionPerformed

    private void sCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sCCActionPerformed
       this.clickOpcionDocuE(1);
    }//GEN-LAST:event_sCCActionPerformed

    private void sTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTIActionPerformed
         this.clickOpcionDocuE(2);
    }//GEN-LAST:event_sTIActionPerformed

    private void sOtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sOtroActionPerformed
        this.clickOpcionDocuE(3);
    }//GEN-LAST:event_sOtroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministracion().setVisible(true);
            }
        });
    }//FIN MAIN
    
   static final ArrayList listaTarjetas = new ArrayList();
    
    private void clickOpcion(int opcion){
        //JOptionPane.showMessageDialog(this, opcion);
        if (opcion == 1){
            this.opcion = Opciones.MASTERCARD;
        }else{
            this.opcion = Opciones.VISA;
        }
    }
    
     private void clickOpcionDocu(int opcion1){
        //JOptionPane.showMessageDialog(this, opcion);
        if (opcion1 == 1){
            this.opcion1 = OpcionesTipoDocu.CC;
        }else if(opcion1 == 2){
            this.opcion1 = OpcionesTipoDocu.TI;
        }else{
            this.opcion1 = OpcionesTipoDocu.Otro;
        }
    }
     
     private void clickOpcionDocuE(int opcionE){
        //JOptionPane.showMessageDialog(this, opcion);
        if (opcionE == 1){
            this.opcionE = OpcionesTipoDocu.CC;
        }else if(opcionE == 2){
            this.opcionE = OpcionesTipoDocu.TI;
        }else{
            this.opcionE = OpcionesTipoDocu.Otro;
        }
    }
    
    public void CrearTarjeta(){
     
        String nombre = cjNombre.getText();
        String identi = cjIdenti.getText();
        String salarioS = cjSalario.getText();
        
        if(nombre.isEmpty() || identi.isEmpty() || salarioS.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacios o Datos no Validos");
        }else{
        
          //Fecha de Creacion
          Calendar calendar = Calendar.getInstance();
          Date fechaCreaci = calendar.getTime();
          
          
          //Numeros de la tarjeta
          Operaciones ope = new Operaciones();
          String numTarjeta = ope.NumerosTar();
        
          //Cupo de la tarjeta
              Integer salario;
              salario = Integer.parseInt(salarioS);
          if(salario == 0 || salario < 1000000){
              JOptionPane.showMessageDialog(null, "Minimo debe ingresar un salario de 1'000.000 para solicitar la tarjeta de credito");
          }else{
          cupoVal = ope.CalculoCupo(salario);
          ope.setCupo(cupoVal);
          
          if(this.opcion1 == null){
              JOptionPane.showMessageDialog(null, "Elija el tipo de documento");
          }else{
               if(this.opcion == null){
              JOptionPane.showMessageDialog(null, "Elija el tipo de tarjeta");
          }else{
          String datT = identi+opcion1;
          if(mapDatosT.containsKey(datT)){
               JOptionPane.showMessageDialog(null, "Ya existe una tarjeta vinculada a la identificación digitada");
          }else{
          mapDatosT.put(datT, cupoVal);
          mapDeudasT.put(datT, 0);
          //Creacion de la Tarjeta
         GestionDeTarjeta gt = new GestionDeTarjeta();
         CrearTarjeta ct = gt.crearTarjetaCredito(nombre, identi, numTarjeta, cupoVal, fechaCreaci, this.opcion, this.opcion1);
         listaTarjeta.add(ct);
         if (ct != null){
             String newTarjeta = identi+opcion1;
             registroTarjetas.add(newTarjeta);
             this.cargarTarjetas();
             String arch = ("Titular: "+ct.getTarjeta().getTitular()+"\n"+"Identificacion: "+ct.getTarjeta().getIdenti()+"\n"+"Tipo de Documento: "+ct.getOpcionDocu()+"\n"+"Numero de Tarjeta: "+ct.getNumTarjeta()+"\n"+"Cupo generado: "+cupoVal+"\n"+"Fecha de creacion: "+util.Util.convertirDateString(ct.getFechaCrea())+"\n"+"Tipo de Tarjeta: "+ct.getOpcion()+"\n");
             ope.guardarArchivoPlano(arch);
             
             JOptionPane.showMessageDialog(this, "Creo la tarjeta: \n "+ct+" ");
             cargarTarjetas();
         }else{
            JOptionPane.showMessageDialog(this, "No se creo la tarjeta");
            }
         }
        }
       }
       
      }  
    }
   }
    
    
    public void pagoTarjeta(){
        deudaVal = mapDeudasT.get(codigoT);
        Operaciones op = new Operaciones();
        if(deudaVal==0){
               JOptionPane.showMessageDialog(null, "No hay deuda a pagar"); 
               bCompra.setEnabled(false);
               bPago.setEnabled(false);
          }else{
        String pagoVar = JOptionPane.showInputDialog("La deuda actual es de: "+deudaVal+"\nIngrese el valor que pagara a la tarjeta");
        if(pagoVar == null){
            JOptionPane.showMessageDialog(null, "No se puede proceder con el pago");
             bCompra.setEnabled(false);
             bPago.setEnabled(false);
        }else{      
        int pago= Integer.parseInt(pagoVar);
        if(pago < 0){
            JOptionPane.showMessageDialog(null, " No se puede proceder con el pago, valor no valido");
        }else{
            if(pago > deudaVal){
               JOptionPane.showMessageDialog(null, "El valor a pagar es mayor a la deuda"); 
          }else{
        //int cupoTar= op.obtCupo();
        String resultPag= op.pago(pago, cupoVal);
        op.setCupo(Integer.parseInt(resultPag));
        deudaVal= deudaVal-pago;
        mapDeudasT.put(codigoT, deudaVal);
        cupoVal = op.getCupo();
        JOptionPane.showMessageDialog(null, "Se pago la tarjeta con: "+pago+"\n El nuevo valor del"
                +" cupo de la tarjeta es de: "+cupoVal+"\n La deuda es de: "+deudaVal);     
        mapDatosT.put(codigoT, cupoVal);
        bCompra.setEnabled(false);
        bPago.setEnabled(false);
        }
       }
      }
     }
    }
    
        //a
        
    public void compra(){
       cupoVal = mapDatosT.get(codigoT);
       
       Operaciones op = new Operaciones();
       if(cupoVal == 0){
       JOptionPane.showMessageDialog(null, "La tarjeta no tiene cupo"); 
        bCompra.setEnabled(false);
        bPago.setEnabled(false);
       }else{
       String compraVar = JOptionPane.showInputDialog("El valor del cupo es de: "+cupoVal+"\nIngrese el valor de la compra");
       if(compraVar == null){
            JOptionPane.showMessageDialog(null, "No se puede proceder con la compra");
             bCompra.setEnabled(false);
             bPago.setEnabled(false);
        }else{
       
       int compra= Integer.parseInt(compraVar);
       //int cupoTar= op.obtCupo();
       if(compra == 0 || compra > cupoVal || compra < 0){
           JOptionPane.showMessageDialog(null, "No se puede proceder con la compra, valor no valido");
            bCompra.setEnabled(false);
            bPago.setEnabled(false);
       }else{
             op.setValCompra(compra);
             deudaVal = deudaVal+compra;
             mapDeudasT.put(codigoT, deudaVal);
             String resultComp = op.compra(compra, cupoVal);
             op.setCupo(Integer.parseInt(resultComp));
             cupoVal = op.getCupo();
             JOptionPane.showMessageDialog(null, "El valor de la compra realizada fue de: "+String.valueOf(compra) 
              + "\n El cupo actual de la tarjeta es de: "+op.getCupo());
             mapDatosT.put(codigoT, cupoVal);
              bCompra.setEnabled(false);
              bPago.setEnabled(false);
                }
            }
        }
    }
    
    private void cargarTarjetas(){
        while(tableModel.getRowCount()>0){
            tableModel.removeRow(0);
        } 
        for (CrearTarjeta ct: listaTarjeta) {
            Object a[] = new Object[6];
            a[0]= ct.getTarjeta().getTitular();
            a[1]= ct.getNumTarjeta();
            a[2]= ct.getOpcionDocu();
            a[3]= ct.getTarjeta().getIdenti();
            a[4]= ct.getOpcion();
            a[5]= util.Util.convertirDateString(ct.getFechaCrea());
            tableModel.addRow(a);
            
        }
      jTabla.setModel(tableModel);
    }
    
    private void buscarTarjeta(){
        String codeUser = cjCodeUser.getText();
        if(codeUser == null || codeUser.isEmpty() || codeUser.isBlank()){
            JOptionPane.showMessageDialog(null, "Por favor digite su identificacion");
        }else{
        String tBuscar = codeUser+opcionE;
        if(opcionE == null){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de tarjeta");
        }else{
        if(mapDatosT.containsKey(tBuscar)){
            JOptionPane.showMessageDialog(null, "La tarjeta existe, se puede proceder con la acciones");
            codigoT = tBuscar;
            bCompra.setEnabled(true);
            bPago.setEnabled(true);
        }else{
            
            JOptionPane.showMessageDialog(null, "No hay tarjetas vinculadas a la identificación digitada, por favor cree la tarjeta");
            bCompra.setEnabled(false);
            bPago.setEnabled(false);
        }
       }
      }
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bCedula;
    private javax.swing.ButtonGroup bCodeUserS;
    private javax.swing.JButton bCompra;
    private javax.swing.JButton bComprobar;
    private javax.swing.JButton bCreacionTarjeta;
    private javax.swing.JRadioButton bMaster;
    private javax.swing.JRadioButton bOtro;
    private javax.swing.JButton bPago;
    private javax.swing.JRadioButton bTIdentidad;
    private javax.swing.JRadioButton bVisa;
    private javax.swing.JTextField cjCodeUser;
    private javax.swing.JTextField cjIdenti;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjSalario;
    private javax.swing.JButton cjSalir;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.ButtonGroup grupoBotones2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton sCC;
    private javax.swing.JRadioButton sOtro;
    private javax.swing.JRadioButton sTI;
    // End of variables declaration//GEN-END:variables
}
