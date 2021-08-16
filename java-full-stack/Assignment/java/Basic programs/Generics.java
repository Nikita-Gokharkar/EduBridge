import java.util.*;
class Generics
{
public static void main(String args[])
{
ArrayList<Integer> item=new ArrayList<Integer>();
item.add(95);
item.add(12);
item.add(24);
item.add(56);
item.add(89);

Collections.sort(item);    //class Collections
System.out.println(item);

item.remove(12); 
System.out.println(item);

item.set(3,102);
System.out.println(item);

}
}
