import java.util.*;
class ArraySort
{
    public static void main(String[] args) 
    {
        int n,i,j=0;
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int array[] = new int[n];
        //int rev[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = sc.nextInt();
                        
        }
        for( i=0; i < n; i++)
{
        for(j=i+1;j<n;j++){
        if(array[i]>array[j]){
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        }
        
        
        
            }
    }
    System.out.println();
     System.out.println("The sorted elements of array are: ");
     for( i=0;i<n;i++){
     System.out.println(array[i]+"");
     }
     }
     }
    
    
