import java.util.*;
class TestClass1111
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int i=0,j=0,m=0;
	int y[]=new int[12];
	for(i=0;i<t;i++)
		{
		int dd=sc.nextInt();
		String mm=sc.next();
		int yy=sc.nextInt();
		System.out.println(mm);
		if (yy%4==0&&yy%400!=0)
			{
			//y[]={31,28,31,30,31,30,31,31,30,31,30,31};
			y[0]=31;
			y[1]=29;
			y[2]=31;
			y[3]=30;
			y[4]=31;
			y[5]=30;
			y[6]=31;
			y[7]=31;
			y[8]=30;
			y[9]=31;
			y[10]=30;
			y[11]=31;
			}
		else
			{//y[]={31,28,31,30,31,30,31,31,30,31,30,31};
			y[0]=31;
			y[1]=28;
			y[2]=31;
			y[3]=30;
			y[4]=31;
			y[5]=30;
			y[6]=31;
			y[7]=31;
			y[8]=30;
			y[9]=31;
			y[10]=30;
			y[11]=31;}
		if (mm=="January")
			m=0;
		else if (mm=="February")
			m=1;
		else if (mm=="March")
			m=2;
		else if (mm=="April")
			m=3;
		else if (mm=="May")
			m=4;
		else if (mm=="June")
			m=5;
		else if (mm=="July")
			m=6;
		else if (mm=="August")
			m=7;
		else if (mm=="September")
			m=8;
		else if (mm=="October")
			m=9;
		else if (mm=="November")
			m=10;
		else if (mm=="December")
			m=11;
		System.out.println(m);
		if (dd==1)
			{
			dd=y[m-1];
			m--;
			}
		else dd--;
		switch(m)
			{
			case 0:System.out.println(dd+" January "+yy);break;
			case 1:System.out.println(dd+" February "+yy);break;
			case 2:System.out.println(dd+" March "+yy);break;
			case 3:System.out.println(dd+" April "+yy);break;
			case 4:System.out.println(dd+" May "+yy);break;
			case 5:System.out.println(dd+" June "+yy);break;
			case 6:System.out.println(dd+" July "+yy);break;
			case 7:System.out.println(dd+" August "+yy);break;
			case 8:System.out.println(dd+" September "+yy);break;
			case 9:System.out.println(dd+" October "+yy);break;
			case 10:System.out.println(dd+" November "+yy);break;
			case 11:System.out.println(dd+" December "+yy);break;
			}		
		}
	}

}