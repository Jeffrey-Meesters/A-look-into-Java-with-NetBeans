/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app;

/**
 *
 * @author jeffrey
 */
class Fish implements ViewFish {
    
    int speed = 0;
    
    
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
    
    void printStates() {
        System.out.println(" speed:" + 
            speed);
    }
}
