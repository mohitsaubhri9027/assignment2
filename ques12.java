/*2.Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/

import java.util.*;
public class ques12 {
    public static String area(int age,char z,char m){
        String area;
      if(z=='F' || (z=='M' && (age>40 && age<60))){
         area="urban area";
      }
      else if(z=='M'&& age>20 && age<40){
        area="anywhere";
      }
      else{
        area="ERROR";
      }
     return area;
    }
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    char z=sc.next().charAt(0);
    char m=sc.next().charAt(0);
    String x=area(age,z,m);
    System.out.println(x);
  

}
    
}

