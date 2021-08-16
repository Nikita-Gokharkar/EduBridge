class Encap
{
private int id;
private String empName;
private int age;

// getter and settet method
public int getID()
{
return id;
}

public String getEmpName()
{
return empName;
}

public int getAge()
{
return age;
}

public void setAge(int newValue)
{
age=newValue;
}

public void setEmpName(String newValue)
{
EmpName=newValue;
}

public void setID(int newValue)
{
id=newValue;
}
}

public class GetSetMethod
{
public static void main(String args[])
Encap obj = new Encap();
obj.setEmpName("Manisha");
obj.setAge(24);
obj.setID(101);
System.out.println("Employee Name" +obj.getEmpName());
System.out.println("Employee SSN" +obj.getID());
System.out.println("Employee Age" +obj.getAge());
}