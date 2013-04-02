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

            if (j == v.length) {

                throw new Exception("Valor não encontrado no vetor");
            }
        }
        return j;
    }

    public static boolean potenciaDeDois(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 0) {
            return false;
        }

        while ((i % 2) == 0) {
            i = i / 2;
        }

        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static long fatorial(int i) throws Exception {
        
        if (i > 20) throw new Exception("Número acima do limite suportado");
        
        if (i < 0) throw new Exception("Não existe fatorial para número negativo");
        
        if (i == 0) return 1;
           
        long fatorial = 1;
        
        for (int j = 1; j <= i; j++) {
            fatorial = fatorial * j;
        }

        return fatorial;
    }
}
