import java.util.*;
class ArraySum
{
    public static void main(String[] args) 
    {
        int n,i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int array[] = new int[n];
        
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("Sum of all elements of an array :"+sum);
            }
    }
