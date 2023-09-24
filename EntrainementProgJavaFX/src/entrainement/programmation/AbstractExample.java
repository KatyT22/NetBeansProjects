/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrainement.programmation;

/**
 *
 * @author katy
 */
public class AbstractExample extends Foo {
    
    public static void main (String [] args){
        Foo obj = new AbstractExample();
        obj.bar(); //Not OK
        Foo.bar(); //OK
        obj.bar2();
        
        System.out.println(obj.x+", "+obj.y+", "+obj.z+"<--obj.x, y, z     Foo.x only-->"+Foo.x);
        obj.abstractMethod();
        //Foo.abstractMethod(); abstractMethod() not a static method can not be invoked from a static context.
    }

    @Override
    public void abstractMethod() {
        System.out.println("Here abstract method have been called.");
    }
}
