import java.util.*;
class TwoDArray {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int a[][]=new int[3][2];
 System.out.println("Enter numbers for array:");
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<2;j++)
 {
 a[i][j]=sc.nextInt();
 }
 }
 for(int i=0;i<3;i++)
 {
 for(int j=0;j<2;j++)
 {
 System.out.println(a[i][j]);
 }
 }
 }
}
