/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();	
            int sum=0;
        for(int j=1;j<=i;j++)
        {
        	sum=sum+j;
        }
        	System.out.print(sum);
	}
} 
