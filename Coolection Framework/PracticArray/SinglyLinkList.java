package PracticArray;
import java.awt.List;
import java.util.Arrays;
public class SinglyLinkList<p> {
	public static void main(String[] args) 
	{
		SinglyLinkList<Integer> list=new SinglyLinkList<>();
		list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);
		list.add(50);
		System.out.println(list.toString());
		list.add(2, 15);
		System.out.println(list.toString());
		System.out.println(list.contain(20));
		System.out.println(list.indexOf(50));
		System.out.println(list.LastIndexOf(50));
		System.out.println(list.size());
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(list.get(4));
		list.set(2, 25);
		System.out.println(list.toString());
		list.remove(2);
		System.out.println(list.toString());
	}
	Node<p> root;
	void add(p data)		//Add Mthod.
	{
		Node<p> obj=new Node<p>(data);
		if(root==null)
			root=obj;
		else
		{
			Node<p>temp=root;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=obj;
		}
	}
	public String toString()
	{
		String s="[";
		Node<p>temp=root;
		while(temp!=null)
		{
			s=s+temp.data;
			if(temp.next!=null)
			{
				s=s+", ";
			}
			temp=temp.next;
		}
		s=s+"]";
		return s;
	}
	void add(int i,p data)
	{	
		Node<p> obj=new Node<p>(data);
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		if(i==0)
		{
			obj.next=root;
			root=obj;
			return;
		}
		Node<p> temp=root;
		int index=0;
		while(temp!=null)
		{
			if(index==i-1)
			{
				obj.next=temp.next;
				temp.next=obj;
				return;
			}
			temp=temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	boolean contain(p data)
	{
		Node<p>temp=root;
		while(temp!=null)
		{
			if(temp.data==data)
				return true;
			temp=temp.next;
		}
		return false;	
	}
	int indexOf(p data)
	{
		Node<p>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				return index;
			}
			temp=temp.next;
			index++;
		}
		return -1;
	}
	int LastIndexOf(p data)
	{
		int lastIndex=-1;
		Node<p>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(temp.data==data)
			{
				lastIndex=index;
			}
			temp=temp.next;
			index++;
		}
		return lastIndex;
	}
	int size()
	{
		int index=0;
		Node<p> temp=root;
		while(temp!=null)
		{
			temp=temp.next;
			index++;
		}
		return index;
	}
	Object[] toArray()
	{
		Object[]a=new Object[size()];
		Node<p>temp=root;
		int index=0;
		while(temp!=null)
		{
			a[index]=temp.data;
			temp=temp.next;
			index++;
		}
		return a;
	}
	p get(int i)
	{		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		Node<p>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(index==i)
			{
				return temp.data;
			}
			temp=temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
	void set(int i,p data)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		Node<p>temp=root;
		int index=0;
		while(temp!=null)
		{
			if(index==i)
			{
				temp.data=data;
				return;
			}
			temp=temp.next;
			index++;
		}
	}
	int remove(int i)
	{
		if(i<0)
			throw new ArrayIndexOutOfBoundsException();
		Node<p>temp=root;
		int index=0;
		if(i==0)
		{
			root=root.next;
			return 1;
		}
		while(temp!=null)
		{
			if(index==i-1)
			{
				temp.next=temp.next.next;
				return 1;
			}
			temp=temp.next;
			index++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}
}
class Node<p>
{
	p data;
	Node<p>	next;
	Node(p data)
	{
		this.data=data;
		next=null;
	}
}
