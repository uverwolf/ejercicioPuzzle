import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.security.SecureRandom;
import java.math.BigInteger;


@SuppressWarnings("unused")
public class PuzzleJava {
	public void sumArray() {
		ArrayList<Integer> base = new ArrayList<Integer>();
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		Collections.addAll(base, 3,5,1,2,7,9,8,13,25,32);
		
		int sum = 0;
		
		for(int i: base) {
			sum+=i;
			if(i>=10) {
				mayores.add(i);
			
			}
		}
		System.out.println("La suma de los valores es: "+sum);
		System.out.println("\nValores en el nuevo Array");
	
			System.out.println(mayores);
		
	}
	
	public void nombresMezclados() {
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> nombresLargos = new ArrayList<String>();
		Collections.addAll(nombres,  "Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa");
		//Se desordena
		Collections.shuffle(nombres);
		System.out.println(nombres);
		
		for(String i: nombres) {
			if(i.length()>5) {
				nombresLargos.add(i);
			}
		}
		System.out.println(nombresLargos);
	}
	
	public void abecedario() {
		ArrayList<Character> letras = new ArrayList<Character>();		
		Collections.addAll(letras, 'a','b','c','d','e','f','g','h','i','j','k','l'
				,'m','n','o','p','q','r','s','t','u','v','w','x','y','z');
		
		Collections.shuffle(letras);
		System.out.println(letras);
		switch (letras.get(0)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("La primera letra del arreglo es una vocal!!");
			break;
		default:
			break;
		}
		System.out.println("Primera letra del arreglo: "+letras.get(0)+"\nUltima letra en el arreglo: "+letras.get(25));			
	}
	
	public ArrayList<Integer> numerosAleatorios() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random aleatorio = new Random();
		
		for(int i=0;i<=10;i++) {
			int numeroAleatorio= aleatorio.nextInt(100-55+1)+55;
			numeros.add(numeroAleatorio);
		}
		return numeros;
		
	}
	public void ordenar(ArrayList <Integer> array) {
		Collections.sort(array);
		System.out.println("Array Ordenado");
		System.out.println(array);
		System.out.println("Valor minimo del arreglo: "+Collections.min(array));
		System.out.println("Valor maximo del arreglo: "+Collections.max(array));
		
		
	}
	public String cadenaAleatoria(ArrayList<Character> cadenaA) {
		StringBuilder cadena=new  StringBuilder();
		
		for(int i =0;i<=5;i++) {
			Collections.shuffle(cadenaA);
			cadena.append(cadenaA.get(0));
		}
		String cadenaS = cadena.toString();
		
		return cadenaS;
	}
	
	public void arrayConCadenas(ArrayList<Character> abc) {
		ArrayList<String> encadenados = new ArrayList<String>();
		for(int i =0;i<=10;i++) {
			String x = this.cadenaAleatoria(abc);
			encadenados.add(x);
		}
				
		System.out.println("Array generado: "+encadenados);
	
	}

}
