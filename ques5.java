// 5.
// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.
import java.util.*;
public class ques5{
    public static char grade(int x){
        if(x<=25){
            return 'f';
        }
        if(x>25 && x<=45){
            return 'E';
        }
        if(x>45 && x<=50){
            return 'D';
        }
        if(x>50 && x<=60){
            return 'C';
        }
        if(x>60 && x<=80){
            return 'B';
        }
        if(x>80){
            return 'A';
        }
        return 'n';
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        char a=grade(x);
        System.out.println(a);
    }
}