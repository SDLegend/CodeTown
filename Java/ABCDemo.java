class A
{
	int i=10;
}
class B extends A
{
	int i=20;
}
class C extends B
{
	int i=30;
	void display()
	{
	System.out.println(this.i);
	System.out.println(super.i);
	System.out.println(((A)this).i);
	}
}
class AbcDemo
{
	public static void main(String args[])
	{
	C ob=new C();
	ob.display();
	}
}