
public class Armstrong {
	public static void main(String[] args) {

		String str="MADAM";
		System.out.println(str.length());

		String rev="";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(" "+ch[i]);
		}
		System.out.println();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+ch[i];
		}

		System.out.println("Reverse string is  "+rev);	
		if(str.contentEquals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrom");

		}


		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);

			a=b;
			b=c;
		}

		System.out.println();
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);



		int[] a1 = {11,22,33,44};
		int[] a2 = new int[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(" "+a2[i]);
		}

		System.out.println();

		String str2="Shirdi";
		String str3="Sai";
		System.out.println("Concatinated string is: "+str2.concat(str3));


		System.out.println();

		String[] str4={"hi","ti"};
		for(int i=0;i<str4.length;i++)
		{
			System.out.print(" "+str4[i]);
		}

		int s[]= {22,45,11,43,88,56,67};

		int temp=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]>s[j])
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(" "+s[i]);
		}
		System.out.println();
		System.out.println("2nd Largest number: "+s[s.length-2]);


		int ca[]={22,45,11,43,88,56,67};
		int min=ca[0];
		for(int i=1;i<ca.length;i++)
		{
			if(min>ca[i])
			{
				min=ca[i];
			}
		}
		System.out.println("Minimum in array is "+min);


		int ca1[]={22,45,11,43,88,56,67};
		int max=ca1[0];
		for(int i=1;i<ca1.length;i++)
		{
			if(ca1[i]>max)
			{
				max=ca1[i];
			}
		}
		System.out.println("Max in array is "+max);




		int num1=7;
		int m1=num1/2;
		boolean flag = false;
		for(int i=2;i<=m1;i++)
		{
			if(num1%i==0)
			{
				flag=true;
				System.out.println("Not Prime");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Number is prime number");
		}



		int num11=242;
		int rem=0,rem1=0;
		int num3=num11;

		while(num11>0)
		{
			rem=num11%10;
			num11=num11/10;
			rem1=rem1*10+rem;

		}


		System.out.println("Reversed number is :"+rem1);
		if(num3==rem1)
		{
			System.out.println("Number is Palindrome");

		}
		else
		{
			System.out.println("Number is not palindrome");
		}

		int test=407;
		int test1=test;
		int r0=0;
		int r1=0;

		while(test>0)
		{
			r1=test%10;
			test=test/10;
			r0=(r1*r1*r1)+r0;
		}
		System.out.println("Value of addition is :"+r0);
		if(test1==r0)
		{
			System.out.println("Number is armstrong");

		}
		else
		{
			System.out.println("Number is not armstrong number");
		}

		char ch1='a';
		int ch2=ch1;


		System.out.println("Ascii value of a is "+ch2);


		int aa[]= {2,3,4,2,4,2,2};
		int VisitedArray[]=new int[aa.length];
		int Visited=-1;
		int count=0;
		for(int i=0;i<aa.length;i++)
		{
			count=1;
			for(int j=i+1;j<aa.length;j++)
			{
				if(aa[i]==aa[j])
				{
					count++;
					VisitedArray[j]=Visited;
				}
			}
			if(VisitedArray[i]!=Visited)
			{
				VisitedArray[i]=count;
			}
		}

		for(int i=0;i<aa.length;i++)
		{
			if(VisitedArray[i]!=Visited)
			{
				System.out.println(" "+aa[i]+ "|"+VisitedArray[i]);
			}
		}



		String str6="Hi Hello";
		char ch6[]=str6.toCharArray();
		String str7="";

		for(int i=0;i<ch6.length;i++)
		{
			if(ch6[i]!=' ')
			{
				str7=str7+ch6[i];
			}
		}
		System.out.println("Trimmed string is: "+str7);


		String ss="Shraddha";
		char vowel[]= {'a','e','i','o','u'};
		int vowel1[]=new int[vowel.length];
		char ch555[]=ss.toCharArray();

		int count1=0;
		for(int i=0;i<vowel.length;i++)
		{
			count1=0;
			for(int j=0;j<ch555.length;j++)
			{
				if(vowel[i]==ch555[j])
				{
					count1++;
					vowel1[i]=count1;
				}
			}

		}


		for(int k=0;k<vowel1.length;k++)
		{
			System.out.println("value of vowel "+vowel[k]+ " "+vowel1[k]);
		}


		int count2=0;
		for(int i=0;i<ch555.length;i++)
		{
			if(ch555[i]=='a' ||ch555[i]=='e' ||ch555[i]=='i' ||ch555[i]=='o' ||ch555[i]=='u')
			{
				count2++;
			}
		}
		System.out.println(count2);



		for(int i=1;i<100;i++)
		{

			calc(i);

		}
		
		
		int x[]= {1,2,3,4,5,2,5,6,7};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
                {
	              System.out.println("Duplicate numbers are: "+x[i]);
	              break;
                }
			}
		}
		
		String name="Shraddha Rajendra Mahale";
		System.out.println("Lenght of string is : "+name.length());
		
		
		
		

	}
	public static void calc(int num)
	{

		int m=num/2;
		boolean flag1=false;
		for(int i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				flag1=true;
				System.out.println(num+"--> This Number is not prime ");
				break;
			}
		}
		if(flag1==false)
		{
			System.out.println(num+"--> This Number is prime ");
		}

     }



}




