/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

//import static java.lang.Math.pow;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pipet
 */
public class Operaciones implements Serializable{
    private int valorCompra;
    private int valorPago;
    private int cupo;
    
    public int getValCompra(){
        return this.valorCompra;
    }
    
    public void setValCompra(int valorCompra){
        
        this.valorCompra=valorCompra;
    }
    
    public int getCupo(){
        return this.cupo;
    }
    
    public void setCupo(int cupo){
        this.cupo=cupo;
    }
    
    public int getValPago(){
        return this.valorPago;
    }
    
    public void setValPago(int valorPago){
        this.valorPago=valorPago;
    }

    public String compra(int valorCompra, int cupoVal){
       if(cupoVal < valorCompra){
           return null;
       }else{
           cupoVal = cupoVal - valorCompra;
           this.cupo = cupoVal;
           String valComp = Integer.toString(cupoVal); 
           return valComp; 
       }  
    }
    
    public String pago(int valorPago, int cupoVal){
        cupoVal = cupoVal+valorPago;
        this.cupo = cupoVal;
        String pagoVal = Integer.toString(cupoVal);
        return pagoVal;
    }
    
     public String NumerosTar(){
        String numTarjeta, num1, num2, num3, num4;
        Random r = new Random();
        num1=Integer.toString(r.nextInt(9999-1000+1)+1000);
        num2=Integer.toString(r.nextInt(9999-1000+1)+1000);
        num3=Integer.toString(r.nextInt(9999-1000+1)+1000);
        num4=Integer.toString(r.nextInt(9999-1000+1)+1000);
        numTarjeta = (num1+" "+num2+" "+num3+" "+num4);
        return numTarjeta;
    }
     
    public int CalculoCupo(int salario){
        int valCup = salario*3;
        this.cupo = this.cupo+valCup;
        return valCup;
    } 
    
    public void guardarArchivoPlano(String archivo) {
       File f;
       FileWriter escribir;
       PrintWriter linea;
  
       f= new File("Tarjetas.txt");
           
       if(!f.exists()){
           try {
               f.createNewFile();
               escribir = new FileWriter(f, true);
               linea = new PrintWriter(escribir);
               linea.println(archivo);
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Tarjeta.class.getName()).log(Level.SEVERE, null, ex);
           }
       }else{
           try {
               escribir = new FileWriter(f, true);
               linea = new PrintWriter(escribir);
               linea.println(archivo);
               escribir.close();
           } catch (IOException ex) {
               Logger.getLogger(Tarjeta.class.getName()).log(Level.SEVERE, null, ex);
           }
            
       }

    }
     
     @Override
     public String toString(){
         return ""+this.cupo;
     }
    
}
