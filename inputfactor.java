import java.util.*;
class inputfactor
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int i;
		System.out.println("Factors are:");
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("\n"+i);
			}
		}
	}
}
