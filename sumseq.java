import java.util.Scanner;
class sum_sequence
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a range:");
  int n = sc.nextInt();
  A ob1 = new A();
  ob1.print_seq(n);
 }
}

class A
{
 void print_seq(int n)
 {
  int a= -1,b = 1, sum = 0;
  for(int i=0; i<n;i++)
  {
   sum = a+b;
   System.out.println(sum+" " + (int)Math.pow(2,i+1)+" ");
   a = b;
   b=sum;
  }
 }
}