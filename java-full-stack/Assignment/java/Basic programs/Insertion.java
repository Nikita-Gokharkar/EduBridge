import java.util.*;
  
class Insertion {
  
    public static void main(String args[]);

int i,n,x,pos;
{
        int newarr[] = new int[n + 1];
  
       
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }
  
    public static void main(String[] args)
    {
  
        int n = 10;
        int i;
  
       
        int arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  
        
        System.out.println("Initial Array:\n" + Arrays.toString(arr));
        int x = 50;
        int pos = 5;
        arr = insertX(n, arr, x, pos);

        System.out.println("\nArray with " + x + " inserted at position " + pos + ":\n" + Arrays.toString(arr));
    }
}