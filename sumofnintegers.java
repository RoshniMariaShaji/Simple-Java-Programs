import java.util.*;
class sumofnintegers
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	}
}
