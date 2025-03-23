# Builder Pattern

Creational Design Pattern.

## Overview

The Builder pattern is one of our 5 creational design pattern. It is essentially helpful when we are creating
new objects

### Example

Let say we have a phone class. This phone class comes with 5 properties labeled as OS, processor , ScreenSize, Battery and Camera

```Java
    public class Phone {
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;
}
```

Now in order to create a new phone object we are required to set these values.

We can set these values using the class setters or the constructor

```java
// using constructor
public  Phone (String os, String processor, double screenSize, int battery, int camera){
    this.os = os;
    this.processor = processor;
    this.screenSize = screenSize;
    this.battery = battery;
    this.camera = camera;
}

@Override
public String toString(){
    return "Phone [os=" + os +", processor=" + processor +", screenSize=" + screenSize + ", battery=" + battery +
            ", camera=" + camera + "]";
}
```

Now since we have our constructor, we would use that constructor to create our phone object (build the phone)
as such

```Java
public class Shop {
    // building our phone
    public static void main (String[] args){
        Phone phone = new Phone("Android","Qualcomm",4.4,3100,13);
        system.println.out(phone);
    }
}
```

*THE QUESTION TO ASK YOURSELF - what parameters do we pass to our constructor and in which order to we pass them?*

In the case of the Phone class, we need to pass five parameters, and we need to remember the sequence of these parameters
thus making this kind of design flaw, especially if our constructor takes more than 5 parameters (which is insane to begin with).

*ALSO*

What if we do not want to set all the parameters. What if we wanted to set only one out of the five, such as the OS or maybe screen size

It is the equivalent of going to the store to choose a new phone. you might not be concerned on all the specs of the phone and just want
a phone with a big enough screen size. So obviously you would not care about the OS and the battery etc.

*PROBLEMS WE WILL RUN INTO*

In a scenario where we are not concerned about all the other specs, we would run into a problem if we created our phone
object using the constructor.

Reason being the phone constructor takes five parameters and we are giving it only one!

Another problem that arise is the fact that you need to know the sequence of these parameters. So even if we intend on using the constructor.
Inserting the parameters in an incorrect order, will result to your program crashing. As simple as that.

Inorder to solve the two problems listed above, we use the builder design pattern.

## Builder Pattern

How does it work, simple.

We have our phone class, unlike before where we had a constructor. In a builder pattern we omit the constructor and replace it with setter methods
and each setter method returns an instance of the phone class.

In simple english, no constructor in our class. Just a bunch of set methods returning the class

```Java
public class PhoneBuilder {
    // our class variables
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;
    private Phone phone;

    // 
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this; // returning an instance of the Phone Builder
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }
    
    // building our phone
    public Phone getPhone(){
        return new Phone(os, processor, screenSize, battery, camera);
    }
    
    // alternatively we could rename getPhone to Build, like the pro's do
}
```

The PhoneBuilder class has no parametrized constructor. It only has a bunch of set methods and these set methods acts as
our constructors. These setters allow us to only set the properties that we need.

How the builder pattern works is simple. You set the property you want and, it returns to you the object.
So something goes in and something comes out.

This is a setup for a simple builder pattern
