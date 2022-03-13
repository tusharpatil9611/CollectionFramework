package ArrayLinkList;
import java.util.Arrays;

import javax.jws.Oneway;
public class ImplementLinkList {
	public static void main(String[] args) 
	{
		MylinkedList<Integer> list=new MylinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(60);
	//`	list.print();
		System.out.println(list.toString());
		System.out.println("Contain "+list.contain(100));
		System.out.println("inddexOf "+list.indexOf(20));
		System.out.println("LastIndexOf "+list.lastIndexOf(40));
		System.out.println("Size of the Array "+list.size());
		list.add(4, 50);
		list.add(5, 70);
		System.out.println("Add element at position "+list.toString());
		list.toArray();
		System.out.println("To Array "+Arrays.toString(list.toArray()));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		list.remove(4);
		System.out.println("Remove Method "+list.toString());
		System.out.println("Get Method "+list.get(5));
		list.set(3,100);
		System.out.println("Set "+list.toString());
		System.out.println("contain "+list.contain(30));
	}
}
	class node<p>	//node class which contain data and next  
	{
		p data;
		node<p> next;
		node(p data)
		{
			this.data=data;
			next=null;
		}
	}
	class MylinkedList<p>
	{
		node<p> root;		//it is a user define variable top store the node address.
		void print()		//we cannot use print  method to print the arrays.
		{
			node<p>temp=root;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}

		}
		Object[] toArray()
		{
			Object []a=new Object[size()];
			node<p>temp=root;
			int index=0;
			while(temp!=null)
			{
				a[index]=temp.data;
				temp=temp.next;
				index++;
			}
			return a;
		}
		public String toString()		//to Print the Arrays Elements.
		{
			String s="[";
			node<p>temp=root;
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
		int size()
		{
			node<p>temp=root;
			int index=0;
			while(temp!=null)
			{
				temp=temp.next;
				index++;
			}
			return index;
		}
		void add(p data)		//To add the Elements into The Arrays.
		{
			node<p> obj=new node<>(data);
			if(root==null)
				root=obj;
			else
			{
				node<p>temp=root;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=obj;
			}
		}
		void add(int i,p data)
		{
			node<p> obj=new node<p>(data);
			if(i<0)
				throw new ArrayIndexOutOfBoundsException();
			if(i==0)
			{
				root=obj;
				return;
			}
			node<p>temp=root;
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
		p get(int i)
		{
			if(i<0)
				throw new ArrayIndexOutOfBoundsException();
			node<p>temp=root;
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
			node<p>temp=root;
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
			throw new ArrayIndexOutOfBoundsException();
		}
		boolean contain(p data)	//to check The element present or not into the arrays.
		{
			node<p>temp=root;
			while(temp!=null)
			{
				if(temp.data==data)
					return true;
				temp=temp.next;
			}
			return false;
		}
		int remove(int i)
		{
			if(i<0)
				throw new ArrayIndexOutOfBoundsException();
			if(i==0)
			{
				root=root.next;
				return 0;
			}
			node<p>temp=root;
			int index=0;
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
		int lastIndexOf(p data)
		{
			node<p>temp=root;
			int lastIndexOf=-1;
			int index=0;
			while(temp!=null)
			{
				if(temp.data==data)
				{
					lastIndexOf=index;
				}
				temp=temp.next;
				index++;
			}
			return lastIndexOf;
		}
		int indexOf(p data)		// return the index value of the given element.  
		{
			int index=0;
			node<p>temp=root;
			while(temp!=null)
			{
				if(temp.data==data)
					return index;
				temp=temp.next;
				index++;
			}
			return -1;
		}
}
