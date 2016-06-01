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

public class QuickSort {
    
    private static void swap(int[] A,int ini,int fin){
        int temp = A[ini];
        A[ini] = A[fin];
        A[fin] = temp;
    }
	
    private static int partition(int[] A,int ini,int fin){
        int pivote = A[ini];
        int pospiv = ini;
        for (int i=ini+1;i<=fin;i++){
            if (A[i] < pivote){
                    pospiv = pospiv + 1;
                    swap(A,pospiv,i);
            }
        }
        swap(A,ini,pospiv);
        return pospiv;
    }

    
    public static void QuickSortAlg(int[] A,int ini,int fin){
        // PRE: El arreglo A tiene elementos insertados (n!=0)
        int posPiv = 0;
        if (ini<fin){
            posPiv = partition(A,ini,fin);
            QuickSortAlg(A,ini,posPiv-1);
            QuickSortAlg(A,posPiv+1,fin);
        }
    }
        
        
    public static String QuickSort(int[] A,int ini,int fin){
        // PRE: El arreglo A tiene elementos insertados (n!=0)
        StringBuilder sb = new StringBuilder(A.length);
        
        QuickSortAlg(A,ini,fin);
        
        for (int i=0;i<A.length;i++){
            sb.append(A[i]);
            if (i+1 != A.length){
                sb.append('|');
            }
        }
        return sb.toString();
    }
}
