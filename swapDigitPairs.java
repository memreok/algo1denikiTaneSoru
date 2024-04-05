package ödev3;

public class swapDigitPairs {

	public static void main(String[] args) {

		System.out.println(swapDigitPairs(1234567));

	}

	public static int swapDigitPairs(int sayi) {
		int sonuc = 0;
		int power = 1;
		while ((sayi / 10) != 0) {
			int sag = sayi % 10;
			int sol = sayi / 10 % 10;
			sayi = sayi / 100;
			sonuc += sag * 10 * power + sol * 1 * power;
			power *= 100;
		}
		sonuc += power * sayi;
		return sonuc;
	}

}
