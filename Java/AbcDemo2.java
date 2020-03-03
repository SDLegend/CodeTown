class A
{
	int i=10;
	void display()
	{
	System.out.println("This is class A");
	}
}
class B extends A
{
	int i=20;
	void display()
	{
	super.display();
	System.out.println("This is class B");
	}
}
class C extends B
{
	int i=30;
	void display()
	{
	super.display();
	System.out.println("This is class C");
	}
}
class AbcDemo
{
	public static void main(String args[])
	{
	C ob=new C();
	//ob.display();
	((A)this).display();
	}
}