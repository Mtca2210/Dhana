class TestOuter1
{
static int data=30;
static class Inner{
static void msg()
{
System.out.println("data is"+data);
}//msg()
}//Inner
public static void main(String[] args){
TestOuter1.Inner Obj=new TestOuter1.Inner();
Obj.msg();
}//main
}//TestOuter