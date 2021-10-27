import java.util.*;
class LinkedList1
{
public static void main(String args[])
{
LinkedList<Integer> item=new LinkedList<Integer>();
item.add(95);
item.add(12);
item.add(24);
item.add(56);
item.add(89);
System.out.println(item);

item.addFirst(10);
item.addLast(100);
System.out.println(item);

item.removeFirst();
item.removeLast();
System.out.println(item);

System.out.println(item.get(2));

System.out.println(item.getFirst());
System.out.println(item.getLast());
System.out.println(item);

System.out.println(item.contains(64));

Collections.reverse(item);
System.out.println(item);

System.out.println(item.peek());

System.out.println(item.indexOf(56));
System.out.println(item.lastIndexOf(24));

item.clone();
System.out.println(item);

item.poll();
System.out.println(item);

//item.lastpoll();
//System.out.println(item);

item.clear();
System.out.println(item);

//item.push();
//System.out.println(item);
}
}