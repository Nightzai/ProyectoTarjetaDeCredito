/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;
import java.io.Serializable;
/**
 *
 * @author pipet
 */
public class CrearTarjeta implements Serializable{
    private Tarjeta laTarjeta;
    private Date fechaCrea;
    private Opciones opcion;
    private OpcionesTipoDocu opcion1;
    private String numTarjeta;
    private Operaciones op;
    
    public CrearTarjeta(Tarjeta laTarjeta, Date fechaCrea, Opciones opcion, String numTarjeta, OpcionesTipoDocu opcion1){
        this.laTarjeta = laTarjeta;
        this.fechaCrea = fechaCrea;
        this.opcion = opcion;
        this.opcion1 = opcion1;
        this.numTarjeta = numTarjeta;
    }

    
    public Tarjeta getTarjeta(){
        return this.laTarjeta;
    }

    public Date getFechaCrea(){
        return this.fechaCrea;
    }
    
        public String getNumTarjeta(){
        return this.numTarjeta;
    }
        
    public Opciones getOpcion(){
        return this.opcion;
    }
    
    public OpcionesTipoDocu getOpcionDocu(){
        return this.opcion1;
    }
    
   
    
    @Override
    public String toString() {
        return "Titular: "+laTarjeta.getTitular()+"\n Fecha de creacion: "+this.fechaCrea+ "\n Numero de Tarjeta: "+this.numTarjeta+"\n Tipo de tarjeta: "+this.opcion;
    }
 
    
    
}
