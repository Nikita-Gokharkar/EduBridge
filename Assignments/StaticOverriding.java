class StaticOverriding
{
static int num;
static String mystr;
//First static block
static{
System.out.println("First Student Details");
num=68;
mystr="Nikita";

} 
//SEcond static block
static{
System.out.println("Second Student Details");  // second will override the 1 block
num=56;
mystr="Poorva";
}

public static void main(String args[])
{
System.out.println("Student ID "+num);
System.out.println("Student Name"+mystr);
}
}