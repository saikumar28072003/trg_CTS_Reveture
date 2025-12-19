import java.util.Scanner;
 class abcd 
	 {
    public static void main(String[] args)
		{
		Scanner s=new Scanner(System.in);
		 System.out.println("enter a number of lines:");
        int n = s.nextInt();
		char m ='A';
        for (int i = 0; i <n; i++) 
			{
            for (int j = 0; j <n; j++) 
				{
                
                if (i == j || i + j == n - 1)
					{
                    System.out.print(m);
					m++;
                   } 
				else
				{
                    System.out.print(" ");
               }
			   
            }
            System.out.println(); 
        }
    }
}