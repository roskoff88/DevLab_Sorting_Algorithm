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

/* Description
 * Mergesort tiene la particularidad de que su complejidad es de O(n log n) en el peor caso.
 * La estrategia del algoritmo se basa en Divide & Conquer dividiendo el problema en 2
 * subproblemas de tamanio mitad.
 * se divide la secuencia original S en dos subsecuencias de tamanioo mitad, S1 y S2. 
 * Se ordenan estas recursivamente con la misma estrategia y luego se combinan, las dos subsecuencias 
 * ya ordenadas intercalandolas (MERGE) en forma ordenada para formar una secuencia ordenada de 
 * tamanio n. El paso base de la recursion se da cuando queda un solo elemento en la subsecuencia y 
 * por lo tanto puede considerarse ordenada.
 * La version a estudiar de Mergesort utiliza una operacion MERGE para combinar las soluciones
 * en el proceso D&C. Esta operacion recibe dos secuencias ordenadas, las intercala ordenadamente 
 * devolviendo una unica secuencia.
 */


public class Merge {
    
    private static void MergeSortAlg(int[] A, int [] tmp, int ini1, int fin1, int ini2, int fin2){
            int pos = ini1;
            int num = fin2 - ini1 + 1; //tamanio del vector tmp

            while (ini1<=fin1 && ini2<=fin2){
                if (A[ini1] <= A[ini2]){
                    tmp[pos++] = A[ini1++];
                }
                else
                        tmp[pos++] = A[ini2++];
            }
            // copio los elementos de la primer secuencia a tmp
            while (ini1<=fin1){
                tmp[pos++] = A[ini1++];
            }
            // copio los elementos de la segunda secuencia a tmp
            while (ini2<=fin2){
                tmp[pos++] = A[ini2++];
            }
            // copio el vector tmp 
            for (int i=0; i<num ; i++,fin2--){
                A[fin2] = tmp[fin2];
            }
	}
	
        public static void MergeAlg(int[] A, int[] tmp, int p, int q){
            int medio;
            if (p<q){
                medio = (p+q) / 2;
                MergeAlg(A,tmp,p,medio);
                MergeAlg(A,tmp,medio+1,q);
                MergeSortAlg(A,tmp,p,medio,medio+1,q);
            }
        }
	public static String MergeSort(int[] A, int[] tmp, int p, int q){
            // PRE: El arreglo A tiene elementos insertados (n!=0)
            StringBuilder sb = new StringBuilder(A.length);
            
            MergeAlg(A, tmp, p, q);
            
            for (int i=0;i<A.length;i++){
                sb.append(A[i]);
                if (i+1 != A.length){
                    sb.append('|');
                }
            }
            return sb.toString();
	}
	
}
