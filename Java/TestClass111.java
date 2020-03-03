import java.util.*;
class TestClass1111
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int i=0,j=0;
	int ny[]={31,28,31,30,31,30,31,31,30,31,30,31};
	int ly[]={31,29,31,30,31,30,31,31,30,31,30,31};
	for(i=0;i<t;i++)
		{
		int dd=sc.nextInt();
		String mm=sc.next();
		int yy=sc.nextInt();
		if (yy%4==0&&yy%400!=0)
			int y[]=ly[];
		else
			int y[]=ny[];
		if (mm="January")
			mm=0;
		else if (mm="February")
			mm=1;
		else if (mm="March")
			mm=2;
		else if (mm="April")
			mm=3;
		else if (mm="May")
			mm=4;
		else if (mm="June")
			mm=5;
		else if (mm="July")
			mm=6;
		else if (mm="August")
			mm=7;
		else if (mm="September")
			mm=8;
		else if (mm="October")
			mm=9;
		else if (mm="November")
			mm=10;
		else if (mm="December")
			mm=11;
		if (dd==1)
			{
			dd=y[mm-1];
			mm--;
			}
		switch(mm)
			{
			case 0:System.out.println(dd+" January"+yy);break;
			case 1:System.out.println(dd+" February"+yy);break;
			case 2:System.out.println(dd+" March"+yy);break;
			case 3:System.out.println(dd+" April"+yy);break;
			case 4:System.out.println(dd+" May"+yy);break;
			case 5:System.out.println(dd+" June"+yy);break;
			case 6:System.out.println(dd+" July"+yy);break;
			case 7:System.out.println(dd+" August"+yy);break;
			case 8:System.out.println(dd+" September"+yy);break;
			case 9:System.out.println(dd+" October"+yy);break;
			case 10:System.out.println(dd+" November"+yy);break;
			case 11:System.out.println(dd+" Decmber"+yy);break;
			}		
		}
	}

}