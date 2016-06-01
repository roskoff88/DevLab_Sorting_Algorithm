package logic.controllers;


import logic.interfaces.Strategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Rodriguez
 * @email roskoff@hotmail.es
 * @linkedin https://uy.linkedin.com/in/sebastianr88
 *
 */
public class Context {
    
   private Strategy strategy;

   public Context(Strategy strategy){
        this.strategy = strategy;
   }

   public String executeStrategy(int []A){
        return strategy.doSorting(A);
   }

}
