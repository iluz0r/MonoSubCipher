import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MonoSubCipher implements ClassicCipher {

	private String key;
	private String alph = "abcdefghijklmnopqrstuvwxyz";

	public MonoSubCipher() {
	}

	@Override
	public void setKey(String key) throws Exception {
		if (checkKey(key))
			this.key = key;
		else
			throw new Exception();
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public String genKey() {
		return mixUpChars(alph);
	}

	private String mixUpChars(String input) {
		List<Character> l = new ArrayList<>();

		for (char c : input.toCharArray())
			l.add(c);
		Collections.shuffle(l);

		StringBuilder sb = new StringBuilder();
		for (char c : l)
			sb.append(c);

		return sb.toString();
	}

	@Override
	public String Enc(String plainText) {
		StringBuilder buffer = new StringBuilder();

		for (char c : plainText.toCharArray()) {
			if (c >= 97 && c <= 122) 
				buffer.append(key.charAt(alph.indexOf(c)));
			else
				buffer.append(c);
		}

		return buffer.toString();
	}

	@Override
	public String Dec(String cipherText) {
		StringBuilder buffer = new StringBuilder();

		for (char c : cipherText.toCharArray()) {
			if (c >= 97 && c <= 122)
				buffer.append(alph.charAt(key.indexOf(c)));
			else
				buffer.append(c);
		}
		return buffer.toString();
	}

	private boolean checkKey(String key) {
		if (!key.equals(alph)) {
			char[] k = key.toCharArray();
			char[] a = alph.toCharArray();

			Arrays.sort(k);

			return Arrays.equals(a, k);
		} else
			return false;
	}

}
