package util;

import java.util.Arrays;

/**
 *
 * @author vitor
 */

public class Util {

    public static boolean iguais(int[] v1, int[] v2) {

        return Arrays.equals(v1, v2);

    }

    public static int primeiroIndiceValorDiferente(int[] v, int i) throws Exception {
        int j = 0;

        while (v[j] == i) {
            j++;

            if (j == v.length){
                
                throw new Exception("Valor não encontrado no vetor");                
            }
        }
        return j;
    }
    
    public static boolean potenciaDeDois(int i){
        if(i == 1) return false;
        if(i == 0) return false;
        
        while( (i % 2) == 0 ){
             i = i / 2;
        }
        
        if (i == 1) return true;
        else return false;
    }
}
