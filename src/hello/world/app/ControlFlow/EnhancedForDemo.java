/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app.ControlFlow;

/**
 *
 * @author jeffrey
 */
public class EnhancedForDemo {
    public static void main(String[] args){
         int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int number : numbers) {
             System.out.println("Count is: " + number);
         }
    }
}

// Ruby: numbers.each do |number|
// p number