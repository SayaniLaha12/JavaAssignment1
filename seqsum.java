import java.util.*;
class Sequel
{
	void sequ(int num){
		int i, a=1;
		for(i=1;i<=num;i++){
		a*=i;
		System.out.print((2*i)+", "+a+", ");
		
		}
	}
}

class Sumseq{

	public static void main(String a[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number print the sequence:");
		n=sc.nextInt();
		Seq obj=new Seq();
		obj.sequ(n);
	}
}