<h3>Factory Method Pattern</h3>
A Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide 
which class to instantiate. In other words, subclasses are responsible to create the instance of the class.<br>
The Factory Method Pattern is also known as Virtual Constructor.
<h4>Advantage of Factory Design Pattern</h4>
o	Factory Method Pattern allows the sub-classes to choose the type of objects to create.<br>
o	It supports the loose-coupling by eliminating the need to bind application-specific classes into the code. 
That means the code interacts only with the resultant interface or abstract class, so that it will work with any classes that 
implement that interface or that extends that abstract class.
<h4>Usage of Factory Design Pattern</h4>
o	When a class doesn't know what sub-classes will be required to create.<br>
o	When a class wants that its sub-classes specify the objects to be created.<br>
o	When the parent classes choose the creation of objects to its sub-classes.<br>

<h5>In this demo</h5>
It is creating the objects according to user input. And use this objects method.
