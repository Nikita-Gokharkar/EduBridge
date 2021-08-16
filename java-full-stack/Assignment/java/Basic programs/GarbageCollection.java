import java.util.*;

class GarbageCollection
{
public static void main(String args[])
{
GarbageCollection t= new GarbageCollection();
//t=null;
System.gc();
}
public void finalize()
{
System.out.println("GARBAGE COLLECTED");
}
}