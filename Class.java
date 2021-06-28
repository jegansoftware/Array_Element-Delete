package username;

import java.util.Scanner;

public class ArrayDelete {
private int[] a;
private int i,j;
private int n;
	public void getvalue()
	{
		Scanner in=new Scanner(System.in);
		
		a=new int[5];
		
		for(i=0;i<a.length;i++)
		{
			System.out.printf("\n%d ) Enter Value:",i+1);
		
			a[i]=in.nextInt();
		}
		
		System.out.printf("\nWhich Element Should I delete?:");
		n=in.nextInt();
		
		if((n<0) ||(n>a.length))
		{
			System.out.printf("Invaild");
		}
		else
		{
			for(i=n-1;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
		
		}
		
	}
	
	public void print()
	{
		for(i=0;i<4;i++)
		{
			System.out.printf("\t%d",a[i]);
		}
	}
  


	
}
