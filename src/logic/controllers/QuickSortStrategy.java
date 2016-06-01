/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.controllers;

import Algorithm.QuickSort;
import logic.interfaces.Strategy;

/**
 *
 * @author Sebastian Rodriguez
 * @email roskoff@hotmail.es
 * @linkedin https://uy.linkedin.com/in/sebastianr88
 *
 */

public class QuickSortStrategy implements Strategy {
    
    @Override
    public String doSorting(int[] A){
        int ini = 0;
        int fin = A.length-1;
        return QuickSort.QuickSort(A, ini, fin);
    }
}

