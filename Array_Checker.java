package smartPark;

public class Array_Checker {
	public static void main(String[] args) {
		String[] names = { "Atyab", "Fatima", "Saeed", "Malak", "Fatima", "Daniyal", "Abdullah", "Abdullah" };

		for (int i = 0; i < names.length; i++) {
			int count = 1;
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					count++;
					names[j] = "";
				}
			}
			if (!names[i].equals("")) {
				System.out.println(names[i] + " appears " + count + " times.");
			}
		}
	}
}
