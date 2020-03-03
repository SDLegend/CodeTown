import java.util.Scanner;
abstract class Shape
{
	int s1,s2;
	Shape(int l,int b)
	{
	s1=l;
	s2=b;
	}
	abstract double area();
}
class Rectangle extends Shape
{
	Rectangle(int l,int b)
	{
	super(l,b);
	}
	double area()
	{
	return s1*s2;
	}
}
class Triangle extends Shape
{
	Triangle(int b,int h)
	{
	super(b,h);
	}
	double area()
	{
	return 0.5*s1*s2;
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
	Shape s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter option\n1:Rectangle\t\t2:Triangle");
	int op=sc.nextInt();
	switch(op)
	{
	case 1: System.out.println("Enter length and breadth");
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		s=new Rectangle(i1,i2);break;
	case 2: System.out.println("Enter sides of right angled Triangle");
		int i3=sc.nextInt();
		int i4=sc.nextInt();
		s=new Triangle(i3,i4);break;
	default: s=null;
	}
	System.out.println(s.area());

	}
}