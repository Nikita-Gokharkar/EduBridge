import java.util.*;
class CollectionEg3
{
public static void main(String args[])
{
ArrayList<Integer> item=new ArrayList<Integer>();
item.add(95);
item.add(12);
item.add(24);
item.add(56);
item.add(89);

ArrayList<Integer> item1=new ArrayList<Integer>();
item1.add(95);
item1.add(12);
item1.add(24);
item1.add(56);
item1.add(89);

item.addAll(item1);
System.out.println(item1);
System.out.println(item1.contains(24));

item1.removeAll(item1);
System.out.println(item1);

item1.clear();
System.out.println(item1);
}
}