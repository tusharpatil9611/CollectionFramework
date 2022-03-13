package PracticArray;

import java.util.Arrays;

public class ArrayList<p> {

	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);l.add(20);l.add(30);l.add(40);l.add(50);l.add(40);l.add(40);
		
		System.out.println(l.toString());
		l.remove(2);
		System.out.println(l.toString());
		System.out.println(l.size());
		System.out.println(Arrays.toString(l.toArray()));
		System.out.println(l.contain(30));
		System.out.println(l.indexOf(20));
		System.out.println(l.LastIndexOf(40));
		l.set(2, 15);
		System.out.println(l.toString());
		l.add(5,100);
		System.out.println(l.toString());
		
	}
	private p[] a=(p[])new Object[4];
	private int index=0;
	void add(p num)						//Add Method.
	{
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			int size =(int)(1.5*a.length);
			p[]b =(p[])new Object[size];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
	public String toString()			//String Method.
	{
		String s="[";
		for (int i = 0; i < index; i++)
		{
			s=s+a[i];
			if(i+1!=index)
			{
				s=s+", ";
			}
		}
		s=s+"]";
		return s;
	}
	void remove(int i)					//Remove Method.
	{
		for (; i+1 <index; i++) 
		{
			if(index==i)
			{
				a[i]=a[i+1];
			}
		}
		index--;
	}
	int size()							//Size Method.
	{
		return index;
	}
	p[] toArray()						//ToArray Method.
	{
		p[]b =(p[])new Object[index];
		for (int i = 0; i <index; i++) 
		{
			b[i]=a[i];
		}
		return b;
	}
	boolean contain(p num)				//Contain Method.
	{
		for (int i = 0; i <index; i++) 
		{
			if(a[i]==num)
				return true;
		}
		return false;
	}
	int indexOf(p num)					//IndexOf Method
	{
		for (int i = 0; i < index; i++) 
		{
			if(a[i]==num)
				return i;
		}
		return -1;
	}
	int LastIndexOf(p num)				//ListIndexOf Method
	{
		int lastIndex=-1;
		for (int i = 0; i <index; i++) 
		{
			if(a[i]==num)
				lastIndex=i;
		}
		return lastIndex;
	}
	p get(int i)						//Get Method.
	{
		return a[i];
	}
	void set(int i,p data)				// Set Method.
	{
		if(i>0 && i<index)
		{
			for (int j = 0; j <index; j++) 
			{
				if(j==i)
					a[j]=data;
			}
		}
	}
	void add(int i, p data)
	{
		if(i<0 || i>index)
			throw new ArrayIndexOutOfBoundsException();
		else
		{
			int size =(int)(1.5*a.length);
			p[]b =(p[])new Object[size];
			for (int j = 0; j < a.length; j++) 
			{
				b[j]=a[j];
			}
			a=b;	
		}
		for (int j = index; j>=i+1; j--) 
		{
			a[j]=a[j-1];
		}
		a[i]=data;
		index++;
	}
}
