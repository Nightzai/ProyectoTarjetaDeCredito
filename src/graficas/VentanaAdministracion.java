/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
import java.text.DateFormat;




/**
*
 * @author pipet
 */
public class VentanaAdministracion extends javax.swing.JFrame {
    private Opciones opcion;
    private OpcionesTipoDocu opcion1;
    public int cupoVal = 0;
    /**
     * Creates new form VentanaCreacionTarjeta
     */
    public VentanaAdministracion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        grupoBotones2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Sistema de Administracion de Tarjeta de Credito");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 340, 16);

        jLabel2.setText("Nombre completo del titular: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 170, 16);
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
        bCreacionTarjeta.setBounds(50, 270, 170, 25);

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
        bCompra.setBounds(280, 270, 170, 25);

        bPago.setText("Pago Tarjeta");
        bPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPagoActionPerformed(evt);
            }
        });
        getContentPane().add(bPago);
        bPago.setBounds(510, 270, 170, 25);

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

        setSize(new java.awt.Dimension(748, 351));
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
          Integer salario = Integer.parseInt(salarioS);
          cupoVal = ope.CalculoCupo(salario);
          ope.setCupo(cupoVal);
          
          //Creacion de la Tarjeta
         GestionDeTarjeta gt = new GestionDeTarjeta();
         CrearTarjeta ct = gt.crearTarjetaCredito(nombre, identi, numTarjeta, cupoVal, fechaCreaci, this.opcion, this.opcion1);
         if (ct != null){
          
             JOptionPane.showMessageDialog(this, "Creo la tarjeta: \n "+ct+" ");
           
         }else{
            JOptionPane.showMessageDialog(this, "No se creo la tarjeta");
         }
        }
       
        
    }
    
    
    public void pagoTarjeta(){
        Operaciones op = new Operaciones();
        int pago= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que pagara a la tarjeta"));
        //int cupoTar= op.obtCupo();
        String resultPag= op.pago(pago, cupoVal);
        op.setCupo(Integer.parseInt(resultPag));
        cupoVal = op.getCupo();
        JOptionPane.showMessageDialog(null, "Se pago la tarjeta con: "+pago+"\n El nuevo valor del"
                +" cupo de la tarjeta es de: "+cupoVal);
        
        /*JOptionPane.showMessageDialog(null, "Se pago la tarjeta \n El nuevo valor de la "
                + "tarjeta del cupo de la tarjeta es de: (Valor Cupo Actual) ");
*/
    }
    
        
        
    public void compra(){
       Operaciones op = new Operaciones();
       
       int compra= Integer.parseInt(JOptionPane.showInputDialog("El valor del cupo es de: "+cupoVal+"\nIngrese el valor de la compra"));
       //int cupoTar= op.obtCupo();
       if(compra == 0 || compra > cupoVal){
           JOptionPane.showMessageDialog(null, "No se puede proceder con la compra");
       }else{
       op.setValCompra(compra);
       String resultComp = op.compra(compra, cupoVal);
       op.setCupo(Integer.parseInt(resultComp));
       cupoVal = op.getCupo();
       JOptionPane.showMessageDialog(null, "El valor de la compra realizada fue de: "+String.valueOf(compra) 
              + "\n El cupo actual de la tarjeta es de: "+op.getCupo());
       
      }
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bCedula;
    private javax.swing.JButton bCompra;
    private javax.swing.JButton bCreacionTarjeta;
    private javax.swing.JRadioButton bMaster;
    private javax.swing.JRadioButton bOtro;
    private javax.swing.JButton bPago;
    private javax.swing.JRadioButton bTIdentidad;
    private javax.swing.JRadioButton bVisa;
    private javax.swing.JTextField cjIdenti;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JTextField cjSalario;
    private javax.swing.JButton cjSalir;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.ButtonGroup grupoBotones2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
