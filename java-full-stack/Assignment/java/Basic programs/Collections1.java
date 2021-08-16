import java.util.*;
class Collections1
{
public static void main(String args[])
{
Collection item=new ArrayList();
item.add("Nikita");
item.add("Poorva");
item.add("Supriya");
item.add(56);
item.add(92.89);
for(Object i:item)
{
System.out.println(i);
}
}
}