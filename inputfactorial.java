import java.util.*;
class inputfactorial
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fcatorial is "+fact);
	}
}
