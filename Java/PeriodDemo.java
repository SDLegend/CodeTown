class Periodym
{
	int yy,mm;
	void display()
	{
	System.out.printf("%02d/%02d\n",mm,yy);
	}
	Periodym()
	{
	yy=mm=0;
	}
	Periodym(int yy)
	{
	this.yy=yy;
	mm=0;
	}
	Periodym(int mm,int yy)
	{
	this.yy=yy;
	this.mm=mm;
	}
	Periodym(Periodym ob)
	{
	this.yy=ob.yy;
	this.mm=ob.mm;
	}
}
class Periodymd extends Periodym
{
	int dd;
	void display()
	{
	System.out.printf("%02d/%02d/%02d\n",dd,mm,yy);
	}
	Periodymd()
	{
	super();
	dd=0;
	}
	Periodymd(int yy)
	{
	super(yy);
	dd=0;
	}
	Periodymd(int mm,int yy)
	{
	super(mm,yy);
	dd=0;
	}
	Periodymd(int dd,int mm,int yy)
	{
	super(mm,yy);
	this.dd=dd;
	}
	Periodymd(Periodymd ob)
	{
	super(ob);
	this.dd=ob.dd;
	}
}
class Periodymdhm extends Periodymd
{
	int h,m;	
	void display()
	{
	System.out.printf("%02d:%02d %02d/%02d/%02d\n",h,m,dd,mm,yy);
	}
	Periodymdhm()
	{
	super();
	h=m=0;
	}
	Periodymdhm(int yy)
	{
	super(yy);
	h=m=0;
	}
	Periodymdhm(int mm,int yy)
	{
	super(mm,yy);
	h=m=0;
	}
	Periodymdhm(int dd,int mm,int yy)
	{
	super(dd,mm,yy);
	h=m=0;
	}
	Periodymdhm(int h,int dd,int mm,int yy)
	{
	super(dd,mm,yy);
	this.h=h;
	m=0;
	}
	Periodymdhm(int h,int m,int dd,int mm,int yy)
	{
	super(dd,mm,yy);
	this.h=h;
	this.m=m;
	}
	Periodymdhm(Periodymdhm ob)
	{
	super(ob);
	this.h=ob.h;
	this.m=ob.m;
	}
}
class Periodymdhms extends Periodymdhm
{
	int s;
	void display()
	{
	System.out.printf("%02d:%02d:%02d %02d/%02d/%02d\n",h,m,s,dd,mm,yy);
	}
	Periodymdhms()
	{
	super();
	s=0;
	}
	Periodymdhms(int yy)
	{
	super(yy);
	s=0;
	}
	Periodymdhms(int mm,int yy)
	{
	super(mm,yy);
	s=0;
	}
	Periodymdhms(int dd,int mm,int yy)
	{
	super(dd,mm,yy);
	s=0;
	}
	Periodymdhms(int h,int dd,int mm,int yy)
	{
	super(h,dd,mm,yy);
	s=0;
	}
	Periodymdhms(int h,int m,int dd,int mm,int yy)
	{
	super(h,m,dd,mm,yy);
	s=0;
	}
	Periodymdhms(int h,int m,int s,int dd,int mm,int yy)
	{
	super(h,m,dd,mm,yy);
	this.s=s;
	}
	Periodymdhms(Periodymdhms ob)
	{
	super(ob);
	this.s=ob.s;
	}
}
class PeriodDemo
{
	public static void main(String args[])
	{
	Periodym p1=new Periodym();
	Periodym p2=new Periodym(2018);
	Periodym p3=new Periodym(5,2018);
	Periodym p4=new Periodym(p3);
	p1.display();
	p2.display();
	p3.display();
	p4.display();
	System.out.println("\n");
	Periodymd p5=new Periodymd();
	Periodymd p6=new Periodymd(2018);
	Periodymd p7=new Periodymd(5,2018);
	Periodymd p8=new Periodymd(26,5,2018);
	Periodymd p9=new Periodymd(p8);
	p5.display();
	p6.display();
	p7.display();
	p8.display();
	p9.display();
	System.out.println("\n");
	Periodymdhm p10=new Periodymdhm();
	Periodymdhm p11=new Periodymdhm(2018);
	Periodymdhm p12=new Periodymdhm(6,2018);
	Periodymdhm p13=new Periodymdhm(26,5,2018);
	Periodymdhm p14=new Periodymdhm(11,26,5,2018);		
	Periodymdhm p15=new Periodymdhm(11,45,26,5,2018);
	Periodymdhm p16=new Periodymdhm(p15);
	p10.display();
	p11.display();
	p12.display();
	p13.display();
	p14.display();
	p15.display();
	p16.display();
	System.out.println("\n");
	Periodymdhms p17=new Periodymdhms();
	Periodymdhms p18=new Periodymdhms(2018);
	Periodymdhms p19=new Periodymdhms(5,2018);
	Periodymdhms p20=new Periodymdhms(26,5,2018);
	Periodymdhms p21=new Periodymdhms(11,26,5,2018);
	Periodymdhms p22=new Periodymdhms(11,45,26,5,2018);
	Periodymdhms p23=new Periodymdhms(11,45,50,26,5,2018);
	Periodymdhms p24=new Periodymdhms(p23);
	p17.display();
	p18.display();
	p19.display();
	p20.display();
	p21.display();
	p22.display();
	p23.display();
	p24.display();
	}
}