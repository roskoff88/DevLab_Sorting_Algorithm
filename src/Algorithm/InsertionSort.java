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


/* Description:
 * Se implementa la secuencia y el resultado ordenado sobre un unico arreglo A
 * de n elementos.
 * Para ello se considerara el arreglo dividido conceptualmente en dos partes, 
 * una la de mas a la izquierda (o de menores indices) ya ordenada y el resto 
 * sera la secuencia desordenada. 
 * La idea consiste en tomar el primer elemento de la parte desordenada e irlo 
 * desplazando a la izquierda hasta insertarlo en su lugar. Para ello se debera al mismo 
 * tiempo desplazar a la derecha los elementos mayores a el que forman la parte ordenada 
 * de manera de hacer lugar en el arreglo para ese elemento a insertar.
 * El tiempo de ejecucion: T(n) pertenece O(n^2)
 */

public class InsertionSort {
    
    public static String InsertionSortAlg(int[] A){
        // PRE: El arreglo A no esta vacio (A.length!=0)
        
        StringBuilder sb = new StringBuilder(A.length);

        int i, j, first;
        for (i=0; i<A.length; i++){
            first = A[i];
            j= i-1;
            while (j>=0 && first<A[j]){
                    A[j+1] = A[j];
                    j--;
            }
            A[j+1] = first;
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
