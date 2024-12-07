class StudentArr
{
public int roll_no;
public String name;
StudentArr(int roll_no,String name)   //parameterized constructor
{
this.roll_no = roll_no;
this.name = name;
}
public static void main (String[] args)
{
StudentArr arr[] = new StudentArr[5];
arr[0] = new StudentArr(1,"aman");
arr[1] = new StudentArr(2,"vaibhav");
arr[2] = new StudentArr(3,"shikar");
arr[3] = new StudentArr(4,"dharmesh");
arr[4] = new StudentArr(5,"mohit");
for (int i = 0; i < arr.length; i++)
{
System.out.println("Element at " + i + " : " + arr[i].roll_no +" "+ arr[i].name);
}
}
}
