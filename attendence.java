import java.util.*;
public class attendence{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("the number of class held");
float held=sc.nextFloat();
System.out.println("the no.of class attended");
float attended=sc.nextFloat();
float per=(attended/held)*100;
System.out.println(per);
if(per>75){
System.out.println("allowed for the exam");
}
else{
System.out.println("not allowed for the exam");
}
}
}
