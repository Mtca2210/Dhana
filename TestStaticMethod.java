class Student
{
	int rollno;
	String name;
	static String college="MTCA";
	static void change()
	{ 
	college="SGDC";
	}
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
		void display()
			{
			System.out.println(rollno+" "+name+" "+college);
			}
	}
	class TestStaticMethod{
    public static void main(String[] args){
		Student.change();
		Student s1=new Student(111,"Dhana");
		Student s2=new Student(222,"Kushi");
		Student s3=new Student(333,"Chinnu");
		s1.display();
		s2.display();
		s3.display();
	}
	}
