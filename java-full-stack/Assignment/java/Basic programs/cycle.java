class Admission
{
void rule()
{
System.out.println("College criteria");
}
}

class Student extends Admission
{
void data()
{
System.out.println("Students details");
}
}

class College
{
public static void main(String args[])
{
Student s=new Student();
s.rule();
s.data();
}