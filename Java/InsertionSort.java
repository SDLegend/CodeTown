//The logic is to divide array into two parts left(sorted) and right(unsorted).
//Take the first element from right side array and put this in correct order in left side.
//Shift every element in left side array greater than this element by one to the right and then put the element in the hole.
//Repeat this till there is no element left in right side.

class InsertionSort
{
	public static void main(String args[])
	{
		int arr[]={10,1,5,18,11,12};
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int hole=i;
			int value=arr[i];
			while(hole>0 && arr[hole-1]>value)
			{
				int temp=arr[hole];
				arr[hole]=arr[hole-1];
				arr[hole-1]=temp;
				hole-=1;
			}
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