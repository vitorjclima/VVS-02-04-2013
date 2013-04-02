/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vitor
 */
public class TesteUtil {
    
    public TesteUtil() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void potenciaDeDoisTestePassa() {    
        assertEquals(true, Util.potenciaDeDois(32));
        assertEquals(true, Util.potenciaDeDois(256));
    }
    
     @Test
    public void potenciaDeDoisTesteFalho() {
        
        assertEquals(false, Util.potenciaDeDois(17));
        assertEquals(false, Util.potenciaDeDois(351));
        
    }
     
     /**
      * Testa se o numero é multiplo de 2, porem não é potência de 2
      */
     @Test
      public void potenciaDeDoisTesteMultiploFalho() {
        
        assertEquals(false, Util.potenciaDeDois(12));
        assertEquals(false, Util.potenciaDeDois(258));
        
    }
     
     @Test
     public void testeVetoresMesmoTamanho(){
         int x[] = new int[5];
         int y[] = new int[5];
         
         assertEquals(true, Util.iguais(x,y));
     }
     
      @Test
     public void testeVetoresDiferenteTamanho(){
         int x[] = new int[6];
         int y[] = new int[5];
         
         assertEquals(false, Util.iguais(x,y));
     }    
     
     @Test
     public void testeVetoresMesmoTamanhoMesmaPosicao(){
         int x[] = {1,2,3,4,5};
         int y[] = {1,2,3,4,5};
         
         assertEquals(true, Util.iguais(x,y));
     }
     
     @Test
     public void testeVetoresMesmoTamanhoDiferentePosicao(){
         
         int x[] = {1,2,6,4,5};
         int y[] = {1,2,3,5,4};
         
         assertEquals(false, Util.iguais(x,y));   
     }
     
     @Test
     public void testeVetoresMesmoTamanhoElementosDiferentes(){
         
         int x[] = {1,2,6,4,5};
         int y[] = {7,8,9,10,20};
         
         assertEquals(false, Util.iguais(x,y));   
     }
     
     @Test
     public void testeVetoresDiferenteTamanhoMesmaPosicao(){

         int x[] = {1,2,3};
         int y[] = {1,2,3,4,8};
         
         assertEquals(false, Util.iguais(x,y));
     }
}
