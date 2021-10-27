// final method

class StudentFinal
 final void work()
{
System.out.println("Learning java developmennt ");
}
}

class college extends StudentFinal
{
void msg()      //final method name is same cannot be run-it will be override.
{
System.out.println("You can start your journey here ");
}
}

public class Finalkey1{
college f=new college();
f.work();
f.msg();
}
}