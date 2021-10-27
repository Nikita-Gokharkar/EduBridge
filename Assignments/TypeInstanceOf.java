class TypeInstanceOf
{
public void show()
{
System.out.println("java");
}
}

class B extends TypeInstanceOf
{
static void show(TypeInstanceOf a)
{
if(a instanceof B)
{
B b=(B)a;  //downcasting
System.out.println("downcasting performed");
}
}

public static void main(String args[])
TypeInstanceOf a= new B();
B.show(a);
}
}
