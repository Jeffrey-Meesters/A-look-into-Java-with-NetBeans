/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app.Operators;

/**
 * The instanceof operator compares an object to a specified type.
 * You can use it to test if an object is an instance of a class, 
 * an instance of a subclass, or an instance of a class that implements a particular interface.
 * @author jeffrey
 */
public class InstanceofDemo {
        public static void main(String[] args) {

        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
    }
}
class Parent {} //Empty object
class Child extends Parent implements MyInterface {} //empty object which extends the perent class and implements an interface
interface MyInterface {} // the interface which is also an empty object