import java.util.*;
public class Program2
{
static int diff(int a,int b){return a-b;}
static int product(int a,int b){return a*b;}
static int smallest(int a,int b)
	{ 
if(a<b)return a;
if(b<a)return b;
return 0;
}
static int largest(int a,int b)
	{
if(a>b)return a;
if(b>a)return b;
return 0;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n1,n2,result;
System.out.println("Enter the number:");
n1=sc.nextInt();
System.out.println("Enter the number:");
n2=sc.nextInt();
result=diff(n1,n2);
System.out.println("Difference is"+result);
result=product(n1,n2);
System.out.println("product is"+result);
result=smallest(n1,n2);
System.out.println("smallest is"+result);
result=largest(n1,n2);
System.out.println("largest is"+result);
}
}

