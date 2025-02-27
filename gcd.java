import java.util.*;
class GCDcalculator {
    
    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; 
    }
}

 class Main {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int num1 =sc.nextInt();
	int num2 =sc.nextInt(); 
        GCDcalculator gcdCalc = new GCDcalculator();

        int gcd = gcdCalc.findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}