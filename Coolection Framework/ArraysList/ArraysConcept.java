package ArraysList;

public class ArraysConcept {

	public static void main(String[] args) 
	{
		ArraysConcept a=new ArraysConcept();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.print();
		
	}
	private int [] a=new int [4];
	private int index=0;
	void add(int num)
	{
		if(index<a.length)
		{
				a[index++]=num;	
		}
		else
		{
			int size=(int)(1.5*a.length);
			int []b=new int [size];
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
		for (int i = 0; i < index; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
