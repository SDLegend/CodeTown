class Series
{
	public static void main(String args[])
	{
		int x[]=new int[5];
		x[0]=4;
		x[1]=1;
		x[2]=3;
		x[3]=2;
		x[4]=5;
		int n=5;
		int i,j,k,key,count,max=1;
		for(i=0;i<n;i++)
		{
			key=x[i];
			count=1;
			for(j=i+1;j<n;j++)
			{
				
				for(k=j;k<n;k++)
				{
					if (key>x[j])
						continue;
					else
					{
						key=x[j];
						count++;
						if (count>max)
							max=count;
						System.out.println(key);
					}
				}
			}
		}
		System.out.println(max);
	}
}