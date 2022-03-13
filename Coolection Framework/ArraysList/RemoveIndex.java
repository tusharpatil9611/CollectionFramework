package ArraysList;
public class RemoveIndex <p>
{
	public static void main(String[] args) 
	{
		RemoveIndex<Integer> list=new RemoveIndex<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.print();
		list.remove(3);
		list.print();
	}
	void remove(int i)
	{
		if(i>=0)
		{
			if(i<index)
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
	void print()
	{
		for (int i = 0; i <index; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
