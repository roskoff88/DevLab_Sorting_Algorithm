/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.interfaces;

import logic.controllers.InsertionSortStrategy;
import logic.controllers.MergeStrategy;
import logic.controllers.QuickSortStrategy;
import logic.controllers.SelectionSortStrategy;

/**
 *
 * @author Sebastian Rodriguez
 * @email roskoff@hotmail.es
 * @linkedin https://uy.linkedin.com/in/sebastianr88
 *
 */

public class Factory {
    
    private static Factory instance;
    
    private Factory(){};
    
    public static Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }
    
    public Strategy getInsertionSortStrategy(){
        return new InsertionSortStrategy();
    }
    
    public Strategy getMergeStrategy(){
        return new MergeStrategy();
    }
    
    
    public Strategy getQuickSortStrategy(){
        return new QuickSortStrategy();
    }
    
    public Strategy getSelectionSortStrategy(){
        return new SelectionSortStrategy();
    }
   
    
           
}
