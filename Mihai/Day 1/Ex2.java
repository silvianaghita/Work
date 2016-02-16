import java.util.Scanner;

public class Class {

	String a;
	int n;

	public Class() {
		n = 0;
	}
	public int getN(){
		return n;
	}
	public static boolean litereMici(String x) {
		for (int i = 1; i < x.length(); i++)
			if(x.charAt(i)<'a'|| x.charAt(i)>'z')
				return false;
		return true;
	}

	public int validareNume(String a) {
		String[] x = a.split("\\s");
		if (x.length != 2)
			return -1;
		if (x[0].length() < 1 && x[1].length() < 1)
			return -1;
		if (x[0].charAt(0) < 'A' || x[0].charAt(0) > 'Z' || x[1].charAt(0) < 'A' || x[1].charAt(0) > 'Z')
			return -1;
		if (litereMici(x[0]) == false)
			return -1;
		if (litereMici(x[1]) == false)
			return -1;

		return 0;
	}

	public void numarare() {
		try {
			Scanner sc = new Scanner(new java.io.File("fis.txt"));
			while (sc.hasNextLine()) {
				a = sc.nextLine();
				if (validareNume(a) == 0)
					n += 1;
			}
			sc.close();
		} catch (Exception e) {
			
		}
	}

	public static void main(String[] args) {
		Class ob=new Class();
		ob.numarare();
		System.out.println("Nume valide: "+ob.getN());
	}

}
