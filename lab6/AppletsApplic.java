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
