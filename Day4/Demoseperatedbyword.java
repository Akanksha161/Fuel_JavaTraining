/*Write a program that asks the user to enter a word. The program will then repeat word for as
many times as it has characters: */

import java.util.*;
class Demoseperatedbyword

{
      public static void main(String args[])

{ 
      String first, second, result,dots;

       int counting, periods, i;
       Scanner sc = new Scanner(System.in);

       System.out.println("Please enter word"); 
       first = sc.next();
       System.out.println("Please enter Number "); 
       second = sc.next();
       result = first +""+ second; 
       counting = result.length();

       periods = 0;
     if(counting<=30) periods = 30 - counting;
        dots = "";
     for(i=1;i<periods; i++) dots+=".";

     System.out.println(first+dots+second);

   }
}
