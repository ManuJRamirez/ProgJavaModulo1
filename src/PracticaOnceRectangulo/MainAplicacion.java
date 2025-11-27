package PracticaOnceRectangulo;

public class MainAplicacion {

	public static void main(String[] args) {
		Rectangulo rectanguloSinParametros = new Rectangulo();
		Rectangulo rectanguloConParametros = new Rectangulo(5 , 4);
		Rectangulo rectanguloCuadrado = new Rectangulo (2 , 2);
		
		//Test contructor sin parámetros.
		System.out.println("Contructor sin parametros -> "+rectanguloSinParametros.toString());
		System.out.println("************************************************************");
		
		//Test método es cuadrado. Lo probamos con un rectángulo NO cuadrado y con uno SI cuadrado.
		System.out.println("¿Es el rectangulo con parametros (5 base y 4 altura) cuadrado? -> "+rectanguloConParametros.esCuadrado());
		System.out.println("************************************************************");
		System.out.println("¿Es el rectangulo con parametros (2 base y 2 altura) cuadrado? -> "+rectanguloCuadrado.esCuadrado());
		System.out.println("************************************************************");
		
		//Test método calcular el área.
		System.out.println("Area del rectanguloConParametros:\nBase = "+rectanguloConParametros.getBase()+"\nAltura = "+rectanguloConParametros.getAltura()+"\nArea = "+rectanguloConParametros.area());
		System.out.println("************************************************************");
		
		//Test método calcular el perímetro
		System.out.println("Perímetro del rectanguloConParametro:\nBase = "+rectanguloConParametros.getBase()+"\nAltura = "+rectanguloConParametros.getAltura()+"\nPerímetro = "+rectanguloConParametros.perimetro());
		System.out.println("************************************************************");
		
		//Test método gira.
		System.out.println("Giramos 90º el rectanguloConParametros con base "+rectanguloConParametros.getBase()+" y altura "+rectanguloConParametros.getAltura());
		System.out.println("Girandoooo...");
		rectanguloConParametros.gira();
		System.out.println("Los parámetros del rectanguloConParametros despues del giro son:\nBase: "+rectanguloConParametros.getBase()+"\nAltura: "+rectanguloConParametros.getAltura());
	}

}
