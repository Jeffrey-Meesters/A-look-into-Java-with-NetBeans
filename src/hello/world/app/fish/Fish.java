/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app.fish;

import hello.world.app.fish.FishInterface;

/**
 * Lesson on how to create classes and interfaces
 * @author jeffrey
 */
class Fish implements FishInterface {
    
    public static int speed = 0;
   
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
    
    public static void main(String[] args) {
        System.out.println("speed:" + 
            speed);
    }
}
