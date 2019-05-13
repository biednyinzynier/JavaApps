<h2>Singeton Design Pattern</h2>
*The singleton pattern is one of the simplest design patterns. 
The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".<br>
*In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.<br>
*Sometimes we need to have only one instance of our class for example a single DB connection 
shared by multiple objects as creating a separate DB connection for every object may be costly. <br>
*Similarly, there can be a single configuration manager or error manager in an application that handles 
all problems instead of creating multiple managers.

<h3>Advantage of Singleton design pattern</h3>
o	Saves memory because object is not created at each request. Only single instance is reused again and again.<br>

<h3>Usage of Singleton design pattern</h3>
o	Singleton pattern is mostly used in multi-threaded and database applications. 
It is used in logging, caching, thread pools, configuration settings etc.

<h3>How to create Singleton design pattern?</h3>
To create the singleton class, we need to have static member of class, private constructor and static factory method.<br>

o	Static member: It gets memory only once because of static, itcontains the instance of the Singleton class.<br>
o	Private constructor: It will prevent to instantiate the Singleton class from outside the class.<br>
o	Static factory method: This provides the global point of access to the Singleton object and returns the instance to the caller.

<h4>In this demo:</h4>
We will only lock on the getInstance() once, when the obj is null. <br>
This way we only synchronize just what we want.
