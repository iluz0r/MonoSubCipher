
public class TestClassic {

	public static void main(String[] args) {
		String plainText = "without an education there is no real democracy without an education there is only autocracy";

		// System.out.println("----------CESARE-----------");
		// CaesarCipher testC = new CaesarCipher();
		// try {
		// testC.setKey("8");
		// } catch (Exception e) {
		// System.err.println("Chiave non valida! Uscita dal programma...");
		// System.exit(1);
		// }
		// System.out.println("Chiave: " + testC.getKey());
		// System.out.println("Testo in chiaro: " + plainText);
		// String cipherText = testC.Enc(plainText);
		// System.out.println("Testo cifrato: " + cipherText);
		// System.out.println("Testo in chiaro: " + testC.Dec(cipherText));
		//
		// System.out.println("-----------------------------");
		// try {
		// testC.setKey(testC.genKey());
		// } catch (Exception e) {
		// System.err.println("Chiave non valida! Uscita dal programma...");
		// System.exit(1);
		// }
		// System.out.println("Chiave: " + testC.getKey());
		// System.out.println("Testo in chiaro: " + plainText);
		// cipherText = testC.Enc(plainText);
		// System.out.println("Testo cifrato: " + cipherText);
		// System.out.println("Testo in chiaro: " + testC.Dec(cipherText));

		System.out.println("-----------------------------");
		System.out.println("----------SOSTITUZIONE-----------");
		MonoSubCipher testS = new MonoSubCipher();
		try {
			testS.setKey("qazwsxedcrfvtgbyhnujmikolp");
		} catch (Exception e) {
			System.err.println("Chiave non valida! Uscita dal programma...");
			System.exit(1);
		}
		System.out.println("Chiave: " + testS.getKey());
		System.out.println("Testo in chiaro: " + plainText);
		String cipherTextS = testS.Enc(plainText);
		System.out.println("Testo cifrato:   " + cipherTextS);
		System.out.println("Testo in chiaro: " + testS.Dec(cipherTextS));

		System.out.println("-----------------------------");
		try {
			testS.setKey(testS.genKey());
		} catch (Exception e) {
			System.err.println("Chiave non valida! Uscita dal programma...");
			System.exit(1);
		}
		System.out.println("Chiave: " + testS.getKey());
		System.out.println("Testo in chiaro: " + plainText);
		cipherTextS = testS.Enc(plainText);
		System.out.println("Testo cifrato:   " + cipherTextS);
		System.out.println("Testo in chiaro: " + testS.Dec(cipherTextS));

	}

}
