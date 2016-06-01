/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.controllers;

import Algorithm.Merge;
import logic.interfaces.Strategy;

/**
 *
 * @author Sebastian Rodriguez
 * @email roskoff@hotmail.es
 * @linkedin https://uy.linkedin.com/in/sebastianr88
 *
 */

public class MergeStrategy implements Strategy {
    
    
    @Override
    public String doSorting(int[] A){
       int [] tmp = new int [A.length];
       int p = 0;
       int q = A.length-1;
       String asf = Merge.MergeSort(A, tmp, p, q);
       return asf;
    }
}
