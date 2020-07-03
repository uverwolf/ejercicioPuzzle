import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		PuzzleJava test = new PuzzleJava();

		//Inicio de pruebas
		
		test.sumArray();
		test.nombresMezclados();
		test.abecedario();
		ArrayList<Integer> arreglo = test.numerosAleatorios();
		System.out.println(arreglo);		
		//Usando el arreglo anterior llamamos al metodo nuevo
		test.ordenar(arreglo);
		//Array con letras del abecedario
		ArrayList<Character> cadenaA= new ArrayList<Character>();
		Collections.addAll(cadenaA, 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
		
		String resultadoCadena= "Cadena generada aleatoria: "+test.cadenaAleatoria(cadenaA);
		System.out.println(resultadoCadena);
		//Crear 10 cadenas y unirlas a un array
	
		test.arrayConCadenas(cadenaA);
	}

}
