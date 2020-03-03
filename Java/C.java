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

public static void display() 
{ 
System.out.println(this.i); // This line will print 30 
System.out.println(super.i); // This line will print 20 

System.out.println(((A)this).i); // i want to access int i of class A 
} 
public static void main(String args[]) 
{ 
C objc = new C(); 
objc.display(); 
} 
} 
