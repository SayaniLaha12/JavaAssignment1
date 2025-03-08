import java.util.*;

class palindrome
{
    void palindrome(int num){
        int rem=0, rev=0;
        int X=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        if(X==rev){
            System.out.println(rev+" : Palindrome number");
            }
        else 
            System.out.println(rev+" : not Palindrome Number");
    }
}
class Palin
{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int x=sc.nextInt();
        N obj=new N();
        obj.palindrome(x);
    }
}