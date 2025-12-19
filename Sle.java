import java.util.Scanner;

class Sle
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
         if( i == 1 || (j-i) == 1 || i== n-2 || (i-j)==1)
		    {
           System.out.print("S");
			}
				else
				System.out.print(" ");
            }System.out.println();
				}
				
    }
   }