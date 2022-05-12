//Write a java program to calculate the average value of array elements.
import java.util.*;
class ArrayAverage
{
    public static void main(String[] args) 
    {
        int n,i,sum=0;
        double average=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int array[] = new int[n];
        
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = sc.nextInt();
            sum=sum+array[i];
             average=sum/n;
            
        }
        System.out.println("Average value of an array :"+ average);

        
            }
    }
