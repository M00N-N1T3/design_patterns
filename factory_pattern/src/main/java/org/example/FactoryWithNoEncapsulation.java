package org.example;

import os.phone.OS;
import os.phone.Android;
import os.phone.IOS;
import os.phone.Windows;

public class FactoryWithNoEncapsulation {

    public static void main(String[] args) {
        /*
        Cool so we have our os.phone package, which contains our OS interface along with our subsystems (android, ios, windows),
        The next step would be to create our subsystems from our os factory
        */

        // the reason we are able to create an android from the OS class is because our android class implements OS thus it is a child of OS class
        OS subsystem = new Android();
        OS subsystem1 = new IOS();
        OS subsystem2 = new Windows();
        /*
        Notice how all the subsystems are being created using the OS object. This is the beauty of the Factory Design pattern

        We can create our main Factory "OS interface". This interface then contains abstract methods and acts as blueprints for creating our OS subsystems

        All our subsystems implement the OS interface, thus they are all children to the OS interface,
        and all our subsystems carry unique implementations of the same methods as that defined in our OS interfere.
        */

        subsystem.spec();
        subsystem1.spec();
        subsystem2.spec();

        /* Conclusion:
        *  Factory revolves around an interface. We have one main interface that acts as the backbone / blueprint for all our other classes.
        * Using this factory interface, we can then go ahead and produce different Objects when we need them
        * */
    }
}
