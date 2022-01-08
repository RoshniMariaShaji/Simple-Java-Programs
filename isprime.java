import java.util.*;
class isprime
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i,flag=0;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Given number is not prime");
		}
		else
		{
			System.out.println("Given number is prime");
		}
	}
}
