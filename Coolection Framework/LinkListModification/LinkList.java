package LinkListModification;

public class LinkList {
	 
	public static void main(String[] args) 
	{
		LinkList link=new LinkList();
		link.add(10);	link.add(20);	link.add(30);	link.add(40);
		link.print();
	}
	node root;
	node lastIndex;
	void add(int data)
	{
		node obj=new node(data);
		if(root==null)
		{
			root=obj;
			lastIndex=obj;
		}
		else
		{
			lastIndex.next=obj;
			lastIndex=obj;
		}
		
	}
	void print()
	{
		node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}
class node
{
	int data;
	node next;
	node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
