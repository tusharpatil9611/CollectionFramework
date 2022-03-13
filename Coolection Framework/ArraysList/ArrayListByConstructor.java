package ArraysList;

import PracticArray.ArrayList;

public class ArrayListByConstructor {
	
	
	public static void main(String[] args)
	{
		ArrayListByConstructor array=new ArrayListByConstructor();
		array.add(10);array.add(20);array.add(30);array.add(40);array.add(50);
		array.add(60);array.add(70);
		array.print();
		
		
	}
	static int []a;
	static int index=0;
	ArrayListByConstructor(int size) 
	{
		a= new int [size];
	}
	void ArraySizeIncrease(int size)
	{
		
	}
	ArrayListByConstructor()
	{
		a=new int [3];
	}
	
	 static  void add(int num)
	{
	 
		int []b=new int [2*index];
		if(index==a.length)
		{
			System.out.println("Increase the size");
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
		else
		{
			a[index++]=num;
		}
	}
	void print()
	{
		for (int i = 0; i <index; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
