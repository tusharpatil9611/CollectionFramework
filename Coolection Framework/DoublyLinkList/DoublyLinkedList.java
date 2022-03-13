package DoublyLinkList;

	public class DoublyLinkedList {
		public static void main(String[] args) 
		{
			MyLinkedList<Integer> list=new MyLinkedList<Integer>();
			list.add(20);list.add(30);list.add(40);list.add(50);
			System.out.println(list.ToString());
			list.add(2,60);
			System.out.println(list.ToString());
			list.set(4, 15);
			System.out.println(list.ToString());
			System.out.println("IndexOf "+list.indexOf(15));
			System.out.println("LastIndexOf "+list.LastIndexOf(40));
			System.out.println("Size of "+list.size());
			System.out.println("Get Method "+list.get(3));
			list.remove(2);
			System.out.println("Remove "+list.ToString());
		}
	}
		class Node<p>
		{
			p data;
			Node<p> next;
			Node<p>	prev;
			 Node(p data)
			 {
				 this.data=data;
				 this.next=null;
				 this.prev=null;
			 }
		}
		class MyLinkedList<p>
		{
			private	Node<p> head;
			private Node<p> tail;
			void remove(int i)
			{
				if(i<0)
					throw new ArrayIndexOutOfBoundsException();
				if(i==0)
				{
					head=head.next;
					head.prev=null;
					return;
				}
				Node<p> temp=head;
				int index=0;
				while(temp!=null)
				{
					if(index==i-1)
					{
						if(temp.next==null)
						{
							throw new ArrayIndexOutOfBoundsException();
						}
						if(temp.next.next==null)
						{
							temp.next=null;
							tail=temp;
							return;
						}
						else
						{
							temp.next=temp.next.next;
							temp.next.prev=temp;
							return;
						}
					}
					temp=temp.next;
					index++;
				}
				throw new ArrayIndexOutOfBoundsException();
			}
			boolean contain(p data)
			{
				Node<p>temp=head;
				while(temp!=null)
				{
					if(temp.data==data)
						return true;
						temp=temp.next;
				}
				return false;
			}
			int size()
			{
				Node<p>temp=head;
				int index=0;
				while(temp!=null)
				{
					temp=temp.next;
					index++;
				}
				return index;
			}
			Object[] toArray()
			{
				Object []a=new Object[size()];
				Node<p>temp=head;
				int index=0;
				while(temp!=null)
				{
					a[index]=temp.data;
					temp=temp.next;
					index++;
				}
				return a;
			}
			int indexOf(p data)
			{
				Node<p> temp=head;
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
				Node<p> temp=head;
				int index=0;
				while(temp!=null)	
				{
					if(temp.data==data)
					{
						return lastIndex=index;
					}
					temp=temp.next;
					index++;			
				}
				return lastIndex;
			}
			void set(int i,p data)
			{
				if(i<0)
					throw new ArrayIndexOutOfBoundsException();
				Node<p> temp=head;
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
			p get(int i)
			{
				if(i<0)
					throw new ArrayIndexOutOfBoundsException();
				Node<p>temp=head;
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
			void add(p data)
			{
				Node<p> obj=new Node<p>(data);
				if(head==null)
				{
					head=obj;
					tail=obj;
				}
				else
				{
					tail.next=obj; 
					obj.prev=tail;
					tail=obj;
				}
			}
			void add(int i, p data)
			{
				Node<p> obj=new Node<p>(data);
				if(i<0)
					throw new ArrayIndexOutOfBoundsException();
				if(i==0)
				{
					
					obj.next=head;
					head.prev=obj;
					head=obj;
					return;
				}
				Node<p> temp=head;
				int index=0;
				while(temp!=null)
				{
					if(temp.next==null)
					{
						add(data);
						return;
					}
					if(index==i-1)
					{
						obj.next=temp.next;
						temp.next.prev=obj;
						temp.next=obj;
						obj.prev=temp;
						return;
					}
					temp=temp.next;
					index++;
				}
				throw new ArrayIndexOutOfBoundsException();
			}
			 String ToString()
			{
				 String s="[";                           
				Node<p>temp=head;
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
			void fwdPrint()
			{
				Node<p>temp=head;
				while(temp!=null)
				{
					System.out.println(temp.data+" " );
					temp=temp.next;
				}
				System.out.println();
			} 
			void revPrint()
			{
				Node<p> temp=tail;
				while(temp!=null)
				{
					System.out.println(temp.data+" ");
					temp=temp.prev;
				}
				System.out.println();
			}
		}



