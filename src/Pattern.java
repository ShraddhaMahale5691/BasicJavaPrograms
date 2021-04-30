
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	
System.out.println("___________________________________________________");
	
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

System.out.println("___________________________________________________");
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int k=i;k<=n;k++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}

System.out.println("----------------------------------------------");	

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
	
	System.out.println();
}

System.out.println("----------------------------------------------");	

for(int i=1;i<=n;i++)
{
	for(int j=i;j<=n;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<i;k++)
	{
		System.out.print("*");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}



System.out.println("----------------------------------------------");	

for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=i;k<n;k++)
	{
		System.out.print("*");
	}
	for(int k=i;k<=n;k++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}

System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

for(int i=1;i<n;i++)
{
	for(int j=i;j<=n;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<i;k++)
	{
		System.out.print("*");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}


for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int k=i;k<n;k++)
	{
		System.out.print("*");
	}
	for(int k=i;k<=n;k++)
	{
		System.out.print("*");
	}
	
	System.out.println();
}



for(int i=1;i<n;i++)
{
	for(int j=i;j<=n;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int j=i;j<=n;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}


	
}

}
