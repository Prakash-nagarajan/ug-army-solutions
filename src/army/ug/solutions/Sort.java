package com.java.array;
public class sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Lets begin...!!");

		int[] a= new int[] {100,3,5,7,8,9,45,300,12,13};
		int low=0;
		int high=a.length;
		sort obj = new sort();
		obj.sortIt(a, low, high-1);
		obj.print(a);

	}
	
	public void sortIt(int[] a,int low,int high)
	{
		if(low<high)
		{
			int p = parttion(a,low,high);
			sortIt(a,low,p-1);
			sortIt(a,p+1,high);
		}
	}

	public int parttion(int a[],int low, int high) 
	{
		int i = low-1;
		int pivot = a[high];
		for(int j=low;j<high;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				swap(a,i,j);
//				System.out.print(i);

			}

		}
		swap(a,i+1,high);
		return i+1;
	}
	static void swap(int[] a,int i, int j)
	{
		int temp = a[j];
		a[j]=a[i];
		a[i]=temp;
	}
	public void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

