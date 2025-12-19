
import java.util.Scanner;
class hallowtri1 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter the number:");
		 Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=n;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==n || j==1 || i==j)
				{
					System.out.print("*");
				}
				else
				{
                   System.out.print(" ");
				}
			}System.out.println();
		}
	}
}