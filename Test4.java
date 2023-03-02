 import java.util.*;
 class MyDate{
private int day;
//public int day;
private int month;
private int year;
public int get_day(){
return day;
}//get_day
public int get_month(){
	return month; 
}//get_month
public int get_year(){
return year;
	}//get_year()
	public void set_day(int d){
		day=d;
	}//set_day()
	public void set_month(int m){
		month=m;
	}//set_month()
	public void set_year(int y){
		year=y;
	}//set_year
}//myDate
class Test4
{
public static void main (String[] args)
	{
	Scanner Ob1=new Scanner(System.in);
	int day,month,year;
	System.out.println("Enter the day number:");
	day=Ob1.nextInt();
	System.out.println("Enter the month number:");
	month=Ob1.nextInt();
	System.out.println("Enter the year number:");
	year=Ob1.nextInt();
	MyDate Ob2=new MyDate();
    Ob2.set_day(day);
	Ob2.set_month(month);
	Ob2.set_year(year);
	System.out.println(Ob2.get_day()+"-"+Ob2.get_month()+"-"+Ob2.get_year());
     }//Test
     }//main

