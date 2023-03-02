class MyDate{
private int day;
//public int day;
public int month;
public int year;
public int get_day()
	{
	return day;
	}//get_day(0)
	public void set_day(int d){
		day=d;
	}//set_day()
}//myDate
class Test1
{
public static void main(String[] args)
{
MyDate ob1=new MyDate();
//ob1.day=12;
ob1.set_day(10);
ob1.month=06;
ob1.year=2002;
//10-06-2002
System.out.println(ob1.get_day()+"-"+ob1.month+"-"+ob1.year);
}//main
}//Test