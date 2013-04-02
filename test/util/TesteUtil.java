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
     
}