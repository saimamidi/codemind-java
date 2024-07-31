import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        int a,b;
        double c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",c);
        
    }
}