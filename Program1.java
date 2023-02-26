import java.util.*;
public class Program1
{
public static void main(String[] args)
{
char ch;
System.out.println("Enter a character");
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z'))
System.out.println("c+ is alphabet");
System.out.println("c+ is not alphabet");
}
}