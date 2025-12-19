import java.util.Scanner;

class rahul
	{
    public static void main(String[] args)
		{
        Scanner s = new Scanner(System.in);
      System.out.println("Enter the number of lines:");
	  int n=s.nextInt();
	  int f=1;
	  for(int i=1;i<=n;i++)
			{
		  f=1;
		  for(int j=1;j<=i;j++)
		{
		System.out.print(f +" ");
		f++;
		}
		System.out.println();
	}
  }
}
