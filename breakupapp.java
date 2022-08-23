//Input:
//First line contains an integer N and then N lines follow with a message S in the following format in each line.
//[G/M]:
//eg. G: Hi
//[G means that it is Girlfriends message and M means that it is Menot’s message]
//Note: Everything is space separated and the days will be integers with no leading zeroes and will always be preceded by a space]

//Output : Print  "Date"if the decided day is 19 or 20 otherwise print "No Date".
//Note: If multiple days have same weightage the date is cancelled and you must output "No Date"

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       // Writing output to STDOUT
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
          int d19=0;
        int d21=0;
       for(int i=1;i<=n;i++)
       {
           String s=sc.nextLine();
           if(s.contains("G"))
           {
               if(s.contains("19"))
               {
                    d19+=2;
               }
               if(s.contains("21"))
               {
                   d21+=2;
               }
           }
           if(s.contains("M"))
           {
             if(s.contains("19"))
             {
                 d19+=1;
             }
             if(s.contains("21"))
             {
                 d21+=1;
             }

           }
           
       }
       if(d19>d21)
       {
           System.out.println("Date");      
        }

    
    else
    {
        System.out.println("No Date");
    }
}
}
