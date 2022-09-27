package by.home.maxzzzit;

public class ProstoeAndSostavnoeChislo {
	public static void main(String[] args) {
		int count = 0, prostoe = 11;
		for (int x = 1; x <= prostoe; x++) {
			if (prostoe % x == 0)
				count++;
		}
		if (count == 2)	System.out.print(prostoe+" - это простое число");	
		else System.out.println(prostoe+" - это составное число");
	}
}
