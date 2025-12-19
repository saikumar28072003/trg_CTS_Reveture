import java.util.Scanner;
class numrow1
{
	public static void main(String[] args) 
	{ 
		System.out.println("Enter the number:");
		 Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        System.out.println("Enter the limit of num:");
		int r =s.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
				{
				System.out.print(n+" ");
				
				n++;}
			System.out.println();
		}
	}
}
