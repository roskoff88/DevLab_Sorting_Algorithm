/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.controllers;

import Algorithm.SelectionSort;
import logic.interfaces.Strategy;

/**
 *
 * @author Sebastian Rodriguez
 * @email roskoff@hotmail.es
 * @linkedin https://uy.linkedin.com/in/sebastianr88
 *
 */

public class SelectionSortStrategy implements Strategy {
    
    @Override
    public String doSorting(int[] A){
        return SelectionSort.SelectionSortAlg(A);
    }
}

