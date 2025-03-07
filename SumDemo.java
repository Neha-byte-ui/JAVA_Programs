//A program to calculate the sum of first 10 natural number.
import java.util.Scanner;
class SumDemo
{
 public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 int num;
 int sum = 0;
 System.out.println("Enter number");
 num=sc.nextInt();
 for(int i=1; i<=num; i++)
 {
 sum += i;
 }
 System.out.println("Sum: " + sum);
 }
}
