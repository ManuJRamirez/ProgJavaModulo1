package PracticaDieciseisCharSequenceTokio;

public class MainAplicacion {

	public static void main(String[] args) {
		
		/*
		 * Probamos los metodos de ArrayCharSequenceTokio
		 * */
		
		char[] charEjemplo = {'H','o','l','a',' ','M','u','n','d','o'};	
		ArrayCharSequenceTokio ejemploArrayCharSequenceTokio = new ArrayCharSequenceTokio(charEjemplo);
		
		
		System.out.println(ejemploArrayCharSequenceTokio.length());
		System.out.println(ejemploArrayCharSequenceTokio.charAt(6));
		System.out.println(ejemploArrayCharSequenceTokio.subSequence(1, 7));
		System.out.println(ejemploArrayCharSequenceTokio.toString());
		
		
		System.out.println("=======================================================================================");
		
		
		/*
		 * Probamos los metodos de BackwardsStringSequenceTokio
		 * */
		
		String stringEjemplo = "Hola Mundo";	
		BackwardsStringSequenceTokio ejemploBackwardsStringSequenceTokio = new BackwardsStringSequenceTokio(stringEjemplo);
		
		System.out.println(ejemploBackwardsStringSequenceTokio.length());
		System.out.println(ejemploBackwardsStringSequenceTokio.charAt(6));
		System.out.println(ejemploBackwardsStringSequenceTokio.subSequence(1, 7));
		System.out.println(ejemploBackwardsStringSequenceTokio.toString());
		
		
	}

}
