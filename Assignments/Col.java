import java.util.*;
class Col
{
public static void main(String args[])
{
Collection item= new ArrayList();
item.add(98);
item.add(67);
item.add("Nikita");
item.add(90.54);
System.out.println(item);

item.remove(98);
System.out.println(item);

item.remove(2);
System.out.println(item);

//item.set("Poorva");
System.out.println(item);


}

}