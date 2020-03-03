class Grandfather
{
	void display()
	{
	System.out.println("Grandfather");
	}
}
class Dad extends Grandfather
{
	void display()
	{
	super.display();
	System.out.println("Dad");
	}
}
class Son extends Dad
{
	void display()
	{
	super.display();
	System.out.println("Son");
	}
}
class GFDS
{
	public static void main(String args[])
	{
	Son s1=new Son();
	Dad d1=new Dad();
	Grandfather g1=new Grandfather();
	((g1)this).display();		
	}
}