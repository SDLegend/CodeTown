import java.util.*;
interface Check
{
	double PI=3.14159;
	double area();
}
class Rectangle implements Check
{
	double x,y;
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
	public double area()
	{
	return x*y;
	}
}
class Circle implements Check
{
	double r;
	Circle()
	{
	r=2;
	}
	Circle(double x)
	{
	r=x;
	}
	public double area()
	{
	return PI*r*r;
	}
}
class InterfaceDemo2
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Check ref=null;
	Rectangle r1=new Rectangle(6,5);
	Circle c1=new Circle(4);
	System.out.println("Enter your option:\n1.Rectangle\n2.Circle");
	int option=sc.nextInt();
	switch(option)
		{
			case 1:ref=r1;break;	
			case 2:ref=c1;break;
		}
	System.out.println("Area="+ref.area());
	}
}