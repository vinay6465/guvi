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
        int j=sc.nextInt();
            int sum=0;
            int a[]=new int[i];
            for(int x=0;x<i;x++)
            {
            	a[x]=sc.nextInt();
            }
        for(int k=1;k<=j;k++)
        {
        	sum=sum+k;
        }
        	System.out.print(sum);
	}
}
