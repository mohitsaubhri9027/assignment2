import java.util.*;
public class main1{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
char ch=sc.next().charAt(0);

int n=ch;
System.out.println(n);
if(n>=65 && n<=90){
System.out.println("upper case");
}
else{
System.out.println("lower case");
}

}
}