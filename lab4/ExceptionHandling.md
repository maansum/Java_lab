
# Lab 4.1 : Exception Handling with the use of try-catch ,finally, throw and throws.

# Theory:

   Exception handling is one of the most important feature of java programming that allows us to handle the runtime errors caused by exceptions.

   ## Try-catch:
   The try block contains set of statements where an exception can occur. A try block is always followed by a catch block, which handles the exception that occurs in associated try block. A try block must be followed by catch blocks or finally block or both.We can catch different exceptions in different catch blocks. When an exception occurs in try block, the corresponding catch block that handles that particular exception executes. For example if an arithmetic exception occurs in try block then the statements enclosed in catch block for arithmetic exception executes.



   ## finally:

   A finally block contains all the crucial statements that must be executed whether exception occurs or not. 
The statements present in this block will always execute regardless of whether exception occurs in try block or 
not such as closing a connection, stream etc. 

  >syntax:

```
  try
{
     //statements that may cause an exception
}
catch (exception(type) e(object))‏
{
     //error handling code
}
 
  finally{
  // statements
}


  ```
  

  _code_


```
  class Example
{
   public static void main(String args[]) {
      try{  
	 int num=121/0;  
	 System.out.println(num);  
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      
      finally{
	 System.out.println("This is finally block");
      }  
      System.out.println("Out of try-catch-finally");  
   }   
}

  ```




 ## throw 

    When exception are set to trigger on different condition.
We define our own set of conditions or rules and throw an exception expllictly using 'throw' keyword. 


 >throw new exception_class("error");



_code_

```
public class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight){ 
      if(stuage<12 && stuweight<40) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 39); 
 } 
}
```

---

 ## throws

  Throws keyword is used for handling checked exceptions . By using throws we can declare multiple exceptions in one go.

  _code_

```
  class ThrowExample { 
  void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
  } 
 public static void main(String args[]){ 
   try{ 
     ThrowExample obj=new ThrowExample(); 
     obj.myMethod(1); 
   }
   catch(Exception ex){
     System.out.println(ex);
    } 
  }
}

```

# Conclusion:

 Exception can be handled in java.