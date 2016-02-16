import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Something {

	public static List<Class> list = new ArrayList<Class>();

	public static void read() {
		try {

			Class ob = new Class();
			Scanner sc = new Scanner(new File("fis.txt"));
			while (sc.hasNext()) {
				String s = sc.next();
				String[] a = s.split(",");
				for (int i = 0; i < a.length; i++) {
					if (i % 4 == 0) {
						ob.setID(a[i]);
					}
					if (i % 4 == 1) {
						a[i]=a[i].substring(1, a[i].length()-1);
						ob.setName(a[i]);

					}
					if (i % 4 == 2)
						ob.setColor(a[i]);
					if (i % 4 == 3) {
						ob.setSize(a[i]);
						list.add(ob);
						ob = new Class();
					}
				}

			}
			sc.close();
		} catch (Exception e) {

		}
	}

	public static void main(String[] arg) {
		read();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			System.out.println("\n");
		}
	}
}
