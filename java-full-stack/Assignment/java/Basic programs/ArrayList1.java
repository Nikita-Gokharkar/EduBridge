import java.util.*;
class ArrayList1
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
list.add("Nikita");
list.add("Poorva");
list.add("Supriya");
list.add("Nik");
list.add("Sheena");
list.add("Mike");

System.out.println(list);

list.add(2,"Daisy");
System.out.println(list);

list.set(1,"tina");
System.out.println(list);

list.remove("Sheena");
System.out.println(list);

list.remove(4);          // remove by index
System.out.println(list);

list.size();
System.out.println(list);

list.reverse();
System.out.println(list);

list.removeAll(list);
System.out.println(list);

list.add("Bear");
System.out.println(list);

list.getIndex("Nik");
System.out.println(list);

list.clearAll(list);
System.out.println(list);
}
}