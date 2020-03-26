import java.util.*;

class Solution{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int type[]=new int[m];
		int fruits[]=new int[n];
		int cost[]=new int[n];
		for(int i=0;i<n;i++)
			fruits[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			cost[i]=sc.nextInt();
		try{
			for(int i=0;i<m;i++)
				type[i]=-1;

			for(int i=0;i<n;i++){
				if(type[fruits[i]-1]==-1)
					type[fruits[i]-1]+=1;
				type[fruits[i]-1]+=cost[i];
			}
			int minimum=51*n;
			for(int i=0;i<m;i++){
				if(type[i]<minimum && type[i]>=0)
					minimum=type[i];
			}
			for(int i=0;i<m;i++)
				System.out.print(type[i]);
			System.out.println("");
			System.out.println(minimum);
		}
		catch(java.lang.Throwable t1){
			System.out.println("");
		}
	}
}