import java.io.*;
import java.util.*;
class largest
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number a");
		a=scan.nextInt();
		System.out.println("enter the number b");
		b=scan.nextInt();
		System.out.println("enter the numberc");
		c=scan.nextInt();
		if(a>c&&b>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		System.out.println("c is greater");
	}

		
		
	}
