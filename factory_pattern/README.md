# Factory Design Pattern

Imagine you need to create a bunch of users for an app such as admins, regular users and guests.
The factory pattern lets you have a specialized factory in your code that produces the right user objects based on certain criteria in your code

Think of it as a code factory that spits us certain objects based on your needs.
All you have todo is to make a request of what you want, and the factory
will deliver it to you. 

## Overview

In this project, the aim is to build an app using a Factory Design pattern and understand how the pattern works.

We will be using an OS as an example or lead for our factory

### Problem statement

Imagine you are a cellphone manufacturer, you have built a phone,
and you are trying to figure out which OS to use in your
devices.
We are aware that the factory design pattern allows us to make use of a "factory"
in our code that creates for us objects based on our needs

How this works is we start off with an OS factory, then we provide the necessary requirements, and an OS gets generated.

The beauty of the factory design is that we can pass android or ios,
and the factory will produce the correct/desired OS object.
Thus, as a developer, all you can focus on is the implementation of this OS factory rather than designing the OS

Factory Design allows us to have a single interface with multiple implementations of that interface. 
That's why in the example above, we have only one OS factory used to produce the different types of OS systems
such as android, ios or windows.

These subsystems that are created will be our implementations of the OS Factory.

## NOTES

```
Java 101, an interface is a blueprint used to design other classes. It contains a set of abstract methods. These abstract method then gets implemented
in which ever manner best suits your problem
```

All Factories need an interface, the factory design pattern is built around an interface,
thus we created our [OS Interface](src/main/java/os/phone/OS.java).

All our different OS systems will be built around this OS interface

## Thought process

### Example 1

```java
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
```

The example above works, but it goes against the factor design concept.

The Factory design concept is built around abstraction and encapsulation.

The way my code is structured above it is not encapsulation-friendly thus you the developer reading the code is able
to see what classes I am using
thus I am exposing the subsystem classes

With the Factory design pattern,
we aim on providing you with what you need without exposing where it comes from or which class produced it, 
Thus adhering to the laws of encapsulation and abstraction.

The idea is to create one mainFactory class that creates your desired Object based on the arguments you give it 

### Example 2

```java
    /**
     * Based on the argument you pass the factory will generate for you the necessary OS
     * @param OsName the os you want, this is a simple factory so we only have android, ios and windows in stock
     * @return an OS instance
     */
    public static OS getOSInstance(String OsName){
        if (OsName.equalsIgnoreCase("android")) {
            return new Android();
        } else if (OsName.equalsIgnoreCase("ios")) {
            return new IOS();
        }else{
            return new Windows();
        }
    }
```

So now we went ahead
and created our main Factory Class [OperatingSystemFactory](src/main/java/os/phone/OperatingSystemFactory.java),
the main method is illustrated above.
Using the getOSInstance() method,
we can then request our factory to produce the particular OS that we require without ever knowing which
class or classes are being called to produce the OS instance

```java
    public static void main(String[] args) {
        // A streamlined version using our Factory
        OS subsystem = OperatingSystemFactory.getOSInstance("android");
        subsystem.spec();
    }
```

## Credits

### Shout to Telusko for the amazing content

1. [Factory Design Pattern Overview](https://youtu.be/KewVXDBmUhw?si=34loCLKaXNdkjAY5)
2. [Factory Design Pattern in Java](https://youtu.be/pt1IbV1aSZ4?list=PLsyeobzWxl7r2ZX1fl-7CKnayxHJA_1ol)

Great Videos, that gets you understanding the factory design concept and how it works