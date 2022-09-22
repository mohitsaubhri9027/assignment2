import java.util.*;
public class emp{
public static void main(String args[]){
Scanner sc = new S canner(System.in);
System.out.println("Enter the number of working years");
int a =sc.nextInt();
System.out.println("Enter your salary");
int b=sc.nextInt();
if (a>5){
int c=b/5;
b=b+c;
System.out.println("your salary is "+b);
}
else{
System.out.println("your salary is "+b);
}
}
}
