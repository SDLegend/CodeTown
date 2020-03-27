//The Logic is to swap every element with its next element if they are not in correct order.
//If we do this n times we get the sorted array
//Note:We get ith largest element at correct position after ith iteration
//We can improve this logic by going till the unsorted part of array i.e: n-1-i
//We can further improve by stopping the process if there have been no swaps in one iteration

class BubbleSort
{
	public static void main(String args[])
	{
		int arr[]={10,1,5,18,11,12};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			Boolean flag=true;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=false;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag)
				break;
			//Print.array(arr,n);
		}
		Print.array(arr,n);
	}	
}
class Print
{
	static void array(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();

	}
}