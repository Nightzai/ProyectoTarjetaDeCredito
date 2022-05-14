/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.CrearTarjeta;
import dto.Opciones;
import dto.OpcionesTipoDocu;
import dto.Tarjeta;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import util.GestorPersistencia;


/**
 *
 * @author pipet
 */
public class GestionDeTarjeta {
//    private Map<String, CrearTarjeta> listaTarjetas;
//    public GestionDeTarjeta(){
//        if (listaTarjetas == null){
//            listaTarjetas = (Map<String, CrearTarjeta> )GestorPersistencia.recuperar();
//            if (listaTarjetas == null){
//                listaTarjetas = new HashMap<>();
//            }
//        }
//    }
    
    
    public CrearTarjeta crearTarjetaCredito(String titular, String identi, String numTarjeta, int salario, Date fechaCrea, 
            Opciones opcion, OpcionesTipoDocu opcion1){
          if(titular == null || identi == null || numTarjeta == null
                  || fechaCrea == null || opcion == null || opcion1 == null || titular.isEmpty() || identi.isEmpty()){
            return null;
        }else{
            Tarjeta tCredito = this.crearTarjeta(titular, identi, salario);
            CrearTarjeta c = new CrearTarjeta(tCredito, fechaCrea, opcion, numTarjeta, opcion1);
//            listaTarjetas.put(c.getNumTarjeta(), c);
//            GestorPersistencia.guardar(listaTarjetas);
            return c;
            
        }
              
    }
    
    private Tarjeta crearTarjeta(String titular, String identi, int salario){
        Tarjeta t = new Tarjeta();
        t.setTitu(titular);
        t.setIdenti(identi);
        t.setSaldo(salario);
        return t;
    }
//    public Map<String, CrearTarjeta> obtenerLista(){
//        return this.listaTarjetas;
//    }
    
}

    
    

