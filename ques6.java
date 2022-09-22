// 6.
// Take input of age of 3 people by user and determine oldest and youngest among them.
import java.util.*;
public class ques6 {
    public static int[] age(int... x){
        for(int i=0;i<(x.length-1);i++){
            int sm=0,in=0;
            sm=x[i];
            in=i;
            for(int j=(i+1);j<(x.length);j++){
                  if(sm<x[j]);
                  else{
                        sm=x[j];
                        in=j;
                  }
            }
           x[in]=x[i];
           x[i]=sm;
     }
     return x;
    }
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int x[]=new int[s];
    for(int i=0;i<s;i++){
        x[i]=sc.nextInt();
    }
    x=age(x);
    System.out.println("youngest "+x[0]);
    System.out.println("oldest "+x[x.length-1]);

}
    
}
