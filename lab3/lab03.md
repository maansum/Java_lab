 # Lab 3: Inheritance and Types of Variables in Java.


 # Theory:

        Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
   It is an important part of OOPs (Object Oriented programming system).


  >syntax:

```
     class Subclass-name extends Superclass-name  
     { 
   //methods and fields  
     }

```  

 Except Multiple inheritance other types of inheritance are possible in java.


 ## Types of inheritance :

  1.single:
   When a class inherits another class.

>code


 ```

    class parent
    {
    	void you()
    	{
    		System.out.println("responsiblility");
    	}
    }  
    class child extends parent
    {
    	void wish()
    	{
    		System.out.println("its me ");}
    }  
    class TestInheritance{ 
    	public static void main(String args[]){  child d=new child();  
    	  d.love();  
    	  d.wish();  
    	  }
    	}

 ```


 2.multilevel


 ```

    class Shape {
    	public void display() {
      System.out.println("Inside display");
       }
      }
       class Rectangle extends Shape {
       	public void area() {
      System.out.println("Inside area");
      } 
     }
      class Cube extends Rectangle {
      	public void volume() {
      System.out.println("Inside volume");}}
      public class Tester {
      	public static void main(String[] arguments) {
      Cube cube = new Cube();
      cube.display();
      cube.area();
      cube.volume();
   }
    } 

 ```


    In similar manner we can inherit for parent class to child class.
     


# variable:

   Variable is name of reserved area allocated in memory.
 There are three types of variables in Java:
   -local variable
   -instance variable
   -static variable

 
_local variable_

 A variable declared inside the body of the method is called local variable. A local variable can't be define as 'static'.

 _instance vaiable_

   A variable declared inside the class but outside the body of the method, is called instance variable.
 It is not declared as static.It is called instance variable because its value is instance specific and 
is not shared among instances.

  _static variables_

  A variable which is declared as static is called static variable. 
It cannot be local. 
You can create a single copy of static variable and share among all the instances of the class. 
Memory allocation for static variable happens only once when the class is loaded in the memory.
   

> code:

 ```
   class A{  
int data=50;//instance variable  
static int m=100;//static variable  
void method(){  
int n=90;//local variable  
}  
}//end of class

``` 



# conclusion:

hence we conclude that we can use inheritance in java and variable can be define as per the need.









