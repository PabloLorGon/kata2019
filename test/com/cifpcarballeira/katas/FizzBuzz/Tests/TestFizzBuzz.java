/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz.Tests;

import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAM116
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }

   
    @Test
     public void test1devuelve1() {
         FizzBuzz fb = new FizzBuzz();
         String result = fb.getFizzBuzz(1);
         assertEquals("1", result);
     }
     @Test
     public void test1devuelve2() {
         FizzBuzz fb = new FizzBuzz();
         String result = fb.getFizzBuzz(2);
         assertEquals("2", result);
     }
     @Test
     public void test1devuelve3() {
         FizzBuzz fb = new FizzBuzz();
         String result = fb.getFizzBuzz(3);
         assertEquals("Fizz", result);
     }
     @Test
     public void test1devuelve5() {
         FizzBuzz fb = new FizzBuzz();
         String result = fb.getFizzBuzz(5);
         assertEquals("Buzz", result);
     }
     @Test
     public void test1devuelve15() {
         FizzBuzz fb = new FizzBuzz();
         String result = fb.getFizzBuzz(15);
         assertEquals("FizzBuz", result);
     }
}
