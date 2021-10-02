/*
Anonymous class{nameless classes}
-->by using abstract
-->by using interface
if you do not know the behaviour then we use abstract modifier.
** We use abstract modifier with: class and modifier.

-->Illegal combinations: 1. private and abstract   2. final and abstract

if a class do not have any abstract method, then also we can make the class abstract.
but if the class has abstract method then the class must be abstract.
 */

//we can't create object of abstract class
abstract class Result{
    abstract public void calcResult();    //we can't make body of the abstract method.
}

//child class-->Cresult        parent class-->Result
class Cresult extends Result{
    //if public access modifier is used in the parent class then we need to use the same access modifier when overriding.
    //only widening can be done...not narrowing
    @Override
    public void calcResult() {
        System.out.println("welcome!!");
    }
}

interface Result1 {
    //all the methods in interface is declared---> public and abstract.
    //all variables declared in interface are public static final.
    //no objects can be declared of interface.
    //we can also create static method inside the interface.
    //we can only write default inside the interface.
    //default in class ---> accessibility
    //default in interface ---> default method

    public void calcResult();

    default public void m2(){

    }
    public static void m3(){

    }
    private void m4(){

    }
        }




public class Test {
    public static void main(String[] args) {
        Cresult obj = new Cresult();
        obj.calcResult();

        //anonymous object:
        new Cresult().calcResult();

        //new Result();        'Result' is abstract; cannot be instantiated


        /*
        Object[] arr = new Object[];
        Object[0] = new String("gla");
        */


        //child class-->anonymous class      parent class-->Result
        Result obj1 = new Result() {
            @Override
            public void calcResult() {
                System.out.println("object of abstract class");
            }
        };
        obj1.calcResult();

        //anonymous class:
        new Result() {
            @Override
            public void calcResult() {
                System.out.println("hello you are calling a method of anonymous class");
            }
        }.calcResult();


        //anonymous interface:
        new Result1() {
            @Override
            public void calcResult() {
                System.out.println("this is an anonymous interface method");
            }
        }.calcResult();
    }
}
