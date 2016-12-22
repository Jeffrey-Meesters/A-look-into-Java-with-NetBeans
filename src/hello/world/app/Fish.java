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
public abstract class Fish implements ViewFish {
    
    boolean hungry = false;
    int speed = 0;
    
    public void eat(boolean newValue) {
        hungry = newValue;
    }
    
    public void swimSpeed(int increment) {
        speed = speed + increment;
    }
    
    public static void main(String[] args){
            System.out.println("hungry:" +
                hungry + " speed:" + 
                speed);
    }
}
