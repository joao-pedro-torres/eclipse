package somar.dois.inteiros.java;
import java.util.*;
class SomarDoisInteiros {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result;
		
		// entradas
		System.out.println("Digite um numero");
		a = sc.nextInt();
		System.out.println("Digite outro numero");
		b = sc.nextInt();
		
		// somar
		result = a + b;
		
		// mostrar
		System.out.println("Soma: " + result);
	}
}