import java.util.*;
class inputfibonacci
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int a=0,b=1,sum,i;
		System.out.println("Fibonacci series is:");
		for(i=0;i<n;i++)
		{
			System.out.println("\n"+a);
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}
