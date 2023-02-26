import java.util.*;
class TestDemo
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a,b,difference,product;
System.out.println("Enter the two number:");
Scanner ob=new Scanner(System.in);
a=sc.nextInt();
b=ob.nextInt();
difference=a-b;
System.out.println("the difference two numbers");
System.out.println(a+"-"+b+"="+difference);
product=a*b;
System.out.println("the product of two numbers");
System.out.println(a+"*"+b+"="+product);
Math.max(a,b);
System.out.println("the largest number is"+Math.max(a,b));
Math.min(a,b);
System.out.println("the smallest number is"+Math.min(a,b));
}
}