/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

//import static java.lang.Math.pow;
import java.util.Random;

/**
 *
 * @author pipet
 */
public class Operaciones {
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

    public String compra(int valorCompra){
       if(this.cupo < valorCompra){
           return null;
       }else{
           this.cupo = this.cupo - valorCompra;
           String valComp = Integer.toString(this.cupo); 
           return valComp; 
       }  
    }
    
    public String pago(int valorPago){
        this.cupo = this.cupo + valorPago;
        String pagoVal = Integer.toString(this.cupo);
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
     
     @Override
     public String toString(){
         return ""+this.cupo;
     }
    
}
