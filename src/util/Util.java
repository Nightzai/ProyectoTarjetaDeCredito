/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pipet
 */
public class Util {
     public static String convertirDateString(Date fecha){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        if (fecha == null){
            return sd.format(new Date());
        }else{
            return sd.format(fecha);
        }
        
    }
}
