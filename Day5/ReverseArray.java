//write a program to read n number of values in an array and display it in reverse order.
import java.util.*;
class ReverseArray
{
    public static void main(String[] args) 
    {
        int n, res,i,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for( i=n; i>0 ; i--)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    
        }
    }
    }
