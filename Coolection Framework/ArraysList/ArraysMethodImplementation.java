package ArraysList;
public class ArraysMethodImplementation<p>
{
	public static void main(String[] args) 
	{
		ArraysMethodImplementation<Integer> List=new ArraysMethodImplementation<>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		//+System.out.println(List.toString());
		List.toArray();
		System.out.println(List.toString());
		System.out.println("Size "+List.size());
		System.out.println("LastIndex of "+List.lastIndexOf(20));
		System.out.println(List.indexOf(2));
		System.out.println(List.get(2));
		System.out.println(List.contains(20));
		List.remove(4
				);
		System.out.println(List.toString());	
	}
	boolean contains(p data)
	{
		for (int i = 0; i<index; i++) 
		{
			if(a[i]==data)
				return true;
		}
		return false;
	}
	p get(int i)
	{
		return a[i];
	}
	int indexOf(p data)
	{
		for (int i = index-1; i >=0; i--) 
		{
			if(a[i]==data)
			{
				return i;
			}
		}
		return -1;
	}
	int lastIndexOf(p data)
	{
		for (int i = index-1; i>=0; i--) 
		{
			if(a[i]==data)
				return i;
		}
		return -1;
	}
	int size() 
	{
		return index;
	}
	public String toString()
	{
		 String s= "[";
		 for (int i = 0; i <index; i++) 
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
	p[] toArray()
	{
		p[] b=(p[])new Object[index];
		for (int i = 0; i <index; i++) 
		{
			b[i]=a[i];
		}
		return b;
	}
	void remove(int i)
	{
		if(i>0)
		{
			if(i<=index)
			{
				for (; i+1 < index; i++) 
				{
					a[i]=a[i+1];
				}
				index--;
			}
		}	
	}
	private p[]a =(p[])new Object[3];
	private int index=0;
	void add(p num)
	{
		if(index<a.length)
			a[index++]=num;
		else
		{
			int size=(int)(1.5*a.length);
			p[]b=(p[])new Object[size];
			for (int i = 0; i < a.length; i++) 
			{
				b[i]=a[i];
			}
			a=b;
			a[index++]=num;
		}
	}
}
