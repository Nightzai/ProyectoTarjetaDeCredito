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
import dto.Operaciones;
import org.junit.Assert;
/**
 *
 * @author pipet
 */
public class OperacionesTest {
    
 
 public OperacionesTest(){
 }
 
 @Test
 public void compraCero(){
    Operaciones oper = new Operaciones();
    String resp = oper.compra(0, 0);
    assertNotNull(resp); 
 }    
 @Test
 public void compraMayor(){
    Operaciones oper = new Operaciones();
    String resp = oper.compra(5, 3);
    Assert.assertEquals(resp, null);
 }    
 @Test
 public void pagoNotNull(){
    Operaciones oper = new Operaciones();
    String resp = oper.pago(6, 7);
    assertNotNull(resp); 
 }    
 
 @Test
 public void calculoSalarioNotNull(){
    Operaciones oper = new Operaciones();
    int respu = oper.CalculoCupo(130000);
    assertNotNull(respu); 
 }   
 
  @Test
 public void calculoSalarioCero(){
    Operaciones oper = new Operaciones();
    int respu = oper.CalculoCupo(0);
    assertNotNull(respu); 
 } 
 
}
