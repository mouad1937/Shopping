# Shopping

SuperCLass    -one instance variable/-one method
-
-
-
-
Subclass      -overrides the inherited/-Adds one new method

Do use inheritance when one class is a  more specific type of a superclass. 

Consider inheritance when you have behaviour (implemented code) that should be shared among multiple classes of the same general type. 
Not to use inheritance just so that you can reuse code from another class. If the relationship between the superclass and subclass violate either of the above two rules.

Not to use inheritance if the subclass and superclass do not pass the IS-A test. 




Public     - members are inherited , we use inheritance when one class is a more specific type of a superclass.
when that should be shared among multiple classes of the same general type.

private    -members are not inherited , reuse code from another class.



we can not change an argument in an overriding method! is a legal overload , but not an overRides.





To define an interface ---------------       use the keyword “interface” instead of “class”
To implement an interface---------------------- use the keyword “implements” followed by the interface name. Note that when you implement an interface to still get to extend a class. 


A CONSTRUCTOR:
-has the code that runs when you instantiate an object. In other words, the code that runs when you say new on a class type. Every class has a constructor, even if we don’t write it ourselves. 


If we have more than one constructor in a class, the constructors must have different argument lists. 
Four things about the constructor, 


-A constructor is the code that runs when somebody says on a class type
-Must have the same name as the class, and no return type.
-If you don’t put a constructor in your class, the compiler puts in a default constructor. the default constructor is always a no arg constructor.
-You can have more than one constructor in your class, as long as the argument list is different, having more than one constructor in class means you have overloaded constructors.


Instance Variables;
-are declared inside a classs but not inside a method.

Local Variables;
-are declared inside a method , including method parameters.


If local variables live on the stack, where do instance variables live,
when we call a method , the method lands on the top pf a call stack.




