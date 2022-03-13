package CollectionPractic;

import java.util.ArrayList;
import java.util.LinkedList;
import LinkListModification.LinkList;

public class RemoveElement {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);array.add(10);array.add(10);array.add(10);array.add(10);
		array.add(20);array.add(20);
		System.out.println(array);
		for (int i = 0; i <array.size(); i++) 
		{
			for (int j =0; j < array.size(); j++) 
			{
				if(array.get(i)==array.get(j))
				{
					array.remove(j);
				}
			}
		}
		System.out.println(array);
	}

}
