package HashMap;

public class HashMap <k,v>
{
	public static void main(String[] args)
	{
		
	}
	Node[]a=new Node[5];
	void add(k key , v value)
	{
		int index=key.hashCode()%a.length;
		if(a[index]==null)
		{
			a[index]=new Node<k,v>(key,value);
			return;
		}
		Node temp=a[index];
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=new Node<k,v>(key,value);
	}
	void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			Node temp=a[i];
			while(temp!=null)
			{
				System.out.println(temp.key+" "+temp.value);
				temp=temp.next;
			}
		}
	}
	boolean contain(k key)
	{
		int index=key.hashCode()%a.length;
		if(a[index]==null)
			return false;
		Node temp=a[index];
		while(temp!=null)
		{
			if(temp.key==key)
				return true;
			temp=temp.next;
		}
		return false;
	}
	boolean containValue(v value)
	{
		for (int i = 0; i < a.length; i++)
		{
			Node temp=a[i];
			while(temp!=null)
			{
				if(temp.value==value)
					return true;
				temp=temp.next;
			}
		}
		return false;
	}
	int size()
	{
		int size=0;
		for (int i = 0; i < a.length; i++) 
		{
			Node temp=a[i];
			while(temp!=null)
			{
				size++;
				temp=temp.next;
			}
		}
		return size;
	}
}
class Node<k,v>  //k=It is used for Integer v= For String.
{
	 k key;
	 v value;
	 Node<k,v>next;
	 Node(k key, v value)
	 {
		 this.key=key;
		 this.value=value;
	 }
	 
}