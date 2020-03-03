class Square
{
	int s1;
	Square()
	{
	s1=0;
	}
	Square(int l)
	{
	s1=l;
	}
	int area()
	{
	return s1*s1;
	}
	void display()
	{
	System.out.println("Area of Square is "+area());
	}
}
class Rectangle extends Square
{
	int s2;
	Rectangle()
	{
	s1=0;
	s2=0;
	}
	Rectangle(int l,int b)
	{
	//super();
	s1=l;
	s2=b;
	}
	int area()
	{
	return s1*s2;
	}
	void display()
	{
	super.display();
	System.out.println("Area of Rectangle is "+area());
	}
}
class Cuboid extends Rectangle
{
	int s3;
	Cuboid()
	{
	s1=0;
	s2=0;
	s3=0;
	}
	Cuboid(int l,int b,int h)
	{
	//super();
	s1=l;
	s2=b;
	s3=h;
	}
	int volume()
	{
	return s1*s2*s3;
	}
	void display()
	{
	super.display();
	System.out.println("Volume of Cuboid is "+volume());
	}
}
class ShapeDemo
{
	public static void main(String args[])
	{
	Cuboid c=new Cuboid(2,3,5);
	Rectangle r= new Rectangle(3,7);
	Square s=new Square(1);
	c.display();
	}
}