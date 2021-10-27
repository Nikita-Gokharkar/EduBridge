public class staticVariable
{
static int i = 0;  //will get memory only once and retain its value
staticVariable()
{
i++;   //incre	menting the value of static variable
System.out.println(i);
}

public static void main(String args[])
{
new staticVariable();
new staticVariable();
new staticVariable();
}


}



// output
// 1
// 2
// 3