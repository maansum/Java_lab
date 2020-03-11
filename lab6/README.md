# Lab :6

# Title : Applets life cycle,param tag and appliction in Applets.

## Theory:
_ An applet is a Java program that can be embedded into a web page. It runs inside the web browser and works at client side.
 An applet is embedded in an HTML page using the APPLET or OBJECT tag and hosted on a web server.

Applets are used to make the web site more dynamic and entertaining.

> Important points :

1. All applets are sub-classes (either directly or indirectly) of java.applet.Applet class.
2. Applets are not stand-alone programs. Instead, they run within either a web browser or an applet viewer.
   JDK provides a standard applet   viewer tool called applet viewer.
3. In general, execution of an applet does not begin at main() method.
 
4. Output of an applet window is not performed by System.out.println(). 
Rather it is handled with various AWT methods, such as drawString().

![](https://media.geeksforgeeks.org/wp-content/uploads/Java-Applet-Lifecycle.png)


_code_

```
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
/*<applet code="AppletLifeCycle.class" width="350" height="150"> </applet>*/
public class AppletLifeCycle extends Applet
{
     public void init()
     {
       setBackground(Color.CYAN);
       System.out.println("init() called");
     }
     public void start(){ System.out.println("Start() called"); }
     public void paint(Graphics g){ System.out.println("Paint(() called"); }
     public void stop() { System.out.println("Stop() Called"); }
     public void destroy()   { System.out.println("Destroy)() Called"); }
}
```


-----------------------------
# for param tag:

Java allows users to pass user-defined parameters to an applet with the help of <PARAM>tags. The <PARAM>tag has a NAME attribute which defines the name of the parameter and a VALUE attribute which specifies the value of the parameter. In the applet source code, the applet can refer to the parameter by its NAME to find its value. The syntax of the <PARAM>tag is:

 

<APPLET>

 <PARAMNAME=parameter1_name VALUE=parameter1_value>

 <PARAMNAME=parameter2_name VALUE=parameter2_value>

 <PARAMNAME=parametern_name VALUE=parametern_value>

 </APPLET>

 

For example, consider the following statements to set the text attribute of applet to This is an example of Parameter! ! !

 
<APPLET>

<PARAMNAME=text VALUE=This is an example of Parameter!!!>

</APPLET>

_code_

```
import java.applet.Applet;  
import java.awt.Graphics;  
  
public class ParamTest extends Applet{  
  
public void paint(Graphics g){  
String str=getParameter("msg");  
g.drawString(str,50, 50);  
}  
  
/* <applet code="ParamTest.class" width="300" height="300">  
 <param name="msg" value="Welcome to applet">  
 </applet> */

}  
```


----------------------

#  Applets to Application:


_code_

```
import java.awt.*;

 class AppletsApplic {

 	
AppletsApplic()
{
	int a=5;
}
public void paint(Graphics g)
{
	System.out.println("paint");
}
public static void main(String arg[])
{
	AppletsApplic b = new AppletsApplic(5);

	b. paint();
}
}

```
 
## conclusion :
   we are familar with the applets and its life cycle.
