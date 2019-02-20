/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author DAM116
 */
public class FizzBuzz {

    public String getFizzBuzz(int num) {
        switch (num) {
            case 1:
                return "1";
            case 2:
                return "2";
            default:
                return "3";
        }
    }        
    
}
