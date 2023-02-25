import java.util.*;
public class Program308
{
public static void main(String[] args)
{
int a,b,c;
System.out.println("\nEnter three numbers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c)
System.out.println("the largest among three numbersis "+a);
else if(b>a&&b>c)
System.out.println("the largest among three numbersis "+b);
else 
System.out.println("the largest among three numbersis "+c);
}
}