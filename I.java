import java.util.Scanner;

class I
	{
    public static void main(String[] args)
		{
        Scanner s = new Scanner(System.in);
      System.out.println("Enter the number of lines:");
        int n = s.nextInt();  
        for (int i = 1; i <= n; i++) 
			{
            for (int j = 1; j <= n; j++)
				{
         if( i == 1 || j == 3 || i==n)
		    {
           System.out.print("I");
			}
			else
			System.out.print(" ");
            }
			System.out.println();
		}
				
    }
  }