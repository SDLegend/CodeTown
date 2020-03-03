import java.util.*;
abstract class Shape
{
	double x,y;
	Shape()
	{
	x=2;
	y=1;
	}
	Shape(double s)
	{
	x=y=s;
	}
	Shape(double a,double b)
	{
	x=a;
	y=b;
	}
	abstract double area();
}
class Rectangle extends Shape
{
	Rectangle()
	{
	super();
	}
	Rectangle(double s)
	{
	super(s);
	}
	Rectangle(double a,double b)
	{
	super(a,b);
	}
	double area()
	{
	return x*y;
	}
}
class Triangle extends Shape
{
	Triangle()
	{
	super();
	}
	Triangle(double s)
	{
	super(s);
	}
	Triangle(double a,double b)
	{
	super(a,b);
	}
	double area()
	{
	return 0.5*x*y;
	}
}
class AbstractDemo1
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Shape ref=null;
	Rectangle r1=new Rectangle(5,6);
	Triangle t1=new Triangle(5,6);
	System.out.println("Enter your option:\n1.Rectangle\n2.Triangle");
	int option=sc.nextInt();
	switch(option)
	{
		case 1:ref=r1;break;
		case 2:ref=t1;break;
	}
	System.out.println("Area="+ref.area());
	}
}