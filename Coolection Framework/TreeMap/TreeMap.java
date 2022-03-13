package TreeMap;
public class TreeMap {
	public static void main(String[] args) 
	{
		TreeMap map=new TreeMap();
		map.add(10,"Ten");map.add(10,"Ten");map.add(2,"two");map.add(3,"Three");
		map.add(11,"Eleven");map.add(20,"Twenty");map.add(1,"one");
		String value= map.get(3);
		System.out.println(value);
	}
	Node root;
	String get(int key)
	{
		if(root==null)
			return null;
		else
		{
			Node temp=root;
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
	void print()
	{
		printMyNode(root);
	}
	void printMyNode(Node temp)
	{
		if(temp.left!=null)
			printMyNode(temp.left);
		System.out.println(temp.key+" "+temp.value);
		if(temp.right!=null)
			printMyNode(temp.right);
	}
	void add(int key,String value)
	{
		if(root==null)
		{
			root=new Node(key,value);
		}
		else 
		{
			Node temp=root;
			while(true)
			{
				if(temp.key==key)
				{
					temp.value=value;
					return;
				}
				else if(key<temp.key && temp.left==null)
				{
					temp.left=new Node(key,value);
					return;
				}
				else if(key>temp.key && temp.right==null)
				{
					temp.right=new Node(key,value);
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
	
}
class Node
{
	int key;
	String value;
	Node left;
	Node right;
	 Node(int key,String value)
	{
		super();
		this.key = key;
		this.value=value;
		this.left = null;
		this.right = null;
	}
}
