# S.O.L.I.D-PRINCIPLE
SOLID OOPS CONCEPT ----HERE I MADE EXPAMLE OF SOLID PRINCIPLE IN THE UPLODED FILE..

S--> Single Responsibility Principle
  => The Single Responsibility Principle states that A class should have only a single reason to change.
  =>IMPORTANCE-> 
  
  1. because many different teams can work on the same project and edit the same class for different reasons, this could lead to incompatible modules.

  2. it makes version control easier. For example, say we have a persistence class that handles database operations, and we see a change in that file in
     the GitHub commits. By following the SRP, we will know that it is related to storage or database-related stuff.

  3. Merge conflicts are another example. They appear when different teams change the same file. But if the SRP is followed, fewer conflicts will appear – files 
     will have a single reason to change, and conflicts that do exist will be easier to resolve.


O-->Open-Closed Principle
  =>The Open-Closed Principle requires that classes should be open for extension and closed to modification.
  
   So what this principle wants to say is: We should be able to add new functionality without touching the existing code for the class.
   This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching 
   the tested and reliable (mostly) production code if possible.
   
   It is usually done with the help of interfaces and abstract classes.
  
L-->Liskov Substitution Principle
  =>According to this Object of super class shall be replaced object of subclass or we should be to substitute base class object with the child class object 
    and this should not alter the behaviour/characteristics of a program
    
   This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to any method that expects an object of class 
   A and the method should not give any weird output in that case.
   
   
I-->Interface Segregation Principle
  =>A client should never be forced to implement an interface that it does not used
    Write highly Cohessive Interfaces 
    avoid interface pollution
  
D--> Dependency Inversion Principle
  =>High level modules/classes should not depends upon low level modules/classes but both should depends upon abastraction
    Also Abstraction should not depends upomn details but details should be depends upon abstraction .
    
    
