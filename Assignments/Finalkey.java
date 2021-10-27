class Finalkey
{

final int amount ;
void get()
{
amount = 8900;      //final key word will not change the value
}

public static void main(String args[])
{
Finalkey f=new Finalkey();
f.get();
//System.out.println(" "+get);
}
}