import java.util.Scanner;
class numrow
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter the number:");
		 Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				{
					if(j==1)System.out.print("1");
					else if(j==2)System.out.print("2");
					else if(j==3)System.out.print("3");
					else if(j==4)System.out.print("4");
					else if (j==5)System.out.print("5");
				}
			System.out.println();
		}
	}
}