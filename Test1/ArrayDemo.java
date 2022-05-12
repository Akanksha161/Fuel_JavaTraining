class ArrayDemo{
public static void main(String args[]){
int i;
int value=0;
int arr[] = new int[5];

arr[0]=1;
arr[1]=2;
arr[2]=3;
arr[3]=4;
arr[4]=5;
for(i=0;i<arr.length;i++){
value= arr[i]*arr[i];
System.out.println("Values are: " + value);

}
}
}
