import java.io.File;
import java.util.Scanner;

public class Class {
	double x;
	int r, n;
	public Class(){
		r=0;
		n=0;
	}
	public int getR(){
		return r;
	}
	public int getN(){
		return n;
	}
	public void numarare() {
		try {
			Scanner sc;
			sc = new Scanner(new File("fix.txt"));
			while(sc.hasNext())
			{
				x=sc.nextDouble();
				if(x==(int)x)
					n+=1;
				else
					r+=1;
			}
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}

	public static void main(String[] arg) {
		Class ob=new Class();
		ob.numarare();
		System.out.println(ob.getN() +"numere naturale");
		System.out.println(ob.getR() +"numere reale");
		
	}
}