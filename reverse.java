import java.util.*;
public class reverse{
public static void main(String args[]){
System.out.println("enter the digit");
Scanner sc =new Scanner(System.in);
int a=sc.nextInt();

int c=0;
while(a>0){
int b=a%10;
c=c*10+b;
a=a/10;
}
System.out.println("The reverse of the digit is = "+c);
}
}
