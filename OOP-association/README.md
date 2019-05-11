![image](https://user-images.githubusercontent.com/46630197/57571937-fd5abf80-741c-11e9-9276-af0d8979feb3.png)<br>
Association simply means the act of establishing a relationship between two unrelated classes.<br>
For example, when you declare two fields of different types within the same class and make them interact with each other, 
you have performed association.<br>
Association in Java:<br>
•	Two separate classes are associated through their objects.<br>
•	The two classes are unrelated, each can exist without the other one.<br>
•	Can be a one-to-one, one-to-many, many-to-one, or many-to-many relationship.<br><br>

<h3>Aggregation vs Composition<h3>

•	Dependency: Aggregation implies a relationship where the child can exist independently of the parent. For example, Bank and Employee, delete the Bank and the Employee still exist. whereas Composition implies a relationship where the child cannot exist independent of the parent. Example: Human and heart, heart doesn’t exist separate to a Human.<br>
•	Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.<br>
•	Type of Association: Composition is a strong Association whereas Aggregation is a weak Association.
