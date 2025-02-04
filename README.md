# Design Patterns

learning design patterns from zero to hero

I have seen this come up quite a few times on job descriptions. Design patterns, What are design patterns, for many job applications I shamelessly said NO to knowing design patterns as I felt it was something I should have known.

I am not a CS Major, but I am a WeThinkCode_ Alumni, and as a WeThinkCoder, when you do not know something, it becomes your job to known it.

SO HERE WE GO AGAIN, time to dive into the world of design patterns!

## Projects Developed during my learning path

All links lead to one of my public repositery

1. [Factory Pattern](https://github.com/M00N-N1T3/factory_design_pattern)

    -  [Shape Factory](https://github.com/M00N-N1T3/shapes_using_factory_design)

## Overview

Design patterns are a set of best practices to use when designing your OOP applications. In total we have 23 different design patterns.

When the designing our application, the pattern we choose is highly dependent on the type of problem we are trying to solve as well as the application we are trying to build.

Thus the choice is highly dependent on the requirements of our application

The design patterns were then classified into three categorizes

1. Creation
2. Structural
3. Behavioral

## Creational patterns

Creational patterns are used when our app requires us to create an object in our application.

### Creational patterns include

1. Singleton
2. Factory
3. Abstract Factory
4. Builder
5. Prototype

Creational patterns simply deals with creating objects, one of the most famous one is the Factory pattern

Imagine you need to create a bunch of users for an app such as admins, regular users and guests.
The factory pattern lets you have a specialized factory in your code that produces the right user objects based on certain criteria in your code

Think of it as a code factory that spits us certain objects based of off your needs

## Structural patterns

We use structural design pattern when we want to create applications that are composed of multiple objects.

For instance we have one Object, for a menu of a restaurant and each item in our menu is an object of its own, such as a pie object or a beverage object. Thus we can say that our menu item is composed out of the menu object, pie object and beverage object.

Note: Composition is the combination of multiple objects to produce one single application

### Structural patterns include

1. Adapter
2. Composite
3. Proxy
4. Fly weight
5. Facade
6. Bridge
7. Decorator

Structural patterns are all about how objects are composed as well as their relationship to each other

An Example of the Adapter pattern, imagine you have phone charger and it needs fit in different outlets. You would need an Adapter for it.
Same logic applies with the adaptor pattern

The adaptor pattern allows objects with different interfaces communicate with each other

## Behavioral patterns

Behavioral patterns are used when we have two application and we are trying to communicate from Object A to Object B. Think of server-client models.

### Behavioral patterns include

1. Template Method (MVC)
2. Mediator
3. Chain of Responsibility
4. Observers
5. Strategy
6. Command
7. State
8. Visitor
9. Iterator
10. Interpreter
11. Memento

Behavioral patterns focus more on how objects interacts and communicates with each other.

A good example would be teh Observer patter Think of a chat app, when one user sends a message all other users get notified in app.
That there would be the Observer pattern

## Conclusion

You do not need to memorize all of them, it is more about understanding them and how they work under the hood than anything else.

By knowing how they work we can then choose which pattern to work with based on the problem we are trying to solve,
the logical approach and then we choose from it.

You need to understand the problem and then choose a pattern that most fits.

### Why Design Patterns

Design patterns are about creating systems that are more modular, more flexible and easier to manage and maintain

Imagine you are building the ecommerce platform. As the number of user grows you will need to scale. You will need to add code for deferent payment systems, maybe offer worldwide shipping and etc, if your code is not well structured making these changes become a nightmare. It is like adding a room to a house with no foundation.

When you use design patterns you are essentially building your application with a solid structural foundation, thus making your code more robust, easy to change and so fourth. Thus ultimately making your code  stand the test of time

## Extra

Compositions, interfaces and loose coupling, key concepts to grasp about design patterns.
The gang of 4, book called Design patterns, good resource to start off on
