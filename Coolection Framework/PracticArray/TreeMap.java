package PracticArray;
public class TreeMap {
	public static void main(String[] args) 
	{
		TreeMap map=new TreeMap();
		map.add(10,"Ten");		map.add(5,"five");		map.add(12,"twelve");
		map.add(7,"seven");		map.add(20,"Twenty");	map.add(1,"One");
		map.print();	
		String value=map.get(10);
		System.out.println(value);
	}
	node root;
	void printMyTree(node temp)
	{
		if(temp.left!=null)
			printMyTree(temp.left);
		System.out.println(temp.key+" "+temp.value);
		if(temp.right!=null)
			printMyTree(temp.right);
	}
	void print()
	{
		printMyTree(root);
	}
	void add(int key, String value)
	{
		node obj=new node(key, value);			//Create object.
		if(root==null)
			root=obj;
		else
		{
			node temp=root;
			while(true)							//run continue.
			{
				if(temp.key==key)
				{
					temp.value=value;
					return;
				}
				else if(key<temp.key && temp.left==null)
				{
					temp.left=obj;
					return;
				}
				else if(key>temp.key && temp.right==null)
				{
					temp.right=obj;	
					return;
				}
				else if(key<temp.key && temp.left!=null)
				{
					temp=temp.left;
				}
				else if(key>temp.key && temp.right!=null)
				{
					temp=temp.right;
				}
			}
		}
	}
	String get(int key)
	{
		if(root==null)
		{
			return null;
		}
		else
		{
			node temp=root;
			while(true)
			{
				if(temp.key==key)
				{
					return temp.value;
				}
				else if(key<temp.key && temp.left==null)
				{
					return null;
				}
				else if(key>temp.key && temp.right==null)
				{
					return null;
				}
				else if(key<temp.key && temp.left!=null)
				{
					temp=temp.left;
				}
				else if(key>temp.key && temp.right!=null)
				{
					temp=temp.right;
				}
			}
		}
	}
}
class node
{
	int key;
	String value;
	node left;
	node right;
	node(int key, String value)
	{
		this.key=key;
		this.value=value;
		this.left=null;
		this.right=null;
	}
}