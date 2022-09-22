/*7.
Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/

import java.util.*;
public class ques7 {
    public static int absolute(int x){
        if(x<0){
            return (-1)*x;
        }
        return x;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int  a=absolute(x);
        System.out.println(a);
    }
}
    

