import java.util.*;
class Stringinput{

  public static void main(String args [])  {
              System.out.println("Enter word");
              Scanner input=new Scanner(System.in);
              String word=input.next();
              int len=word.length();
              System.out.println();
    for(int i=0;i<len;i++)
    {
          System.out.println(word);
    }
  
  }
}
