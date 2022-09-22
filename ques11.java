/*1.Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.*/

import java.util.*;
public class ques11 {
    public static boolean leapyear(int x){
        boolean ans;
        if(x%4==0 && x%100!=0){
            ans=true;
         }
         else{
         ans=false;
         }
     return ans;
    }
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    boolean ans=leapyear(x);
    System.out.println(ans+" "+" "+x);
   }
    
}