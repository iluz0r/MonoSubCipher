import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		MonoSubCipher c;
		Scanner s = new Scanner(System.in);
		String key;
		String ans;

		do {
			System.out.println("Vuoi generare casualmente la chiave? (y/n)");
			do {
				ans = s.nextLine();
			} while (!ans.equals("y") && !ans.equals("n"));

			c = new MonoSubCipher();
			if (ans.equals("y")) {
				c.setKey(c.genKey());
			} else {
				System.out.println("Inserisci la chiave:");
				do {
					key = s.nextLine();
				} while (!c.checkKey(key));
				c.setKey(key);
			}

			System.out.println("Inserisci il plain text: ");
			String plainText = s.nextLine();
			String cipherText = c.Enc(plainText);
			String decodedText = c.Dec(cipherText);
			key = c.getKey();

			System.out.println("PlainText: " + plainText + '\n' + "Key: " + key + '\n' + "CipherText: " + cipherText
					+ '\n' + "Decoded Text: " + decodedText);
			System.out.println("Ripetere l'operazione? (y/n)");
			ans = s.nextLine();
		} while (ans.equals("y"));

		s.close();
	}

}
