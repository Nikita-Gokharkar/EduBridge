interface AnimalEat
{
void eat();
}

interface AnimalTravel
{
void travel();
}

classs Animal implements AnimalEat,AnimalTravel
{
public void eat(){
System.out.println("Animal is eating");
}

public void travel()
{
System.out.println("Animal is Travelling");
}}

public class multiinheritance
{
public static void main(String args[])
Animal a=new Animal();
a.eat();
a.travel();
}