# Factory Design Pattern

Imagine you need to create a bunch of users for an app such as admins, regular users and guests.
The factory pattern lets you have a specialized factory in your code that produces the right user objects based on certain criteria in your code

Think of it as a code factory that spits us certain objects based of off your needs. All you have todo is make a request of what you want and the factory
will deliver it to you. 

## Overview

In this project the aim is to build a app using Factory Design pattern and understand how the pattern works.

We will be using an OS as an example or lead for our factory

### Problem statement

Imagine you are a cellphone manufacture, you have built a phone, and you are trying to figure out which OS to use in your
devices. We are aware that the factory design pattern allows us to make use of a "factory" in our code that creates for us objects based on our needs

How this works is we start off with an OS factory, then we provide the necessary requirements and an OS gets generated.

The beauty of the factory design is that we can pass android, or ios and the factory will produce the correct/desired OS object.
Thus, as a developer all you can focus on is the implementation of this OS factory rather than designing the OS

Factory Design allows us to have a single interface with multiple implementation of that interface. 
That's why in the example above, we have only one OS factory, that is used to produce different type of OS systems
