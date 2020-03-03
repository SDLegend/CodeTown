import java.util.*;
class Chfar
{
	static int a[];
	static int n;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		for(j=0;j<t;j++)
		{
			int flag=0;
			n=sc.nextInt();
			int k=sc.nextInt();
			a=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			if (checkCondition()==true)
				flag=1;
			else
			{
				while(k!=0||flag==1)
				{
					int max =findMax();
					//System.out.println("Reached here");
					//System.out.println();
					a[findIndex(a,max)]=1;
					
					if (checkCondition()==true)
						{
							flag=1;
							break;
						}
					k--;
				}
			}
			if (flag==0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
	static boolean checkCondition()
	{
		int i,j,suml=0,sumr=0;
		for(i=0;i<n;i++)
		{
			suml+=a[i]*a[i];
			sumr+=a[i];
		}
		if (suml<=sumr)
			return true;
		else
			return false;
	} 
	static int findMax()
	{
		int i,max=a[0];
		for(i=0;i<n;i++)
			if (a[i]>max)
				max=a[i];
		return max;
	}
	static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
}

