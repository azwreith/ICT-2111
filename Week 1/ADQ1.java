import java.io.*;
import java.util.Scanner;
public class ADQ1
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		System.out.println("Enter 4 digits: ");
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		System.out.println("4 digit Numbers with repetation of digits: ");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					for(int l=0;l<4;l++)
					{
						System.out.print(a[i]);
						System.out.print(a[j]);
						System.out.print(a[k]);
						System.out.print(a[l]);
						System.out.print(" ");
					}
				}
			}
		}
		System.out.println();
		System.out.println("4 digit Numbers without repetation of digits:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					for(int l=0;l<4;l++)
					{
						if(i==j || i==k || i==l || j==k || j==l || k==l)
							continue;
						System.out.print(a[i]);
						System.out.print(a[j]);
						System.out.print(a[k]);
						System.out.print(a[l]);
						System.out.print(" ");
					}
				}
			}
		}
	}
}