import java.util.Scanner;
class Triangle
{
static double area_of_a_rightangletriangle(double b,double h)
{
return 1/2*b*h;
}
public static void main(String[] args)
{
double b,h;
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter b and h of the rightangletriangle:");
b=sc.nextInt();
h=sc.nextInt();
System.out.println("Area of the rightangletriangle:"+area_of_a_rightangletriangle(b,h));
}
}