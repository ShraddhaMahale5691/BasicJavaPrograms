import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyPrograms {
	public static void main(String[] args) {
     hashmap();
     starpattern();
	}

	public static void hashmap()
	{
		Map<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(1, "Sai1");
		hm1.put(2, "Sai2");
		hm1.put(3, "Sai3");
		hm1.put(4, "Sai4");

		Iterator<Map.Entry<Integer,String>> it= hm1.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,String> it1=it.next();
			System.out.println(" "+it1.getKey()+" "+it1.getValue());
		}
	}
	
	
	
	public static void starpattern()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

