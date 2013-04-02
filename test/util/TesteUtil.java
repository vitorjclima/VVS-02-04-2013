package util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.omg.CORBA.UnknownUserException;

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
     
     @Test
     public void testePrimeiraOcorrenciaNoVetorDeUmElementoDiferenteDaEntrada() throws Exception{
         int v[] = {1,1,1,2};
         
         assertEquals(3, Util.primeiroIndiceValorDiferente(v, 1));
         assertEquals(0, Util.primeiroIndiceValorDiferente(v, 0));;
     }
     
   
    @Test(expected = Exception.class)
     public void testePrimeiraOcorrenciaNoVetorDeUmElementoIgualDaEntrada() throws Exception{
         int v[] = {1,1,1};
         
         assertEquals(null, Util.primeiroIndiceValorDiferente(v, 1));
     }
     
    @Test
    public void testeFatorial() throws Exception{
        
        assertEquals(1, Util.fatorial(0));
        assertEquals(1, Util.fatorial(1));
        assertEquals(120, Util.fatorial(5));    
        
    }
    
    @Test(expected = Exception.class)
    public void testeFatorialNegativo() throws Exception{
        
        assertEquals(1, Util.fatorial(-1));
        assertEquals(1, Util.fatorial(-1000));
        
    }
    
    @Test
    public void testeFatorialNumeroMaximo() throws Exception{
        
        assertEquals(2432902008176640000l, Util.fatorial(20));
        
    }
    
    @Test(expected = Exception.class)
    public void testeFatorialAcimoDoLimite() throws Exception{
        
        assertEquals(0, Util.fatorial(21));
        
    }
     
}
