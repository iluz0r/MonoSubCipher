import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MonoSubCipher implements ClassicCipher {

	private String key;
	private String alph = "abcdefghijklmnopqrstuvwxyz";

	public MonoSubCipher() {
		key = genKey();
	}

	public MonoSubCipher(String key) {
		this.key = key;
	}

	@Override
	public void setKey(String key) {
		this.key = key;
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
		for(char c : input.toCharArray()) {
			l.add(c);
		}
		Collections.shuffle(l);
		
		StringBuilder sb = new StringBuilder();
		for(char c : l)
		  sb.append(c);

		return sb.toString();
	}

	@Override
	public String Enc(String plainText) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Dec(String cipherText) {
		// TODO Auto-generated method stub
		return null;
	}

}
