import java.util.*;
class CollectionEg2
{
public static void main(String args[])
{
ArrayList<Integer> item= new ArrayList<Integer>();
item.add(98);
item.add(78);
item.add(15);
item.add(90);

Collections.sort(item);
System.out.println(item);

System.out.println(Collections.min(item));

System.out.println(Collections.max(item));

Collections.reverse(item);
System.out.println(item);

System.out.println("Size: "+item.size());
System.out.println("Position is: "+item.get(3));
}
}