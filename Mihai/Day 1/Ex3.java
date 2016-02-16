
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class {

	ArrayList<String> x;
	int n;

	public Class() {
		x = new ArrayList<String>();
		n = 0;
	}

	public void impartire() {
		try {
			String s;
			String[] a;
			Scanner sc = new Scanner(new java.io.File("fis.txt"));
			while (sc.hasNextLine()) {
				s = sc.nextLine();
				a = s.split("[,\\.?!\\s\n]+");
				for (int i = 0; i < a.length; i++) {
					if (a[i].matches("(a*ba*ba*)*"))
						n++;
					a[i] = a[i].replaceAll("<p>", "<span>");
					a[i] = a[i].replaceAll("<\\\\p>", "<\\\\span>");
					if (a[i].matches("^[aeiouAEIOU].*")) {
						String q = new String("");
						q = q + a[i].length();
						x.add(q);
					} else
						x.add(a[i]);
				}

			}

			sc.close();
		} catch (Exception e) {

		}
	}

	public void sortare() {
		Collections.sort(x);
	}

	public void afisareX() {
		for (int i = 0; i < x.size(); i++)
			System.out.println(x.get(i));
	}

	public int getN() {
		return n;
	}

	public static void main(String[] args) {
		Class ob = new Class();
		ob.impartire();
		ob.sortare();
		ob.afisareX();
		System.out.println(ob.getN());
	}

}
