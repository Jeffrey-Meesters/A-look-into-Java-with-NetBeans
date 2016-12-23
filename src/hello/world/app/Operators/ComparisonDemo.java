/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app.Operators;

/**
 *
 * @author jeffrey
 */
public class ComparisonDemo {
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");
        
        //Conditional AND: && and OR: ||
        if((value1 == 1) && (value2 == 2)) // both are true
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1)) // first condition is true, second is false
            System.out.println("value1 is 1 OR value2 is 1");
        
        //Ternary operator:
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2; // will store value1 in result while condition is true

        System.out.println(result);
    }
}
