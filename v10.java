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
        int num=sc.nextInt();
        int count=0;
        while(num>0)
        
        {
        	int r=num%10;
        	count++;
        	num/=10;
        	 
        }
        System.out.print(count);
        	}
}
