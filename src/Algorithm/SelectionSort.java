package Algorithm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seba
 */

/* Descripcion
 * Se implementa la secuencia y el resultado ordenado sobre un unico arreglo A
 * de n elementos.
 * El arreglo se considerara dividido en 2 partes, la izquierda contiene la parte
 * ordenada, la derecha contiene la parte desordenada. 
 * En cada paso se busca el menor elemento de la desordenada y se 
 * intercambiara con el primer elemento de esta, 
 * creciendo asi la parte ordenada y decreciendo la desordenada (en tama�o).
 * El tiempo de ejecucion: T(n) pertenece O(n^2)
 */

public class SelectionSort {
    
    public static String SelectionSortAlg(int[] A){
        
        // PRE: El arreglo A no esta vacio (n!=0)
        StringBuilder sb = new StringBuilder(A.length);
        
        int i, j, tmp = 0, posmin = 0;
        for (i=0; i<(A.length-1); i++){
            posmin = i;
            for (j = i+1; j<A.length; j++){
                    if (A[j] < A[posmin])
                            posmin = j;
            }
            tmp = A[i];
            A[i] = A[posmin];
            A[posmin] = tmp;
        }
        
        for (i=0;i<A.length;i++){
            sb.append(A[i]);
            if (i+1 != A.length){
                sb.append('|');
            }
        }
        return sb.toString();
    }
}
