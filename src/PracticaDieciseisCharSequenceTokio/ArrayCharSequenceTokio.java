package PracticaDieciseisCharSequenceTokio;

public class ArrayCharSequenceTokio implements CharSequenceTokio {

	private char[] arrayChars;

	public ArrayCharSequenceTokio(char[] arrayDeChars) {
		arrayChars = arrayDeChars;
	}

	@Override
	public int length() {
		return arrayChars.length;
	}

	@Override
	public char charAt(int index) {
		if (index < 0 || index >= arrayChars.length) {
			return 0;
		}
		return arrayChars[index];
	}

	@Override
	public CharSequenceTokio subSequence(int start, int end) {

		if (end < start || end > arrayChars.length || start < 0) {
			return null;
		}

		char[] subSecuencia = new char[end - start];
		for (int i = 0; i < subSecuencia.length; i++) {
			subSecuencia[i] = arrayChars[start + i];
		}

		return new ArrayCharSequenceTokio(subSecuencia);
	}

	@Override
	public String toString() {
		return new String(arrayChars);
	}

}
