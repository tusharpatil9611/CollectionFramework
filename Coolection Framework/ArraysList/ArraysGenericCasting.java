package ArraysList;
public class ArraysGenericCasting <p>		//p is a variable to pass data type to the array
{

	public static void main(String[] args)
	{
//		ArraysGenericCasting<String> list=new ArraysGenericCasting<String>();
//		list.add("Tushar");		//Here data type is String if we cannot gives generic then we assign any type of data
//		list.add("patil");
//		list.add("Rajendra");
//		list.print();
		ArraysGenericCasting list=new ArraysGenericCasting();
		list.add(10);
		list.add("Tushar");
		list.add('d');
		list.print();

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
			for (int i = 0; i < b.length; i++) 
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
