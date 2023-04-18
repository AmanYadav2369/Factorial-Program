/* wajp to find the factorial of a integers. */

import java.io.*;
class Factorial
{
public static void main(String args[])
{
Console c=System.console();
int num=Integer.parseInt(c.readLine("enter the number :"));

int f=1;
for(int i=1; i<=num; i++)
{
f=f*i;
}
System.out.println("Factorial is ="+ f);

}
}