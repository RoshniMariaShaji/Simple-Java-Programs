import java.util.*;
class oddoreven
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(n%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
	}
}

