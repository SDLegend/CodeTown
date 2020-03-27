//The logic is to select the minimum from the array and put this element in another array.
//After putting this element to another array we replace it my some max value 
//We repear above procedure for n times and we get the sorted array

class SelectionSort
{
	public static void main(String args[])
	{
		int arr[]={10,1,5,18,11,12};
		int n=arr.length;
		int sorted[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int minimum=arr[0];
			int index=0;
			for(int j=0;j<n;j++)
				if (arr[j]<minimum)
				{
					minimum=arr[j];
					index=j;
				}
			sorted[i]=arr[index];
			arr[index]=Integer.MAX_VALUE;
			//Print.array(arr,n);
		}
		Print.array(sorted,n);
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