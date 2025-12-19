package PracticaDieciseisCharSequenceTokio;

public class BackwardsStringSequenceTokio implements CharSequenceTokio {

	private String texto;

	public BackwardsStringSequenceTokio(String texto) {
		this.texto = texto;
	}

	@Override
	public int length() {
		return texto.length();
	}

	@Override
	public char charAt(int index) {
		if (index < 0 || index > texto.length()) {
			return 0;
		}

		return texto.charAt(texto.length() - 1 - index);
	}

	@Override
	public CharSequenceTokio subSequence(int start, int end) {
		if (end < start || end > texto.length() || start < 0) {
			return null;
		}

		StringBuilder textoInvertido = new StringBuilder();

		for (int i = start; i < end; i++) {
			textoInvertido.append(texto.charAt(i));
		}

		return new BackwardsStringSequenceTokio(textoInvertido.toString());
	}

	@Override
	public String toString() {
		
		StringBuilder textoFinal = new StringBuilder();
		CharSequenceTokio secuenciaInvertida = subSequence(0,(texto.length()));
		
		for(int i = 0; i < secuenciaInvertida.length(); i++) {
			textoFinal.append(secuenciaInvertida.charAt(i));
		}
		
		return textoFinal.toString();
	}

}
