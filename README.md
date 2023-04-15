# DecoratorPattern

## Decorator Pattern

We learned that the “O” in the Solid principles means that it’s a good practice in design to keep our class open for extension and closed for modification – each component or class should be open to extending its functionality without source code modification. We want our code to easily implement new behaviour without making a change to our existing code. There are a few ways of extending behaviour with Object Oriented design techniques. The Decorator Pattern is one of them. 

The Decorator pattern is a structural design pattern that we can use to attach new behaviours to objects by placing the objects inside wrapper objects. The wrapper objects have the behaviours that we want our existing objects to extend. Decorators have the same supertype as the objects they decorate because decorators implement the same interface or abstract class as the object they decorate. We can decorate the object with as many decorators as we like. Decorators change the behaviour of the existing object by adding new functionality before and/or after method calls to the object. All these decorators extend the behaviour of the existing basic object but not part of the object itself, we can easily remove these decorators from the objects if we don’t need them. 

We called the common interface for both the wrapped object and the decorators a component. The class of objects being wrapped implements the interface that defines the basic behaviour, which can be changed by the decorators. The base decorator class has a field referencing the wrapped object and delegates all operations to the object. If we want to add extra behaviour to the components dynamically, we can have concrete decorators which override the methods of the base decorators. After creating the concrete decorator classes, we can use them to decorate interface objects. We need to ensure all these classes implement the component interface.

When we want to change an existing object’s functionality, we think about inheritance. But with inheritance, which is done at compile time and static, we can only replace the entire object with another one instead of altering the behaviour at runtime. To change the functionality of the object dynamically, we can use the decorator pattern, which can also avoid breaking the code that uses the object. We don’t need to make a new subclass to add new behaviour and can combine several behaviours by using multiple decorators on an object. We can easily change the duty assigned to an object later if the intended functionality changes. With the decorator pattern, we can apply the single responsibility that each component or class should have a single purpose by dividing the functionality into different classes.

Assume that we have an abstract class called Beverage. In the class, we have a description instance variable to provide the details of the beverage and two methods, one is the description getter method called getDescription() and another one is a method called cost() to return the price of the beverage. There’re different kinds of beverages offered by the shop and the customer can also request several condiments to be added to the beverage. We want to include all the information in our order system. 

If we just add instance variables to represent all the condiments and calculate the costs, we need to add a bunch of get and set methods for each of the condiment instance variables in our code. Meanwhile, there’re a lot of situations that may lead to modification of the code. For example, if the price changes for condiments or new condiments are added, we need to alter the code in the superclass. And not all condiments are applied to all beverages although all beverage subclass will inherit all methods in the Beverage superclass. It implies that representing the beverage and condiments with inheritance is not a good idea. 

We need to decorate the beverage subclass with condiments during execution. For example, if the customer wants a decaf with milk and whip. We can initiate a Decaf object and decorate it with a Milk object and a Whip object. The Milk object and the Whip object are all decorators. They’re the same type as the object that they’re decorating, which is the Decaf object. So all of them have the cost() method that can be called. If we visualize this process, we would get a Whip decorator wrapping the Milk decorator with the Decaf object wrapped inside the Milk decorator. 

In order to calculate how much it costs, we can call the cost() method and add up the costs. During this process, we first call cost() on the Whip decorator, which is the last decorator added. The Whip decorator calls the cost() method in the Milk decorator next. And the Milk decorator calls the cost() method on the Decaf object. The methods return the cost accordingly from the Decaf object to the Milk decorator and reach the Whip decorator at the end. 

## Code Description

For the project, we create a Tea class to represent different types of tea that are available in one beverage shop. And we use the decorators to decorates a Tea object without changing its structure. Using the decorator pattern in this project allows for flexible customization of teas with different toppings.

First we create the “Tea” class, as an interface that defines the common behavior for different types of teas, including the getName() and getPrice() methods.

Then, “AbstractTea” is an abstract class that implements the Tea interface. It contains protected fields of sugar, description, and price for each object of tea. It also provides an implementation of the Tea interface by defining the getName() and getPrice() methods.

After the abstract class, we created “FreshTea”, “FruitTea”, and “MilkTea” classes as the concrete classes that extend the “AbstractTea” class. They represent different types of teas and provide their own implementations of the getName() and getPrice() methods by overriding the methods. The constructors in these concrete classes are to set the values of description, sugar, and price for each specific type of tea.

Then we come to our usage of decorator pattern. We first create the “ToppingDecorator” as an abstract class that also implements the Tea interface. It acts as a decorator for a Tea object, and it allows different toppings to be added to the tea dynamically. It contains a reference to a Tea object and a name variable to represent the topping’s name.

Then, we create “SagoDec”, “TaroDec”, “CoconutJellyDec”, and “BlackPearlDec” as the concrete classes that extend the “ToppingDecorator” class. Each of them represents one kind of topping that can be added to a Tea object. Each of the decorator classes has a constructor to set the topping’s name and reference to the Tea object. And each decorator class also contains its own implementation of the getPrice() method to calculate the total price of the tea with the specific added topping.

Lastly, to wrap up, we have the "Order" class as the driver for the tea project. It contains a printReceipt() method to display the name and final price of the ordered tea. The main method demonstrates three different orders of tea with various toppings using the decorator pattern. 

For example, in the first order, we call the “MilkTea” class to create a MilkTea object with the description "Brown Sugar Milk Tea", we assign this MilkTea object as “sugarMilkTea”. And then we add the decorators to the “sugarMilkTea” by calling the two decorators and passing it as the parameter, so it will be decorated with "BlackPearlDec" and "TaroDec" toppings, and then we print the whole receipt. The second and third order works similarly, we added the “SagoDec” and “CoconutJellyDec” toppings to the FruitTea object “mango”, and no decorators are added to the FreshTea object “black”. This process shows how we can use the decorator pattern to dynamically add or modify behavior of our Tea objects by wrapping them with decorators.

## How to run the code
In the package of allabouttea, the “Order” class contains the main method to run the whole program. So we can run the main method in the “Order” class to see how we use the decorator pattern in this project.

## UML diagram

![UML diagram](/uml.png)


## Reference

E. Freeman and E. Robson, Head first design patterns : building extensible and maintainable object-oriented software, 2nd edition. Sebastopol, California: O’Reilly, 2021.

D. Zhart, “Decorator” Refactoring.Guru. https://refactoring.guru/design-patterns/decorator. (accessed Apr 11, 2023)

