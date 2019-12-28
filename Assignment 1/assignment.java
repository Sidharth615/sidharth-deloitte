import java.util.Scanner;

class assignment
{
	public static void main (String[] args)
	{
		int n, temp, newv =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		
		if(n > 0)
		{
			while(n > 0)
			{
				temp = n%10;
				if(temp%2 != 0)
				{
					newv = newv + temp;
				
				}
				n = n/10;
			}
			System.out.println("Ans:" +newv);
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}
}