import java.util.*;
interface Show
{
	void display();
}
class Identity implements Show
{
	String name;
	Identity()
	{
	name="Unknown";
	}
	Identity(String n)
	{
	name=n;
	}
	public void display()
	{
	System.out.println("Name:"+name);
	}
}
class Rectangle implements Show
{
	int x,y;
	Rectangle()
	{
	x=2;
	y=1;
	}
	Rectangle(int a,int b)
	{
	x=a;
	y=b;
	}
	public void display()
	{
	System.out.println("Area="+(x*y));
	}
}
class TF implements Show
{
	boolean var;
	TF()
	{
	var=true;
	}
	TF(boolean x)
	{
	var=x;
	}
	public void display()
	{
	System.out.println("Truth value="+var);
	}
}
class InterfaceDemo1
{
	public static void main(String args[])
	{
	Show ref=null;
	Identity i1=new Identity("Samarth");
	Rectangle r1=new Rectangle(6,5);
	TF tf1=new TF(false); 
	System.out.println("Enter your option\n1.Identity\n2.Rectangle\n3.True/False");
	Scanner sc=new Scanner(System.in);
	int option=sc.nextInt();
	switch(option)
		{
		case 1:ref=i1;break;
		case 2:ref=r1;break;
		case 3:ref=tf1;break;
		}
	ref.display();
	}	
}