import java.util.Scanner;
class Program501
{
static double CalculateArea(double b,double h)
{
double temp;
temp=1.0/2.0*b*h;
return temp;
}
public static void main(String[] args)
{
double base,height,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the base of the right angled triangle:");
base=sc.nextDouble();
System.out.println("Enter the height of the right angled triangle:");
height=sc.nextDouble();
area=CalculateArea(base,height);
System.out.println("Area of triangle with base"+base+"height"+height+"is"+area+"sq units");
}
}
