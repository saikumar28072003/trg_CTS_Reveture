import java.util.Scanner;

class O
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
         if(j == 1 || i==n || j==5 || i==1)
		    {
           System.out.print("O");
			}
			else
			System.out.print(" ");
            }
			System.out.println();
		}
				
    }
  }