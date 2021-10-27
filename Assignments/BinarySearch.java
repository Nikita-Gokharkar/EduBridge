class BinarySearch
{
public static void main(String args[])
{
int i;

int[] arr={2,5,7,9,12,14,16,17,19,20,22};

 int a=16;
 int li=0;
 int hi=arr.length-1; 
 int mi=(li/hi)/2;

while(li<=hi)
{
  if(arr[mi]==a)
{
System.out.print("Element is "+mi+ " index position");
break;
}
else if(arr[mi]<a)
{
li=mi+1;
}
else
{
hi=mi-1;
}
mi=(li+hi)/2;
}
if(li>hi)
{
System.out.println("Element not found");
}
}}