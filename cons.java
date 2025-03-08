class box{
	double l,b,h;
	box(){
		l=b=h=0.0;
		System.out.println("dedfault constructor callled");
		}
		box(double l1,double b1,double h1)
		{
			l=l1;
			b=b1;
			h=h1;
		System.out.println("parameterized constructor");
		}
		box(double n)
			{
				l=b=h=n;
				System.out.println("parameterized count accepting one parameter");
				System.out.println("Forming a cube");
			} 
		box(box ob){
				l=ob.l;
				b=ob.b;
				h=ob.h;
				System.out.println("clone of constructor of box class");
			}
			double volume(){
				return l*b*h;
			}
		}
		class box_demo{
				public static void main(String[]args){
				box b1=new box();
				box b2=new box(5,3,2);
				box b3=new box(5);
				box b4=new box (b2);
				System.out.println("Volume of b1:" + b1.volume());
				System.out.println("Volume of b2:" + b2.volume());
				System.out.println("volume b3 is: " +b3.volume());
         			System.out.println("volume b4 is: " +b4.volume());

			}
}
