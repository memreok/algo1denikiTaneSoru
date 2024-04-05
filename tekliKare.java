package ödev3;

public class tekliKare {

	public static void main(String[] args) {

		// *
		// ***
		// *****

		int size = 9;
		int ortaKisim = (size / 2) + 1;
		for (int satir = 0; satir <= ortaKisim - 1; satir++) {
			int yıldız = (satir * 2) + 1;
			for (int sutun = 1; sutun <= size; sutun++) {
				if (sutun == satir || satir == ortaKisim || sutun <= yıldız) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	public static boolean twoSum(int[] dizi, int hedef) {
		int deger1, deger2;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] + dizi[j] == hedef) {
					deger1 = dizi[i];
					deger2 = dizi[j];
					System.out.println("Aranan sayının sorgulanacak sayı dizisi: " + dizi + "\nAranan sayı: " + hedef
							+ "\n1. değer: " + deger1 + "\n2. değer: " + deger2);
					return true;
				}
			}
		}
		return false;

	}

}
