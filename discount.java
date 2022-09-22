import java.util.*;
public class discount{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("No. of units");
int a=sc.nextInt();
System.out.println("the cost of piece");
int b=sc.nextInt();
int c=a*b;


if (c>1000){
int d=c/10;
c=c-d;
System.out.println("our total after the discount"+c);
}
else{
System.out.println("total cost is "+c);
}
}
}
