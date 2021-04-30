import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hi Hello";
char c[]=str.toCharArray();
for(int i=str.length()-1;i>=0;i--)
{
System.out.print(""+c[i]); 

}
System.out.println("________________________________________");



Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st value");
int i=sc.nextInt();


System.out.println("Enter 2nd value");
int j=sc.nextInt();

int temp=i;
i=j;
j=temp;

System.out.println("Swapped numbers are :"+i+" "+j);
}
}
