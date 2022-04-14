/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author pipet
 */
public class Tarjeta {
    private String titular;
    private String identi;
    private int saldo;
    
    public String getTitular(){
        return this.titular;
    }
    
     public String getIdenti(){
        return this.identi;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public void setTitu(String titular){
        if(titular != null){
            this.titular=titular;
        }
       
    }
    
    public void setIdenti(String identi){
        if(identi != null){
            this.identi=identi;
        }
    }
    
    
    public void setSaldo(int saldo){
        if(identi != null){
           this.saldo=saldo;
        }
    }
    
    
    @Override
    public String toString(){
        return "Titular: "+this.titular+" Identificacion: "+this.identi+ " Saldo ingresado: "+this.saldo;
        
    }
    
}
