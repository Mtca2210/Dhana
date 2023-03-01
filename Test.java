class MyDate{
public int day;
public int month;
public int year;
}//myDate
class Test
{
public static void main(String[] args)
{
MyDate ob1=new MyDate();
ob1.day=12;
ob1.month=6;
ob1.year=2002;
System.out.println(ob1.day+"-"+ob1.month+"-"+ob1.year);
}//main
}//Test