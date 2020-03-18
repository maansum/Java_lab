
# lab 4.2: Package in java.
 


# Theory:
 A java package is a group of similar types of classes, interfaces and sub-packages.Package in java can be categorized in two form, built-in package and user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

 There are three ways to access the package from outside the package.

  1. import package.*;


  if we package name then all classes and interfaces of that class are accessible but not sub-packages.


**code**
```_save by A.java_  
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  
```
```_save in b.java_
package mypack;  
import pack.*;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  
```

  2. import package.classname;

_only class name is assible not others_

**code**

```
package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
}  
```
```
package mypack;  
import pack.A;  
  
class B{  
  public static void main(String args[]){  
   A obj = new A();  
   obj.msg();  
  }  
}  
```



  3. fully qualified name.

  _If you use fully qualified name then only declared class of this package will be accessible. Now there is no need to import. But you need to use fully qualified name every time when you are accessing the class or interface._

  ```
  package pack;  
public class A{  
  public void msg(){System.out.println("Hello");}  
  ```
 ```
 package mypack;  
class B{  
  public static void main(String args[]){  
   pack.A obj = new pack.A();//using fully qualified name  
   obj.msg();  
  }  
}  
 ```


## to compile: javac -d directory javafilename
## to run : java packageNAME.className

# Conclusion 
 package are usge to provide access protection , remove name collision and many more.