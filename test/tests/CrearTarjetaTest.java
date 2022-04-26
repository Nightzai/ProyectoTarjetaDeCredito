/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dto.CrearTarjeta;
import dto.Opciones;
import dto.OpcionesTipoDocu;
import java.util.Calendar;
import logica.GestionDeTarjeta;
/**
 *
 * @author pipet
 */
public class CrearTarjetaTest {
    
    public CrearTarjetaTest() {
    }
    
    @Test
    public void CrearTarjetaTitularNullTest(){
        Calendar c = Calendar.getInstance();
        GestionDeTarjeta gtar = new GestionDeTarjeta();
        CrearTarjeta latar = gtar.crearTarjetaCredito(null, null, null, 0, c.getTime(), Opciones.VISA, OpcionesTipoDocu.TI);
        assertNull(latar);
    }
    
    @Test
    public void CrearTarjetaNullTest(){
        GestionDeTarjeta gtar = new GestionDeTarjeta();
        CrearTarjeta latar = gtar.crearTarjetaCredito(null, null, null, 0, null, null, null);
        assertNull(latar);
    }
    
    @Test
    public void CrearTarjetaBlancoTest(){
        Calendar c = Calendar.getInstance();
        GestionDeTarjeta gtar = new GestionDeTarjeta();
        CrearTarjeta latar = gtar.crearTarjetaCredito("", "", "", 0, c.getTime(), Opciones.MASTERCARD, OpcionesTipoDocu.CC);
        assertNull(latar);
    }
    
    @Test
    public void CrearTarjetaOkTest(){
        Calendar c = Calendar.getInstance();
        GestionDeTarjeta gtar = new GestionDeTarjeta();
        CrearTarjeta latar = gtar.crearTarjetaCredito("Emma", "2343242343", "3321 3244 4336 5443", 130000, c.getTime(), Opciones.VISA, OpcionesTipoDocu.CC);
        assertNotNull(latar);
    }
    
    
}
