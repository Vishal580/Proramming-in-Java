class Simple
{
private int num=100;
private void printmsg()
{
System.out.println("Vishal");
}
}
class Main
{
public static void main(String[] args){
Simple obj=new Simple();
System.out.println(obj.num);
obj.printmsg();
}
}