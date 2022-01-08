import java.util.*;
class inputarmstrong
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int rem,sum=0,org_num=n,num;
		while(n>0)
		{
			rem=n%10;
			num=rem*rem*rem;
			sum=sum+num;
			n=n/10;
		}
		if(org_num==sum)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong");
		}
	}
}
