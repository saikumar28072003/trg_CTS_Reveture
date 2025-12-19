import java.util.Scanner;
class hallowtri2 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter the number:");
		 Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==n || i==j)
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