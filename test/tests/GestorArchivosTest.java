/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utilidades.GArchivos;


/**
 *
 * @author pipet
 */
public class GestorArchivosTest {

    @Test
    public void guardarNull(){
        String abc = "Emma";
        
        boolean rta = GArchivos.guardar(null,abc);
        System.out.println(rta);
        Assert.assertEquals(rta, false);
    }
    
    @Test
    public void guardarNull2(){
        
        boolean rta = GArchivos.guardar(null,null);
        System.out.println(rta);
        Assert.assertEquals(rta, false);
    }
     @Test
    public void guardarNullObject(){
        
        boolean rta = GArchivos.guardar("archivo.dat",null);
        System.out.println(rta);
        Assert.assertEquals(rta, false);
    }
    @Test
    public void guardarNullObject1(){
        
        boolean rta = GArchivos.guardar("",new String("-"));
        System.out.println(rta);
        Assert.assertEquals(rta, false);
    }
     @Test
    public void guardarOk(){
        
        boolean rta = GArchivos.guardar("archivo.txt",new String("a"));
        System.out.println(rta);
        Assert.assertEquals(rta, true);
    }

}
