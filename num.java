import java.io.*;
import java.util.*;
class number
    {
      public static void main(String args[])
        {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          if(n!=0)
           {
            if(n>0)
              System.out.println("it is a positive number");
            else
               System.out.println("It is a negative number");
            }
            else
             System.out.println("The number is zero");
         }
      }
